import hello.Person

class BootStrap {

    def init = { servletContext ->
        if (!Person.count()) {
            new Person(firstName: "Maurizio", lastName: "Turatti").save()
        }
    }
    def destroy = {
    }
}
