package br.com.belemtech.btprojects.web.client.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.belemtech.btprojects.core.models.Client;
import br.com.belemtech.btprojects.core.repositories.ClientRepository;
import br.com.belemtech.btprojects.web.client.dtos.ClientViewModel;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping
    public ModelAndView index() {
        var clients = clientRepository.findAll()
        .stream()
        .map(ClientViewModel::of)
        .toList();
        // var lstClientViewModel = new ArrayList<ClientViewModel>();
        // for (Client client : clients) {
        //     var clientViewModel = ClientViewModel.of(client);
        //     lstClientViewModel.add(clientViewModel);
        // }
        var model = Map.of("clients", clients);
        //return new ModelAndView("clients/index", Map.of("clients", clients));
        return new ModelAndView("clients/index", model);
    }

}
