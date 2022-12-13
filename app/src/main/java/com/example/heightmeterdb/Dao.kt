package com.example.heightmeterdb
import androidx.room.*
import androidx.room.Dao
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    // с другого урока
//    @Insert
//    fun insertItem(item: Item)

 //   @Query("SELECT * FROM items")
 //   fun getAllItem(): Flow<List<Item>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Item)

    @Query("Select * from items")
    fun getAll(): List<Item>

    @Delete
    fun delete(item: Item)

}