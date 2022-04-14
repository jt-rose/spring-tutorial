package com.example.tutorial.controller;

import com.example.tutorial.JobApplication;
import com.example.tutorial.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
public class JobApplicationController {

    @Autowired
    JobApplicationRepository repo;

    @RequestMapping(value = "/apps", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<JobApplication> create(@RequestBody JobApplication app) {
        //JobApplication newApp = new JobApplication(app.getCompanyName(), app.getAppliedOn(), app.getWebsite(), app.getNotes());
        repo.save(app);
        return new ResponseEntity<>(app, HttpStatus.OK);
    }

    @GetMapping("/apps")
    @ResponseBody
    public ResponseEntity<List<JobApplication>> read() {
        try {
            return new ResponseEntity<>((List<JobApplication>) repo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/app/{id}")
    public ResponseEntity<JobApplication> getApp(@PathVariable("id") Long id) {
        try {
            //check if application exist in database
            Optional<JobApplication> app = repo.findById(id);

            if (app.isPresent()) {
                return new ResponseEntity<JobApplication>(app.get(), HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
