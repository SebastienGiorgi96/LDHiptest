package com.example.test.livingdoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.livingdoc.entity.Team;
import com.example.test.livingdoc.service.TeamServiceInterface;

@Controller
public class TeamController {

    @Autowired
    TeamServiceInterface teamService;

    @RequestMapping("/teams")
    public String findCities(Model model) {

        List<Team> teams = (List<Team>) teamService.findAll();

        model.addAttribute("teams", teams);

        return "teams";
    }

}
