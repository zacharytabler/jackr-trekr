package com.jackrtrekr.jackrtrekrteam3.repositories;

import com.jackrtrekr.jackrtrekrteam3.models.Region;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<Region, Long> {
    Region findRegionById(Long location);

}
