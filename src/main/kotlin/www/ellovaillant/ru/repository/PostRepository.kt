package www.ellovaillant.ru.repository

import www.ellovaillant.ru.db.Database.POSTS
import www.ellovaillant.ru.entity.Post

class PostRepository : JpaRepository<Post, Long>{
    override fun save(e: Post) :Int {
        POSTS.add(e)
        return 1
    }
    override fun findBy(id: Long): Post? {
        return POSTS.firstOrNull { post: Post -> post.id==id }
    }
    override fun findAll(): List<Post> {
        return POSTS
    }
    fun findAllBy(userId:Long):List<Post> = POSTS.filter { post: Post->post.userId==userId }
}