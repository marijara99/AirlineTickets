package com.airlines.solera.dbrepousers;

import com.airlines.solera.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDBRepository extends JpaRepository<Users,Integer> {
}
