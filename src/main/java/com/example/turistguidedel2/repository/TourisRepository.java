package com.example.turistguidedel2.repository;

import com.example.turistguidedel2.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TourisRepository {
    private final List<TouristAttraction> touristAttractionList = new ArrayList<>(List.of(
            new TouristAttraction("Tivoli", "Forlystelsespark", "København",List.of("Bornevenlig")),
            new TouristAttraction("Zoologiske have", " Har beliggenhed i København.", "København", List.of("Naturlig", "Bornevenlig")),
            new TouristAttraction("Rundetårn", "Rundetårn er et 41,55 meter højt observationstårn, der ligger i Købmagergade i Indre By, København.", "København", List.of("Udstilling", "Koncenter", "Særarrangementer")),
            new TouristAttraction("Legoland", "Legoland Billund Resort er en dansk forlystelsespark i Billund med fokus på LEGO og Legoklodser.", "Billund", List.of("X-treme Racers", "Polar X-plorer", "LEGO Canoe"))
    ));



    public List<TouristAttraction> readfil(){
        return touristAttractionList;
    }

    public TouristAttraction createAttraction(TouristAttraction touristAttraction){
        if (touristAttractionList.add(touristAttraction)){
            return touristAttraction;
        }
        return null;
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction) {
        touristAttractionList.add(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction save(TouristAttraction touristAttraction) {
        if (touristAttraction != null) {
            touristAttractionList.contains(touristAttraction);
        }
        return touristAttraction;
    }



    public TouristAttraction updateAttraction(TouristAttraction touristAttraction){
        for (TouristAttraction attraction : touristAttractionList){
            if (attraction.getName().equals(touristAttraction.getName())){
                attraction.setName(touristAttraction.getName());
                attraction.setDescription(attraction.getDescription());
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction deleteAttraction(TouristAttraction touristAttraction){
        touristAttractionList.remove(touristAttraction);
        return touristAttraction;
    }
}
