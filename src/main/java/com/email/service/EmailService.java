package com.email.service;

import com.email.dto.EmailMessageRequest;

public interface EmailService {
    //use this method to send the email without any attachment.
    public String sendEmail(EmailMessageRequest emailMessageRequest);
    public void sendEmailWIthAttachment(EmailMessageRequest emailMessageRequest);

}
