package com.kotlinexamples.uuidexamples.repository

import com.kotlinexamples.uuidexamples.modelo.TableWithUUID
import com.kotlinexamples.uuidexamples.modelo.UuidId
import org.springframework.data.jpa.repository.JpaRepository

public interface TableWithUUIDRepository : JpaRepository<TableWithUUID, UuidId > {

}