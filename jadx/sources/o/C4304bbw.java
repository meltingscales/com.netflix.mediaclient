package o;

import com.netflix.mediaclient.service.offline.download.DownloadableType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bbw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4304bbw implements InterfaceC4285bbd {
    private final List<C4223baU> a;
    private final long c;
    private final String e;

    @Override // o.InterfaceC4285bbd
    public List<C4223baU> b() {
        return this.a;
    }

    @Override // o.InterfaceC4285bbd
    public long c() {
        return this.c;
    }

    @Override // o.InterfaceC4285bbd
    public String e() {
        return this.e;
    }

    private C4304bbw(List<C4223baU> list, String str, long j) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
        C4223baU.a(arrayList);
        this.e = str;
        this.c = j;
    }

    public static C4304bbw d(C4540bgT c4540bgT) {
        String[] b;
        if (c4540bgT != null && c4540bgT.c() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : c4540bgT.b()) {
                if (C8168dfL.h(str)) {
                    arrayList.add(new C4223baU(str, 1, 1L));
                }
            }
            if (arrayList.size() > 0) {
                return new C4304bbw(arrayList, c4540bgT.e(), c4540bgT.c());
            }
        }
        return null;
    }

    @Override // o.InterfaceC4285bbd
    public DownloadableType a() {
        return DownloadableType.TrickPlay;
    }
}
