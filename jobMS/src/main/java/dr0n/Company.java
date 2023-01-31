package dr0n;

import lombok.Value;

import java.sql.Date;

@Value
public class Company {
    Long id;
    String name;
    String description;
    Date foundationDate;
    int amountOfEmployees;
    String ceoName;
    Double stars;
}
