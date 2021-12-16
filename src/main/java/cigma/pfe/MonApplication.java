package cigma.pfe;

import cigma.pfe.contollers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller"); // controller est l'id dans le fichier Spring.xml
        Client client =new Client(1,"ALAMI");
        ctrl.save(client);
        System.out.println("testing...123");
        System.out.println("RG 123");
        System.out.println("RG 432");
    }
}
