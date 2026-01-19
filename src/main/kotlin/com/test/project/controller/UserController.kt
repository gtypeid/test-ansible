package com.test.project.controller

import com.test.project.domain.User
import com.test.project.repository.UserJpaRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime


@RestController
class UserController(
    private val userJpaRepository: UserJpaRepository
){

    @GetMapping("/health")
    fun health(): String = "OK"

    @GetMapping("/users")
    fun getUsers(): List<User> = userJpaRepository.findAll()

    @PostMapping("/users")
    fun createUser(@RequestBody request: CreateUserRequest): User {
        val user = User(
            name = request.name,
            email = request.email,
            createdAt = LocalDateTime.now()
        )
        return userJpaRepository.save(user)
    }
}


data class CreateUserRequest(
    val name: String,
    val email: String
)
