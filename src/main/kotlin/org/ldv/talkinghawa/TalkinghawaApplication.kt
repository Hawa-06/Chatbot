package org.ldv.talkinghawa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.persistence.autoconfigure.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["org.ldv.talkinghawa", "org.ldv.chatbot"])
@EnableJpaRepositories(basePackages = ["org.ldv.talkinghawa", "org.ldv.chatbot"])
@EntityScan(basePackages = ["org.ldv.talkinghawa", "org.ldv.chatbot"])
class TalkinghawaApplication

fun main(args: Array<String>) {
    runApplication<TalkinghawaApplication>(*args)
}