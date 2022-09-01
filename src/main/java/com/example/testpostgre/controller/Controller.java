package com.example.testpostgre.controller;

import com.example.testpostgre.entity.Plane;
import com.example.testpostgre.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private PlaneService planeService;
    @PostMapping("/create")
    public Plane savePlane(@RequestBody Plane plane) {
        return planeService.savePlane(plane);
    }
    @GetMapping("/all")
    public List<Plane> fetchPlaneList(){
        return planeService.fetchPlaneList();
    }
    @GetMapping("/all/{id}")
    public Plane fetchPlanById(@PathVariable("id") Long plane_id){
        return planeService.fetchPlaneById(plane_id);

    }
    @DeleteMapping("/all/{id}")
    public String deletePlaneById(@PathVariable("id") Long plane_id){
        planeService.deletePlaneById(plane_id);
        return "Delete successful";
    }


}
