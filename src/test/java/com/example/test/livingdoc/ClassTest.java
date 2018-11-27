package com.example.test.livingdoc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.livingdoc.entity.Player;
import com.example.test.livingdoc.entity.Team;
import com.example.test.livingdoc.service.PlayerServiceBean;
import com.example.test.livingdoc.service.TeamServiceBean;
import com.github.cukedoctor.Cukedoctor;
import com.github.cukedoctor.api.CukedoctorConverter;
import com.github.cukedoctor.api.DocumentAttributes;
import com.github.cukedoctor.api.model.Feature;
import com.github.cukedoctor.config.GlobalConfig;
import com.github.cukedoctor.parser.FeatureParser;
import com.github.cukedoctor.util.FileUtil;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassTest {

    @Autowired
    TeamServiceBean teamService;

    @Autowired
    PlayerServiceBean playerService;

    @Test
    public void teamTest() {

        Team teamInt = teamService.findTeamById(6);
        Team team = new Team(9, "Paris SG");

        // assert statements
        assertEquals("Paris SG", team.getName());
        assertEquals("Liverpool FC", teamInt.getName());

    }

    @Test
    public void playerTest() {

        Player playerTest = playerService.findTeamById(7);
        Team club = playerTest.getTeam();
        assertEquals("Salah", playerTest.getName());
        assertEquals("Liverpool FC", club.getName());

    }

    @Test
    public void shouldSaveDocumentationIntoDisk() {
        List<String> pathToCucumberJsonFiles = FileUtil.findJsonFiles("target/");
        List<Feature> features = FeatureParser.parse(pathToCucumberJsonFiles);
        DocumentAttributes attrs = GlobalConfig.getInstance().getDocumentAttributes();
        attrs.toc("left").backend("html5")
                .docType("book")
                .icons("font").numbered(false)
                .sourceHighlighter("coderay")
                .docTitle("Documentation Title")
                .sectAnchors(true).sectLink(true);

        CukedoctorConverter converter = Cukedoctor.instance(features, attrs);
        converter.setFilename("target/living_documentation.adoc");

        converter.saveDocumentation();
        assert (FileUtil.loadFile("target/living_documentation.adoc")).exists();
    }

}
