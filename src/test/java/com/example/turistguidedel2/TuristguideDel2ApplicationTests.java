package com.example.turistguidedel2;

import com.example.turistguidedel2.controller.TouristController;
import com.example.turistguidedel2.repository.TourisRepository;
import com.example.turistguidedel2.service.TouristService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.stereotype.Controller;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@SpringBootTest
class TuristguideDel2ApplicationTests {

    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
    class RandomPortTest {

        @LocalServerPort
        private int port;

        @Autowired
        private TouristController controller;

        @Autowired
        private TouristService touristService;

        @Autowired
        private TourisRepository repository;


    }

}
