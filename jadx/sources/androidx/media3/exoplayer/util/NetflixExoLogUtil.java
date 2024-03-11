package androidx.media3.exoplayer.util;

import android.util.Log;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* loaded from: classes2.dex */
public class NetflixExoLogUtil {
    public static void Log(String str, Object... objArr) {
        Log.d("NfExo", toMessage(str, objArr));
    }

    private static String toMessage(String str, Object... objArr) {
        return (objArr == null || objArr.length < 1) ? str : String.format(Locale.US, str, objArr);
    }

    public static String getTrackType(int i) {
        return Util.getTrackTypeString(i);
    }
}
