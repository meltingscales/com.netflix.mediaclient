package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import o.AbstractC9459pw;
import o.AbstractC9544rb;

/* loaded from: classes5.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.AbstractC9453pq
    /* renamed from: b */
    public void e(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw) {
        String substring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    substring = "[" + hostName.substring(1) + "]";
                } else {
                    substring = hostName.substring(1);
                }
                hostName = substring;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        jsonGenerator.i(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.AbstractC9453pq
    public void c(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, AbstractC9459pw abstractC9459pw, AbstractC9544rb abstractC9544rb) {
        WritableTypeId b = abstractC9544rb.b(jsonGenerator, abstractC9544rb.b(inetSocketAddress, InetSocketAddress.class, JsonToken.VALUE_STRING));
        e(inetSocketAddress, jsonGenerator, abstractC9459pw);
        abstractC9544rb.c(jsonGenerator, b);
    }
}
