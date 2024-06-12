package com.example.wildlifeobservation.repositories;

import com.example.wildlifeobservation.types.Tier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierRepository extends JpaRepository<Tier, Long> {
}




