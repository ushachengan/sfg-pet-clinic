package com.mobileiron.sfgpetclinic.services.map;

import com.mobileiron.sfgpetclinic.model.Pet;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    void delete(Pet object) {
        super.delete(object);
    }

    @Override
    Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }
}
