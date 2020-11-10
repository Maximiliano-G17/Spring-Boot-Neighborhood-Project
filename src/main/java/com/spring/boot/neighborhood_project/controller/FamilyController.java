package com.spring.boot.neighborhood_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.neighborhood_project.models.Family;
import com.spring.boot.neighborhood_project.service.IFamilyService;

@Controller
@RequestMapping("/family")
public class FamilyController {
	
	private IFamilyService familyService;
	
	@Autowired
	public FamilyController(IFamilyService familyService) {
		this.familyService = familyService;
	}

	@GetMapping("/")
	public String read(Model model) {
		List<Family> families = familyService.findAll();
		model.addAttribute("families",families);
		return "views/home";
	}
	
	@GetMapping("/children")
	public String amountOfChildren(Model model,int quantity) {
		List<Family> listOfChildren = familyService.numberOfChildren(quantity);
		model.addAttribute("children",listOfChildren);
		return "views/children";
	}
	
	@GetMapping("/profits")
	public String profits(Model model,double quantity) {
		List<Family> profitsList = familyService.findByProfits(quantity);
		model.addAttribute("profits",profitsList);
		return "views/profits";
	}
	
	@GetMapping("/phone")
	public String peopleNeedPhone(Model model) {
		List<Family> listlistOfPeopleWithoutPhone = familyService.notPhoneExist();
		model.addAttribute("phone", listlistOfPeopleWithoutPhone);
		return "views/phone";
	}
}