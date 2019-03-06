package com.mobileiron.sfgpetclinic.services.map;

import com.mobileiron.sfgpetclinic.model.Vet;
import com.mobileiron.sfgpetclinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    //@Override
    //public Vet save(Long id, Vet object) {
        //return super.save(id, object);
    //}

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
