package br.com.bh.dadoslocais.database.repository

import android.content.Context
import br.com.bh.dadoslocais.database.dao.ContatoDb
import br.com.bh.dadoslocais.model.Contato

class ContatoRepository(context: Context) {

    var db = ContatoDb.getDatabase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.salvar(contato)
    }

    fun atualizar(contato: Contato): Int {
        return db.atualizar(contato)
    }

    fun excluir(contato: Contato): Int {
        return db.excluir(contato)
    }

    fun buscarContatoPorId(id: Long): Contato {
        return db.buscarContatoPorId(id)
    }

    fun listarContatos(): List<Contato> {
        return db.listarContatos()
    }

}