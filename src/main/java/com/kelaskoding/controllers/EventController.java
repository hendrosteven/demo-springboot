package com.kelaskoding.controllers;

import java.util.Optional;

import com.kelaskoding.models.entities.Event;
import com.kelaskoding.services.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {
    
    @Autowired
    private EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }

    @GetMapping
    public Iterable<Event> findAll(){
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event findById(@PathVariable("id") Long id){
        Optional<Event> event = eventService.findOne(id);
        if(!event.isPresent()){
            return null;
        }
        return event.get();
    }
}
