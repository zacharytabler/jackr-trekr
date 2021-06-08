package com.jackrtrekr.jackrtrekrteam3.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @ManyToOne
    private Continent continent;

    public Long getId(){
        return id;
    }

    public String getLocation(){
        return location;
    }

    public Continent getContinent(){
        return continent;
    }

    public Region() {

    }

    public Region (String location, Continent continent){
        this.location = location;
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(id, region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
