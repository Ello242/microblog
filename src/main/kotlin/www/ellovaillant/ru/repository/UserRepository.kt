package www.ellovaillant.ru.repository
import www.ellovaillant.ru.entity.User
import www.ellovaillant.ru.db.Database.USERS
import java.time.ZoneId


class UserRepository: JpaRepository<User, Long> {
    override fun save(e: User) :Int {
        USERS.add(e)
        return 1
    }
    override fun findBy(id: Long) = USERS.firstOrNull { user: User -> user.id == id }
    override fun findAll(): List<User> = USERS

    fun findByUsername(username: String) : User?{
        return USERS.firstOrNull { user: User -> user.username == username}
    }
}