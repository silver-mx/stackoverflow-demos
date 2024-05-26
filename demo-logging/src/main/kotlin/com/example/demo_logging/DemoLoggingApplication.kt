package com.example.demo_logging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoLoggingApplication

fun main(args: Array<String>) {
	runApplication<DemoLoggingApplication>(*args)
}
