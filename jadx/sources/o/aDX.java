package o;

import com.netflix.model.leafs.TrackableListSummary;
import java.util.ArrayList;
import java.util.List;
import o.C1362Yt;

/* loaded from: classes3.dex */
public final class aDX implements InterfaceC5196buG {
    private final int a;
    private final String c;
    private final List<C1362Yt.D> e;

    public aDX(List<C1362Yt.D> list, int i, String str) {
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        this.e = list;
        this.a = i;
        this.c = str;
    }

    @Override // o.InterfaceC5196buG
    public TrackableListSummary h() {
        return new aDZ(this.a, this.c, bR_().size());
    }

    @Override // o.InterfaceC5196buG
    public List<InterfaceC5223buh> bR_() {
        int d;
        List<C1362Yt.D> list = this.e;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        for (C1362Yt.D d2 : list) {
            C2630ajh b = d2.b();
            C1362Yt.C1365c c = d2.c();
            arrayList.add(new aEX(b, c != null ? c.d() : null, null));
        }
        return arrayList;
    }
}
