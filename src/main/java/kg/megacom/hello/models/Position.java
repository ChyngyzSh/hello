package kg.megacom.hello.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

@Entity // указание, для создания таблицы с его столбцами
@Table(name = "positions") // название таблицы всегда во множест.числе
public class Position {

    @Id // создание столбца Id
            @GeneratedValue(strategy = GenerationType.IDENTITY) // автоинкремент
            @Column(name = "position_id")
    Long id;
    @Column(unique = true,nullable = false, name = "position_name", length = 100)
    String name;
    boolean active;


}
