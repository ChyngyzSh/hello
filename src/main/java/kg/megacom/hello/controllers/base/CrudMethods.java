package kg.megacom.hello.controllers.base;

import kg.megacom.hello.models.Employee;
import kg.megacom.hello.models.Position;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CrudMethods <T>{ //<T> чтобы не привязывать метод к определенному классу, заменяем на Т
    @GetMapping("/all")
    List<T> findAll();

    @GetMapping("/id")
    T getById(@PathVariable Long id);

    @PostMapping("/save")
    T save(@RequestBody Position position);





}
/*
@GetMapping("/all")
    List<Position> findAll();

    @GetMapping("/id")
    Position getById(@PathVariable Long id);

    @PostMapping("/save")
    Position save(@RequestBody Position position);
 */