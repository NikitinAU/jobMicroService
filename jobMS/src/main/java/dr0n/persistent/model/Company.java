package dr0n.persistent.model;

import lombok.Value;

import java.sql.Date;

@Value
public class Company {
    Long id;
    String name;
    String description;
    Date foundationDate;
    Integer amountOfEmployees;
    String ceoName;
    Double stars;
}
