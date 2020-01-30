package com.yuri.pontointeligente.repositories

import com.yuri.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository


interface EmpresaRepository : MongoRepository<Empresa, String> {
    fun findByCnpj(cnpj: String): Empresa
}