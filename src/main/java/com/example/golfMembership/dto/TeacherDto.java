package com.example.golfMembership.dto;

import com.example.golfMembership.entity.Teacher;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherDto {
    @Column(name = "teacher_code", length = 3, nullable = false)
    private String teacherCode;
    @Column(name = "teacher_name", length = 15)
    private String teacherName;
    @Column(name = "class_name", length = 20)
    private String className;
    @Column(name = "class_price")
    private int classPrice;
    @Column(name = "teacher_gegist_date", length = 8)
//    @DateTimeFormat(pattern = "yyyy")
    private String teacherGegistDate;

    public static TeacherDto fromTeacherEntity(Teacher teacher) {
        return new TeacherDto(
                teacher.getTeacherCode(),
                teacher.getTeacherName(),
                teacher.getClassName(),
                teacher.getClassPrice(),
                teacher.getTeacherGegistDate()
        );
    }
}

