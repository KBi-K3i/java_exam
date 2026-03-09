package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {

    @NotBlank(message = "名前の入力は必須です")
    private String name;

    @NotBlank(message = "メールアドレスの入力は必須です")
    @Email(message = "メールアドレスの形式が不正です")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}
