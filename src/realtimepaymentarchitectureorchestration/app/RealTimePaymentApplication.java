package realtimepaymentarchitectureorchestration.app;

import java.time.*;
import java.util.*;


/**
 * Application entry point for the real-time payment architecture and orchestration demo.
 * This class bootstraps a minimal runtime environment for experimentation and demos.
 */
public class RealTimePaymentApplication {

    public static void main(String[] args) {
        System.out.println("Starting Real-Time Payment Architecture and Orchestration demo...");
        ApplicationConfig config = new ApplicationConfig();
        config.loadDefaults();

        Bootstrapper bootstrapper = new Bootstrapper(config);
        bootstrapper.start();

        System.out.println("Application started. Wire this into your preferred framework or tests.");
    }
}
