package com.example.bootes.config;




import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class EsConfig {


    @Bean
    public TransportClient client() throws UnknownHostException {
        String hostName = "10.190.180.127";
        int port=9300;
        String clusterName = "cluster.name";
        String nodeName = "elasticsearch";
        TransportAddress transportAddress = new TransportAddress(InetAddress.getByName(hostName), port);
        Settings settings = Settings.builder().put(clusterName, nodeName).build();
        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(transportAddress);
        return client;
    }






}
