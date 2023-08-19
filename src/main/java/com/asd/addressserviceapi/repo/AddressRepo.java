package com.asd.addressserviceapi.repo;

import com.asd.addressserviceapi.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface AddressRepo extends JpaRepository<Address,String> {

    Optional<Address> findById(String id);
}
