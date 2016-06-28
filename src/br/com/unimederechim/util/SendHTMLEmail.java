package br.com.unimederechim.util;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendHTMLEmail {
    private String to;
    private String from;
    private String host;
    private String user;
    private String password;
    private String subject;
    private String message;
       
    public SendHTMLEmail(String host, String to, String from, String subject, String message) {
        this.host = host;
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.message = message;
        
        this.user = "";
        this.password = "";
    }
    
    public boolean Send() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", this.host);
        
        if (!this.user.equals("")) {
            properties.setProperty("mail.user", this.user);
        }
        if (!this.password.equals("")) {
            properties.setProperty("mail.password", this.password);
        }
        
        Session session = Session.getDefaultInstance(properties);
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(this.from));
            
            msg.addRecipient(Message.RecipientType.TO,
                                     new InternetAddress(this.to));
            msg.setSubject(this.subject);
            msg.setContent(this.message, "text/html; charset=ISO-8859-1");
            Transport.send(msg);
            return true;
        }   catch (MessagingException mex) {
            return false;
        }
   }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}