package com.example.turistguidedel2.controller;

import com.example.turistguidedel2.model.TouristAttraction;
import com.example.turistguidedel2.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService = new TouristService();


    @GetMapping("/alle")
    public String getAttractions(Model model){
        model.addAttribute("attractions", touristService.getAll());
        return "atttractionList";
    }
}
