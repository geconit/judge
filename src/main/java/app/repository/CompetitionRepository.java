package app.repository;

import app.entity.Competition;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompetitionRepository extends CrudRepository<Competition, Long> {
    List<Competition> findBySeason(Integer season);
}
