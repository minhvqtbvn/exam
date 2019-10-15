package com.example.clientminh.controller;

import com.example.clientminh.service.Employee;
import com.example.clientminh.service.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/employees")
    public class EmployeeController {
        @Autowired
        HelloWorld helloWorld;
        @GetMapping(value = "/list")
        public String listEmployee(Model model) throws RemoteException {
            model.addAttribute("list",helloWorld.getEmployees());
            return "list";
        }
        @GetMapping(value = "/add")
        public String showForm(Model model){
            model.addAttribute("employee",new Employee());
            return "form";
        }
        @PostMapping(value = "/add")
        public String addEmployee(Employee employee) throws RemoteException {
            helloWorld.addEmployees(employee);
            return "redirect:/employees/list";
        }
}

