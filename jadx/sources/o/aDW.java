package o;

import com.netflix.model.leafs.TrackableListSummary;
import java.util.ArrayList;
import java.util.List;
import o.C1362Yt;

/* loaded from: classes3.dex */
public final class aDW implements InterfaceC5202buM {
    private final C1362Yt.I b;
    private final String c;

    public aDW(C1362Yt.I i, String str) {
        C8632dsu.c((Object) i, "");
        this.b = i;
        this.c = str;
    }

    @Override // o.InterfaceC5202buM
    public TrackableListSummary ck_() {
        String str = this.c;
        List<C1362Yt.B> b = this.b.b();
        return new aDZ(255330215, str, b != null ? b.size() : 0);
    }

    @Override // o.InterfaceC5202buM
    public List<InterfaceC5223buh> cl_() {
        int d;
        List<C1362Yt.B> b = this.b.b();
        if (b != null) {
            d = C8572dqo.d(b, 10);
            ArrayList arrayList = new ArrayList(d);
            for (C1362Yt.B b2 : b) {
                C2630ajh c = b2.c();
                C1362Yt.C1364b a = b2.a();
                String e = a != null ? a.e() : null;
                if (e == null) {
                    e = "";
                }
                arrayList.add(new aEX(c, e, null));
            }
            return arrayList;
        }
        return null;
    }
}
