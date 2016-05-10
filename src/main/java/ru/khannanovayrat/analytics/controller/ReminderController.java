package ru.khannanovayrat.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.khannanovayrat.analytics.entity.Remind;
import ru.khannanovayrat.analytics.repository.RemindRepository;
import ru.khannanovayrat.analytics.service.ReminderService;

import java.util.Date;
import java.util.List;

/**
 * Created by ayrat on 04.05.16.
 */
@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindId){
        return service.getById(remindId);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind){
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteReminder(@PathVariable long id){
        service.remove(id);
    }
}
