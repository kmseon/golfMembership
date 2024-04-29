package com.example.golfMembership.controller;


import com.example.golfMembership.dto.ClassInfoDto;
import com.example.golfMembership.dto.MemberDto;
import com.example.golfMembership.dto.TeacherDto;
import com.example.golfMembership.service.GolfMembershipService;
import jakarta.persistence.ManyToOne;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class GolfMembershipController {

    private final GolfMembershipService golfMembershipService;

    public GolfMembershipController(GolfMembershipService golfMembershipService) {
        this.golfMembershipService = golfMembershipService;
    }

    @GetMapping("/")
    public String mainView(){
        return "/golfMembershipView/index";
    }

    @GetMapping("/teacherView")
    public String teacherView(Model model){
        List<TeacherDto> teacherDtoList = golfMembershipService.teacherList_all();
        log.info(teacherDtoList.toString());
        model.addAttribute("teacherDtoList", teacherDtoList);
        return "/golfMembershipView/teacherList";
    }

    @GetMapping("/subscriptionForm")
    public String subscriptionForm(Model model){
        List<MemberDto> memberDtoList = golfMembershipService.classInfoList_all();
        log.info(memberDtoList.toString());
        model.addAttribute("memberDtoList", memberDtoList);
        List<TeacherDto> teacherDtoList = golfMembershipService.teacherList_all();
        log.info(teacherDtoList.toString());
        model.addAttribute("teacherDtoList", teacherDtoList);
        return "/golfMembershipView/subscriptionForm";
    }

    @GetMapping("/memberView")
    public String memberView(Model model){
        List<MemberDto> memberDtoList = golfMembershipService.memberList_all();
        log.info(memberDtoList.toString());
        model.addAttribute("memberDtoList", memberDtoList);
        return "/golfMembershipView/memberList";
    }
}
