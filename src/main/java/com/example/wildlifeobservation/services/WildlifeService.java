package com.example.wildlifeobservation.service;

import com.example.wildlifeobservation.model.Tier;
import com.example.wildlifeobservation.model.Standort;
import com.example.wildlifeobservation.repository.TierRepository;
import com.example.wildlifeobservation.repository.StandortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void saveStandort(Standort standort) {
        standortRepository.save(standort);
    }

    public List<Tier> findAllTiere() {
        return tierRepository.findAll();
    }
}



