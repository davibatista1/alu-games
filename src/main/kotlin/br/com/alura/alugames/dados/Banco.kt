package br.com.alura.alugames.dados

import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence

object Banco {

    fun getEntityManager(): EntityManager {
    val factory: EntityManagerFactory = Persistence.createEntityManagerFactory("alugames")
    return factory.createEntityManager()
    }

}