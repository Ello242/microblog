package www.ellovaillant.ru.entity

import java.sql.Timestamp
import java.time.LocalDateTime

data class User(
    var id :Long,
    var username : String,
    var profession : String,
    var ville : String,
    var pays : String,
    var fullname : String,
    var password : String,
    var posts : MutableList<Post> = mutableListOf(),
    var createdid : Timestamp = Timestamp.valueOf(LocalDateTime.now()),
    var apdatedid : Timestamp? = null
)