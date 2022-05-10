package com.hgu.library.controller;

//import com.hgu.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class LibraryController {
//	private BookService bookService;

	@GetMapping("/main")
	public String main() {
		System.out.println("bookList page loaded");
		return "mainPage";
	}
	@GetMapping( "/login")
	public String login() {
		System.out.println("login page loaded");
		return "login";
	}
	@GetMapping("/bookList")
	public String bookList(Model model) {
//		List<BookDto> bookList = bookService.getBooklist();

//		model.addAttribute("bookList", bookList);
		System.out.println("bookList page loaded");
		return "bookList";
	}
	@GetMapping("/bookmark")
	public String bookmark() {
		System.out.println("bookList page loaded");
		return "bookmark";
	}
	@GetMapping("/about")
	public String about() {
		System.out.println("about page loaded");
		return "about";
	}
}
