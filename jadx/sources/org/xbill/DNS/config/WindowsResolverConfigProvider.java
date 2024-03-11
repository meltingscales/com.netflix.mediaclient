package org.xbill.DNS.config;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Win32Exception;
import com.sun.jna.ptr.IntByReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;
import lombok.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xbill.DNS.Name;
import org.xbill.DNS.config.IPHlpAPI;

/* loaded from: classes5.dex */
public class WindowsResolverConfigProvider implements ResolverConfigProvider {
    @Generated
    private static final Logger log = LoggerFactory.getLogger(WindowsResolverConfigProvider.class);
    private InnerWindowsResolverConfigProvider inner;

    @Override // org.xbill.DNS.config.ResolverConfigProvider
    public boolean isEnabled() {
        return this.inner != null;
    }

    public WindowsResolverConfigProvider() {
        if (System.getProperty("os.name").contains("Windows")) {
            try {
                this.inner = new InnerWindowsResolverConfigProvider();
            } catch (NoClassDefFoundError unused) {
                log.debug("JNA not available");
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class InnerWindowsResolverConfigProvider extends BaseResolverConfigProvider {
        @Generated
        private static final Logger log;

        static {
            Logger logger = LoggerFactory.getLogger(InnerWindowsResolverConfigProvider.class);
            log = logger;
            logger.debug("Checking for JNA classes: {} and {}", Memory.class.getName(), Win32Exception.class.getName());
        }

        private InnerWindowsResolverConfigProvider() {
        }

        @Override // org.xbill.DNS.config.ResolverConfigProvider
        public void initialize() {
            InetAddress address;
            Memory memory = new Memory(15360L);
            IntByReference intByReference = new IntByReference(0);
            IPHlpAPI iPHlpAPI = IPHlpAPI.INSTANCE;
            if (iPHlpAPI.GetAdaptersAddresses(0, 39, Pointer.NULL, memory, intByReference) == 111) {
                memory = new Memory(intByReference.getValue());
                int GetAdaptersAddresses = iPHlpAPI.GetAdaptersAddresses(0, 39, Pointer.NULL, memory, intByReference);
                if (GetAdaptersAddresses != 0) {
                    throw new InitializationException((Exception) new Win32Exception(GetAdaptersAddresses));
                }
            }
            IPHlpAPI.IP_ADAPTER_ADDRESSES_LH ip_adapter_addresses_lh = new IPHlpAPI.IP_ADAPTER_ADDRESSES_LH(memory);
            do {
                if (ip_adapter_addresses_lh.OperStatus == 1) {
                    for (IPHlpAPI.IP_ADAPTER_DNS_SERVER_ADDRESS_XP.ByReference byReference = ip_adapter_addresses_lh.FirstDnsServerAddress; byReference != null; byReference = byReference.Next) {
                        try {
                            address = byReference.Address.toAddress();
                        } catch (UnknownHostException e) {
                            log.warn("Invalid nameserver address on adapter index {}", Integer.valueOf(ip_adapter_addresses_lh.IfIndex), e);
                        }
                        if (!(address instanceof Inet4Address) && address.isSiteLocalAddress()) {
                            log.debug("Skipped site-local IPv6 server address {} on adapter index {}", address, Integer.valueOf(ip_adapter_addresses_lh.IfIndex));
                        }
                        addNameserver(new InetSocketAddress(address, 53));
                    }
                    addSearchPath(ip_adapter_addresses_lh.DnsSuffix.toString());
                    for (IPHlpAPI.IP_ADAPTER_DNS_SUFFIX.ByReference byReference2 = ip_adapter_addresses_lh.FirstDnsSuffix; byReference2 != null; byReference2 = byReference2.Next) {
                        addSearchPath(String.valueOf(byReference2._String));
                    }
                }
                ip_adapter_addresses_lh = ip_adapter_addresses_lh.Next;
            } while (ip_adapter_addresses_lh != null);
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
