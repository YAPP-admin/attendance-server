package kr.co.yapp.attendance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AttendanceAdminApplication

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "application,admin")
    runApplication<AttendanceAdminApplication>(*args)
}
