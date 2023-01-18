package www.ellovaillant.ru.service

import www.ellovaillant.ru.db.Database.POSTS
import www.ellovaillant.ru.entity.Post
import www.ellovaillant.ru.repository.PostRepository

class PostService(private var postRepository: PostRepository = PostRepository()) {

    fun getAllPost():List<Post> = postRepository. findAll()

    fun createPost(content: String, userId: Long): Post{
        if (content!=""){
            val post = Post(id = POSTS.size+1L, content= content, userId=userId)
            postRepository.save(post)
            return post
        }
        throw IllegalArgumentException("Les donnes ne sont pas valides")
    }

    fun gatPostsByUser(userId: Long):List<Post> = postRepository.findAllBy(userId)
}