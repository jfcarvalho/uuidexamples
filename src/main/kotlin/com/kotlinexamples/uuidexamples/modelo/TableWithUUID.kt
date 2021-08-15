package com.kotlinexamples.uuidexamples.modelo

import lombok.Data
import lombok.Getter
import lombok.Setter
import java.io.Serializable
import java.util.*
import javax.persistence.*

@Data
@Entity
@Table(name = "table_with_uuid")
class TableWithUUID {

    @EmbeddedId
    var uuidId = UuidId(UUID(0L,0L),UUID(0L,0L),UUID(0L,0L))
    @Column(name = "field_4")
    var uuid4 = UUID(0L,0L)
    @Column(name = "field_5")
    var uuid5 : String = ""

    constructor(uuidId: UuidId, uuid4: UUID, uuid5: String)
}

@Embeddable
class UuidId: Serializable {
    @Column(name = "field_1")
    var uuid1 = UUID(0L,0L)
    @Column(name = "field_2")
    var uuid2 = UUID(0L,0L)
    @Column(name = "field_3")
    var uuid3 = UUID(0L, 0L)

    constructor(uuid1: UUID, uuid2: UUID, uuid3: UUID) {

    }
}