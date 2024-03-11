package o;

import com.netflix.mediaclient.util.ConnectivityUtils;

/* loaded from: classes.dex */
public final class TN {
    public static final TN a = new TN();
    private static ConnectivityUtils.NetType c;

    public final ConnectivityUtils.NetType d() {
        return c;
    }

    public final void e(ConnectivityUtils.NetType netType) {
        c = netType;
    }

    private TN() {
    }
}
