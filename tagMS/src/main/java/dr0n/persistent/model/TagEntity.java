package dr0n.persistent.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tag", schema = "public", catalog = "JobForJunior")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class TagEntity {
    @GeneratedValue(generator = "tag_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "tag_id_seq", sequenceName = "tag_id_seq")
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
}
