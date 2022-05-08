package com.needies.app.services;

import com.needies.app.models.Needy;
import com.needies.app.repositories.NeedyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeedyService {
    @Autowired
    private NeedyRepository needyRepository;

    public Needy save(Needy needy) {
        return needyRepository.save(needy);
    }
    public List<Needy> getNeedies() {
        return needyRepository.findAll();
    }
}
