package com.example.jpaonetoone.controller;

import com.example.jpaonetoone.model.Users;
import com.example.jpaonetoone.model.UsersContact;
import com.example.jpaonetoone.repository.UsersContactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/userscontact")
public class UsersContactController {


    private UsersContactRepository usersContactRepository;

    public UsersContactController(UsersContactRepository usersContactRepository) {
        this.usersContactRepository = usersContactRepository;
    }

    @GetMapping(value = "/all")
    public List<UsersContact> getUsersContact(){
        return usersContactRepository.findAll();
    }
    @GetMapping(value = "/update/{name}")
    public List<UsersContact> update(@PathVariable final String name){
        UsersContact usersContact = new UsersContact();
        Users users = new Users();

        users.setTeamName("Development")
            .setSalary(10000)
            .setName(name);

        usersContact.setPhoneNo(11111)
                .setUsers(users);

        usersContactRepository.save(usersContact);

        return usersContactRepository.findAll();

    }
}
