package com.qf.springboot_mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
@Service
public class Email {
    public void email() throws MessagingException, UnsupportedEncodingException {

        @Autowired
        JavaMailSender javaMailSender;


            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper messageHelper=new MimeMessageHelper(mimeMessage);
            messageHelper.setFrom("vip_gouzi@sina.cn");
            messageHelper.addTo("1153475753@qq.com","黄金会员");
            messageHelper.setText("我观察你很久了，");
            messageHelper.setSubject("会员续费通知!!!");
            messageHelper .setSentDate(new Date());
            javaMailSender.send(mimeMessage);
        }
}
