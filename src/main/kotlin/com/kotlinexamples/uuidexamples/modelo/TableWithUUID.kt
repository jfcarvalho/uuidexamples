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
     var uuidcId : UuidId? = null
    @Column(name = "field_4")
     var uuidc4 : UUID? = null
    @Column(name = "field_5")
     var uuidc5 : String? = null

    constructor(uuidId: UuidId, uuid4: UUID, uuid5: String) {
        uuidcId = uuidId
        uuidc4 = uuid4
        uuidc5 = uuid5
    }
}

@Embeddable
class UuidId: Serializable {
    @Column(name = "field_1")
    var uuidc1 :  UUID? = null
    @Column(name = "field_2")
    var uuidc2 : UUID? = null
    @Column(name = "field_3")
    var uuidc3 : UUID? = null

    constructor(uuid1: UUID, uuid2: UUID, uuid3: UUID) {
        uuidc1 = uuid1
        uuidc2 = uuid2
        uuidc3 = uuid3
    }
}