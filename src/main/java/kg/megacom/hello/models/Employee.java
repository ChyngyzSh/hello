package kg.megacom.hello.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data// сам создает геттеры и сеттеры
@FieldDefaults(level = AccessLevel.PRIVATE)// делает все поля одного типа модификатора(private по умолчанию)
@AllArgsConstructor // создает конструктор со всеми оргументами
@NoArgsConstructor//создает пустой конструктор

public class Employee {
    Long id;
    String name;
    String surname;
}
