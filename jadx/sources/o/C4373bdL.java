package o;

import android.media.MediaCodecList;
import android.media.MediaFormat;

/* renamed from: o.bdL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4373bdL {
    public static boolean c() {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/eac3");
        return C8168dfL.h(mediaCodecList.findDecoderForFormat(mediaFormat));
    }

    public static boolean a() {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/eac3-joc");
        return C8168dfL.h(mediaCodecList.findDecoderForFormat(mediaFormat));
    }
}
