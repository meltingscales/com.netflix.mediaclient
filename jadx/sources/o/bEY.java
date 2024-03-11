package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.protocol.nflx.NflxHandler;
import java.util.Map;

/* loaded from: classes.dex */
public interface bEY {
    String a(String str, String str2, String str3, String str4, String str5, int i);

    void a(Activity activity, String str, ConnectionSource connectionSource);

    boolean a(Activity activity);

    Intent b(Uri uri);

    void b(Activity activity, String str);

    boolean b(NflxHandler nflxHandler);

    void e(Activity activity, Map<String, String> map);

    /* loaded from: classes4.dex */
    public static final class c {
        public static /* synthetic */ String a(bEY bey, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
            if (obj == null) {
                return bey.a(str, str2, str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 0 : i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildShareUrl");
        }
    }
}
