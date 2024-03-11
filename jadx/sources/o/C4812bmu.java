package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.bmu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4812bmu {
    public static final boolean a(long j, long j2) {
        return j + 2000 >= j2;
    }

    public static final C4816bmy c(AbstractC4468bfA abstractC4468bfA) {
        C8632dsu.c((Object) abstractC4468bfA, "");
        List<AbstractC4533bgM> j = abstractC4468bfA.j();
        C8632dsu.a(j, "");
        Map<String, AbstractC4518bfy> c = abstractC4468bfA.c();
        C8632dsu.a(c, "");
        return new C4816bmy(j, c, new C4805bmn(abstractC4468bfA.b(), abstractC4468bfA.a(), abstractC4468bfA.h()), abstractC4468bfA.e() - abstractC4468bfA.d());
    }
}
