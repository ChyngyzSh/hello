package kg.megacom.hello.services;

import kg.megacom.hello.models.Position;
import kg.megacom.hello.services.impl.PositionServiceImpl;

import java.util.List;

public interface PositionService {

    //PositionService INSTANCE = new PositionServiceImpl(); - не нужен так как используется Autowired

    Position save(Position position);

    List<Position> findAll();

    Position update(Position position);
}
