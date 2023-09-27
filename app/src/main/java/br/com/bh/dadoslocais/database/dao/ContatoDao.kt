package br.com.bh.dadoslocais.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.bh.dadoslocais.model.Contato

@Dao
interface ContatoDao {

    @Insert
    fun salvar(contato: Contato): Long

    @Update
    fun atualizar(contato: Contato): Int

    @Delete
    fun excluir(contato: Contato): Int

    @Query("SELECT * FROM tb_contato WHERE id = :idContato")
    fun buscarContatoPorId(idContato: Long): Contato

    @Query("SELECT * FROM tb_contato ORDER BY nome ASC")
    fun listarContatos(): List<Contato>

}