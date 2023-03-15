package guru.springframework.spring6webapp.controllers;

// created by kp on 3/15/2023

import guru.springframework.spring6webapp.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class AuthorController {

    private final AuthorService authorService;

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("title", "All Authors");
        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }
}
