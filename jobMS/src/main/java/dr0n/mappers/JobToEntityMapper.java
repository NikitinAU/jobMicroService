package dr0n.mappers;

import dr0n.persistent.model.Job;
import dr0n.persistent.model.JobEntity;

public interface JobToEntityMapper {
    JobEntity jobToEntity(Job job);
    Job jobEntityToJob (JobEntity jobEntity);
}
