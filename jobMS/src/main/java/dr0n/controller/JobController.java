package dr0n.controller;

import dr0n.Job;
import dr0n.mappers.JobToDTOMapper;
import lombok.RequiredArgsConstructor;
import dr0n.service.JobService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/jobs")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;
    private final JobToDTOMapper jobToDTOMapper;

    @GetMapping(value = "/{id}")
    public Job getJobById(@PathVariable Long id){
        return jobService.getById(id);
    }

    @GetMapping
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @PostMapping
    public void addJob(JobRequest request){
        jobService.addJob(jobToDTOMapper.AddJobRequestToJob(request));
    }

    @GetMapping(value = "/{tag_id}")
    public List<Job> getJobsByTag(@PathVariable Long tag_id){
        return getJobsByTag(tag_id);
    }
}
