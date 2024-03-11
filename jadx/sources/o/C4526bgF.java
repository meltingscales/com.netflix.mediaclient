package o;

import android.util.Pair;
import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.VideoTrack;
import o.InterfaceC4525bgE;

/* renamed from: o.bgF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4526bgF {
    public static Pair<VideoTrack, Stream> d(InterfaceC4525bgE interfaceC4525bgE, String str) {
        for (VideoTrack videoTrack : interfaceC4525bgE.an()) {
            for (Stream stream : videoTrack.streams()) {
                if (C8168dfL.c(stream.downloadableId(), str)) {
                    return new Pair<>(videoTrack, stream);
                }
            }
        }
        return null;
    }

    public static InterfaceC4525bgE.c a(InterfaceC4525bgE interfaceC4525bgE) {
        long j = 0;
        int i = 0;
        int i2 = 0;
        for (VideoTrack videoTrack : interfaceC4525bgE.an()) {
            int maxWidth = videoTrack.maxWidth();
            int maxHeight = videoTrack.maxHeight();
            long j2 = maxWidth * maxHeight;
            if (j2 > j) {
                i2 = maxHeight;
                i = maxWidth;
                j = j2;
            }
        }
        C1044Mm.c("nf_manifest_utils", "maxWidth=%d maxHeight=%d", Integer.valueOf(i), Integer.valueOf(i2));
        return new InterfaceC4525bgE.c(i, i2);
    }
}
