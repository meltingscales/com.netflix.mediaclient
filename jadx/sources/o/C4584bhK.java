package o;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import com.netflix.mediaclient.service.player.common.NetflixVMAFMetadataEntry;

/* renamed from: o.bhK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4584bhK {
    public static int d(Format format) {
        Metadata metadata = format.metadata;
        if (metadata != null) {
            for (int i = 0; i < metadata.length(); i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof NetflixVMAFMetadataEntry) {
                    return ((NetflixVMAFMetadataEntry) entry).d();
                }
            }
        }
        return -1;
    }
}
