package com.example.testpostgre.services;

import com.example.testpostgre.entity.Plane;
import com.example.testpostgre.repository.PlaneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PlanServiceImp implements PlaneService{
    @Autowired
    private PlaneRepo planeRepo;
    @Override
    public Plane savePlane(Plane plane) {
        return planeRepo.save(plane);
    }

    @Override
    public List<Plane> fetchPlaneList() {
        return planeRepo.findAll();
    }

    @Override
    public Plane fetchPlaneById(Long plane_id) {
        return planeRepo.findById(plane_id).get();
    }

    @Override
    public void deletePlaneById(Long plane_id) {
        planeRepo.deleteById(plane_id);
    }




}
