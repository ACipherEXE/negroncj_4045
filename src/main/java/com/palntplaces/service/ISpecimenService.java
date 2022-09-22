package com.palntplaces.service;

import com.palntplaces.dto.SpecimenDTO;

/**
 * 
 * CRUD operations for specimens
 *
 */
public interface ISpecimenService {
	/**
	 *Get specimens from persistence layer.
	 *@param id a unique lookup
	 *@return a specimen with a matching id
	 */
	
	SpecimenDTO fetchById(int id);
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 */
	void save(SpecimenDTO specimenDTO);

}