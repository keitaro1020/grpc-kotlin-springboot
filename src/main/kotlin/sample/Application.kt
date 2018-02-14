package sample

import com.google.appengine.api.datastore.DatastoreService
import com.google.appengine.api.datastore.DatastoreServiceFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean


@SpringBootApplication
class Application : SpringBootServletInitializer() {

    override fun configure(builder: SpringApplicationBuilder): SpringApplicationBuilder {
        return builder.sources(Application::class.java)
    }
//
//    // datastore
//    @Bean
//    fun cloudDatastoreService(): DatastoreService{
//        return DatastoreServiceFactory.getDatastoreService()
//    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
