package dr0n.mappers;

import dr0n.Company;
import dr0n.persistent.model.CompanyEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Mapper(componentModel = "spring")
public interface CompanyToEntityMapper {
    CompanyEntity companyToCompanyEntity(Company company);
    Company companyEntityToCompany(CompanyEntity companyEntity);
}
