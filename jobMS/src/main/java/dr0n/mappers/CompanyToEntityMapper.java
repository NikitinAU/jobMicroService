package dr0n.mappers;

import dr0n.persistent.model.Company;
import dr0n.persistent.model.CompanyEntity;

public interface CompanyToEntityMapper {
    default Company entityToCompany(CompanyEntity companyEntity){
        return new Company(companyEntity.getId(),
                companyEntity.getName(),
                companyEntity.getDescription(),
                companyEntity.getFoundationDate(),
                companyEntity.getAmountOfEmployees(),
                companyEntity.getCeoName(),
                companyEntity.getStars());
    }
    default CompanyEntity companyToEntity(Company company){
        return new CompanyEntity(company.getId(),
                company.getName(),
                company.getDescription(),
                company.getFoundationDate(),
                company.getAmountOfEmployees(),
                company.getCeoName(),
                company.getStars());
    }
}
