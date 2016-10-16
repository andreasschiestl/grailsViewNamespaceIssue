package grailsviewnamespaceissue

class UrlMappings {

    static mappings = {
        "/$namespace/$controller/$action?/$id?(.$format)?"{
            constraints {
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
