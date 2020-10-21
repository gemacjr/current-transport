package com.ecom.transportserv.config;

import com.ecom.transportserv.jobs.RestCallServiceJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

@Configuration
public class ConfigureJob {

    @Bean
    public JobDetail jobCallRestDetails() {
        return JobBuilder.newJob(RestCallServiceJob.class).withIdentity("restCall").storeDurably().build();
    }

    @Bean
    public Trigger jobRestCallTrigger(JobDetail jobRestCallDetail){
        return TriggerBuilder.newTrigger().forJob(jobRestCallDetail)
                .withIdentity("restCallTrigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * ? * * *"))
                .build();
    }
}
