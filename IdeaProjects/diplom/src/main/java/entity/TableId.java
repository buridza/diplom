package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TableIdInc")
@ToString
@AllArgsConstructor
public class TableId {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
}
