package o;

import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;

/* renamed from: o.dfY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8181dfY {
    public static String b(int i) {
        if (i < 0) {
            return "DLST.N" + (i * (-1));
        }
        return "DLST." + i;
    }

    public static String b(StopReason stopReason) {
        int e = stopReason.e();
        if (e < 0) {
            return "DLS.N" + (e * (-1));
        }
        return "DLS." + e;
    }

    public static String e(WatchState watchState) {
        int a = watchState.a();
        if (a < 0) {
            return "DLW.N" + (a * (-1));
        }
        return "DLW." + a;
    }

    public static String e(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return " (" + str + ")";
    }
}
