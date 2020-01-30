package com.yuri.pontointeligente.services.impli

import com.yuri.pontointeligente.documents.Empresa
import com.yuri.pontointeligente.repositories.EmpresaRepository
import com.yuri.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceimpli(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}