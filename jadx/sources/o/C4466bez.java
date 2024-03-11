package o;

import android.os.Build;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.ErrorCodeUtils;

/* renamed from: o.bez  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4466bez {
    public static boolean e(C4974bpx c4974bpx) {
        if (b() && C8054ddD.o()) {
            return ErrorCodeUtils.b(c4974bpx);
        }
        return false;
    }

    public static boolean b() {
        return Build.MODEL.startsWith("Pixel 2");
    }
}
