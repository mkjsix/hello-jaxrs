package hello

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces


@Path('/api/@resource.path@')
class TestResourceTests {

    @GET
    @Produces('text/plain')
    String get@resource.name@Representation() {
        '@resource.name@'
    }
    
}
