import hello.Person
import com.gmongo.GMongo

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                // drop database
                new GMongo().getDB('hello').dropDatabase()

                new Person(firstName: "Mauro", lastName: "Rossi").save(failOnError: true)
                new Person(firstName: "Giuseppe", lastName: "Verdi").save(failOnError: true)
                new Person(firstName: "Anna", lastName: "Bianchi").save(failOnError: true)
            }
        }
    }
    def destroy = {
    }
}
