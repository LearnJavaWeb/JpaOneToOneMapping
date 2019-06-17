package com.example.jpaonetoone.repository;

import com.example.jpaonetoone.model.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
