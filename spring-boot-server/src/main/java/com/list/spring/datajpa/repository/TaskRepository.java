package com.list.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.list.spring.datajpa.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findByStatus(boolean status);
	List<Task> findByTitleContaining(String title);
}
