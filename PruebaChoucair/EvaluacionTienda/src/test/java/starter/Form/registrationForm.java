package starter.Form;

import org.openqa.selenium.By;

public class registrationForm {
    public static By YOUR_APPLY_BUTTON = By.xpath("//input[@value='Apply for job']");
    public static By YOUR_NAME_FIELD = By.name("your-name");
    public static By YOUR_EMAIL_FIELD = By.name("your-email");
    public static By YOUR_TEL_FIELD = By.name("tel");
    public static By YOUR_STUDIES_FIELD = By.name("estudios");
    public static By YOUR_EXP_FIELD = By.name("exp");
    public static By YOUR_AUTO_FIELD = By.name("auto");
    public static By YOUR_SALARY_FIELD = By.name("salario");
    public static By YOUR_COURSE_FIELD = By.name("curso");
    public static By YOUR_SELECT_OPTION1 = By.xpath("//option[@value='Inmediata']");
    public static By YOUR_SELECT_OPTION2 = By.xpath("//option[@value='1 a 3 días']");
    public static By YOUR_SELECT_OPTION3 = By.xpath("//option[@value='1 semana']");
    public static By YOUR_SELECT_OPTION4 = By.xpath("//option[@value='2 semanas']");
    public static By YOUR_MESSAGE_FIELD = By.name("your-message");
    public static By YOUR_ARCHIVE_PDF_BUTTON = By.xpath("//input[@class='wpcf7-form-control wpcf7-file wpcf7-validates-as-required']");
    public static By RECAPTCHA_BUTTON = By.xpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-expired']");
    public static By YOUR_SEND_BUTTON = By.xpath("//input[@value='Enviar']");

}
