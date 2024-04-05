package com.beautysaloon.springbootrest.controllers;

import com.beautysaloon.springbootrest.models.Clients;
import com.beautysaloon.springbootrest.models.Stylists;
import com.beautysaloon.springbootrest.repository.ClientsRepository;
import com.beautysaloon.springbootrest.repository.StylistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class MainController {
    @Autowired
    private StylistsRepository stylistsRepository;
    @Autowired
    private ClientsRepository clientsRepository;

    @PostMapping(path="/addStylists")
    public @ResponseBody String addNewStylist(@RequestParam String name, @RequestParam Boolean isDeleted) {
        Stylists stylist = new Stylists();
        stylist.setName(name);
        stylist.setDeleted(isDeleted);
        stylistsRepository.save(stylist);
        return "Saved";
    }
    @GetMapping(path="/getStylists")
    public @ResponseBody Iterable<Stylists> getAllStylists() {
        return stylistsRepository.findAll();
    }
    @GetMapping(path="/getClients")
    public @ResponseBody Iterable<Clients> getAllClients() {
        return clientsRepository.findAll();
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
