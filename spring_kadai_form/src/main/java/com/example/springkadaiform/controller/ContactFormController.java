package com.example.springkadaiform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import src.main.java.com.example.springkadaiform.form.ContactForm;

@Controller
public class ContactFormController {

    // フォーム画面の表示
    @GetMapping("/form")
    public String showForm(ContactForm contactForm) {
        return "contactFormView";
    }

    // 確認画面への遷移（バリデーションあり）
    @PostMapping("/comfirm")
    public String confirm(@Valid @ModelAttribute ContactForm contactForm,
                          BindingResult bindingResult,
                          Model model) {

        if (bindingResult.hasErrors()) {
            return "contactFormView"; // バリデーションエラー → フォーム画面へ戻る
        }

        return "confirmView"; // バリデーション成功 → 確認画面へ
    }
}
