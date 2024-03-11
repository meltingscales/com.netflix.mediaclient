package o;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.UUID;

/* renamed from: o.dhD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8266dhD {
    protected AbstractC8266dhD() {
    }

    public static void d() {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_PAUSE_EVENTS_DELIVERY");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.getInstance()).sendBroadcast(intent);
    }

    public static void b(boolean z) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOG_RESUME_EVENTS_DELIVERY");
        intent.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intent.putExtra("flush", z);
        LocalBroadcastManager.getInstance(AbstractApplicationC1040Mh.getInstance()).sendBroadcast(intent);
    }

    public static String a() {
        return String.valueOf(c());
    }

    public static UUID c() {
        return UUID.randomUUID();
    }
}
