
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class frmEmail {
    
     public void mail()
     {
            final String username = "cableskyline@gmail.com";
            final String password = "cableproject";

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.host", "mail.javatpoint.com");  
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session;
            session = Session.getInstance(props,
            new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(username, password);
            }
            });

            try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("dikshawuthoo@gmail.com"));
                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse("dikshawuthoo@gmail.com"));
                    message.setSubject("Bill");
                    message.setText("Dear Mail Crawler,"
                            + "\n\n No spam to my email, please!");
                    BodyPart messageBodyPart1 = new MimeBodyPart();  
                    messageBodyPart1.setText("My bill");  

                    MimeBodyPart messageBodyPart2 = new MimeBodyPart();  

                    String filename = "C:\\Users\\Neha\\Documents\\NetBeansProjects\\Cable\\Bill.pdf"; 
                    DataSource source = new FileDataSource(filename);  
                    messageBodyPart2.setDataHandler(new DataHandler(source));  
                    messageBodyPart2.setFileName(filename);  

                    Multipart multipart = new MimeMultipart();  
                    multipart.addBodyPart(messageBodyPart1);  
                    multipart.addBodyPart(messageBodyPart2);  

                    message.setContent(multipart);  

                    Transport.send(message);

                    System.out.println("Done");

            } catch (MessagingException ex) {
                    ex.printStackTrace();
            }
     }
}
