package com.spring.boot.neighborhood_project.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.neighborhood_project.models.Family;
import com.spring.boot.neighborhood_project.repository.FamilyRepository;

@Service
public class FamilyServiceImpl implements IFamilyService{
	
	private FamilyRepository familyRepo;
	
	@Autowired
	public FamilyServiceImpl(FamilyRepository familyRepo) {
		this.familyRepo = familyRepo;
	}

	@Override
	public List<Family> findAll() {
		return familyRepo.findAll();
	}

	@Override
	public List<Family> findByProfits(double profit) {
		return findAll().stream()
						.filter(f -> f.getProfits() >= profit)
						.collect(Collectors.toList());
	}

	@Override
	public List<Family> numberOfChildren(int children) {	
		return findAll().stream()
						.filter(f -> f.getChildren() > children)
						.collect(Collectors.toList());
	}

	@Override
	public List<Family> notPhoneExist() {		
		return findAll().stream()
						.filter(f -> f.getPhone() == null)
						.collect(Collectors.toList());
	}

	@Override
	public Family save(Family family) {
		return familyRepo.save(family);
	}
}