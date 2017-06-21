package io.muoncore.example.protocol.continuousfunction;

import io.muoncore.Muon;
import io.muoncore.channel.ChannelConnection;
import io.muoncore.descriptors.ProtocolDescriptor;
import io.muoncore.descriptors.SchemaDescriptor;
import io.muoncore.message.MuonInboundMessage;
import io.muoncore.message.MuonOutboundMessage;
import io.muoncore.protocol.ServerProtocolStack;

import java.util.Map;
import java.util.function.Consumer;

public class ContinuousServer implements ServerProtocolStack {

    private Muon muon;

    public ContinuousServer(Muon muon) {
        this.muon = muon;
    }

    @Override
    public Map<String, SchemaDescriptor> getSchemasFor(String s) {    //<1>
        return null;
    }

    @Override
    public ProtocolDescriptor getProtocolDescriptor() {          // <2>
        return null;
    }

    @Override
    public ChannelConnection<MuonInboundMessage, MuonOutboundMessage> createChannel() {    // <3>
        return null;
    }
}
