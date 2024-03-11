package org.xbill.DNS.config;

import com.netflix.android.org.json.zip.JSONzip;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.WString;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.W32APIOptions;
import java.net.Inet6Address;
import java.net.InetAddress;

/* loaded from: classes5.dex */
interface IPHlpAPI extends Library {
    public static final IPHlpAPI INSTANCE = (IPHlpAPI) Native.load("IPHlpAPI", IPHlpAPI.class, W32APIOptions.ASCII_OPTIONS);

    @Structure.FieldOrder({"Length", "Reserved", "Next", "Address"})
    /* loaded from: classes5.dex */
    public static class IP_ADAPTER_DNS_SERVER_ADDRESS_XP extends Structure {
        public SOCKET_ADDRESS Address;
        public ByReference Next;

        /* loaded from: classes5.dex */
        public static class ByReference extends IP_ADAPTER_DNS_SERVER_ADDRESS_XP implements Structure.ByReference {
        }
    }

    @Structure.FieldOrder({"Next", "_String"})
    /* loaded from: classes5.dex */
    public static class IP_ADAPTER_DNS_SUFFIX extends Structure {
        public ByReference Next;
        public char[] _String = new char[JSONzip.end];

        /* loaded from: classes5.dex */
        public static class ByReference extends IP_ADAPTER_DNS_SUFFIX implements Structure.ByReference {
        }
    }

    int GetAdaptersAddresses(int i, int i2, Pointer pointer, Pointer pointer2, IntByReference intByReference);

    @Structure.FieldOrder({"sin_family", "sin_port", "sin_addr", "sin_zero"})
    /* loaded from: classes5.dex */
    public static class sockaddr_in extends Structure {
        public byte[] sin_addr;
        public byte[] sin_zero;

        public sockaddr_in(Pointer pointer) {
            super(pointer);
            this.sin_addr = new byte[4];
            this.sin_zero = new byte[8];
            read();
        }
    }

    @Structure.FieldOrder({"sin6_family", "sin6_port", "sin6_flowinfo", "sin6_addr", "sin6_scope_id"})
    /* loaded from: classes5.dex */
    public static class sockaddr_in6 extends Structure {
        public byte[] sin6_addr;
        public int sin6_scope_id;

        public sockaddr_in6(Pointer pointer) {
            super(pointer);
            this.sin6_addr = new byte[16];
            read();
        }
    }

    @Structure.FieldOrder({"lpSockaddr", "iSockaddrLength"})
    /* loaded from: classes5.dex */
    public static class SOCKET_ADDRESS extends Structure {
        public Pointer lpSockaddr;

        /* JADX INFO: Access modifiers changed from: package-private */
        public InetAddress toAddress() {
            short s = this.lpSockaddr.getShort(0L);
            if (s != 2) {
                if (s != 23) {
                    return null;
                }
                sockaddr_in6 sockaddr_in6Var = new sockaddr_in6(this.lpSockaddr);
                return Inet6Address.getByAddress("", sockaddr_in6Var.sin6_addr, sockaddr_in6Var.sin6_scope_id);
            }
            return InetAddress.getByAddress(new sockaddr_in(this.lpSockaddr).sin_addr);
        }
    }

    @Structure.FieldOrder({"Length", "IfIndex", "Next", "AdapterName", "FirstUnicastAddress", "FirstAnycastAddress", "FirstMulticastAddress", "FirstDnsServerAddress", "DnsSuffix", "Description", "FriendlyName", "PhysicalAddress", "PhysicalAddressLength", "Flags", "Mtu", "IfType", "OperStatus", "Ipv6IfIndex", "ZoneIndices", "FirstPrefix", "TransmitLinkSpeed", "ReceiveLinkSpeed", "FirstWinsServerAddress", "FirstGatewayAddress", "Ipv4Metric", "Ipv6Metric", "Luid", "Dhcpv4Server", "CompartmentId", "NetworkGuid", "ConnectionType", "TunnelType", "Dhcpv6Server", "Dhcpv6ClientDuid", "Dhcpv6ClientDuidLength", "Dhcpv6Iaid", "FirstDnsSuffix"})
    /* loaded from: classes5.dex */
    public static class IP_ADAPTER_ADDRESSES_LH extends Structure {
        public byte[] Dhcpv6ClientDuid;
        public WString DnsSuffix;
        public IP_ADAPTER_DNS_SERVER_ADDRESS_XP.ByReference FirstDnsServerAddress;
        public IP_ADAPTER_DNS_SUFFIX.ByReference FirstDnsSuffix;
        public int IfIndex;
        public ByReference Next;
        public int OperStatus;
        public byte[] PhysicalAddress;
        public int[] ZoneIndices;

        /* loaded from: classes5.dex */
        public static class ByReference extends IP_ADAPTER_ADDRESSES_LH implements Structure.ByReference {
        }

        public IP_ADAPTER_ADDRESSES_LH(Pointer pointer) {
            super(pointer);
            this.PhysicalAddress = new byte[8];
            this.ZoneIndices = new int[16];
            this.Dhcpv6ClientDuid = new byte[130];
            read();
        }

        public IP_ADAPTER_ADDRESSES_LH() {
            this.PhysicalAddress = new byte[8];
            this.ZoneIndices = new int[16];
            this.Dhcpv6ClientDuid = new byte[130];
        }
    }
}
