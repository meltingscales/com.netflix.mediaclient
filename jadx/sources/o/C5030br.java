package o;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import o.InterfaceC5136bt;

/* renamed from: o.br  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5030br<P extends InterfaceC5136bt> {
    private final ArrayDeque<P> a;

    public C5030br(int i, drO<? extends P> dro) {
        C8654dtp g;
        int d;
        C8632dsu.c((Object) dro, "");
        g = C8657dts.g(0, i);
        d = C8572dqo.d(g, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<Integer> it = g.iterator();
        while (it.hasNext()) {
            ((dqB) it).nextInt();
            arrayList.add(dro.invoke());
        }
        this.a = new ArrayDeque<>(arrayList);
    }

    public final P a() {
        P poll = this.a.poll();
        this.a.offer(poll);
        poll.d();
        C8632dsu.a(poll, "");
        return poll;
    }

    public final void d() {
        for (P p : this.a) {
            p.d();
        }
    }
}
