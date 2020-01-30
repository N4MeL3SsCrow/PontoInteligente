package com.yuri.pontointeligente.services.impli

import com.yuri.pontointeligente.documents.Lancamento
import com.yuri.pontointeligente.repositories.LancamentoRepository
import com.yuri.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


@Service
class LancamentoServiceImpli(val lancamentoRepository: LancamentoRepository) : LancamentoService {
    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> = lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)

    override fun buscarPorId(id: String): Lancamento? = lancamentoRepository.findOne(id)

    override fun persistir(id: String): Lancamento = lancamentoRepository.save()

    override fun remover(id: String) = lancamentoRepository.deleteById(id)
}