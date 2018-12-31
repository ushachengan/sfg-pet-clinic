package com.mobileiron.sfgpetclinic.services;

import com.mobileiron.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);

}
