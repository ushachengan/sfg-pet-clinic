package com.mobileiron.sfgpetclinic.bootstrap;

import com.mobileiron.sfgpetclinic.model.Owner;
import com.mobileiron.sfgpetclinic.model.Vet;
import com.mobileiron.sfgpetclinic.services.OwnerService;
import com.mobileiron.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Adding owner1");
        Owner owner1 = new Owner();
        owner1.setFirstName("John1");
        owner1.setLastName("Smith1");
        ownerService.save(owner1);

        System.out.println("Adding owner2");
        Owner owner2 = new Owner();
        owner2.setFirstName("John2");
        owner2.setLastName("Smith2");
        ownerService.save(owner2);

        System.out.println("Adding vet1");
        Vet vet1 = new Vet();
        vet1.setFirstName("Gary1");
        vet1.setLastName("Smith1");
        vetService.save(vet1);

        System.out.println("Adding vet2");
        Vet vet2 = new Vet();
        vet2.setFirstName("Gary2");
        vet2.setLastName("Smith2");
        vetService.save(vet2);


    }
}
