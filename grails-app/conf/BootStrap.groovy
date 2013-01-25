import hello.Person
import com.gmongo.GMongo
import org.bson.types.ObjectId
import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        
        JSON.registerObjectMarshaller(ObjectId) {
            it.toString()
        }
        
        environments {
            development {
                // drop database
                new GMongo().getDB('hello').dropDatabase()

                new Person(firstName: "Marco", lastName: "Rossi").save(failOnError: true)
                new Person(firstName: "Giuseppe", lastName: "Verdi").save(failOnError: true)
                new Person(firstName: "Anna", lastName: "Bianchi").save(failOnError: true)
            }
        }
    }
    def destroy = {
    }
}
