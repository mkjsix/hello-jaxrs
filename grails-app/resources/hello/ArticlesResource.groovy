package hello

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam


@Path('/api/article/{id}/comments')
class ArticlesResource {
    
    def comments = ['abc', 'def', 'ghi']

    @GET
    @Produces(["application/json", "application/xml"])
    List<String> getAllComments() {
        this.comments
    }
    
}
