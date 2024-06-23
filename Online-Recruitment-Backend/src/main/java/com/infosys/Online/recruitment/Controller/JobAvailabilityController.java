package com.infosys.Online.recruitment.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.infosys.Online.recruitment.Entity.JobAvailability;
import com.infosys.Online.recruitment.Service.JobAvailabilityService;
import com.infosys.Online.recruitment.Service.NotificationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobAvailabilityController {
    
    @Autowired
    JobAvailabilityService service;
    
    @Autowired
    private NotificationService notificationService;
    
    @GetMapping("/jobavailability")
    public List<JobAvailability> getAllJobAvailability(){
        return service.getAllJobAvailability();
    }
    
    @GetMapping("/jobavailability/{id}/resume")
    public ResponseEntity<byte[]> downloadResume(@PathVariable Integer id) {
        JobAvailability job = service.getJobAvailabilityById(id);
        if (job != null && job.getResumeData() != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(job.getResumeFileType()))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + job.getResumeFilename() + "\"")
                    .body(job.getResumeData());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    
    @PostMapping("/api/jobavailability")
    public ResponseEntity<JobAvailability> createJobAvailability(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("phoneno") String phoneno,
            @RequestParam("yearofpassing") String yearofpassing,
            @RequestParam("percentage") Double percentage,
            @RequestParam("language") String language,
            @RequestParam("skills") String skills,
            @RequestParam("project") String project,
            @RequestParam("resume") MultipartFile resume) {
                
        JobAvailability jobAvailability = new JobAvailability();
        jobAvailability.setName(name);
        jobAvailability.setEmail(email);
        jobAvailability.setPhoneno(phoneno);
        jobAvailability.setYearofpassing(yearofpassing);
        jobAvailability.setPercentage(percentage);
        jobAvailability.setLanguage(language);
        jobAvailability.setSkills(skills);
        jobAvailability.setProject(project);
        
        try {
            // Save the job application along with the resume file
            JobAvailability savedApplication = service.saveJobAvailability(jobAvailability, resume);
            notificationService.createNotification("New job application from " + name, savedApplication.getId());
            return new ResponseEntity<>(savedApplication, HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
