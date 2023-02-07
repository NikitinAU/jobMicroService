package dr0n.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dr0n.persistent.model.Job;
import dr0n.mappers.JobToDTOMapper;
import lombok.RequiredArgsConstructor;
import dr0n.service.JobService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/jobs")
@RequiredArgsConstructor
//@CrossOrigin
public class JobController {
    private final JobService jobService;
    private final JobToDTOMapper jobToDTOMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id){
        Job job = jobService.getById(id);
        System.out.println(job);
        return job;
    }

    @GetMapping
    public ResponseEntity<List<Job>> getAllJobs(){
        return ResponseEntity.ok(jobService.getAllJobs());
    }

    @PostMapping
    public void addJob(JobRequest request){
        jobService.addJob(jobToDTOMapper.AddJobRequestToJob(request));
    }

    @GetMapping("/tagId={tagId}")
    public ResponseEntity<List<Job>> getJobsByTag(@PathVariable Long tagId){
        return ResponseEntity.ok(jobService.getJobsByTag(tagId));
    }

    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(){
        return "Hello";
    }
}
