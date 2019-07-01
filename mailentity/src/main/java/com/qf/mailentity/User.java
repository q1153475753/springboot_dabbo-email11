package com.qf.mailentity;

import jdk.nashorn.internal.ir.Flags;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private boolean code;
    private boolean flags;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_mime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date update_time;


}
