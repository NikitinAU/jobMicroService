package dr0n.persistent.model;

import lombok.Value;

import java.sql.Date;
//TODO: make getters cause value doesnt work with composite objects
@Value
public class Job {
    Long id;
    String name;
    String description;
    Long tagId;
    Date postedDate;
    String contactPhone;
    String contactName;
    Boolean isAvailable;
    Company company;
}
