package com.example.turistguidedel2.service;

import com.example.turistguidedel2.model.TouristAttraction;
import com.example.turistguidedel2.repository.TourisRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TouristService {
    TourisRepository tourisRepository = new TourisRepository();



    public List<TouristAttraction> getAllAttractions(){
        return tourisRepository.findAllAttractions();
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction) {
        tourisRepository.addAttraction(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction save(TouristAttraction touristAttraction) {
        tourisRepository.save(touristAttraction);
        return touristAttraction;
    }

    public void delete(String name) {
        TouristAttraction touristAttraction = tourisRepository.findByName(name);
        if (touristAttraction != null) {
            tourisRepository.delete(touristAttraction);
        }
    }

    public List<String> getNameByTags(){
        return tourisRepository.getNameByTags();
    }

    public List<String> getCity(){
        return tourisRepository.getCity();

    }

    public TouristAttraction findByName(String name) {
        return tourisRepository.findByName(name);
    }

    public TouristAttraction updateAttraction(String name, TouristAttraction updatedAttraction){
        for (TouristAttraction attraction : tourisRepository.findAllAttractions()){
            if (attraction.getName().equals(name)){
                attraction.setDescription(updatedAttraction.getDescription());
                attraction.setCity(updatedAttraction.getCity());
                attraction.setTagList(updatedAttraction.getTagList());
                return attraction;
            }
        }
        return null;
    }


}
