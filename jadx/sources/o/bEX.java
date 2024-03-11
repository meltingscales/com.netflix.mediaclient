package o;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;

/* loaded from: classes.dex */
public interface bEX {
    public static final e b = e.b;

    NflxHandler.Response a(Intent intent, boolean z);

    boolean a(Intent intent);

    NflxHandler.Response c(Intent intent);

    NflxHandler.Response d(Uri uri, long j);

    NflxHandler d(Intent intent, long j);

    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e b = new e();

        private e() {
        }

        public final Intent e(Intent intent) {
            C8632dsu.c((Object) intent, "");
            intent.putExtra("extra_in_app_deeplink_use", true);
            return intent;
        }

        public final boolean d(Intent intent) {
            C8632dsu.c((Object) intent, "");
            return intent.getBooleanExtra("extra_in_app_deeplink_use", false);
        }
    }
}
