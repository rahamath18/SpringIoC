package com.test.spring.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoachSingleton implements Coach {

	@Autowired
	FortuneService fortuneService;

    public TennisCoachSingleton(){
        System.out.println(">> TennisCoachSingleton: inside default constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoachSingleton: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TennisCoachSingleton: Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoachSingleton says : "+fortuneService.getFortune();
    }
}
