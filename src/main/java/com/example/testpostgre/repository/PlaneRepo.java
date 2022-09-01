package com.example.testpostgre.repository;

import com.example.testpostgre.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepo extends JpaRepository<Plane,Long> {
}
