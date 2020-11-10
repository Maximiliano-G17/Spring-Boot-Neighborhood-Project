package com.spring.boot.neighborhood_project.service;

import java.util.List;


import com.spring.boot.neighborhood_project.models.Family;

public interface IFamilyService {
	
	public List<Family> findAll();
	
	public List<Family> findByProfits(double profits);
	
	public List<Family> numberOfChildren(int children);
	
	public List<Family> notPhoneExist();
	
	public Family save(Family family);

}
