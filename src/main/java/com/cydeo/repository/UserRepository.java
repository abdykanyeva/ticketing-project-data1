package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // get user based on username

    User findAllByUserName(String username);


    @Transactional
    void deleteByUserName(String username);

    List<User> findByRoleDescriptionIgnoreCase(String description);

}
