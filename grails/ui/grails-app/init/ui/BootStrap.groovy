package ui

import io.micronaut.core.convert.ConversionService
import io.micronaut.reactive.rxjava2.converters.RxJavaConverterRegistrar

class BootStrap {

    def init = { servletContext ->
        // this is temporary
        new RxJavaConverterRegistrar().register(ConversionService.SHARED)
    }
    def destroy = {
    }
}
