package com.example.myappzhecunniu;

import lombok.Data;

/**
 * Created by 我的世界不止有我 on 2019/2/25.
 */
@Data
public class Beis {
    private String message;
    public Beis (String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
