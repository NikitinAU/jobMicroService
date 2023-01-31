package dr0n.persistent.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "company")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyEntity {
    @GeneratedValue(generator = "company_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "company_id_seq", sequenceName = "company_id_seq")
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
    private int amountOfEmployees;
    
    @Column(name = "ceo_name")
    private String ceoName;
    
    @Column(name = "stars")
    private Double stars;

}
