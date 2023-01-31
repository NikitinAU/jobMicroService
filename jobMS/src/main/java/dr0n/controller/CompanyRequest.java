package dr0n.controller;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
public class CompanyRequest {
    private String name;
    private String description;
    private Date foundationDate;
    private int amountOfEmployees;
    private String ceoName;
    private Double stars;
}
