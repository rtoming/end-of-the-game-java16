package ee.secretagency.endofthegame.repository;

import ee.secretagency.endofthegame.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomesRepository extends JpaRepository<Income, Long> {
}
