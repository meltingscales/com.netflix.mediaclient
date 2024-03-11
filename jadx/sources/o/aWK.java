package o;

import com.netflix.mediaclient.util.ConnectivityUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public final class aWK {
    private String a;
    private Short b;
    private String c;
    private String d;
    private final InetAddress e;

    public final Short c() {
        return this.b;
    }

    public aWK(InetAddress inetAddress) {
        C8632dsu.c((Object) inetAddress, "");
        this.e = inetAddress;
        this.b = ConnectivityUtils.a(inetAddress);
        this.a = ConnectivityUtils.d(inetAddress);
        InetAddress d = ConnectivityUtils.d(b(), a());
        if (d != null) {
            this.d = ConnectivityUtils.d(d);
        }
        Short sh = this.b;
        if (sh != null) {
            this.c = ConnectivityUtils.b(inetAddress, sh.shortValue());
        }
    }

    private final boolean b() {
        return this.e instanceof Inet4Address;
    }

    private final boolean a() {
        return this.e instanceof Inet6Address;
    }

    public String toString() {
        InetAddress inetAddress = this.e;
        String str = this.c;
        Short sh = this.b;
        String str2 = this.d;
        String str3 = this.a;
        return "IpAddressDescriptor(address=" + inetAddress + ", subNetAddress=" + str + ", subnetPrefixLength=" + sh + ", gateway=" + str2 + ", networkAddress=" + str3 + ")";
    }
}
