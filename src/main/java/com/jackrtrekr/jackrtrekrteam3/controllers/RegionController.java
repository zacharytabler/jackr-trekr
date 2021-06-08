package com.jackrtrekr.jackrtrekrteam3.controllers;

import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model){
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsview";
    }

    @GetMapping("/regions/{location}")
    public String displaySingleRegion(@PathVariable String location, Model model){
        Region retrievedRegion = regionRepo.findRegionByLocation(location);
        return "regionview";
    }

}
