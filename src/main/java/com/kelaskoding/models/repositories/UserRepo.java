package com.kelaskoding.models.repositories;

import com.kelaskoding.models.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {
    
}
