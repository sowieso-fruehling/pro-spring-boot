package de.be.aff.repository;

import de.be.aff.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository is marker interface that allows the Spring Data Repository engine
// to implement not just CRUD operations but also some custom methods.
// Custom methods are based on naming conventions and actual entity used. So we could have
// findByTitleLike, findBySummary, findByTitleAndSummaryIgnoringCase
public interface JournalRepository extends JpaRepository<Journal, Long> {

}