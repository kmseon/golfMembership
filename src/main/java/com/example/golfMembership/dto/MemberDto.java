package com.example.golfMembership.dto;

import com.example.golfMembership.entity.Member;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDto {
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

    public static MemberDto fromMemberEntity(Member member) {
        return new MemberDto(
                member.getMemberId(),
                member.getMemberName(),
                member.getPhone(),
                member.getAddress(),
                member.getGrade()
        );
    }
}
