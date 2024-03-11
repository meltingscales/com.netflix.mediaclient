package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.netflix.mediaclient.service.net.NetworkType;
import java.util.List;

/* loaded from: classes3.dex */
public class CurrentNetworkInfo {
    private final List<String> a;
    private final DataRestrictionState b;
    private final boolean c;
    private String d;
    private final Integer e;
    private Integer f;
    private final MeteredState g;
    private final NetType h;
    private Integer i;
    private final NetSpec j;

    /* loaded from: classes3.dex */
    public enum MeteredState {
        METERED,
        NOT_METERED,
        TEMPORARILY_NOT_METERED
    }

    public List<String> a() {
        return this.a;
    }

    public Integer b() {
        return this.f;
    }

    public DataRestrictionState c() {
        return this.b;
    }

    public Integer d() {
        return this.e;
    }

    public String e() {
        return this.d;
    }

    public NetSpec f() {
        return this.j;
    }

    public MeteredState g() {
        return this.g;
    }

    public Integer h() {
        return this.i;
    }

    public boolean i() {
        return this.c;
    }

    public NetType j() {
        return this.h;
    }

    private int a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            this.d = null;
            this.f = null;
            this.i = null;
            return 0;
        }
        this.d = telephonyManager.getNetworkOperatorName();
        int phoneType = telephonyManager.getPhoneType();
        String networkOperator = telephonyManager.getNetworkOperator();
        if (networkOperator == null || networkOperator.length() <= 4) {
            this.f = null;
            this.i = null;
        } else {
            this.f = Integer.valueOf(Integer.parseInt(networkOperator.substring(0, 3)));
            this.i = Integer.valueOf(Integer.parseInt(networkOperator.substring(3)));
        }
        return phoneType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:3)(1:53)|4|(1:6)(1:52)|7|(1:9)(1:51)|10|(8:46|47|(10:14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:30))(1:45)|31|32|(1:(2:34|(2:37|38)(1:36))(1:43))|39|40)|12|(0)(0)|31|32|(2:(0)(0)|36)|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f3, blocks: (B:40:0x00d9, B:42:0x00e1), top: B:51:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3 A[EDGE_INSN: B:54:0x00f3->B:46:0x00f3 ?: BREAK  , SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private CurrentNetworkInfo(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.reporter.CurrentNetworkInfo.<init>(android.content.Context):void");
    }

    public static CurrentNetworkInfo d(Context context) {
        return new CurrentNetworkInfo(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CurrentNetworkInfo currentNetworkInfo = (CurrentNetworkInfo) obj;
        Integer num = this.i;
        if (num == null ? currentNetworkInfo.i == null : num.equals(currentNetworkInfo.i)) {
            Integer num2 = this.f;
            if (num2 == null ? currentNetworkInfo.f == null : num2.equals(currentNetworkInfo.f)) {
                String str = this.d;
                if (str == null ? currentNetworkInfo.d == null : str.equals(currentNetworkInfo.d)) {
                    return this.h == currentNetworkInfo.h && this.b == currentNetworkInfo.b && this.g == currentNetworkInfo.g && this.j == currentNetworkInfo.j;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.i;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.f;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        String str = this.d;
        int hashCode3 = str != null ? str.hashCode() : 0;
        NetType netType = this.h;
        int hashCode4 = netType != null ? netType.hashCode() : 0;
        NetSpec netSpec = this.j;
        int hashCode5 = netSpec != null ? netSpec.hashCode() : 0;
        DataRestrictionState dataRestrictionState = this.b;
        int hashCode6 = dataRestrictionState != null ? dataRestrictionState.hashCode() : 0;
        MeteredState meteredState = this.g;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (meteredState != null ? meteredState.hashCode() : 0);
    }

    /* loaded from: classes3.dex */
    public enum DataRestrictionState {
        BACKGROUND_DATA_UNRESTRICTED,
        BACKGROUND_DATA_RESTRICTED,
        BACKGROUND_DATA_WHITELISTED,
        BACKGROUND_DATA_UNMETERED,
        BACKGROUND_DATA_METERED;

        public static DataRestrictionState d(ConnectivityManager connectivityManager) {
            if (connectivityManager.isActiveNetworkMetered()) {
                int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                return restrictBackgroundStatus != 1 ? restrictBackgroundStatus != 2 ? restrictBackgroundStatus != 3 ? BACKGROUND_DATA_METERED : BACKGROUND_DATA_RESTRICTED : BACKGROUND_DATA_WHITELISTED : BACKGROUND_DATA_UNRESTRICTED;
            }
            return BACKGROUND_DATA_UNMETERED;
        }
    }

    /* loaded from: classes3.dex */
    public enum NetType {
        MOBILE,
        GSM,
        CDMA,
        WIMAX,
        WIFI,
        WIRED,
        BLUETOOTH,
        NONE;

        public boolean d() {
            return this == WIFI || this == WIRED;
        }

        public boolean e() {
            return this == MOBILE || this == GSM || this == CDMA;
        }

        public static NetType d(NetworkInfo networkInfo, int i) {
            int type = networkInfo.getType();
            return type != 1 ? type != 9 ? type != 6 ? type != 7 ? i != 1 ? i != 2 ? MOBILE : CDMA : GSM : BLUETOOTH : WIMAX : WIRED : WIFI;
        }
    }

    /* loaded from: classes3.dex */
    public enum NetSpec {
        CELL_2G,
        CELL_3G,
        CELL_4G,
        CELL_5G,
        WIRED,
        WIFI,
        MOBILE,
        UNKNOWN;

        public static NetSpec a(NetworkInfo networkInfo) {
            int type = networkInfo.getType();
            if (type != 1) {
                if (type != 9) {
                    if (type == 6 || type == 7) {
                        return CELL_4G;
                    }
                    NetworkType b = NetworkType.b(networkInfo.getSubtype());
                    return NetworkType.b(b) ? CELL_2G : NetworkType.d(b) ? CELL_3G : NetworkType.a(b) ? CELL_4G : NetworkType.e(b) ? CELL_5G : MOBILE;
                }
                return WIRED;
            }
            return WIFI;
        }
    }
}
