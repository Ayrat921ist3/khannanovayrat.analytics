package ru.khannanovayrat.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.khannanovayrat.analytics.entity.User;
import ru.khannanovayrat.analytics.service.AnalyticsService;

/**
 * Created by ayrat on 11.05.16.
 */
@RestController
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String testConnection(String test) {
        return test;
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST,
            consumes = "application/json")
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return analyticsService.saveUser(user);
    }

}
