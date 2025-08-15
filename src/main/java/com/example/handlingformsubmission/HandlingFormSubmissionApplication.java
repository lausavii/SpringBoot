/*
 * Laura Savinon
 * COP 3330C
 *
 * Program Objective:
 * This is the main Spring Boot application class that bootstraps and launches
 * the web application for handling form submissions related to Greetings.
 *
 * Inputs:
 * - The application listens for HTTP requests on specified endpoints.
 *
 * Outputs:
 * - It serves HTML pages and processes form data submitted by users.
 */

package com.example.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class that starts the Spring Boot application.
 */
@SpringBootApplication
public class HandlingFormSubmissionApplication {

    /**
     * Main method that serves as the entry point to launch the Spring Boot application.
     */
    public static void main(String[] args) {
        // Bootstraps and runs the Spring application, starting the web server
        SpringApplication.run(HandlingFormSubmissionApplication.class, args);
    }

}
