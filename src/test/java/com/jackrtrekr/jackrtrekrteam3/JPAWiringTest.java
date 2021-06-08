package com.jackrtrekr.jackrtrekrteam3;

import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ContinentRepository continentRepo;

    @Autowired
    private TypeRepository typeRepo;

    @Autowired
    private TrekRepository trekRepo;

    @Test
    public void continentShouldHaveListOfTreks() {
        Continent testContinent = new Continent("Test Location");
        Type testType = new Type("Test Type");
        Region testRegion = new Region("Test Region");
        Trek testTrek = new Trek("Name", "Description", testContinent, testRegion, testType, "packList", "length", "reviews");

        continentRepo.save(testContinent);
        typeRepo.save(testType);
        trekRepo.save(testTrek);

        entityManager.flush();
        entityManager.clear();

        Optional<Continent> retrievedContinentOpt = continentRepo.findById(testContinent.getId());
        Continent retrievedContinent = retrievedContinentOpt.get();
        Trek retrievedTrek = trekRepo.findById(testTrek.getId()).get();
        assertThat(retrievedContinent.getTreks()).contains(testTrek);

    }
}

