package com.example.golfMembership.repository;

import com.example.golfMembership.entity.ClassInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;

public interface ClassInfoRepository extends JpaRepository<ClassInfo, Long> {
    @Query(value = "select * from quiz order by rand() limit 1" , nativeQuery = true)
    Arrays listQuery();
}
