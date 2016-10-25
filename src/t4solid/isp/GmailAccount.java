package t4solid.isp;

/**
 * Created by joseba on 26/10/2016.
 */
public class GmailAccount implements EmailContact{
    String name, emailAddress;

    @Override
    public void setEmailAddress(String ea) {
        name = ea;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}