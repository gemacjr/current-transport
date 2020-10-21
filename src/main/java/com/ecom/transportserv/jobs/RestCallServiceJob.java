package com.ecom.transportserv.jobs;

import com.ecom.transportserv.service.RestService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

@DisallowConcurrentExecution
public class RestCallServiceJob implements Job {



    @Autowired
    RestService restService;

    @Override
    public void execute(JobExecutionContext context){
        //log.info("Job ** {} ** starting @ {}", context.getJobDetail().getKey().getName(), context.getFireTime());
        try {
            restService.getRestJson();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //log.info("Job ** {} ** completed.  Next job scheduled @ {}", context.getJobDetail().getKey().getName(), context.getNextFireTime());


    }
}

