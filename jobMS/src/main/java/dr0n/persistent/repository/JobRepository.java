package dr0n.persistent.repository;

import dr0n.persistent.model.JobEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {
    @Query("select j from JobEntity j where j.tagId = ?1")
    List<JobEntity> findByTagId(Long tagId);

}
