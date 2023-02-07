package dr0n.persistent.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@JsonFormat
@Table(name = "company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyEntity {
    @GeneratedValue(generator = "company_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "company_id_seq", sequenceName = "company_id_seq", allocationSize = 1)
    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "foundation_date")
    private Date foundationDate;
    
    @Column(name = "amount_of_employees")
    private Integer amountOfEmployees;
    
    @Column(name = "ceo_name")
    private String ceoName;
    
    @Column(name = "stars")
    private Double stars;

}
