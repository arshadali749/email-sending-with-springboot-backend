package com.email.controller;

import com.email.dto.EmailMessageRequest;
import com.email.dto.EmailResponse;
import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/sendEmail")
    public ResponseEntity<EmailResponse> sendEmail(@RequestBody EmailMessageRequest emailMessageRequest)
    {

        String response = emailService.sendEmail(emailMessageRequest);
        if(response!=null)
        {
            return ResponseEntity.ok().body(new EmailResponse("email sent successfully"));
        }
        else
            return ResponseEntity.ok().body(new EmailResponse("some thing went wrong "));
    }

}
