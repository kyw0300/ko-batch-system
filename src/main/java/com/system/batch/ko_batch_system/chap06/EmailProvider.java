package com.system.batch.ko_batch_system.chap06;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailProvider {

    public void send(String to, String subject, String message) {
        // 실제로는 여기서 smtp로 전송
        log.info("[메일 발송 성공] 받는사람 : {}", to);
        log.info("제목 : {}", subject);
        log.info("내용 : {}", message);
    }
}
