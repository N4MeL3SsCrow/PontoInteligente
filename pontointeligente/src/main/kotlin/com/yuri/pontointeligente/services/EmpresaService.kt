package com.yuri.pontointeligente.services

import com.yuri.pontointeligente.documents.Empresa

interface EmpresaService {

    fun  buscarPorCnpj(cnpj:String): Empresa?
    fun persistir(empresa:Empresa): Empresa
}