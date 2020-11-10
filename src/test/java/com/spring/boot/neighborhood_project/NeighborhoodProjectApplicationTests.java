package com.spring.boot.neighborhood_project;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.boot.neighborhood_project.models.Family;
import com.spring.boot.neighborhood_project.service.IFamilyService;

@SpringBootTest
class NeighborhoodProjectApplicationTests {
	
	private IFamilyService familyService;
	
	@Autowired
	public NeighborhoodProjectApplicationTests(IFamilyService familyService) {
		this.familyService = familyService;
	}

	@Test
	public void testCreateFamily() {
		Family family = new Family();
		family.setHouseId(8L);
		family.setChildren(2);
		family.setMembers(4);
		family.setPhone(494949);
		family.setProfits(250);
		Family familiSave = familyService.save(family);
		assertTrue(familiSave.getHouseId().equals(family.getHouseId()));
	}
}