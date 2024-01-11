package chathealth.chathealth.controller;


import chathealth.chathealth.dto.request.PostWriteDto;
import chathealth.chathealth.dto.response.CustomUserDetails;
import chathealth.chathealth.dto.response.MaterialDto;
import chathealth.chathealth.dto.response.SymptomDto;
import chathealth.chathealth.entity.member.Ent;
import chathealth.chathealth.entity.post.MaterialPost;
import chathealth.chathealth.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/post")
@Slf4j
public class PostController {

    private final PostService postService;

    @GetMapping
    public String post(Model model, Authentication authentication) {
        boolean isAuth = authentication != null && authentication.isAuthenticated();
        model.addAttribute("isAuth", isAuth);
        return "post/post";
    }

    @GetMapping("/write")
    public String write(Model model) {
        List<SymptomDto> symptom=postService.getSymptomList();
        model.addAttribute("symptom",symptom);
        List<MaterialDto> material=postService.getMaterialList();
        model.addAttribute("material",material);
        return "post/write";
    }

    // 1. insert
    @PostMapping("/write")
    public void postWriteProcess(@ModelAttribute PostWriteDto postWriteDto, @AuthenticationPrincipal CustomUserDetails ent) {
        log.info("postWriteDto==={}", postWriteDto);

        List<MaterialPost> materialPostList=new ArrayList<>();
        postWriteDto.getMaterialList().stream().map(material -> materialPostList);
        Ent customUserDetails = Ent.builder().build();
        postService.createPost(postWriteDto, ent, materialPostList);

    }
}
