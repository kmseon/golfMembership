package com.example.golfMembership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @Column(name = "member_id", length = 5, nullable = false)
    private String memberId;
    @Column(name = "member_name", length = 15)
    private String memberName;
    @Column(length = 11)
    private String phone;
    @Column(length = 50)
    private String address;
    @Column(length = 6)
    private String grade;
}
