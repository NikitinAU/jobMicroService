package dr0n.mappers.impl;

import dr0n.persistent.model.Company;
import dr0n.persistent.model.Job;
import dr0n.mappers.CompanyToEntityMapper;
import dr0n.mappers.JobToEntityMapper;
import dr0n.persistent.model.CompanyEntity;
import dr0n.persistent.model.JobEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JobToEntityMapperImpl implements JobToEntityMapper {

    private final CompanyToEntityMapper companyToEntityMapper;
    @Override
    public JobEntity jobToEntity(Job job) {
        CompanyEntity company = companyToEntityMapper.companyToEntity(job.getCompany());
        return new JobEntity(job.getId(),
                job.getName(),
                job.getDescription(),
                job.getTagId(),
                job.getPostedDate(),
                job.getContactPhone(),
                job.getContactName(),
                job.getIsAvailable(),
                company);
    }

    @Override
    public Job jobEntityToJob(JobEntity jobEntity) {
        Company company = companyToEntityMapper.entityToCompany(jobEntity.getCompany());
        return new Job(jobEntity.getId(),
                jobEntity.getName(),
                jobEntity.getDescription(),
                jobEntity.getTagId(),
                jobEntity.getPostedDate(),
                jobEntity.getContactPhone(),
                jobEntity.getContactName(),
                jobEntity.getIsAvailable(),
                company);
    }
}
