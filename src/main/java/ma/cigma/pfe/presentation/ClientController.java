package ma.cigma.pfe.presentation;

import ma.cigma.pfe.dao.ClientDaoImpl;
import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientServiceImpl;
import ma.cigma.pfe.service.IClientService;

public class ClientController {

    IClientService service ;

    public void setService(IClientService service) {
        this.service = service;
    }

    public IClientService getService() {
        return service;
    }

    public void save(Client c){
        System.out.println("Presentation Layer Level...");
        service.save(c);
    }

    public ClientController() {
        System.out.println("Creation d'un objet Client controler");
    }
}
