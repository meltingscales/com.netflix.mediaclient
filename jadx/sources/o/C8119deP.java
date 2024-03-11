package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.service.falkor.NotificationsListStatus;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.deP  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8119deP {
    private static final Map<String, Long> b = new ConcurrentHashMap();
    private static final C8203dfu d = new C8203dfu();
    private static boolean e = false;

    public static Observable<Integer> a(String str) {
        return d.d(str).map(new Function() { // from class: o.deR
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((NotificationsListStatus) obj).e());
            }
        });
    }

    public static boolean c(String str) {
        return d.e(str).a() > 0;
    }

    public static int d(String str) {
        return d.e(str).e();
    }

    private static void e() {
        if (e) {
            return;
        }
        LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).registerReceiver(new BroadcastReceiver() { // from class: o.deP.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NotificationsListStatus e2 = C8119deP.e(intent, "SocialUtils");
                C8119deP.d.a(e2.c(), e2);
            }
        }, new IntentFilter("com.netflix.mediaclient.intent.action.BA_IRIS_NOTIFICATION_LIST_UPDATED"));
        e = true;
    }

    public static void a(ServiceManager serviceManager) {
        e();
        String c = C8126deW.c();
        Map<String, Long> map = b;
        long longValue = map.getOrDefault(c, 0L).longValue();
        if (serviceManager == null || serviceManager.j() == null || System.currentTimeMillis() - longValue <= 900000) {
            return;
        }
        serviceManager.j().c(false);
        map.put(C8126deW.c(), Long.valueOf(System.currentTimeMillis()));
    }

    public static NotificationsListStatus e(Intent intent, String str) {
        C1044Mm.a(str, "Received social notifications list updated intent");
        if (intent == null) {
            C1044Mm.j(str, "Received null intent");
            return NotificationsListStatus.a;
        } else if ("com.netflix.mediaclient.intent.action.BA_IRIS_NOTIFICATION_LIST_UPDATED".equals(intent.getAction())) {
            C1044Mm.a(str, "Updating menu icon");
            return (NotificationsListStatus) intent.getParcelableExtra("notifications_list_status");
        } else {
            return NotificationsListStatus.a;
        }
    }

    public static void a(Context context, Intent intent, String str) {
        String stringExtra = intent.getStringExtra("swiped_notification_id");
        if (C8168dfL.g(stringExtra)) {
            return;
        }
        C1044Mm.a(str, "saving swiped out notification id to preferences");
        C8157dfA.a(context, "notification_id_deleted_from_statusbar", stringExtra);
    }

    public static <T> void a(Parcelable[] parcelableArr, Set<T> set) {
        for (Parcelable parcelable : parcelableArr) {
            set.add(parcelable);
        }
    }

    public static String e(Resources resources, String str, String str2) {
        if (C8168dfL.g(str)) {
            InterfaceC1598aHf.a(new C1596aHd("SPY-9064, SPY-13429 - Video title was not ready - showing no title share msg.").b(false));
            return resources.getString(com.netflix.mediaclient.ui.R.o.lu, str2);
        }
        return resources.getString(com.netflix.mediaclient.ui.R.o.lq, str, str2);
    }
}
