package o;

import android.media.MediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrm;

/* renamed from: o.dfj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8192dfj extends C1045Mp {
    public static final C8192dfj a = new C8192dfj();

    public static final void e(NetflixMediaDrm netflixMediaDrm) {
    }

    private C8192dfj() {
        super("MediaDrmUtils_property");
    }

    public static final String a(MediaDrm mediaDrm, String str, String str2) {
        C8632dsu.c((Object) mediaDrm, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        try {
            String propertyString = mediaDrm.getPropertyString(str);
            C8632dsu.a(propertyString, "");
            a.getLogTag();
            return propertyString;
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static final int a(MediaDrm mediaDrm, String str, int i) {
        C8632dsu.c((Object) mediaDrm, "");
        C8632dsu.c((Object) str, "");
        try {
            String propertyString = mediaDrm.getPropertyString(str);
            C8632dsu.a(propertyString, "");
            a.getLogTag();
            return Integer.parseInt(propertyString);
        } catch (Throwable unused) {
            return i;
        }
    }
}
