package ru.khannanovayrat.analytics.service;

import ru.khannanovayrat.analytics.entity.User;

import java.util.List;

/**
 * Created by ayrat on 11.05.16.
 */
public interface AnalyticsService {

    User saveUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    String getMock();
}
