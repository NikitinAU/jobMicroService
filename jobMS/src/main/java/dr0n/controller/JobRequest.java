package dr0n.controller;

import dr0n.persistent.model.Company;
import lombok.Data;

import java.sql.Date;


@Data
public class JobRequest {
    private String name;
    private String description;
    private Long tagId;
    private Date postedDate;
    private String contactPhone;
    private String contactName;
    private Boolean isAvailable;
    private Company company;
}
