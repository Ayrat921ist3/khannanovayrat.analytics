package ru.khannanovayrat.analytics.service;

import ru.khannanovayrat.analytics.entity.Remind;

import java.util.List;

/**
 * Created by ayrat on 10.05.16.
 */
public interface ReminderService {

    List<Remind> getAll();

    Remind getById(long id);

    Remind save(Remind remind);

    void remove(long id);
}
