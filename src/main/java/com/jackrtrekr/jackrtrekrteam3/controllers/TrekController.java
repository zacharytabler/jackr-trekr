package com.jackrtrekr.jackrtrekrteam3.controllers;

import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;


import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model){
        model.addAttribute("treks", trekRepo.findAll());
        return "treksView";
    }

    @RequestMapping("/treks/{id}")
    public String displaySingleTrek(@PathVariable Long id, Model model){
        Optional<Trek> retrievedTrek = trekRepo.findById(id);
        Trek foundTrek = retrievedTrek.get();
        model.addAttribute("trek", foundTrek);
        return "trekView";
    }
}
