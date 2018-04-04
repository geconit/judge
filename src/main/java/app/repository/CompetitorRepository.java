package app.repository;

import app.entity.Competitor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompetitorRepository extends CrudRepository<Competitor, Long> {
    List<Competitor> findByClubId(long clubId);
}
