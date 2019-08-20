package ksbra.repository

import org.springframework.data.repository.CrudRepository
import ksbra.model.User

interface UserRepository : CrudRepository<User, Long> {
}