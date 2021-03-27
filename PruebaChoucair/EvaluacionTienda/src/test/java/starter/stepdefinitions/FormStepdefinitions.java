package starter.stepdefinitions;

import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.Form.doRegistrationForm;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FormStepdefinitions {

    String name;

    @Before
    public void settheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("(.*) nuevo aspirante accede a la web de Empleados")
    public void que_un_nuevo_aspirante_accede_a_la_web_de_Empleados(String name) {
        this.name = name;
    }

    @When("el selecciona un empleo")
    public void el_selecciona_un_empleo() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                doRegistrationForm.whithCredentials("juan", "juanmanuel125@gmail.com", "3006756569",
                                            "8 meses", "8 meses", "Me gusta y quisiera apreder más",
                                            "1800000", "me gustaría trabajar acá ya que es una empresa internacional y con años de experiencia para poder formar mi carrera profesional ")
        );
    }

    @Then("el agrega datos personales al formulario y los envia")
    public void el_agrega_datos_personales_al_formulario_y_los_envia() {

    }

}
