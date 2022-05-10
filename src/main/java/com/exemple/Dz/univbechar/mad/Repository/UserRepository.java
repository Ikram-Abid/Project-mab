package com.exemple.Dz.univbechar.mad.Repository;

import com.exemple.Dz.univbechar.mad.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


}
