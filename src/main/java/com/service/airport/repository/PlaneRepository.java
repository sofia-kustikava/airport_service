package com.service.airport.repository;

import com.service.airport.entity.PlaneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<PlaneEntity, Long> {
}
