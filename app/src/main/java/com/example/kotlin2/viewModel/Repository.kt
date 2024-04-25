package com.example.kotlin2.viewModel

import com.example.kotlin2.roomDB.Pessoa
import com.example.kotlin2.roomDB.PessoaDataBase


class Repository(private val db:PessoaDataBase) {

    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)

    }

    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa()

}