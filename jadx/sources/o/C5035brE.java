package o;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.util.ConnectivityUtils;

/* renamed from: o.brE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5035brE {
    public static final C5035brE d = new C5035brE(ConnectivityUtils.NetType.wifi, "unknown", "defaultIpAddr");
    final String a;
    final String c;
    final ConnectivityUtils.NetType e;

    public C5035brE(ConnectivityUtils.NetType netType, String str, String str2) {
        this.e = netType;
        this.c = str == null ? "" : str;
        this.a = str2 == null ? "" : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5035brE c5035brE = (C5035brE) obj;
        return this.e == c5035brE.e && this.c.equals(c5035brE.c) && this.a.equals(c5035brE.a);
    }

    public int hashCode() {
        ConnectivityUtils.NetType netType = this.e;
        return ((((netType != null ? netType.hashCode() : 0) * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public static C5035brE a(Context context, ConnectivityUtils.NetType netType) {
        String str;
        if (context == null) {
            return d;
        }
        String b = ConnectivityUtils.b(context);
        if (netType != null) {
            int i = AnonymousClass1.b[netType.ordinal()];
            if (i == 1) {
                str = ConnectivityUtils.e(ConnectivityUtils.j(context));
            } else if (i == 2) {
                str = ConnectivityUtils.a((TelephonyManager) context.getSystemService("phone"));
            }
            return new C5035brE(netType, str, b);
        }
        str = "";
        return new C5035brE(netType, str, b);
    }

    /* renamed from: o.brE$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ConnectivityUtils.NetType.values().length];
            b = iArr;
            try {
                iArr[ConnectivityUtils.NetType.wifi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ConnectivityUtils.NetType.mobile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ConnectivityUtils.NetType.wired.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public String toString() {
        return "NetworkKey{mNetType=" + this.e + ", mNetworkId='" + this.c + "', mLocalIp='" + this.a + "'}";
    }
}
