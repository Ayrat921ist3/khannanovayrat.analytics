package ru.khannanovayrat.analytics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.khannanovayrat.analytics.entity.User;
import ru.khannanovayrat.analytics.repository.UserRepository;

import java.util.List;

/**
 * Created by ayrat on 11.05.16.
 */
@Service
public class AnalyticsServiceImpl implements AnalyticsService{

    @Autowired
    UserRepository repository;

    
    public User saveUser(User user) {
        return repository.saveAndFlush(user);
    }

    public User getUser(long id) {
        return repository.findOne(id);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public String getMock() {
        return "Success";
    }
}
