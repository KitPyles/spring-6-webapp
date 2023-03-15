package guru.springframework.spring6webapp.controllers;

// created by kp on 3/14/2023

import guru.springframework.spring6webapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class BookController {

    private final BookService bookService;

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("title", "All Books");
        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
