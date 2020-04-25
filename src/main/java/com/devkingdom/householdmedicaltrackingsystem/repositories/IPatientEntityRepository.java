/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devkingdom.householdmedicaltrackingsystem.entities.PatientEntity;

/**
 * A repository for accessing patient information.
 */
@Repository
public interface IPatientEntityRepository extends CrudRepository<PatientEntity, Integer> {

}
