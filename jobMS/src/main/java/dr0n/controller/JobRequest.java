package dr0n.controller;

import dr0n.Company;
import lombok.Data;

import java.sql.Date;


@Data
public class JobRequest {
    private String name;
    private String description;
    private int tagId;
    private Date postedDate;
    private String contactPhone;
    private String contactName;
    private boolean isAvailable;
    private Company company;
}
