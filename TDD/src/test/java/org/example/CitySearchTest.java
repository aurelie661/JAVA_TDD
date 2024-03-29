package org.example;

import org.example.entity.CitySearch;
import org.example.exception.CityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CitySearchTest {

    private static final List<String> MOCK_CITIES = List.of(
            "Paris",
            "Budapest",
            "Skopje",
            "Rotterdam",
            "Valence",
            "Vancouver",
            "Amsterdam",
            "Vienne",
            "Sydney",
            "New York",
            "Londres",
            "Bangkok",
            "Hong Kong",
            "Dubaï",
            "Rome",
            "Istanbul"
    );
    private CitySearch citySearch;

    @BeforeEach
    public void setup() {
        citySearch = new CitySearch();
    }

    @Test
    public void testSearchCitiesShouldRaiseNotFoundExceptionWhenSearchTextIsLt2char() {
        //Arrange => avec setup
        citySearch.setCities(MOCK_CITIES);
        //Act And Assert When Exception
        Assertions.assertThrowsExactly(CityNotFoundException.class, () -> {
            citySearch.searchCities("t");
        });
    }

    @Test
    void testSearchCitiesShouldReturnCitiesStartWithSearchTextWhenGt2Chars() {
        citySearch.setCities(MOCK_CITIES);

        List<String> cities = citySearch.searchCities("Va");

        Assertions.assertEquals(Arrays.asList("Valence", "Vancouver"), cities);
    }

    @Test
    void testSearchCitiesShouldNotBeCaseSensitive() {
        citySearch.setCities(MOCK_CITIES);

        List<String> cities = citySearch.searchCities("vA");

        Assertions.assertEquals(Arrays.asList("Valence", "Vancouver"), cities);
    }

    @Test
    void testSearchCitiesShouldReturnCitiesContainsSearchTextWhenGt2Chars() {
        citySearch.setCities(MOCK_CITIES);

        List<String> cities = citySearch.searchCities("ape");

        Assertions.assertEquals(Arrays.asList("Budapest"), cities);
    }

    @Test
    void testSearchCitiesShouldReturnAllCitiesWhenSearhTextIsAsterisk() {
        citySearch.setCities(MOCK_CITIES);

        List<String> cities = citySearch.searchCities("*");

        Assertions.assertEquals(MOCK_CITIES, cities);
    }

}
