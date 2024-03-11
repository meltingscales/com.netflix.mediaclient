package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dlx  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8446dlx {
    private Object e = new Object();
    private long b = System.currentTimeMillis();
    private ArrayList<InterfaceC8433dlk> c = new ArrayList<>();

    public final ArrayList<InterfaceC8433dlk> b() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public final void a(InterfaceC8433dlk interfaceC8433dlk) {
        if (interfaceC8433dlk == null) {
            return;
        }
        synchronized (this.e) {
            this.c.add(interfaceC8433dlk);
            this.b = System.currentTimeMillis();
            dpR dpr = dpR.c;
        }
    }

    public final List<InterfaceC8433dlk> a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            arrayList.addAll(this.c);
            this.c.clear();
            dpR dpr = dpR.c;
        }
        return arrayList;
    }
}
