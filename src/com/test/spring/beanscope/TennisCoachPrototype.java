package com.test.spring.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoachPrototype implements Coach {
	
	@Autowired
	FortuneService fortuneService;

    public TennisCoachPrototype(){
        System.out.println(">> TennisCoachPrototype: inside default constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoachPrototype: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoachPrototype: Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoachPrototype says : " + this.fortuneService.getFortune();
    }
}
