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
                UUID(0L, 5555555),
                UUID(0L, 6666666),
                UUID(0L, 7777777),
            ),
                UUID(0L, 8888888),
                UUID(0L, 9999999).toString()
            )
        )
    }

    override fun get() {
       val id =  UuidId(
           UUID(0L, 5555555),
           UUID(0L, 6666666),
           UUID(0L, 7777777),
       )
        val intvalue1 = id.uuidc1?.leastSignificantBits
        val intvalue2 = id.uuidc2?.leastSignificantBits
        val intvalue3 = id.uuidc3?.leastSignificantBits

        val entity = //tableWithUUIDRepository.findAll()
           tableWithUUIDRepository.findById(
           id
        )

        val entity2 = //tableWithUUIDRepository.findAll()
            tableWithUUIDRepository.findByParams(
                id.uuidc1,
                id.uuidc2,
                id.uuidc3
            )
        System.out.println(entity)
    }


}
