package com.ijse.Springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.Task;

@Service
public interface TaskService {
    List<Task>getTaskList();//reading
    Task createTask(Task task);//creating
    Task getTaskById(Long id);//finding task by its primary key
    Task updateTask(Long Id,Task task);//find task and update task
    void deleteTask(Long id);//delete task,here use void type,because after delete there is no returns

}
