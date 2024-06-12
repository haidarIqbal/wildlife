package com.example.wildlifeobservation.controllers;

import com.example.wildlifeobservation.types.Tier;
import com.example.wildlifeobservation.types.Standort;
import com.example.wildlifeobservation.services.WildlifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
    @GetMapping("/getAllTier")
    public List<Tier> returnAllTier() {
       return wildlifeService.findAllTiere();
    }

    @PostMapping("/tier")
    public String createTier(@RequestBody Tier tier) {
    	wildlifeService.saveTier(tier);
    	return "success";
    }
    @PostMapping("/standort")
    public String createStandort(@RequestBody Standort standort) {
        wildlifeService.saveStandort(standort);
        return "redirect:/home";
   }
}
