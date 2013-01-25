package hello

import org.bson.types.ObjectId

class Person {

    ObjectId id
    String firstName
    String lastName
    
    static mapWith = "mongo"
    
    static constraints = {
    }
}
