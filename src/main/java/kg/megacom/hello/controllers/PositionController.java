package kg.megacom.hello.controllers;

import kg.megacom.hello.controllers.base.CrudMethods;
import kg.megacom.hello.models.Position;
import kg.megacom.hello.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController implements CrudMethods<Position> {

    @Autowired // находит BEAN и присваивает переменной, синглтон не нужен
    private PositionService positionService;

    @GetMapping("/all")
    public List<Position> findAll(){
        return positionService.findAll();
    }

    @GetMapping("/id")
    public Position getById(@PathVariable Long id){
        return new Position(id, "head", true);
    }

    @PostMapping("/save")
    public Position save(@RequestBody Position position){
        return positionService.save(position);

    }

    @Override
    public Position update(Position position) {
        return positionService.save(position);
    }

    @Override
    public Position remove(Long id) {
        return new Position(id,"deputy", true);
    }


}
