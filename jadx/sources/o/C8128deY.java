package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.BladerunnerErrorStatus;
import com.netflix.mediaclient.service.player.bladerunnerclient.volley.NqErrorStatus;
import java.util.List;
import java.util.Map;
import o.InterfaceC8248dgm;

/* renamed from: o.deY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8128deY {
    private static final int d;

    public static void b(String str, Map<String, List<String>> map) {
    }

    static {
        int i = 0;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            i++;
            if (stackTraceElement.getClassName().equals(C8128deY.class.getName())) {
                break;
            }
        }
        d = i;
    }

    private C8128deY() {
    }

    public static void b(String str, InterfaceC5195buF interfaceC5195buF) {
        if (interfaceC5195buF == null) {
            C1044Mm.b("nf_log", "No season details");
        } else {
            InterfaceC1598aHf.a(String.format("For Show Id %s, the Current Season Details Id is empty - %s, see SPY-7455", str, interfaceC5195buF.toString()));
        }
    }

    public static String a(Status status) {
        String valueOf = String.valueOf(status.c().getValue());
        if (status instanceof BladerunnerErrorStatus) {
            return ((BladerunnerErrorStatus) status).o();
        }
        return status instanceof NqErrorStatus ? ((NqErrorStatus) status).o() : valueOf;
    }

    public static String d(Status status) {
        String l = status.l();
        if (status instanceof BladerunnerErrorStatus) {
            return ((BladerunnerErrorStatus) status).r();
        }
        return status instanceof NqErrorStatus ? ((NqErrorStatus) status).r() : l;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_RESUME_ALL_EVENTS_DELIVERY");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static boolean c(InterfaceC8248dgm.d dVar, long j) {
        return dVar == null || C8175dfS.d(j, dVar.b());
    }
}
