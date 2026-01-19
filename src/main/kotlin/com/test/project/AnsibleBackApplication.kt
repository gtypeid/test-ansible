package com.test.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnsibleBackApplication

fun main(args: Array<String>) {
    runApplication<AnsibleBackApplication>(*args)
}
