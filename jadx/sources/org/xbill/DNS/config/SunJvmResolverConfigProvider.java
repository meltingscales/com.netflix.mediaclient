package org.xbill.DNS.config;

import java.net.InetSocketAddress;
import java.util.List;

/* loaded from: classes5.dex */
public class SunJvmResolverConfigProvider extends BaseResolverConfigProvider {
    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void initialize() {
        try {
            Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
            Object invoke = cls.getDeclaredMethod("open", new Class[0]).invoke(null, new Object[0]);
            for (String str : (List) cls.getMethod("nameservers", new Class[0]).invoke(invoke, new Object[0])) {
                addNameserver(new InetSocketAddress(str, 53));
            }
            for (String str2 : (List) cls.getMethod("searchlist", new Class[0]).invoke(invoke, new Object[0])) {
                addSearchPath(str2);
            }
        } catch (Exception e) {
            throw new InitializationException(e);
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean isEnabled() {
        return Boolean.getBoolean("dnsjava.configprovider.sunjvm.enabled");
    }
}
