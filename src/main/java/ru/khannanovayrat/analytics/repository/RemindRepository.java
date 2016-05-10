package ru.khannanovayrat.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.khannanovayrat.analytics.entity.Remind;

/**
 * Created by ayrat on 10.05.16.
 */
public interface RemindRepository extends JpaRepository<Remind, Long> {
}
