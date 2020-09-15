package com.example.demo;

import com.example.demo.rules.HelloWorldRule;
import com.example.demo.rules.RuleA;
import com.example.demo.rules.RuleNegative;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.DefaultRulesEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RuleEngine {


    public List<String> runRulesDummy() {
        return Collections.singletonList("Out");
    }

    public List<String> runRules() {

        List<String> result = new ArrayList<>();

        RulesEngineParameters parameters = new RulesEngineParameters();
        RulesEngine fizzBuzzEngine = new DefaultRulesEngine(parameters);

        // create rules
        Rules rules = new Rules();

        rules.register(new RuleA());
        rules.register(new HelloWorldRule());
        rules.register(new RuleNegative());

        Facts facts = new Facts();
        facts.put("result", result);
        facts.put("rain", true);
        for (int i = 1; i <= 100; i++) {
            facts.put("number", i);
            //fizzBuzzEngine.fire(rules, facts);
            Map<Rule, Boolean> a = fizzBuzzEngine.check(rules, facts);
            System.out.println("a:"+a);
        }

        return result;
    }
}
