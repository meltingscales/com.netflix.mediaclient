package o;

import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Iterator;

/* renamed from: o.bdI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4370bdI {
    private static final String e = C4369bdH.class.getSimpleName();
    private static final boolean b = a();

    public static boolean d() {
        return b;
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Iterator<MediaCodecInfo> it = MediaCodecUtil.getDecoderInfos("audio/mp4a-latm", false, false).iterator();
                if (it.hasNext()) {
                    MediaCodecInfo next = it.next();
                    String str = e;
                    C1044Mm.e(str, next.name);
                    if (!next.name.equals("OMX.google.aac.decoder") && !next.name.equals("c2.android.aac.decoder")) {
                        C1044Mm.e(str, "NON Google XHEAAC Decoder");
                        return false;
                    }
                    C1044Mm.e(str, "Google XHEAAC Decoder" + next.name);
                    return true;
                }
            } catch (MediaCodecUtil.DecoderQueryException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
