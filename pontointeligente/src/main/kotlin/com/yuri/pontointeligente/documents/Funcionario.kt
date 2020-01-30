package com.yuri.pontointeligente.documents

import com.yuri.pontointeligente.enums.PerfilEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Funcionario(
        val nome: String,
        val email: String,
        val senha: String,
        val cpf: String,
        val perfil: PerfilEnum,
        val empresaoId: String,
        val valorHora: Double? = 0.0,
        val qtdHoraTrabalhoDia: Float? = 0.0f,
        val qtdHoraAlmoço: Float? = 0.0f,
        @Id val id: String? = null
)