package com.example.golfMembership.service;

import com.example.golfMembership.dto.ClassInfoDto;
import com.example.golfMembership.dto.MemberDto;
import com.example.golfMembership.dto.TeacherDto;
import com.example.golfMembership.repository.ClassInfoRepository;
import com.example.golfMembership.repository.MemberRepository;
import com.example.golfMembership.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GolfMembershipService {
    private final ClassInfoRepository classInfoRepository;
    private final TeacherRepository teacherRepository;
    private final MemberRepository memberRepository;

    public GolfMembershipService(ClassInfoRepository classInfoRepository, TeacherRepository teacherRepository, MemberRepository memberRepository) {
        this.classInfoRepository = classInfoRepository;
        this.teacherRepository = teacherRepository;
        this.memberRepository = memberRepository;
    }

    public List<TeacherDto> teacherList_all() {
        List<TeacherDto> teacherDtoList = new ArrayList<>();
        teacherDtoList = teacherRepository.findAll()
                                            .stream()
                                            .map(x -> TeacherDto.fromTeacherEntity(x))
                                            .toList();
        return teacherDtoList;
    }

    public List<MemberDto> memberList_all() {

        List<MemberDto> memberDtoList = new ArrayList<>();
        memberDtoList = memberRepository.findAll()
                .stream()
                .map(x -> MemberDto.fromMemberEntity(x))
                .toList();
        return memberDtoList;
    }

    public List<MemberDto> classInfoList_all() {
        List<MemberDto> memberDtoList = new ArrayList<>();
        memberDtoList = memberRepository.findAll()
                .stream()
                .map(x ->  MemberDto.fromMemberEntity(x))
                .toList();
        return memberDtoList;

    }
}
