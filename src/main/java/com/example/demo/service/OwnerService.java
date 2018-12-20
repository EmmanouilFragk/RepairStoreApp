package com.example.demo.service;


import com.example.demo.domain.Owner;
import com.example.demo.forms.OwnerForm;
import com.example.demo.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Owner findOwnerById(Long id);

    Owner createOwner(Owner owner);

    List<OwnerModel> findByTaxRegistrationNumberOrEmail(String taxRegistrationNumber, String email);

    List<OwnerModel> findAll();

    Owner update(OwnerForm ownerForm) throws Exception;

    void deleteOwnerById(Long id);


}
