package dr0n.persistent.repository;

import dr0n.persistent.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

}
