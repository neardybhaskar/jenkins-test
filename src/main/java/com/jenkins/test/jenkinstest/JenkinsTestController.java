package com.jenkins.test.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bhaskar Singh
 * @date 8/31/2021 10:51 PM
 */
@RestController
public class JenkinsTestController {

    @GetMapping("/jenkinsTest")
    public String jenkinsTestCall() {
        return "Welcome to Jenkins Test";
    }

    @GetMapping("githubChangeTrigger")
    public String githubChangeTrigger() {
        return "Welcome again to Jenkins Test";
    }

}
