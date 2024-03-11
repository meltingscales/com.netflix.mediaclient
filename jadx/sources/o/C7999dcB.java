package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dcB  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7999dcB {
    public static final C7999dcB c = new C7999dcB();

    private C7999dcB() {
    }

    public final List<C5341bwt> c(String str, List<C7969dbY> list) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            arrayList.add(c.e(str, (C7969dbY) obj, i));
            i++;
        }
        return arrayList;
    }

    public static /* synthetic */ C5341bwt e(C7999dcB c7999dcB, String str, C7969dbY c7969dbY, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        return c7999dcB.e(str, c7969dbY, j);
    }

    public final C5341bwt e(String str, C7969dbY c7969dbY, long j) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c7969dbY, "");
        return new C5341bwt(c7969dbY.e(), str, c7969dbY.i(), c7969dbY.d(), c7969dbY.g(), c7969dbY.f(), c7969dbY.c(), c7969dbY.a(), c7969dbY.h(), j);
    }
}
