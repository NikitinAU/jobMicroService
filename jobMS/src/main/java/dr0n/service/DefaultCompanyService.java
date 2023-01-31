package dr0n.service;

import dr0n.Company;
import dr0n.mappers.CompanyToEntityMapper;
import dr0n.persistent.model.CompanyEntity;
import dr0n.persistent.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultCompanyService implements CompanyService{

    private final CompanyRepository companyRepository;
    private final CompanyToEntityMapper companyToEntityMapper;

    @Override
    public Company getById(Long id) {
        CompanyEntity companyEntity = companyRepository.findById(id).orElse(null);
        return companyToEntityMapper.companyEntityToCompany(companyEntity);
    }

    @Override
    public List<Company> getAllCompanies() {
        Iterable<CompanyEntity> iterable = companyRepository.findAll();
        ArrayList<Company> companies = new ArrayList<>();
        for(CompanyEntity companyEntity : iterable){
            companies.add(companyToEntityMapper.companyEntityToCompany(companyEntity));
        }
        return companies;
    }

    @Override
    public void addCompany(Company company) {
        CompanyEntity companyEntity = companyToEntityMapper.companyToCompanyEntity(company);
        companyRepository.save(companyEntity);
    }
}
