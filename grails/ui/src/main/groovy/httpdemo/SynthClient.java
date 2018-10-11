package httpdemo;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("synth-data")
public interface SynthClient {

    @Get("/synths")
    List<Synthesizer> getSynthesizers();
}
