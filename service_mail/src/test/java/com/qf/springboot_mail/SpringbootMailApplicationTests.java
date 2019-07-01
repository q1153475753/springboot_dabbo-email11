package com.qf.springboot_mail;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMailApplicationTests {
    @Autowired
    private JavaMailSender javaMailSender;
    @Test
    public void contextLoads() throws Exception {
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
