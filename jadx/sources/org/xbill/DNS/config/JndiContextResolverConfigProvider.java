package org.xbill.DNS.config;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.Name;

/* loaded from: classes5.dex */
public class JndiContextResolverConfigProvider implements ResolverConfigProvider {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(JndiContextResolverConfigProvider.class);
    private InnerJndiContextResolverConfigProvider inner;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean isEnabled() {
        return this.inner != null;
    }

    public JndiContextResolverConfigProvider() {
        if (System.getProperty("java.vendor").contains("Android")) {
            return;
        }
        try {
            this.inner = new InnerJndiContextResolverConfigProvider();
        } catch (NoClassDefFoundError unused) {
            log.debug("JNDI DNS not available");
        }
    }

    /* loaded from: classes5.dex */
    static final class InnerJndiContextResolverConfigProvider extends BaseResolverConfigProvider {
        @Generated
        private static final Logger log;

        static {
            Logger logger = LoggerFactory.getLogger(InnerJndiContextResolverConfigProvider.class);
            log = logger;
            logger.debug("JNDI class: {}", DirContext.class.getName());
        }

        private InnerJndiContextResolverConfigProvider() {
        }

        @Override // org.xbill.DNS.config.ResolverConfigProvider
        public void initialize() {
            String str;
            Hashtable hashtable = new Hashtable();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns://");
            try {
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                str = (String) initialDirContext.getEnvironment().get("java.naming.provider.url");
                try {
                    initialDirContext.close();
                } catch (NamingException unused) {
                }
            } catch (NamingException unused2) {
                str = null;
            }
            if (str != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    try {
                        URI uri = new URI(nextToken);
                        String host = uri.getHost();
                        if (host != null && !host.isEmpty()) {
                            int port = uri.getPort();
                            if (port == -1) {
                                port = 53;
                            }
                            addNameserver(new InetSocketAddress(host, port));
                        }
                    } catch (URISyntaxException e) {
                        log.debug("Could not parse {} as a dns server, ignoring", nextToken, e);
                    }
                }
            }
        }
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public void initialize() {
        this.inner.initialize();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<InetSocketAddress> servers() {
        return this.inner.servers();
    }

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public List<Name> searchPaths() {
        return this.inner.searchPaths();
    }
}
