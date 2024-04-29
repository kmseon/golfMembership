package com.example.golfMembership.dto;

import com.example.golfMembership.entity.Member;
import com.example.golfMembership.entity.Teacher;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassInfoDto {
    @Column(name = "class_id",nullable = false)
    private Long classId;
    @Column(name = "regist_month", length = 6)
    private String registMonth;
    @ManyToOne
    @JoinColumn(name = "class_no", referencedColumnName = "member_id")
    Member classNo;
    @Column(name = "class_area", length = 15)
    private String classArea;
    private int tuition;
    @ManyToOne
    @JoinColumn(name = "teacher_code", referencedColumnName = "teacher_code")
    Teacher teacherCode;
}
