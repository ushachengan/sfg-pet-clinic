package com.mobileiron.sfgpetclinic.services.map;

import com.mobileiron.sfgpetclinic.model.Owner;

import java.util.Set;

//import com.mobileiron.sfgpetclinic.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    void delete(Owner object) {
        super.delete(object);
    }

    @Override
    Owner save(Long id, Owner object) {
        return super.save(id, object);
    }

    @Override
    Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    void deleteById(Long id) {
        super.deleteById(id);
    }

}
