package com.yuri.pontointeligente.repositories

import com.yuri.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String): Funcionario
    fun findByCpf(cpf: String): Funcionario
    fun findOne(id:String): Funcionario
}