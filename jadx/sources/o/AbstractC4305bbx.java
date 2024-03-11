package o;

import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.media.manifest.Url;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bbx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4305bbx implements InterfaceC4285bbd {
    private final String b;
    private final long c;
    private final DownloadableType d;
    private final List<C4223baU> e;

    @Override // o.InterfaceC4285bbd
    public DownloadableType a() {
        return this.d;
    }

    @Override // o.InterfaceC4285bbd
    public List<C4223baU> b() {
        return this.e;
    }

    @Override // o.InterfaceC4285bbd
    public long c() {
        return this.c;
    }

    @Override // o.InterfaceC4285bbd
    public String e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4305bbx(List<C4223baU> list, long j, String str, DownloadableType downloadableType) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.addAll(list);
        this.c = j;
        this.b = str;
        this.d = downloadableType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<C4223baU> d(Stream stream, List<AbstractC4534bgN> list) {
        if (stream == null || stream.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Url url : stream.urls()) {
            if (C8168dfL.h(url.url())) {
                AbstractC4534bgN c = AbstractC4534bgN.c(url.cdnId(), list);
                arrayList.add(new C4223baU(url.url(), c == null ? 0 : c.e(), url.cdnId()));
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }
}
