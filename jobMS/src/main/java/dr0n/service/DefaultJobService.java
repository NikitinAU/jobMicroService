package dr0n.service;

import dr0n.persistent.model.Job;
import dr0n.mappers.JobToEntityMapper;
import dr0n.persistent.model.JobEntity;
import dr0n.persistent.repository.JobRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultJobService implements JobService {

    private final JobRepository jobRepository;
    private final JobToEntityMapper jobToEntityMapper;
    //private final CompanyRepository companyRepository;
    @Override
    public Job getById(Long id) {
        //FIXME: add exception
        JobEntity jobEntity = jobRepository.findById(id).orElseThrow();

        return jobToEntityMapper.jobEntityToJob(jobEntity);
    }

    @Override
    public List<Job> getAllJobs() {
        Iterable<JobEntity> iterable = jobRepository.findAll();

        return getJobs(iterable);
    }

    @Override
    public void addJob(Job job) {
        JobEntity jobEntity = jobToEntityMapper.jobToEntity(job);
        jobRepository.save(jobEntity);
    }

    public List<Job> getJobsByTag(Long tag_id) {
        Iterable<JobEntity> iterable = jobRepository.findByTagId(tag_id);
        return getJobs(iterable);
    }

    private List<Job> getJobs(Iterable<JobEntity> iterable) {
        ArrayList<Job> jobs = new ArrayList<>();
        for (JobEntity jobEntity : iterable){
            jobs.add(jobToEntityMapper.jobEntityToJob(jobEntity));
        }
        return jobs;
    }
}
