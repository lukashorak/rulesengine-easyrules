package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RuleEngineTest {

    RuleEngine ruleEngine = new RuleEngine();

    @Test
    void runRulesDummy() {
        List<String> out = ruleEngine.runRulesDummy();
        System.out.println(Arrays.toString(out.toArray()));

    }

    @Test
    void runRules() {
        List<String> out = ruleEngine.runRules();
        System.out.println(Arrays.toString(out.toArray()));
    }
}