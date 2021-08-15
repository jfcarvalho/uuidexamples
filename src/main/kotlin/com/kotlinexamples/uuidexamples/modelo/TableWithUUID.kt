package com.kotlinexamples.uuidexamples.modelo

import lombok.Data
import lombok.Getter
import lombok.Setter
import java.util.*
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Embedded
import javax.persistence.Entity

@Data
@Entity
class TableWithUUID {

    @Embedded
    var uuidId = UuidId(UUID(0L,0L),UUID(0L,0L),UUID(0L,0L))
    @Column(name = "field_4")
    var uuid4 = UUID(0L,0L)
    @Column(name = "field_5")
    var uuid5 : String = ""

    constructor(uuidId: UuidId, uuid4: UUID, uuid5: String)
}

@Embeddable
class UuidId {
    @Column(name = "field_1")
    var uuid1 = UUID(0L,0L)
    @Column(name = "field_2")
    var uuid2 = UUID(0L,0L)
    @Column(name = "field_3")
    var uuid3 = UUID(0L, 0L)

    constructor(uuid1: UUID, uuid2: UUID, uuid3: UUID) {

    }
}