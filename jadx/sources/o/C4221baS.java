package o;

import android.content.Context;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixStatus;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.util.ConnectivityUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: o.baS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4221baS {
    private static final long c = TimeUnit.MINUTES.toMillis(1);
    private static final Object a = new Object();
    private static long d = 0;

    public static void a(Context context) {
        synchronized (a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= d + c) {
                C8157dfA.e(context, "last_contact_netflix_ms", currentTimeMillis);
                d = currentTimeMillis;
            }
        }
    }

    private static long d(Context context) {
        long j;
        synchronized (a) {
            if (d == 0) {
                d = C8157dfA.b(context, "last_contact_netflix_ms", -1L);
            }
            j = d;
        }
        return j;
    }

    public static boolean e(Context context) {
        long d2 = d(context);
        return d2 > 0 && d2 + (c * 2) >= System.currentTimeMillis() && ConnectivityUtils.l(context);
    }

    public static boolean a(InterfaceC4299bbr interfaceC4299bbr) {
        return interfaceC4299bbr.N() >= System.currentTimeMillis();
    }

    public static boolean c(Context context, InterfaceC4299bbr interfaceC4299bbr) {
        if (interfaceC4299bbr.F() && interfaceC4299bbr.B() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - interfaceC4299bbr.B() < interfaceC4299bbr.z() || ConnectivityUtils.l(context)) {
                return true;
            }
            long d2 = d(context);
            if (!interfaceC4299bbr.D() || interfaceC4299bbr.C() <= 0 || d2 <= 0 || currentTimeMillis - d2 >= interfaceC4299bbr.z()) {
                return false;
            }
            interfaceC4299bbr.o();
            synchronized (interfaceC4299bbr) {
                interfaceC4299bbr.X();
            }
            C1044Mm.e("nf_PlayabilityEnforcer", "reset play window");
            return true;
        }
        return true;
    }

    public static boolean d(InterfaceC4299bbr interfaceC4299bbr) {
        return interfaceC4299bbr.v() < C8170dfN.d();
    }

    public static boolean c(InterfaceC4299bbr interfaceC4299bbr) {
        if (interfaceC4299bbr.H() != StopReason.EncodesRevoked && interfaceC4299bbr.H() != StopReason.EncodesAreNotAvailableAnyMore) {
            long d2 = C8170dfN.d();
            if ((interfaceC4299bbr.G() && d2 >= interfaceC4299bbr.A()) || (interfaceC4299bbr.v() > 0 && interfaceC4299bbr.v() <= d2 + 864000000)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Status a(Context context, InterfaceC4299bbr interfaceC4299bbr) {
        if (interfaceC4299bbr.D() && interfaceC4299bbr.C() > 0 && ConnectivityUtils.l(context)) {
            interfaceC4299bbr.o();
            interfaceC4299bbr.X();
            return InterfaceC1078Nw.aJ;
        }
        return new NetflixStatus(StatusCode.DL_PLAY_WINDOW_RENEW_FAILED);
    }
}
