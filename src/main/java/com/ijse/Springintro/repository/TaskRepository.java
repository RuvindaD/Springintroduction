package com.ijse.Springintro.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.Springintro.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
