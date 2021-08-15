package com.kotlinexamples.uuidexamples.service.impl;

import com.kotlinexamples.uuidexamples.modelo.TableWithUUID
import com.kotlinexamples.uuidexamples.modelo.UuidId
import com.kotlinexamples.uuidexamples.repository.TableWithUUIDRepository
import com.kotlinexamples.uuidexamples.service.UUIDService;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service;
import java.util.*

@Service
class UUIDServiceImpl : UUIDService {

    @Autowired
    lateinit var tableWithUUIDRepository: TableWithUUIDRepository

    override fun save() {
        tableWithUUIDRepository.save(
        TableWithUUID(
            UuidId(
                UUID(0L, 555),
                UUID(0L, 666),
                UUID(0L, 777),
            ),
                UUID(0L, 888),
                UUID(0L, 999).toString()
            )
        )
    }

    override fun get() {
       val entity = tableWithUUIDRepository.findById(
            UuidId(
                UUID(0L, 555),
                UUID(0L, 666),
                UUID(0L, 777),
            )
        )
        System.out.println(entity)
    }


}
