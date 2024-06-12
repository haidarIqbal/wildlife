package com.example.wildlifeobservation.services;

import com.example.wildlifeobservation.types.Standort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wildlifeobservation.repositories.StandortRepository;
import com.example.wildlifeobservation.repositories.TierRepository;
import com.example.wildlifeobservation.types.Tier;

import java.util.List;

@Service
public class WildlifeService {
    @Autowired
    private TierRepository tierRepository;

    @Autowired
    private StandortRepository standortRepository;

    public void saveTier(Tier tier) {
        tierRepository.save(tier);
    }

    public List<Tier> findAllTiere() {
        return tierRepository.findAll();
    }

    public void saveStandort(Standort standort) {
        standortRepository.save(standort);
    }
}



