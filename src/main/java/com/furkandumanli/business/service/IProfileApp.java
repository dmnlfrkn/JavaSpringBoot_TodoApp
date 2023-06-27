package com.furkandumanli.business.service;

import com.furkandumanli.business.dto.TodoDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProfileApp {

    public List<TodoDto> speedDataService();

    public String allDeleteService();

    // App Information
    public String appInformationService(HttpServletRequest request, HttpServletResponse response);
}
