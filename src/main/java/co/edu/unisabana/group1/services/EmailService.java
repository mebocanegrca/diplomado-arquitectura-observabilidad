package co.edu.unisabana.group1.services;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class EmailService {

    private final Counter successCounter;
    private final Counter failureCounter;
    private final Timer sendTimer;
    private final Random random = new Random();

    public EmailService(MeterRegistry registry) {
        this.successCounter = Counter.builder("email_sent_success_total")
                .description("Número total de correos enviados exitosamente")
                .register(registry);

        this.failureCounter = Counter.builder("email_sent_failure_total")
                .description("Número total de correos fallidos")
                .register(registry);

        this.sendTimer = Timer.builder("email_processing_duration")
                .description("Duración del proceso de envío de correos")
                .register(registry);
    }

    public void sendEmail() {
        sendTimer.record(() -> {
            try {
                // Simulamos tiempo de envío
                TimeUnit.SECONDS.sleep(random.nextInt(3) + 1);

                // Simulamos 80% éxito, 20% fallo
                if (random.nextDouble() < 0.8) {
                    successCounter.increment();
                    System.out.println("Correo enviado exitosamente");
                } else {
                    failureCounter.increment();
                    System.out.println("Fallo al enviar correo");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
}
