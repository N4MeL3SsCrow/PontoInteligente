package com.yuri.pontointeligente.services.impli

import com.yuri.pontointeligente.documents.Funcionario
import com.yuri.pontointeligente.repositories.FuncionarioRepository
import com.yuri.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpli(val funcionarioRepository: FuncionarioRepository):FuncionarioService {
    override fun persistir(funcionario: Funcionario): Funcionario  = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)
}