package dr0n.mappers;


import dr0n.Job;
import dr0n.controller.JobRequest;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper(componentModel = "spring")
public interface JobToDTOMapper {
    Job AddJobRequestToJob(JobRequest jobRequest);
}
