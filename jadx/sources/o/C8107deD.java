package o;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.StatusCode;

/* renamed from: o.deD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8107deD {
    public static boolean b(StatusCode statusCode) {
        return statusCode == StatusCode.DELETED_PROFILE;
    }

    public static void e(Context context, StatusCode statusCode) {
        C1044Mm.e("nf_fetcherrorutils", "Broadcasting DELETED_PROFILE intent");
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.DELETED_PROFILE"));
    }
}
