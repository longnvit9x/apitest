package com.mkyong.controller;

import com.mkyong.models.User;
import com.mkyong.servies.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/employees", method = GET)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> employees = new UserService().getAllUsers();
        if(employees.isEmpty()) {
            System.out.println("Users Not Found!");
            return new ResponseEntity<List<User>>(NO_CONTENT);
        } else {
            System.out.println("Users Found!");
            return new ResponseEntity<List<User>>(employees, OK);
        }
    }

    @RequestMapping(value = "/employee", params = "id", method = GET)
    public ResponseEntity<User> getById(@RequestParam int id) {
        User employee =  new UserService().findById(id);
        if(employee == null) {
            System.out.println("User ID " + id + " Not Found!");
            return new ResponseEntity<User>(NOT_FOUND);
        } else {
            System.out.println("User ID " + id + " Found!");
            return new ResponseEntity<User>(employee, OK);
        }
    }

    @RequestMapping(value = "/employee", params = "name", method = GET)
    public ResponseEntity<User> getByName(@RequestParam String name) {
        User employee = new UserService().findByName(name);
        if(employee.getId() == 0) {
            System.out.println("User Name " + name + " Not Found!");
            return new ResponseEntity<User>(NOT_FOUND);
        } else {
            System.out.println("User Name " + name + " Found!");
            return new ResponseEntity<User>(employee, OK);
        }
    }

    @RequestMapping(value = "/addUser", method = POST)
    public ResponseEntity<Void> addUser(@RequestBody User employee) {
        if( new UserService().addUser(employee)) {
            System.out.println("Created New User!");
            return new ResponseEntity<Void>(OK);
        } else {
            System.out.println("Can not create new employee!");
            return new ResponseEntity<Void>(BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/updateUser", method = PUT)
    public ResponseEntity<Void> updateUser(@RequestParam("id") int id, @RequestBody User employee) {
        if(new UserService().updateUser(id, employee)) {
            System.out.println("Updated User with ID " + id);
            return new ResponseEntity<Void>(OK);
        } else {
            System.out.println("User ID " + id + " Not Found!");
            return new ResponseEntity<Void>(NOT_FOUND);
        }
    }

    @RequestMapping(value = "/deleteUser", method = DELETE)
    public ResponseEntity<Void> deleteUser(@RequestParam("id") int id) {
        if(new UserService().deleteUser(id)) {
            System.out.println("Deleted User with ID " + id);
            return new ResponseEntity<Void>(OK);
        } else {
            System.out.println("User ID " + id + " Not Found!");
            return new ResponseEntity<Void>(NOT_FOUND);
        }
    }


}