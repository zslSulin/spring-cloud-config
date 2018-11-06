package com.mine.cloud.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * Producer
 *
 * @author zhangsl
 * @date 2018/9/29 15:38
 */

@EnableBinding(Source.class)
public class Producer {

    @Output(Sink.INPUT)
    private MessageChannel channel;

    public void send() {
        channel.send(MessageBuilder.withPayload("2222" + UUID.randomUUID().toString()).build());
    }
}
