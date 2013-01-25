package hello

import org.bson.types.ObjectId

abstract class Mongoable {
    
    ObjectId id

    static constraints = {
    }
}
