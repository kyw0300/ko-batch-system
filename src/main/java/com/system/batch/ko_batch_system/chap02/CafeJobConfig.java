package com.system.batch.ko_batch_system.chap02;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.Step;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@RequiredArgsConstructor
public class CafeJobConfig {

    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;


    public Step openCafeStep(){
        
    }
}
