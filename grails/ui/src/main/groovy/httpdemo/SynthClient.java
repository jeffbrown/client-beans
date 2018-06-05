package httpdemo;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.Client;

import java.util.List;

@Client("synth-data")
public interface SynthClient {

    @Get("/synths")
    List<Synthesizer> getSynthesizers();
}
