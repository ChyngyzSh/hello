package kg.megacom.hello.services.impl;

import kg.megacom.hello.dao.PositionRepository;
import kg.megacom.hello.models.Position;
import kg.megacom.hello.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // создает BEAN(объект в Сервис)
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Position update(Position position) {
        return positionRepository.save(position);
    }
}
