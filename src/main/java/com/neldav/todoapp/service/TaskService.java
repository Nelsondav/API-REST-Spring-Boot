package com.neldav.todoapp.service;

import com.neldav.todoapp.exceptions.ToDoExceptions;
import com.neldav.todoapp.mapper.TaskInDTOToTask;
import com.neldav.todoapp.persistence.entity.Task;
import com.neldav.todoapp.persistence.entity.TaskStatus;
import com.neldav.todoapp.persistence.repository.TaskRepository;
import com.neldav.todoapp.service.dto.TaskInDTO;
import org.aspectj.bridge.IMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO){
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }

    public List<Task> findAll(){
        return this.repository.findAll();
    }

    public List<Task> findALLByTaskStatus(TaskStatus status) {
        return this.repository.findAllByTaskStatus(status);
    }

    @Transactional
    public void updateTaskAsFinished(Long id) {
        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions( "Task not found", HttpStatus.NOT_FOUND);
        }

        this.repository.markTaskAsFinished(id);
    }

    public void deleteById(Long id) {
        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions( "Task not found", HttpStatus.NOT_FOUND);
        }

        this.repository.deleteById(id);
    }


}
