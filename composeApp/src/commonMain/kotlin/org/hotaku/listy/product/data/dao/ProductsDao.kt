package org.hotaku.listy.product.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
import org.hotaku.listy.product.data.model.ProductEntity

@Dao
interface ProductsDao {

    @Upsert
    suspend fun upsertProduct(product: ProductEntity)

    @Delete
    suspend fun deleteProduct(product: ProductEntity)

    @Query("SELECT * FROM products WHERE (:categoryId IS NULL OR categoryId = :categoryId) AND importance = :importance")
    fun getProducts(categoryId: Int?, importance: String): Flow<List<ProductEntity>>

    @Query("SELECT * FROM products WHERE id = :productId")
    suspend fun getProduct(productId: Int?): ProductEntity

}