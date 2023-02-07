package dr0n.service;


import dr0n.persistent.model.Job;

import java.util.List;


public interface JobService {
    Job getById(Long id);
    List<Job> getAllJobs();
    void addJob(Job job);
    List<Job> getJobsByTag(Long tag_id);
}
