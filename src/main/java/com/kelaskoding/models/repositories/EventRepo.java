package com.kelaskoding.models.repositories;

import com.kelaskoding.models.entities.Event;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepo extends PagingAndSortingRepository<Event, Long> {
    
}
