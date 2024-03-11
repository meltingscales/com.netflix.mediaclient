package o;

import androidx.media3.common.VideoSize;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;

/* renamed from: o.bhc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4602bhc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final NetflixCroppingMetadataEntry a(VideoSize videoSize) {
        int i = videoSize.width;
        int i2 = videoSize.height;
        return new NetflixCroppingMetadataEntry(i, i2, i, i2);
    }
}
