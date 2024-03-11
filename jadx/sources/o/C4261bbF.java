package o;

import com.netflix.mediaclient.media.manifest.Stream;
import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.util.List;

/* renamed from: o.bbF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4261bbF extends AbstractC4305bbx {
    @Override // o.AbstractC4305bbx, o.InterfaceC4285bbd
    public /* bridge */ /* synthetic */ DownloadableType a() {
        return super.a();
    }

    @Override // o.AbstractC4305bbx, o.InterfaceC4285bbd
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // o.AbstractC4305bbx, o.InterfaceC4285bbd
    public /* bridge */ /* synthetic */ long c() {
        return super.c();
    }

    @Override // o.AbstractC4305bbx, o.InterfaceC4285bbd
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    private C4261bbF(List<C4223baU> list, Long l, String str) {
        super(list, l.longValue(), str, DownloadableType.Video);
    }

    public static C4261bbF e(Stream stream, List<AbstractC4534bgN> list) {
        List<C4223baU> d = AbstractC4305bbx.d(stream, list);
        if (d != null) {
            return new C4261bbF(d, Long.valueOf(stream.size()), stream.downloadableId());
        }
        return null;
    }
}
