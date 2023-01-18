package www.ellovaillant.ru.db

import www.ellovaillant.ru.entity.Post
import www.ellovaillant.ru.entity.User

object Database {
    val POSTS : MutableList<Post> = mutableListOf(
        Post(id = 1, content = "1 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            userId = 1),
        Post(id = 2, content ="2 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
        userId= 1),
        Post(id = 3, content = "3 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            userId = 2)
    )
    var USERS : MutableList<User> = mutableListOf(
        User(
            id = 1,
            username = "Demo",
            profession = "Dev",
            ville = "Moscow",
            pays = "Russia",
            fullname ="Demo User",
            password = "wefhfssd",
            posts = mutableListOf(Post(id = 1, content = "1 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                userId = 1),
                Post(id = 2, content ="2 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    userId= 1),
                Post(id = 3, content = "3 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    userId = 2))
        ),
        User(
                id = 2,
        username = "Admin",
        profession = "Dev",
        ville = "New-York",
        pays = "US",
        fullname ="Admin User",
        password = "password",
        posts = mutableListOf(Post(id = 1, content = "1 Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
            userId = 1)
        )
        ),
        User(
            id = 2,
            username = "guess",
            profession = "Dev",
            ville = "brazzaville",
            pays = "Congo",
            fullname ="guess User",
            password = "password"
        )
    )
}