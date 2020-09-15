package com.example.demo.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

import java.util.List;

@Rule(name = "weather rule", description = "if it rains then take an umbrella")
public class RuleA {

    @Condition
    public boolean itRains(@Fact("rain") boolean rain) {
        System.out.println("Checking rain "+rain);
        return rain;
    }

    @Action
    public void takeAnUmbrella(@Fact("result") List<String> result) {
        System.out.println("Add rain to result");
        result.add("It rains, take an umbrella!");
    }

    @Action
    public void takeAnUmbrella2(Facts facts) {
        System.out.println("takeAnUmbrella2");
    }
}