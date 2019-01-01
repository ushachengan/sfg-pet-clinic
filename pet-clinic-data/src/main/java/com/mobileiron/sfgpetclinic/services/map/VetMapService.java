package com.mobileiron.sfgpetclinic.services.map;

import com.mobileiron.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    void delete(Vet object) {
        super.delete(object);
    }

    @Override
    Vet save(Long id, Vet object) {
        return super.save(id, object);
    }

    @Override
    Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }
}
