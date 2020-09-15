package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rules")
@Log4j2
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class RuleController {

    RuleEngine ruleEngine = new RuleEngine();

    @GetMapping(path = "/test")
    public String getTest() {
        return "OK";
    }

    @GetMapping(path = "/rules")
    public List<String> getRunRules() {
        return ruleEngine.runRulesDummy();

    }

}
