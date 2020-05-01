/**
 *
 */
package com.devkingdom.householdmedicaltrackingsystem.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devkingdom.householdmedicaltrackingsystem.IConstants;
import com.devkingdom.householdmedicaltrackingsystem.entities.PatientEntity;
import com.devkingdom.householdmedicaltrackingsystem.models.GenderEnum;
import com.devkingdom.householdmedicaltrackingsystem.repositories.IPatientEntityRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * A controller designed to provide an interactive point for the service.
 */
@RestController
@RequestMapping(IConstants.ROOT_ENDPOINT)
@Api(tags = "Medical")
@CrossOrigin()
public class MainController {

    @Autowired(required = true)
    private IPatientEntityRepository patientRepository;

    /**
     * Gets all the patients
     * @param request The request.
     * @return The available patients.
     */
    @GetMapping(value = "/patients", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(tags = "Patients", value = "Gets all the patients registered")
    public Iterable<PatientEntity> getPatients(
            HttpServletRequest request) {
        
        return patientRepository.findAll();
    }

    /**
     * Gets all the patients
     * @param request The request.
     * @return The available patients.
     */
    @PostMapping(value = "/patient/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(tags = "Patients", value = "Gets all the patients registered")
    public PatientEntity savePatients(@RequestParam String firstName,
            @RequestParam String middleName,
            @RequestParam String lastName,
            @RequestParam String dob,
            @RequestParam boolean isFemale) {
        
        final PatientEntity entity = new PatientEntity();
        entity.setFirstName(firstName);
        entity.setMiddleName(middleName);
        entity.setLastName(lastName);
        
        try {
            final SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyy");
            entity.setDateOfBirth(format.parse(dob));
        }
        catch (final ParseException e) {
            e.printStackTrace();
        }
        
        if (isFemale) {
            entity.setGender(GenderEnum.Female);
        }
        else {
            entity.setGender(GenderEnum.Male);
        }

        return patientRepository.save(entity);
    }
}
