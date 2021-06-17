package com.jackrtrekr.jackrtrekrteam3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private String contImage;

    @OneToMany(mappedBy = "continent")
    private Collection<Region> regions;

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getContImage() {return contImage;}

    public Collection<Region> getRegions() {
        return regions;
    }

    public Continent() {

    }

    public Continent(String location, String contImage, Region... regions) {
        this.location = location;
        this.contImage = contImage;
        this.regions = new ArrayList<>(Arrays.asList(regions));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
