package com.spring.boot.neighborhood_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.neighborhood_project.models.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long>{

}
