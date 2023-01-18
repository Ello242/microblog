package www.ellovaillant.ru.repository

interface JpaRepository <E, T> {
    fun save(e: E): Int
    fun findBy(id: T) : E?
    fun findAll(): List<E>
}