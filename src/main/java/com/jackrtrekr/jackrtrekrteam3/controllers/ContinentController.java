package com.jackrtrekr.jackrtrekrteam3.controllers;

import com.jackrtrekr.jackrtrekrteam3.errorExceptions.ContinentNotFoundException;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private TypeRepository typeRepo;

    @RequestMapping({"/index", "/", ""})
    public String displayAllContinents(Model model) {
        model.addAttribute("continentsModel", continentRepo.findAll());
        model.addAttribute("typesModel", typeRepo.findAll());
        return "index";
    }

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continentsModel", continentRepo.findAll());
        return "continentsView";
    }

    @GetMapping("/continents/{location}")
    public String displaySingleContinent(@PathVariable String location, Model model) throws ContinentNotFoundException {
        if (continentRepo.findContinentByLocation(location) == null) {
        throw new ContinentNotFoundException();
        }
        model.addAttribute("continentModel", continentRepo.findContinentByLocation(location));
        return "continentView";
    }

}
