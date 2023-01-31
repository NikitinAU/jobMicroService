package dr0n.service;

import dr0n.Company;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    Company getById(Long id);
    List<Company> getAllCompanies();
    void addCompany(Company company);
}
