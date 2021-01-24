package com.test.test2;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}