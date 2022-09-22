package com.palntplaces.service;

import org.springframework.stereotype.Component;

import com.palntplaces.dto.SpecimenDTO;
@Component
public class SpecimenServiceStub implements ISpecimenService{
	
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setDescription("A beutiful Easter Readbud");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setLatitude("39.74");
		return specimenDTO;
		
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}