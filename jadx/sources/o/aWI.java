package o;

import com.google.common.net.InetAddresses;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ddr;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes3.dex */
public final class aWI {
    public static final aWI a = new aWI();

    private aWI() {
    }

    public final aWJ c() {
        InetAddress e = ConnectivityUtils.e(true, false);
        if (e == null) {
            e = ConnectivityUtils.e(false, true);
        }
        if (e != null) {
            String d = ConnectivityUtils.d(e);
            if (d != null) {
                d = "http://" + d + ":9080/ddr";
            }
            return new aWJ(e, d);
        }
        return null;
    }

    public final String e() {
        InetAddress e = ConnectivityUtils.e(true, false);
        Short a2 = ConnectivityUtils.a(e);
        if (e != null && a2 != null) {
            try {
                String b = ConnectivityUtils.b(InetAddress.getByName("255.255.255.255"), a2.shortValue());
                C8632dsu.a(b, "");
                C1044Mm.a("nf_ddr_net", "subNetAddress=" + b);
                return b;
            } catch (UnknownHostException unused) {
            }
        }
        return "";
    }

    public static final boolean b(aWJ awj, String str) {
        if (!Config_FastProperty_Ddr.Companion.a()) {
            C1044Mm.j("nf_ddr_net", "Local target check is disabled");
            return true;
        } else if (awj == null) {
            C1044Mm.d("nf_ddr_net", "Local device address is null! This should NOT happen!");
            return false;
        } else if (str == null) {
            C1044Mm.d("nf_ddr_net", "Remote URL is null! This should NOT happen!");
            return false;
        } else {
            Short c = new aWK(awj.a()).c();
            if (c != null) {
                short shortValue = c.shortValue();
                aWI awi = a;
                byte[] address = awj.a().getAddress();
                C8632dsu.a(address, "");
                boolean b = awi.d(address, shortValue).b(awi.d(str, shortValue));
                String b2 = awj.b();
                C1044Mm.e("nf_ddr_net", "We can reach remote device " + str + " from " + b2 + ": " + b);
                return b;
            }
            return false;
        }
    }

    public static final byte[] b(byte[] bArr, int i) {
        C8632dsu.c((Object) bArr, "");
        if (i != -1) {
            try {
                if (bArr.length != 0) {
                    byte[] bArr2 = new byte[bArr.length];
                    int length = bArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        bArr2[i2] = (byte) (((byte) (255 & (PrivateKeyType.INVALID << (8 - Math.max(Math.min(i - (i2 * 8), 8), 0))))) & bArr[i2]);
                    }
                    byte[] address = InetAddress.getByAddress(bArr2).getAddress();
                    C8632dsu.d(address);
                    return address;
                }
            } catch (Throwable unused) {
                return new byte[0];
            }
        }
        return new byte[0];
    }

    public static final byte[] c(String str) {
        if (!C8168dfL.g(str)) {
            try {
                byte[] address = InetAddresses.forUriString(new URI(str).getHost()).getAddress();
                C8632dsu.a(address, "");
                return address;
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    private final aWH d(byte[] bArr, int i) {
        try {
            return new aWH(bArr, i, b(bArr, i));
        } catch (Exception unused) {
            return new aWH(new byte[0], -1, new byte[0]);
        }
    }

    private final aWH d(String str, int i) {
        return d(c(str), i);
    }
}
