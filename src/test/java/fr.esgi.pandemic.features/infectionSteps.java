package fr.esgi.pandemic.features;

import fr.esgi.pandemic.domain.city.City;
import fr.esgi.pandemic.domain.city.CityName;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Maps;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Locale;
import java.util.Map;
import static fr.esgi.pandemic.domain.city.CityName.PARIS;

public class infectionSteps {

    Map<CityName, City> map = Maps.newHashMap(PARIS, new City(PARIS));

    @ParameterType(".*")
    public CityName cityName(String cityName){
        return CityName.valueOf(cityName.toUpperCase(Locale.ROOT));
    }


    @Given("{city} has not bean infected")
    public void parisHasNotBeanInfected(City city) {

        city.setInfectionLevel(0);

        System.out.println(city);
        throw new io.cucumber.java.PendingException();
    }

    @When("{city} is infected")
    public void parisIsInfected() {
    }

    @Then("{city}' infection level should be increase to {int}")
    public void parisInfectionLevelShouldBeIncreaseTo(int arg0) {
        Assertions.assertThat(city.)
    }
}
