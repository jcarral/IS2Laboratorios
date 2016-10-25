package t4solid.isp;

/**
 * Created by joseba on 26/10/2016.
 */
public class Contacto implements EmailContact, PhoneContact{
    String name, address, emailAddress, telephone;
    public void setName(String n) { name=n; }
    public String getName() { return name; }

    public void setAddress(String a) { address=a; }
    public String getAddress() { return address; }

    public void setEmailAddress(String ea) { emailAddress=ea; }
    public String getEmailAddress() { return emailAddress; }

    public void setTelephone(String t) { telephone=t; }
    public String getTelephone() { return telephone; }

}
