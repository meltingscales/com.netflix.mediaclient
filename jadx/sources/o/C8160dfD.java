package o;

import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.dfD  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8160dfD {
    public static void c(PlayContext playContext) {
        if (playContext == null) {
            InterfaceC1598aHf.a("PlayContext trackId should not be null !");
            return;
        }
        C1044Mm.e("ContentValues", "TrackId Validation:" + playContext.getTrackId());
        if (playContext.getTrackId() <= 0) {
            InterfaceC1598aHf.a("Empty playContext. trackID is invalid." + playContext.getTrackId() + " " + playContext.j());
        }
    }
}
