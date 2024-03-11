package org.xbill.DNS.spi;

import sun.net.spi.nameservice.NameService;
import sun.net.spi.nameservice.NameServiceDescriptor;

/* loaded from: classes6.dex */
public class DNSJavaNameServiceDescriptor implements NameServiceDescriptor {
    public String getProviderName() {
        return "dnsjava";
    }

    public String getType() {
        return "dns";
    }

    public NameService createNameService() {
        return new DNSJavaNameService();
    }
}
