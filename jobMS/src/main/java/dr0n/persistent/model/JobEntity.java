package dr0n.persistent.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jdk.jfr.ContentType;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.http.MediaType;

import java.sql.Date;
import java.util.Objects;

@Entity
@JsonFormat
@Table(name = "job")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor

public class JobEntity {
    @GeneratedValue(generator = "job_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "job_id_seq", sequenceName = "job_id_seq", allocationSize = 1)
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
    
    @Column(name = "is_available")
    private Boolean isAvailable;
    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private CompanyEntity company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobEntity jobEntity = (JobEntity) o;
        return id != null && Objects.equals(id, jobEntity.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
