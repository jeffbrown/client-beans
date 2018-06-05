package ui

import io.micronaut.core.convert.ConversionService
import io.micronaut.reactive.rxjava2.converters.RxJavaConverterRegistrar

class BootStrap {

    def init = { servletContext ->
        new RxJavaConverterRegistrar().register(ConversionService.SHARED)
    }
    def destroy = {
    }
}
