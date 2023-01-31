package dr0n.mappers;

import dr0n.Job;
import dr0n.persistent.model.JobEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper(componentModel = "spring")
public interface JobToEntityMapper {
    JobEntity jobToEntity(Job job);
    Job jobEntityToJob (JobEntity jobEntity);
}
