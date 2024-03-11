package o;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.BwCap;
import com.netflix.mediaclient.service.webclient.model.leafs.StreamProfileData;
import com.netflix.mediaclient.ui.bandwidthsetting.ManualBwChoice;
import com.netflix.mediaclient.util.ConnectivityUtils;

/* renamed from: o.aHu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1613aHu {
    private static final Boolean c = Boolean.FALSE;
    public static final int b = ManualBwChoice.LOW.d();
    public static int d = 1200;
    private static final Boolean a = Boolean.TRUE;

    public static boolean b(Context context) {
        int d2 = C8157dfA.d(context, "bw_user_control_auto", -1);
        if (d2 < 0) {
            return a.booleanValue();
        }
        return d2 != 0;
    }

    public static void a(Context context, Boolean bool, int i) {
        C8157dfA.a(context, "bw_user_control_auto", bool.booleanValue() ? 1 : 0);
        C8157dfA.a(context, "bw_user_manual_setting", i);
    }

    public static int e(Context context) {
        int d2 = C8157dfA.d(context, "bw_user_manual_setting", -1);
        if (d2 < 0 || d2 > ManualBwChoice.UNLIMITED.d() || d2 == ManualBwChoice.MEDIUM.d() || d2 == ManualBwChoice.HIGH.d()) {
            int i = b;
            C8157dfA.a(context, "bw_user_manual_setting", i);
            return i;
        }
        return d2;
    }

    public static boolean i(Context context) {
        return !b(context) && e(context) == ManualBwChoice.LOW.d();
    }

    public static String c(Context context) {
        if (b(context)) {
            return "auto";
        }
        int e = e(context);
        return e == ManualBwChoice.OFF.d() ? "off" : e == ManualBwChoice.UNLIMITED.d() ? "max" : "low";
    }

    public static boolean j(Context context) {
        if (f(context)) {
            return C8157dfA.b(context, "nf_play_no_wifi_warning", false);
        }
        if (b(context)) {
            return false;
        }
        return ManualBwChoice.OFF.d() == e(context);
    }

    public static void h(Context context) {
        if (f(context)) {
            C1044Mm.e("nf_bw_saving", "Data saver functionality is not yet enabled .. skip migrate");
        } else if (C8157dfA.b(context, "nf_play_no_wifi_warning", false)) {
            C1044Mm.e("nf_bw_saving", "migrating wifi only setting to latest");
            a(context, Boolean.FALSE, ManualBwChoice.OFF.d());
            C1044Mm.e("nf_bw_saving", "unsetting old wifi only setting");
            C8157dfA.d(context, "nf_play_no_wifi_warning", false);
        }
    }

    public static boolean f(Context context) {
        return C8157dfA.b(context, "disable_data_saver", false);
    }

    public static boolean k(Context context) {
        if (b(context)) {
            C1044Mm.a("nf_bw_saving", "shouldLimitCellularVideoBitrate :%b", Boolean.TRUE);
            return true;
        }
        boolean z = ManualBwChoice.UNLIMITED.d() != e(context);
        C1044Mm.a("nf_bw_saving", "shouldLimitCellularVideoBitrate :%b", Boolean.valueOf(z));
        return z;
    }

    public static int d(Context context, BwCap bwCap) {
        if (b(context)) {
            return d(bwCap);
        }
        int e = e(context);
        int e2 = e(e, bwCap);
        C1044Mm.a("nf_bw_saving", "getCellularVideoBitrateKbps manual: %b,  : %d", Integer.valueOf(e), Integer.valueOf(e2));
        return e2;
    }

    private static int e(int i, BwCap bwCap) {
        if (ManualBwChoice.LOW.d() == i) {
            return a(bwCap);
        }
        if (ManualBwChoice.UNLIMITED.d() == i) {
            return 20000;
        }
        if (ManualBwChoice.OFF.d() == i) {
            return 0;
        }
        return StreamProfileData.Companion.getDEFAULT_CELLULAR_AUTO_KBPS();
    }

    public static boolean d(Context context) {
        if (c.booleanValue()) {
            return true;
        }
        if (ConnectivityUtils.k(context)) {
            return !f(context);
        }
        C1044Mm.e("nf_bw_saving", "no cellular!!");
        return false;
    }

    public static boolean a(Context context) {
        if (!f(context) && ConnectivityUtils.p(context)) {
            if (b(context)) {
                return true;
            }
            return ManualBwChoice.UNLIMITED.d() != e(context);
        }
        return false;
    }

    public static int a(Context context, BwCap bwCap) {
        int d2;
        if (!a(context) || (d2 = d(context, bwCap)) <= 0) {
            return 20000;
        }
        return d2;
    }

    public static boolean g(Context context) {
        return ConnectivityUtils.p(context) && k(context);
    }

    private static int a(BwCap bwCap) {
        return (bwCap == null || bwCap.getLow() <= 0) ? StreamProfileData.Companion.getDEFAULT_MANUAL_VIDEO_BITRATE_LOW() : bwCap.getLow();
    }

    private static int d(BwCap bwCap) {
        return (bwCap == null || bwCap.getAuto() <= 0) ? StreamProfileData.Companion.getDEFAULT_CELLULAR_AUTO_KBPS() : bwCap.getAuto();
    }
}
