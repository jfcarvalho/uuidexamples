package com.kotlinexamples.uuidexamples.repository

import com.kotlinexamples.uuidexamples.modelo.TableWithUUID
import com.kotlinexamples.uuidexamples.modelo.UuidId
import org.hibernate.annotations.Parameter
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*

public interface TableWithUUIDRepository : JpaRepository<TableWithUUID, UuidId > {

    @Query(value = "SELECT t FROM TableWithUUID t WHERE t.uuidcId.uuidc1 = :id1 AND t.uuidcId.uuidc2 = :id2 AND t.uuidcId.uuidc3 = :id3")
    fun findByParams(
        @Param("id1")id1:UUID?,
        @Param("id2")id2:UUID?,
        @Param("id3")id3:UUID?,
    ):TableWithUUID
}