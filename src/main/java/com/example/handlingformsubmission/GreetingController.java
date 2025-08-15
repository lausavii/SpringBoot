package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * GreetingController handles HTTP requests related to greeting forms.
 * It manages displaying the form and processing the submitted greeting data.
 */
@Controller
public class GreetingController {

    /**
     * Handles GET requests to "/greeting".
     * Prepares and displays the greeting form by adding an empty Greeting object
     */
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        // Add a new, empty Greeting object to the model for the form to bind to
        model.addAttribute("greeting", new Greeting());
        return "greeting"; // Return the name of the Thymeleaf template to display
    }

    /**
     * Handles POST requests to "/greeting".
     * Receives the submitted Greeting object from the form, adds to the form,
     * and forwards to the result  to display the submitted data.
     */
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        // Add the submitted Greeting object back to the form for display in the result page
        model.addAttribute("greeting", greeting);
        return "result"; // Return the name of the Thymeleaf template to show the result
    }

}
