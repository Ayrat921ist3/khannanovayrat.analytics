package ru.khannanovayrat.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.khannanovayrat.analytics.entity.User;

/**
 * Created by ayrat on 12.05.16.
 */
public interface UserRepository extends JpaRepository<User, Long>{


}
