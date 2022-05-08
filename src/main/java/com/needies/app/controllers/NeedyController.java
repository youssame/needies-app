package com.needies.app.controllers;

import com.needies.app.helpers.Globals;
import com.needies.app.models.Needy;
import com.needies.app.services.NeedyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Globals.NEEDIES_API_PATH)
public class NeedyController {
    @Autowired
    private NeedyService needyService;

    @GetMapping
    public List<Needy> getNeedies() {
        Needy needy = new Needy();
        needy.setName("Test");
        needy.setDescription("Test description");
        needyService.save(needy);
        return needyService.getNeedies();
    }
}
