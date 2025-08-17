package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
	// お名前
    @NotBlank(message = "お名前を入力してください。")
    private String name;

    // メールアドレス
    @Email
    @NotBlank(message = "メールアドレスを入力してください。")
    private String mailAdress;

    // お問合せ内容
    @NotBlank(message = "お問い合わせ内容を入力してください。")
    private String message;
}
