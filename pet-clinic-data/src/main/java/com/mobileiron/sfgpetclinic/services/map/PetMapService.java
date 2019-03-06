package com.mobileiron.sfgpetclinic.services.map;

import com.mobileiron.sfgpetclinic.model.Pet;
import com.mobileiron.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
