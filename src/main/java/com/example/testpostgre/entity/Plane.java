package com.example.testpostgre.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Plane")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long plane_id;
    private String name;
    private String color;


}
