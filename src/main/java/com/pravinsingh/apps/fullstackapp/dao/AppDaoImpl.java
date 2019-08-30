package com.pravinsingh.apps.fullstackapp.dao;

import com.pravinsingh.apps.fullstackapp.data.ResponseModel;
import com.pravinsingh.apps.fullstackapp.entity.Person;
import com.pravinsingh.apps.fullstackapp.model.Employee;
import com.pravinsingh.apps.fullstackapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AppDaoImpl implements AppDao {

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostConstruct
    public void init() {
        createAndPopulateInMemoryDB();
    }

    private void createAndPopulateInMemoryDB() {


    }

    @Override
    public Optional<ResponseModel> getData() {
        ResponseModel<Employee> employeeResponseModel = new ResponseModel<>();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pravin", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin2", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin3", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin4", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin5", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin6", "Singh", 29, LocalDate.now()));
        employees.add(new Employee("Pravin7", "Singh", 29, LocalDate.now()));
        employeeResponseModel.setList(employees);
        return Optional.of(employeeResponseModel);
        //return Optional.empty();
    }
    public Optional<List<Person>> getDataFromRepository() {
        return Optional.of(employeeRepository.findAll());
    }
}