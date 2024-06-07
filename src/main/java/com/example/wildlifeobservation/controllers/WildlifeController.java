package com.example.wildlifeobservation.controller;

import com.example.wildlifeobservation.model.Tier;
import com.example.wildlifeobservation.model.Standort;
import com.example.wildlifeobservation.service.WildlifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class WildlifeController {    
    @Autowired
    private WildlifeService wildlifeService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("tiere", wildlifeService.findAllTiere());
        return "redirect:/home";
  }

    @PostMapping("/tier")
    public String createTier(@RequestBody Tier tier) {
    	wildlifeService.saveTier(tier);
    	
    	return "success";
    }

    @PostMapping("/standort")
    public String createStandort(Standort standort) {
        wildlifeService.saveStandort(standort);
        return "redirect:/home";
   }
    
    @GetMapping("/test123")
    public String testSand() {
        return "redirect:/home";
   }

}
