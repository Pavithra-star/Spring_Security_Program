package com.example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Person_table, Integer> {
Person_table findByUsername(String username);
}
