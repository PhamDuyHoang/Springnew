package com.example.testpostgre.services;

import com.example.testpostgre.entity.Plane;

import java.util.List;

public interface PlaneService {
    Plane savePlane(Plane plane);


    List<Plane> fetchPlaneList();

    Plane fetchPlaneById(Long plane_id);

    void deletePlaneById(Long plane_id);

}
