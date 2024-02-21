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
        return tourisRepository.readfil();
    }

    public TouristAttraction addAttraction(TouristAttraction touristAttraction) {
        tourisRepository.addAttraction(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction save(TouristAttraction touristAttraction) {
        tourisRepository.save(touristAttraction);
        return touristAttraction;
    }


    public TouristAttraction update(TouristAttraction touristAttraction){
        tourisRepository.updateAttraction(touristAttraction);
        return touristAttraction;
    }

    public void create(TouristAttraction touristAttraction){
        tourisRepository.createAttraction(touristAttraction);
    }

    public List<TouristAttraction> readAtrraktioner(){
        return tourisRepository.readfil();
    }

    public void delete(TouristAttraction touristAttraction){
        tourisRepository.deleteAttraction(touristAttraction);
    }

}
