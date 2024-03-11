package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* renamed from: o.bcN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4322bcN extends BroadcastReceiver {
    private static String e = "com.netflix.mediaclient.intent.action.SKIP_TO_NEXT";

    public abstract void d();

    public static void d(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(e));
    }

    public static IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(e);
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (e.equals(intent.getAction())) {
            d();
        }
    }
}
