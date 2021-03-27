package starter.Form;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class doRegistrationForm implements Task {

    private final String name;
    private final String email;
    private final String tel;
    private final String studies;
    private final String exp;
    private final String auto;
    private final String salary;
    private final String message;


    public doRegistrationForm(String name, String email, String tel, String studies,
                              String exp, String auto, String salary, String message) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.studies = studies;
        this.exp = exp;
        this.auto = auto;
        this.salary = salary;
        this.message = message;
    }

    public static Performable whithCredentials(String name, String email, String tel, String studies,
                                               String exp, String auto, String salary, String message){
        return instrumented(doRegistrationForm.class, name, email, tel, studies, exp, auto, salary, message);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(registrationForm.YOUR_APPLY_BUTTON),
                Enter.theValue(name).into(registrationForm.YOUR_NAME_FIELD),
                Enter.theValue(email).into(registrationForm.YOUR_EMAIL_FIELD),
                Enter.theValue(tel).into(registrationForm.YOUR_TEL_FIELD),
                Enter.theValue(studies).into(registrationForm.YOUR_STUDIES_FIELD),
                Enter.theValue(exp).into(registrationForm.YOUR_EXP_FIELD),
                Enter.theValue(auto).into(registrationForm.YOUR_AUTO_FIELD),
                Enter.theValue(salary).into(registrationForm.YOUR_SALARY_FIELD),
                Click.on(registrationForm.YOUR_COURSE_FIELD),
                Click.on(registrationForm.YOUR_SELECT_OPTION1),
                Enter.theValue(message).into(registrationForm.YOUR_MESSAGE_FIELD),
                Click.on(registrationForm.YOUR_SEND_BUTTON)

        );
    }
}
