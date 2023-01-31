package dr0n.controller;

import dr0n.Company;
import dr0n.mappers.CompanyToDTOMapper;
import dr0n.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RequestMapping(value = "/api/companies")
@RestController
public class CompanyController {

    private final CompanyService companyService;
    //private final CompanyToDTOMapper companyToDTOMapper;

    @GetMapping(value = "/{id}")
    public Company getCompanyById(@PathVariable Long id){
        return companyService.getById(id);
    }

    @GetMapping
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @PostMapping
    public void addCompany(@ModelAttribute("company") Company company){
        companyService.addCompany(company);
    }
}
