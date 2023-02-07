package dr0n.mappers;


import dr0n.persistent.model.Job;
import dr0n.controller.JobRequest;

public interface JobToDTOMapper {
    default Job AddJobRequestToJob(JobRequest jobRequest){
        return new Job(null,
                jobRequest.getName(),
                jobRequest.getDescription(),
                jobRequest.getTagId(),
                jobRequest.getPostedDate(),
                jobRequest.getContactPhone(),
                jobRequest.getContactName(),
                jobRequest.getIsAvailable(),
                jobRequest.getCompany());
    }
}
