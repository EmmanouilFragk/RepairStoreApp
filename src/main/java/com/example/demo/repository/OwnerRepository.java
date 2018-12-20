package com.example.demo.repository;

import com.example.demo.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends JpaRepository <Owner, Long> {

    Owner findOwnerByEmailAndPassword(String email, String password);

    Owner findOwnerByUserName(String userName);

    Optional<Owner> findOwnerByTaxRegistrationNumber(String tax_reg_num);

    void deleteById(Long id);
    Owner save(Owner user);

    Owner findByEmail(String email);
    Owner findOwnerById(Long id);

    List<Owner> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email);

}
