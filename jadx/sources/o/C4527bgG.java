package o;

import android.text.TextUtils;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.bgG  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4527bgG {
    public static PlaylistMap c(AbstractC4556bgj abstractC4556bgj, long j) {
        C5209buT c;
        String b = abstractC4556bgj.b();
        long c2 = abstractC4556bgj.c();
        Map<String, AbstractC4531bgK> a = abstractC4556bgj.a();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AbstractC4531bgK> entry : a.entrySet()) {
            if (c2 == 80135585) {
                c = a(entry.getValue(), j);
            } else if (c2 == 81241275) {
                c = e(entry.getValue(), j);
            } else {
                c = c(entry.getValue(), j);
            }
            hashMap.put(entry.getKey(), c);
        }
        return new C5211buV(hashMap, b, String.valueOf(c2), c2);
    }

    private static C5209buT e(AbstractC4531bgK abstractC4531bgK, long j) {
        C5213buX[] d = d(abstractC4531bgK.e());
        String a = TextUtils.isEmpty(abstractC4531bgK.a()) ? null : abstractC4531bgK.a();
        long f = abstractC4531bgK.f();
        long j2 = abstractC4531bgK.f() > 0 ? 1 : 0;
        if (abstractC4531bgK.c() != -1) {
            j = abstractC4531bgK.c();
        }
        return new C5209buT(a, j2 + f, j, d, abstractC4531bgK.b(), abstractC4531bgK.d(), abstractC4531bgK.i(), abstractC4531bgK.j());
    }

    private static C5209buT a(AbstractC4531bgK abstractC4531bgK, long j) {
        C5213buX[] d = d(abstractC4531bgK.e());
        String a = abstractC4531bgK.a();
        if (a == null && d.length == 1) {
            a = d[0].d;
        }
        long f = abstractC4531bgK.f();
        long j2 = abstractC4531bgK.f() <= 0 ? 0 : 1;
        if (abstractC4531bgK.c() != -1) {
            j = abstractC4531bgK.c();
        }
        return new C5209buT(a, f + j2, j, d, abstractC4531bgK.b(), abstractC4531bgK.d(), abstractC4531bgK.i(), abstractC4531bgK.j());
    }

    private static C5209buT c(AbstractC4531bgK abstractC4531bgK, long j) {
        C5213buX[] d = d(abstractC4531bgK.e());
        String a = abstractC4531bgK.a();
        long f = abstractC4531bgK.f();
        long j2 = abstractC4531bgK.f() > 0 ? 1 : 0;
        if (abstractC4531bgK.c() != -1) {
            j = abstractC4531bgK.c();
        }
        return new C5209buT(a, j2 + f, j, d, abstractC4531bgK.b(), abstractC4531bgK.d(), abstractC4531bgK.i(), abstractC4531bgK.j());
    }

    private static C5213buX[] d(Map<String, AbstractC4565bgs> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, AbstractC4565bgs> entry : map.entrySet()) {
            AbstractC4565bgs value = entry.getValue();
            arrayList.add(new C5213buX(entry.getKey(), value.e(), value.b(), value.a()));
        }
        return (C5213buX[]) arrayList.toArray(new C5213buX[0]);
    }

    public static C5208buS d(AbstractC4528bgH abstractC4528bgH, String str, long j) {
        String a = abstractC4528bgH.a();
        Map<String, AbstractC4531bgK> c = abstractC4528bgH.c();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, AbstractC4531bgK> entry : c.entrySet()) {
            AbstractC4531bgK value = entry.getValue();
            hashMap.put(entry.getKey(), new C5273bve(value.a(), value.f(), value.c(), d(value.e()), value.b(), value.d(), value.i(), value.h().longValue(), 0L, value.j(), j, SegmentType.a));
        }
        return new C5208buS(hashMap, a, str);
    }
}
