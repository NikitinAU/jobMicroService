package dr0n.mappers;

import dr0n.Company;
import dr0n.controller.CompanyRequest;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper(componentModel = "spring")
public interface CompanyToDTOMapper {
    Company addCompanyRequestToCompany(CompanyRequest companyRequest);
}
