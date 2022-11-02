package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.GooglePage;
import pages.INNOcvPage;
import org.apache.commons.lang3.StringUtils; //para contar ocurrencias de un substring en otro string


public class INNOcvSteps {
	
	//REALMENTE NO DEBERÍAN REALIZARSE LOS CASOS ASÍ, CADA FEATURE (FICHERO ESCRITO EN GHERKIN) DEBERÍA ESTAR LINKADA CON UNA CLASE DE TEST
	//Y SUS TAGS EN CUCUMBER, @GIVEN @WHEN @THEN Y CADA ACCIÓN BAJO SU TAG, LO HE HECHO ASÍ PARA IR MÁS RÁPIDO.
	//DICHO ESTO, TAMBIÉN SERÍA MEJOR HACER LA VALIDACIÓN CON ASSERTS

    public static  void main(String [] args){
        INNOcvPage inno = new INNOcvPage();

        //CASO 01
        inno.navigateToInno();
        inno.clickContactos();
        String telf = inno.getContactoTelf();
        telf = telf.substring(6); //comienza en la posicion 6 para no contar el (+34)

        inno.getAvisoText();
        String text = inno.getAvisoText();

        if(text.contains(telf)) System.out.println("Contiene el numero de telf"); //SERÍA MEJOR COMPROBAR CON ASSERTS!
        else System.out.println("No lo contiene");


        //CASO 02
        inno.navigateToInno();
        inno.clickContactos();

        inno.ContactoTexto();
        String texto_contacto = inno.getContactoTexto();
        System.out.println(StringUtils.countMatches(texto_contacto, "Faraday")); //SERÍA MEJOR COMPROBAR CON ASSERTS!


        //CASO 03
        inno.navigateToInno();
        inno.clickContactos();
        inno.clickFormularioBoton();

        if(inno.getAlertaFormulario()=="") System.out.println("La alerta no ha aparecido"); //SERÍA MEJOR COMPROBAR CON ASSERTS!
        else System.out.println("Alerta aparece!");


        //CASO 04:
        //....



    }

}
