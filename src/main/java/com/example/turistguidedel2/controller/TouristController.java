package com.example.turistguidedel2.controller;

import com.example.turistguidedel2.model.TouristAttraction;
import com.example.turistguidedel2.repository.TourisRepository;
import com.example.turistguidedel2.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    private final TouristService touristService;

    public TouristController(TouristService touristService){
        this.touristService = touristService;
    }


    @GetMapping("")
    public String getAttractions(Model model){
        model.addAttribute("attractions", touristService.getAllAttractions());
        return "attractionList";
    }

    @GetMapping("/{name}/tags")
    public String getAttractionTags(Model model, @PathVariable String name ){
        List<TouristAttraction> touristAttractions = touristService.getAllAttractions();
        TouristAttraction attractions = null;
        for(TouristAttraction attraction : touristAttractions){
            if(attraction.getName().equals(name)){
                attractions = attraction;
            }
        }
        model.addAttribute("attractionTags", attractions);
        return "tags";
    }




}
