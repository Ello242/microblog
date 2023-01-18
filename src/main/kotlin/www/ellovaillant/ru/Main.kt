package www.ellovaillant.ru

import www.ellovaillant.ru.entity.Post
import www.ellovaillant.ru.entity.User
import www.ellovaillant.ru.service.PostService
import www.ellovaillant.ru.service.UserService

fun main(args: Array<String>) {

    val userService = UserService()
    val postService = PostService()

    while (true){

        println("Connectez-vous")
        println("Saisissez votre username ou appuyez 1 pour s'inscrire")
        val username: String = readln()
        if(username.equals(other = "i", ignoreCase = true)){
            //userService.inscription() // todo a implement
        }else{
            println("Saisissez votre mot de passe")
            val password: String = readln()

            val user: User = userService.connexion(username="guess", password = "password")
            println(
                """
                    1. Appuyez (P) pour faire une publication
                    2. Appuyez (L) pour lister les publications
                """.trimIndent()
            )
            when(readln().uppercase()){
                "P"->{
                    println("Saisissez votre publication")
                        val post:Post = postService.createPost(content= readln(), userId = user.id)
                        user.posts.add(post)
                        println(user)
                }
            }
        }

    }
}

