package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String list(@RequestParam(defaultValue = "0") int page, Model model) {
        model.addAttribute("posts", postService.list(PageRequest.of(page, 20)));
        return "list";
    }

    @GetMapping("/post/{slug}")
    public String detail(@PathVariable String slug, Model model) {
        Post post = postService.singlePost(slug);
        model.addAttribute("post", post);
        return "detail";
    }
}
