package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addEvent(@Valid @RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @PutMapping("event/{id}")
    public String updateEvent(@PathVariable Long id, @Valid @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("event/{id}")
    public String deleteEvent(@PathVariable Long id) {
        return eventService.deleteEvent(id);
    }

    @GetMapping("events")
    public List<Event> getAllEventsByDate(@RequestParam LocalDate date) {
        return eventService.getAllEventsByDate(date);
    }
}
