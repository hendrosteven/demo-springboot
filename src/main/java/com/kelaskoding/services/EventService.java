package com.kelaskoding.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.kelaskoding.models.entities.Event;
import com.kelaskoding.models.repositories.CategoryRepo;
import com.kelaskoding.models.repositories.EventRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EventService {

    @Autowired
    private EventRepo repo;

    @Autowired
    private CategoryRepo categoryRepo;

    public Event saveEvent(Event event){
        if(event.getCategory().getId() == null){
            event.setCategory(categoryRepo.save(event.getCategory()));
        }
        return repo.save(event);
    }

    public Iterable<Event> findAll(){
        return repo.findAll();
    }

    public Optional<Event> findOne(Long id){
        return repo.findById(id);
    }
    
}
