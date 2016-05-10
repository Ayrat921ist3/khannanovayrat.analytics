package ru.khannanovayrat.analytics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.khannanovayrat.analytics.entity.Remind;
import ru.khannanovayrat.analytics.repository.RemindRepository;

import java.util.List;

/**
 * Created by ayrat on 10.05.16.
 */
@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getById(long id) {
        return repository.findOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
