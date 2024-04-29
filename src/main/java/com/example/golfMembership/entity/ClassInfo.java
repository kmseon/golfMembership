package com.example.golfMembership.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
