package cigma.pfe.contollers;

import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {

    ClientService clientService;
    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with ClientService param....");
        this.clientService = clientService;
    }

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
    public ClientController() {
        System.out.println("Call ClientController ....");
    }
}
