package com.furkandumanli.data.repository;

import com.furkandumanli.data.entity.TodoEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ITodoRepository extends CrudRepository<TodoEntity, Long> {
    // Delivered Query
    TodoEntity findByTodo(String todo);

    // Query
    @Query("select t from TodoEntity t")
    List<TodoEntity> myTodoList();

}
