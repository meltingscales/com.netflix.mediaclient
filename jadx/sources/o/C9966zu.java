package o;

import android.text.TextUtils;
import com.netflix.mediaclient.service.pushnotification.Payload;

/* renamed from: o.zu  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9966zu {
    public static int e(int i) {
        if (i == 3) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        return i == 1 ? 1 : 0;
    }

    public static int c(String str) {
        if (TextUtils.equals(str, "THUMBS_WAY_UP")) {
            return 3;
        }
        if (TextUtils.equals(str, Payload.Action.THUMBS_DOWN)) {
            return 1;
        }
        return TextUtils.equals(str, Payload.Action.THUMBS_UP) ? 2 : 0;
    }
}
