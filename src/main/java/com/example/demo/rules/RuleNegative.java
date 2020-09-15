package com.example.demo.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

import java.util.List;

@Rule(name = "negative rule", description = "ohhh")
public class RuleNegative {

    @Condition
    public boolean itRains() {
        return false;
    }

    @Action
    public void takeAnUmbrella(@Fact("result") List<String> result) {
        result.add("Ohhhh");
    }

    @Action
    public void takeAnUmbrella2(Facts facts) {
        System.out.println("takeAnUmbrella2");
    }
}