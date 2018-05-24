import io.micronaut.spring.beans.MicronautBeanProcessor
import io.micronaut.http.client.Client

beans = {
    httpClientBeanProcessor MicronautBeanProcessor, Client
}
