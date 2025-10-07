package co.edu.unisabana.group1.tasks;

import co.edu.unisabana.group1.services.EmailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailScheduler {

    private final EmailService emailService;

    public EmailScheduler(EmailService emailService) {
        this.emailService = emailService;
    }

    // Cada 2 minutos (120000 ms)
    @Scheduled(fixedRate = 120000)
    public void simulateEmailSending() {
        System.out.println("INICIA LA SIMULACION DE ENVIO DE CORREOS!!");
        for (int i = 0; i < 10; i++) {
            emailService.sendEmail();
        }
    }
}
