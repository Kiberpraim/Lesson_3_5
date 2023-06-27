package com.example.lesson_3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Собрать из букв имён своё имя*/


        String[] names = {"Чынгыз", "Алексей", "Андрей", "Алинур", "Максим", "Бектур", "Тимур", "Настя", "Алим"};

        String me = "Алманбет";
        String mee = "АЛМАНБЕТ";

        String result="";

        boolean f = false;


        for (int i = 0; i < me.length(); i++) {
            for (String name : names) {
                f = false;
                for (int j = 0; j < name.length(); j++) {
                    if (name.charAt(j) == me.charAt(i) || name.charAt(j) == mee.charAt(i) ) {
                        result = result + name.charAt(j);
                        f = true;
                        break;
                    }
                }
                if (f) {
                    break;
                }
            }
        }
        System.out.println(result);

    }
}