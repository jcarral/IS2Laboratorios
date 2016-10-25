package t4solid.isp;

/**
 * Created by joseba on 26/10/2016.
 */
public class MainISP {

    public static void main(String []args){
        GmailAccount gmail = new GmailAccount();
        EmailSender.sendEmail(gmail, "Enviando nuevo email...");
    }
}
