package com.lti.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailServiceImpl {
	public void send(String to, String sub, String msg) {
		
		//PROPERTIES
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		
		//SESSION
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("wheels4hope.lti@gmail.com", "Wheels4Hope@lti");
			}
		});
		
		//MESSAGE
		try 
		{
			MimeMessage message = new MimeMessage(session);
			message.setFrom("wheels4hope.lti@gmail.com");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			message.setContent(msg, "text/html");
			// send message
			Transport.send(message);
			System.out.println("Registration Email Successfully sent to "+to);
		} 
		catch (MessagingException e) 
		{
			throw new RuntimeException(e);
		}

	}
}
