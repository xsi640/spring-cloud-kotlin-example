package com.suyang.testserver.repository

import com.suyang.testserver.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>