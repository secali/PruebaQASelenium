package pages;

public class INNOcvPage extends BasePage{

    //URLS Y XPATH PARA LOCALIZAR ELEMENTOS
    private String URL_INNO = "https://www.innocv.com/";
    private String BARRA_CONTACTOS = "//a[contains(text(),'Contacto')]";
    private String CONTACTOS_TELF = "//span[contains(text(),'(+34) 91 192 38 32')]";
    private String CONTACTO_AVI_LEG = "//li[contains(text(),'AVISO LEGAL')]";
    private String AVI_LEGAL_TEXT = "//body";

    private String CONTACTO_TEXTO = "//html//body";

    private String CONTACTO_CAMPO_REQ = "//p[@class='MuiFormHelperText-root jss229 Mui-error']";
    private String CONTACTO_FORM_BOTON = "//button[@type='button']";

    private String telf_contacto ="";
    private String text_aviso = "";
    private String text_contacto ="";
    private String text_alerta_formulario ="";


    public INNOcvPage() {
        super(driver);
    }


    public void navigateToInno(){
        navigateTo(URL_INNO);
    }

    public void clickContactos(){
        clickElement(BARRA_CONTACTOS);
    }

    public void clickAvisoLegal(){
        clickElement(CONTACTO_AVI_LEG);
    }

    public void ContactoTelf(){
        telf_contacto = textFromElement(CONTACTOS_TELF);
    }

    public String getContactoTelf(){return telf_contacto;}

    public void AvisoText(){
        text_aviso = textFromElement(AVI_LEGAL_TEXT);
    }

    public String getAvisoText(){
        return text_aviso;
    }

    public void ContactoTexto(){
        text_contacto = textFromElement(CONTACTO_TEXTO);
    }

    public String getContactoTexto(){return text_contacto;}


    public void clickFormularioBoton(){
        clickElement(CONTACTO_FORM_BOTON);
    }

    public void alertaFormulario(){
        textFromElement(CONTACTO_CAMPO_REQ);
    }

    public String getAlertaFormulario(){return text_alerta_formulario;}
}
