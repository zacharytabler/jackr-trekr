package com.jackrtrekr.jackrtrekrteam3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;

import javax.annotation.Resource;


@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;
    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private TrekRepository trekRepo;
    @Resource
    private RegionRepository regionRepo;


    @Override
    public void run(String... args) throws Exception {
        Type easy = new Type("Easy");
        Type moderate = new Type("Moderate");
        Type strenuous = new Type("Strenuous");
        Type difficult = new Type("Difficult");
        typeRepo.save(easy);
        typeRepo.save(moderate);
        typeRepo.save(strenuous);
        typeRepo.save(difficult);

        Continent northAmerica = new Continent("North America", "/images/northamericacontimage.jpg");
        Continent southAmerica = new Continent("South America", "images/southamericacontimage.jpg");
        Continent africa = new Continent("Africa", "/images/africacontimage.jpg");
        Continent asia = new Continent("Asia","/images/africacontimage.jpg");
        Continent europe = new Continent("Europe", "/images/africacontimage.jpg");
        Continent antarctica = new Continent("Antarctica", "/images/africacontimage.jpg");
        Continent australia = new Continent("Australia", "/images/africacontimage.jpg");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(europe);
        continentRepo.save(antarctica);
        continentRepo.save(australia);

        Region mountainousWest = new Region("The Mountainous West", northAmerica);
        Region greatPlains = new Region("The Great Plains", northAmerica);
        Region canadianShield = new Region("The Canadian Shield", northAmerica);
        Region variedEasternRegion = new Region("The Varied Eastern Region", northAmerica);
        Region caribbean = new Region("The Caribbean", northAmerica);
        Region patagonia = new Region("Patagonia", southAmerica);
        Region andesMountains = new Region("The Andes Mountains", southAmerica);
        Region brazilianCoastline = new Region("The Brazilian Coastline", southAmerica);
        Region amazon = new Region("The Amazon", southAmerica);
        Region pantanal = new Region("The Pantanal", southAmerica);
        Region balkanPeninsula = new Region("The Balkan Peninsula", europe);
        Region iberianPeninsula = new Region("The Iberian Peninsula", europe);
        Region italianPeninsula = new Region("The Italian Peninsula", europe);
        Region scandinavianPeninsula = new Region("The Scandinavian Peninsula", europe);
        Region fennoscandianPeninsula = new Region("The Fennoscandian Peninsula", europe);
        Region jutlandPeninsula = new Region("The Jutland Peninsula", europe);
        Region france   = new Region("France", europe);
        Region sahel = new Region("The Sahel", africa);
        Region sahara = new Region("The Sahara", africa);
        Region ethiopianHighlands = new Region("The Ethiopian Highlands", africa);
        Region savanna = new Region("The Savanna", africa);
        Region swahiliCoast = new Region("The Swahili Coast", africa);
        Region rainForest = new Region("The Rain Forest", africa);
        Region africanGreatLakes = new Region("The African Great Lakes", africa);
        Region southernAfrica = new Region("Southern Africa", africa);
        Region centralAsia = new Region("Central Asia", asia);
        Region antarcticPeninsula = new Region("Antarctic Peninsula", antarctica);
        Region eastAntarctica = new Region("East Antarctica", antarctica);
        Region southPole = new Region("South Pole", antarctica);
        Region westAntarctica = new Region("West Antarctica", antarctica);
        Region rossSea = new Region("Ross Sea", antarctica);
        Region australianCapitalTerritory = new Region("Australian Capital Territory", australia);
        Region newSouthWales = new Region("New South Wales", australia);
        Region northernTerritory = new Region("Northern Territory", australia);
        Region queensLand = new Region("Queensland", australia);
        Region southAustralia = new Region("South Australia", australia);
        Region tasmaniaHobart = new Region("Tasmania-Hobart", australia);
        Region victoriaMelbourne = new Region("Victoria-Melbourne", australia);
        Region westernAustralia = new Region("Western Australia", australia);
        Region southeastAsia = new Region("Southeast Asia", asia);
        Region eastAsia = new Region("East Asia", asia);
        Region southAsia = new Region("South Asia", asia);
        Region southwestAsia = new Region("Southwest Asia", asia);

        regionRepo.save(mountainousWest);
        regionRepo.save(patagonia);
        regionRepo.save(balkanPeninsula);
        regionRepo.save(sahara);
        regionRepo.save(centralAsia);
        regionRepo.save(southPole);
        regionRepo.save(newSouthWales);
        regionRepo.save(queensLand);
        regionRepo.save(greatPlains);
        regionRepo.save(canadianShield);
        regionRepo.save(variedEasternRegion);
        regionRepo.save(caribbean);
        regionRepo.save(andesMountains);
        regionRepo.save(brazilianCoastline);
        regionRepo.save(amazon);
        regionRepo.save(pantanal);
        regionRepo.save(iberianPeninsula);
        regionRepo.save(italianPeninsula);
        regionRepo.save(scandinavianPeninsula);
        regionRepo.save(fennoscandianPeninsula);
        regionRepo.save(jutlandPeninsula);
        regionRepo.save(france);
        regionRepo.save(sahara);
        regionRepo.save(sahel);
        regionRepo.save(ethiopianHighlands);
        regionRepo.save(savanna);
        regionRepo.save(swahiliCoast);
        regionRepo.save(rainForest);
        regionRepo.save(africanGreatLakes);
        regionRepo.save(southernAfrica);
        regionRepo.save(australianCapitalTerritory);
        regionRepo.save(northernTerritory);
        regionRepo.save(southAustralia);
        regionRepo.save(tasmaniaHobart);
        regionRepo.save(victoriaMelbourne);
        regionRepo.save(westernAustralia);
        regionRepo.save(southeastAsia);
        regionRepo.save(eastAsia);
        regionRepo.save(southAsia);
        regionRepo.save(southwestAsia);
        regionRepo.save(antarcticPeninsula);
        regionRepo.save(eastAntarctica);
        regionRepo.save(westAntarctica);
        regionRepo.save(rossSea);

//        Continent: Asia
        Trek annaPurna = new Trek("Annapurna Circuit", "The Annapurna Circuit is a trek within the mountain ranges of central Nepal. The total length of the route varies between 100 and 145 miles. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill.", asia, southAsia, difficult, "Annapurna Circuit Pack List", "Fifteen to Twenty Five Days", "It was great!");
        trekRepo.save(annaPurna);
        
        Trek banaueRiceTerraces = new Trek("Banaue Rice Terraces", "The terraces are located approximately 4,900 feet above sea level. These are fed by an ancient irrigation system from the rainforests above the terraces.", asia, southeastAsia, easy, "Backpack, Water bottle, Walking stick, Rain jacket.","Two to Three days.", "It was fun" );
        trekRepo.save(banaueRiceTerraces);
        
        Trek kumanoKodo = new Trek("Kumano Kodo", "The Kumano Kodo has various routes, with most people spending 2-4 days. Reaches elevated height of up to 3280 feet. The most popular is the Nakahechi route.", asia, eastAsia, easy, "Backpack, Walking Stick, Jacket, Water bottle, Sleeping bag, Head Lamp", "Two to Three days.", "This is a review.");
        trekRepo.save(kumanoKodo);
        
        Trek mountFuji = new Trek("Mount Fuji", "Climbing Mount Fuji is a challenge and is something that all Japanese do at least once in their life. Reached heights of up to 12,400 feet makes this a challenge. The trek lasts two days and there are no straight roads, it’s all uphill, so it’s best to be prepared.", asia, eastAsia, difficult, "Backpack, Walking Stick, Cramptons, Sleeping bag, Head lamp, Waterproof climbing shoes.", "Two days.", "There was a big mountain, but I didn't see it!");
        trekRepo.save(mountFuji);
        
        Trek shamanseerMountain = new Trek("Shamanseer Mountain", "This is a very light trail that will only take about 2-3 days to complete. Hikers will walk a total of 65 miles over. Heights will reach up to 5500 feet. The path is pretty rocky.", asia, southwestAsia, easy, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor", "Two to Three days.", "It is super hot!");
        trekRepo.save(shamanseerMountain);
        
        Trek danaToPetra = new Trek("Dana to Petra Trek", "Trek for eight days through Jordan's beautiful and rugged countryside, following the 'Jordan Trail' from Dana Nature Reserve to the ancient 'Rose-Red City' of Petra, and camping Bedouin style. Enjoy a wonderful week of discovery, walking and Jordanian hospitality. This trek will reach heights of 3800 feet.", asia, southwestAsia, moderate, "Backpack, water bottle, sleeping bag, hat or visor, sunscreen.", "Eight days.", "It's hot");
        trekRepo.save(danaToPetra);
        
        Trek everestBaseCamp = new Trek("Everest Base Camp", "The trek to Everest Base Camp is among the most dramatic and picturesque in the Himalaya. The scenery is varied and spectacular, the lodgings and tracks are of a very high standard. Will reach heights of 29,000 feet.", asia, southAsia, difficult, " 2 pairs of climbing boots, Cramptons, Ice Axes, Cramptoms, Backpack, Sleeping Bag, Cooking Stove, Ropes, Winter Clothing, Head Lamp.", "Tweleve days", "Its another review.");
        trekRepo.save(everestBaseCamp);

        //      Continent:Antarctica
        Trek theOceanEndeavour = new Trek("The Ocean Endeavour", "Explore the natural environment and closeup encounters with wildlife on our forward-facing zodiac’s and on foot.", antarctica, southPole, difficult, "Raft, Water bottle, Food, Head Lamp", "Eleven days", "Very fun, 11 days in the ocean!");
        trekRepo.save(theOceanEndeavour);

        //      Continent: Africa
        Trek mountKilimanjaro = new Trek ("Mount Kilimanjaro", "The highest mountain in Africa—rising to 5,895 more than 19,000 feet in elevation.", africa, savanna, moderate, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor","Three to Five days", "Its hot.");
        trekRepo.save(mountKilimanjaro);

        Trek maasaiMara = new Trek("Maasai Mara.", "The Maasai Mara offers several cross-counrty tours. It is all across flat lands.", africa, southernAfrica, moderate,"Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor", "Five to seven days", "Wonder scenery!");
        trekRepo.save(maasaiMara);

        Trek blydeRiverCanyon = new Trek("Blyde River Canyon", "This lush valley is the third-largest canyon in the world, and is marked by a clear, blue river cutting through sheer stone drop-offs 800 meters high.", africa, southernAfrica, strenuous, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife", "Twenty Days", "It was a long trip");
        trekRepo.save(blydeRiverCanyon);

        Trek danakilDepression = new Trek("Danakil Depression", "The Danakil Depression is one of the most inhospitable places on the planet, and yet life flourishes here. The Afar people thrive here.", africa, ethiopianHighlands, moderate, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor, Head Lamp", "One day and One Night", "Fun time!");
        trekRepo.save(danakilDepression);

        Trek livingstonia = new Trek("Livingstonia", "Livingstonia is 900 meters above the lake and is accessible by either driving up hairpin African dirt roads or hiking from Khondowe.", africa, africanGreatLakes, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor", "One day","Quick and easy!");
        trekRepo.save(livingstonia);


//      Continent:Australia
        Trek larapintaTrail = new Trek("Larapinta Trail", "One-way walk; good road access along track, including at ends", australia, northernTerritory, difficult, "Backpack, Walking Stick, Sleeping bag, Head lamp, Waterproof climbing shoes, Hat or visor, sunscreen.", "Eleven to fifteen days.","It was hot, it sucked!");
        trekRepo.save(larapintaTrail);

        Trek fraserIslandGreatWalk = new Trek("Fraser Island Great Walk", "One is a spectacular World Heritage area, with pristine lakes, rare rainforests growing on sand.", australia, tasmaniaHobart, easy,"Backpack, Walking Stick, Sleeping bag, Hat or visor, sunscreen.", "Three to five days", "I got lost, but then found my guide!");
        trekRepo.save(fraserIslandGreatWalk);

        Trek wildernessCoastWalk = new Trek("Wilderness Coast Walk", " One-way; boat transport required at one end, road access at other", australia, victoriaMelbourne, moderate, "Five to seven days", "Backpack, Walking Stick, Sleeping bag, Head lamp, Waterproof climbing shoes, Hat or visor, sunscreen.", "Once in a lifetime experience!");
        trekRepo.save(wildernessCoastWalk);


//      Continent: Europe
        Trek tourDeMontBlanc = new Trek("Tour De Mont Blanc", " This mother of all treks circumnavigates the mighty slopes of the highest mountain in the Alps", europe,france, difficult,"Backpack, Walking Stick, Sleeping bag, Head lamp, Waterproof climbing shoes.","ten to fifteen days","Once in a lifetime adventure");
        trekRepo.save(tourDeMontBlanc);

        Trek norwegianFjords = new Trek("Norwegian Fjords", "Take the family on treks over blue glaciers, viewing mountains that come straight up from the narrow fjords.",europe, northernTerritory, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor","One day", "Fun for the whole family!");
        trekRepo.save(norwegianFjords);

        Trek tourDeMonteRosa = new Trek("Tour De Monte Rosa", "The trek around this 15710 foot mountain is stunning - and it is not easy. Every day there are steep ascents and descents over ice and rock.", europe, italianPeninsula, difficult,"Backpack, Walking Stick, Sleeping bag, Head lamp, Waterproof climbing shoes.", "Eleven to fifteen days", "Hardest thing I have ever done!");
        trekRepo.save(tourDeMonteRosa);

        Trek canaryIslands = new Trek("Canary Islands", "Enerife boasts the world’s 3rd highest volcano, pine forests, ravines and coastal paths.", europe, iberianPeninsula, easy, "Backpack, Walking Stick, Sleeping bag, Head lamp, Waterproof climbing shoes.", "Two to three days.", "Its was awesome!");
        trekRepo.save(canaryIslands);


//      Continent: South America
        Trek chapadaDiamantinaNationalPark = new Trek("Chapada Diamantina National Park", "One of the most beautiful National Parks in Brazil, Chapada Diamantina is located in Bahia in northeast Brazil", southAmerica, brazilianCoastline, moderate, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor", "Two to five days", "It was wonderful!");
        trekRepo.save(chapadaDiamantinaNationalPark);

        Trek theIncaTrail = new Trek("The Inca Trail", "When you think of trekking in South America, you think of the Inca Trail", southAmerica, brazilianCoastline, moderate, "Water Bottle, Sleeping bag or tent, Sunglasses, Sunscreen, Hat or Visor", "Three to five days", "Once in a lifetime chance to see these sites!");
        trekRepo.save(theIncaTrail);

        Trek theLostCity = new Trek("The Lost City", "Colombia’s Inca Trail, the Lost City trek is the country’s best multi-day trekking option.", southAmerica, amazon, moderate, "Water Bottle, Sleeping bag or tent, Sunglasses, Sunscreen, Hat or Visor.", "Three to Five days", "Stunning...");
        trekRepo.save(theLostCity);


//      Continent: North America
        Trek yellowstone = new Trek("Yellowstone Park", "Yellowstone National Park in Wyoming, Montana and Idaho is a hiker's paradise, with approximately 1,000 miles of hiking trails across more than 2.2 million acres.", northAmerica, mountainousWest, difficult, "Five to Seven days", "Water Bottle, Sleeping bag or tent, Sunglasses, Sunscreen, Hat or Visor", "Stunning");
        trekRepo.save(yellowstone);

        Trek grandTetonNationalPark = new Trek("Grand Teton National Park", "The park, which sits in Wyoming's Jackson Hole valley, caters to every level of hiker with its more than 200 miles of trails", northAmerica, greatPlains, moderate,"Water Bottle, Sleeping bag or tent, Sunglasses, Sunscreen, Hat or Visor", "One to five days", "Offers single or multi-day hikes!");
        trekRepo.save(grandTetonNationalPark);

        Trek theAppalachianTrail = new Trek("The Appalachian Trail", "The Appalachian Trail is a 2,180+ mile long public footpath that traverses the scenic, wooded, pastoral, wild, and culturally resonant lands of the Appalachian Mountains.", northAmerica, variedEasternRegion, strenuous, "Water Bottle, Sleeping bag, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife, Firearm.", "One to three months", "The hardest thing I have done ever!");
        trekRepo.save(theAppalachianTrail);



    }

}
