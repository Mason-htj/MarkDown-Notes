package com.tjycompany.markdownnote.room.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.tjycompany.markdownnote.model.AllNotesItem
import io.reactivex.Flowable

@Dao
interface NotesDao {
    @Query("SELECT * FROM AllNotesItem")
    fun all(): Flowable<List<AllNotesItem>>

    @Insert
    fun insert(vararg notes: AllNotesItem)
}