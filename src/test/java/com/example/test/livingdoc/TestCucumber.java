package com.example.test.livingdoc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.cukedoctor.Cukedoctor;
import com.github.cukedoctor.api.CukedoctorConverter;
import com.github.cukedoctor.api.DocumentAttributes;
import com.github.cukedoctor.api.model.Feature;
import com.github.cukedoctor.config.GlobalConfig;
import com.github.cukedoctor.parser.FeatureParser;
import com.github.cukedoctor.util.FileUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "json:target/cucumber.json" }, features = { "src/test/resources/" }, strict = true)
public class TestCucumber {

    @Test
    public void shouldSaveDocumentationIntoDisk() {
        List<String> pathToCucumberJsonFiles = FileUtil.findJsonFiles("target/");
        List<Feature> features = FeatureParser.parse(pathToCucumberJsonFiles);
        DocumentAttributes attrs = GlobalConfig.getInstance().getDocumentAttributes();
        attrs.toc("left").backend("html5")
                .docType("book")
                .icons("font").numbered(false)
                .sourceHighlighter("coderay")
                .docTitle("Test des features en adoc")
                .sectAnchors(true).sectLink(true);

        CukedoctorConverter converter = Cukedoctor.instance(features, attrs);
        converter.setFilename("target/living_doc.adoc");

        converter.saveDocumentation();
        assert (FileUtil.loadFile("target/living_doc.adoc")).exists();
    }
}
