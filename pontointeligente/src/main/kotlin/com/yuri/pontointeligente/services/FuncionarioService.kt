package com.yuri.pontointeligente.services

import com.yuri.pontointeligente.documents.Funcionario

interface FuncionarioService {

    fun persistir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf:String): Funcionario?

    fun buscarPorEmail(email:String):Funcionario?

    fun buscarPorId(id:String): Funcionario?

}