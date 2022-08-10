package kg.megacom.hello.dao;

import kg.megacom.hello.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // определяет, что интерфейс работает с базой данных
public interface PositionRepository extends JpaRepository<Position, Long> {
}
