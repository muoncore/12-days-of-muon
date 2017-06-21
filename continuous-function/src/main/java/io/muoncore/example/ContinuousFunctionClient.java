package io.muoncore.example;

import io.muoncore.Muon;
import io.muoncore.MuonBuilder;
import io.muoncore.config.AutoConfiguration;
import io.muoncore.config.MuonConfigBuilder;
import io.muoncore.example.protocol.continuousfunction.ContinuousClient;

/**
 * Simple Muon example that acts as a client
 */
public class ContinuousFunctionClient {

    public static void main(String[] args) throws Exception {

        AutoConfiguration config = MuonConfigBuilder.withServiceIdentifier("example-service-client").build();

        Muon muon = MuonBuilder.withConfig(config).build();
        muon.getDiscovery().blockUntilReady();

        ContinuousClient client = new ContinuousClient(muon);

        //# tag::api[]
        client.request("Hello World", 2, functionResponse -> {

        });
        //# end::api[]
    }
}
