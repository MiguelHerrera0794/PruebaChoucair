package starter.Form;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class realizarRegistro implements Task {

    private final String crearCorreo;
    private final String nombre;
    private final String apellido;
    private final String clave;
    private final String nombre2;
    private final String apellido2;
    private final String compania;
    private final String direccion1;
    private final String direccion2;
    private final String ciudad;
    private final String codPostal;
    private final String informacionAdicionl;
    private final String nuneroCasa;
    private final String referenciaDireccion;


    public realizarRegistro(String crearCorreo, String nombre, String apellido, String clave, String nombre2, String apellido2, String compania, String direccion1,
                            String direccion2, String ciudad, String codPostal, String informacionAdicionl, String nuneroCasa,
                            String referenciaDireccion){

        this.crearCorreo = crearCorreo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.compania = compania;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.informacionAdicionl = informacionAdicionl;
        this.nuneroCasa = nuneroCasa;
        this.referenciaDireccion = referenciaDireccion;

    }

    public static Performable whithCredentials(String crearCorreo, String nombre, String apellido, String clave, String nombre2, String apellido2, String compania,
                                               String direccion1, String direccion2, String ciudad, String codPostal, String informacionAdicionl,
                                               String nuneroCasa, String referenciaDireccion) {

        return instrumented(realizarRegistro.class, crearCorreo, nombre, apellido, clave, nombre2, apellido2, compania, direccion1, direccion2,
                                                        ciudad, codPostal, informacionAdicionl, nuneroCasa, referenciaDireccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(registrarse.YOU_APPLY_BUTTON),
                Enter.theValue(crearCorreo).into(registrarse.EMAIL_CREATE),
                Click.on(registrarse.YOU_CREATE_ACCOUNT),
                Click.on(registrarse.MISS),
                Enter.theValue(nombre).into(registrarse.FIRST_NAME),
                Enter.theValue(apellido).into(registrarse.LAST_NAME),
                Enter.theValue(clave).into(registrarse.PASSWORD),
                Enter.theValue(nombre2).into(registrarse.FIRST_NAME2),
                Enter.theValue(apellido2).into(registrarse.LAST_NAME2),
                Enter.theValue(compania).into(registrarse.COMPANY),
                Enter.theValue(direccion1).into(registrarse.ADDRESS1),
                Enter.theValue(direccion2).into(registrarse.ADDRESS2),
                Enter.theValue(ciudad).into(registrarse.CITY),
                Click.on(registrarse.STATE),
                Click.on(registrarse.COUNTRY),
                Enter.theValue(codPostal).into(registrarse.POST_CODE),
                Enter.theValue(informacionAdicionl).into(registrarse.ADDITIONAL_INFORMATION),
                Enter.theValue(nuneroCasa).into(registrarse.MOBILE_PHONE),
                Enter.theValue(referenciaDireccion).into(registrarse.ADDRESS_REFERENCES),
                Click.on(registrarse.REGISTER)






        );

    }

}
