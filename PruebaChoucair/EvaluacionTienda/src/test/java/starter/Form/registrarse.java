package starter.Form;

import org.openqa.selenium.By;

public class registrarse {

public static By YOU_APPLY_BUTTON = By.className("login");
public static By EMAIL_CREATE = By.id("email_create");
public static By YOU_CREATE_ACCOUNT = By.id("SubmitCreate");
public  static By MISS = By.id("id_gender1");
//public  static By MISTER = By.id("id_gender2");
public  static By FIRST_NAME =By.id("customer_firstname");
public  static By LAST_NAME =By.id("customer_lastname");
public  static By PASSWORD =By.id("passwd");
public  static By FIRST_NAME2 =By.id("firstname");
public  static By LAST_NAME2 =By.id("lastname");
public  static By COMPANY =By.id("company");
public  static By ADDRESS1 =By.id("address1");
public  static By ADDRESS2 =By.id("address2");
public  static By CITY =By.id("city");
public  static By STATE =By.id("id_state");
public  static By COUNTRY =By.xpath("//select[@id='id_state']/option[5]");
public static By POST_CODE = By.id("postcode");
public static  By ADDITIONAL_INFORMATION =By.id("other");
public static  By MOBILE_PHONE =By.id("phone_mobile");
public  static By ADDRESS_REFERENCES =By.id("alias");
public static By REGISTER =By.id("submitAccount");

}
