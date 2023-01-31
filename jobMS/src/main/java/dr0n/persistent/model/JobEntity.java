package dr0n.persistent.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "job", schema = "public", catalog = "JobForJunior")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class JobEntity {
    @GeneratedValue(generator = "job_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "job_id_seq", sequenceName = "job_id_seq")
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    @Column(name = "tag_id")
    private Long tagId;
    
    @Column(name = "posted_date")
    private Date postedDate;
    
    @Column(name = "contact_phone")
    private String contactPhone;
    
    @Column(name = "contact_name")
    private String contactName;
    
    @Column(name = "is_avaliable")
    private boolean isAvaliable;
    @ManyToOne
    private CompanyEntity company;
}
