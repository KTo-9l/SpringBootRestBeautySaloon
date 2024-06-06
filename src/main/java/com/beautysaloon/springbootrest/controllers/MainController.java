package com.beautysaloon.springbootrest.controllers;

import com.beautysaloon.springbootrest.models.Client;
import com.beautysaloon.springbootrest.models.Stylist;
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

    @PostMapping(path="/addStylist")
    public @ResponseBody Stylist addNewStylist(@RequestBody Stylist stylist) {
        stylistsRepository.save(stylist);
        return stylistsRepository.findById(stylist.getId()).orElse(null);
    }

    @GetMapping(path="/getStylists")
    public @ResponseBody Iterable<Stylist> getAllStylists() {
        return stylistsRepository.findAll();
    }

    @PutMapping(path="/updateStylist")
    public @ResponseBody Stylist updateStylist(@RequestBody Stylist stylist) {
        stylistsRepository.save(stylist);
        return stylistsRepository.findById(stylist.getId()).orElse(null);
    }

    @DeleteMapping(path="/deleteStylist")
    public @ResponseBody Stylist deleteStylist(@RequestBody Stylist stylist) {
        stylistsRepository.softDelete(stylist.getId());
        return stylistsRepository.findById(stylist.getId()).orElse(null);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @PostMapping(path="/addClient")
    public @ResponseBody Client addNewClient(@RequestBody Client client) {
        clientsRepository.save(client);
        return clientsRepository.findById(client.getId()).orElse(null);
    }

    @GetMapping(path="/getClients")
    public @ResponseBody Iterable<Client> getAllClients() {
        return clientsRepository.findAll();
    }

    @PutMapping(path="/updateClient")
    public @ResponseBody Client updateClient(@RequestBody Client client) {
        clientsRepository.save(client);
        return clientsRepository.findById(client.getId()).orElse(null);
    }

    @DeleteMapping(path="/deleteClient")
    public @ResponseBody Client deleteClient(@RequestBody Client client) {
        clientsRepository.softDelete(client.getId());
        return clientsRepository.findById(client.getId()).orElse(null);
    }
}
