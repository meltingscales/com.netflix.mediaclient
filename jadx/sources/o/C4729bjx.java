package o;

import com.netflix.mediaclient.media.manifest.Location;
import com.netflix.mediaclient.media.manifest.Url;
import java.util.List;

/* renamed from: o.bjx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4729bjx {
    private final C4668bip d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4668bip d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4729bjx(String str, Url url, List<AbstractC4534bgN> list, List<Location> list2) {
        this.e = url.url();
        this.d = C4668bip.e(str, url, list, list2);
    }
}
