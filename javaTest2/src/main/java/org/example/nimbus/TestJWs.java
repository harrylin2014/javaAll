package org.example.nimbus;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;

import java.security.SecureRandom;

/**
 * @author lxl
 * @date 2021/1/21 18:00
 */
public class TestJWs {
    public static void main(String[] args) throws JOSEException {
        // Create an HMAC-protected JWS object with some payload
        JWSObject jwsObject = new JWSObject(new JWSHeader(JWSAlgorithm.HS256),
                new Payload("Hello, world!"));

// We need a 256-bit key for HS256 which must be pre-shared
        byte[] sharedKey = new byte[32];
        new SecureRandom().nextBytes(sharedKey);

// Apply the HMAC to the JWS object
        jwsObject.sign(new MACSigner(sharedKey));

// Output in URL-safe format
        System.out.println(jwsObject.serialize());
    }
}
