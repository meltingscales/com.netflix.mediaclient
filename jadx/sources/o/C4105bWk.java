package o;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o.aCE;

/* renamed from: o.bWk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4105bWk {
    private static final List<LoMoType> a;

    static {
        List<LoMoType> j;
        j = C8569dql.j(LoMoType.POPULAR_GAMES, LoMoType.CHARACTERS);
        a = j;
    }

    public static final void c(C4001bSo c4001bSo, aCG acg) {
        C8632dsu.c((Object) acg, "");
        if (C8171dfO.e()) {
            a(c4001bSo != null ? c4001bSo.e() : null, acg);
        }
    }

    public static final void e(C4003bSq c4003bSq, aCG acg) {
        List e;
        C8632dsu.c((Object) acg, "");
        if (!C8171dfO.e() || c4003bSq == null) {
            return;
        }
        e = C8566dqi.e(c4003bSq);
        a(e, acg);
    }

    public static final void a(List<C4003bSq> list, aCG acg) {
        int d;
        Set W;
        List<C4002bSp> i;
        boolean b;
        LoMo b2;
        C8632dsu.c((Object) acg, "");
        if (!C8171dfO.e() || list == null || list.isEmpty()) {
            return;
        }
        ArrayList<C4003bSq> arrayList = new ArrayList();
        for (Object obj : list) {
            C4003bSq c4003bSq = (C4003bSq) obj;
            b = C8576dqs.b((Iterable<? extends LoMoType>) a, (c4003bSq == null || (b2 = c4003bSq.b()) == null) ? null : b2.getType());
            if (!b) {
                arrayList.add(obj);
            }
        }
        ArrayList<C4002bSp> arrayList2 = new ArrayList();
        for (C4003bSq c4003bSq2 : arrayList) {
            if (c4003bSq2 == null || (i = c4003bSq2.e()) == null) {
                i = C8569dql.i();
            }
            C8571dqn.b(arrayList2, i);
        }
        d = C8572dqo.d(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(d);
        for (C4002bSp c4002bSp : arrayList2) {
            String id = c4002bSp.a().getVideo().getId();
            C8632dsu.a(id, "");
            arrayList3.add(Integer.valueOf(Integer.parseInt(id)));
        }
        if (!arrayList3.isEmpty()) {
            W = C8576dqs.W(arrayList3);
            b(W, acg);
        }
    }

    public static final void e(List<C4002bSp> list, LoMo loMo, aCG acg) {
        Set W;
        Integer num;
        InterfaceC5222bug<? extends InterfaceC5223buh> a2;
        InterfaceC5223buh video;
        String id;
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) acg, "");
        if (!C8171dfO.e() || list == null || list.isEmpty() || a.contains(loMo.getType())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C4002bSp c4002bSp : list) {
            if (c4002bSp == null || (a2 = c4002bSp.a()) == null || (video = a2.getVideo()) == null || (id = video.getId()) == null) {
                num = null;
            } else {
                C8632dsu.d((Object) id);
                num = Integer.valueOf(Integer.parseInt(id));
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (!arrayList.isEmpty()) {
            W = C8576dqs.W(arrayList);
            b(W, acg);
        }
    }

    private static final void b(Set<Integer> set, aCG acg) {
        List U;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        aDB d2 = aGD.d(d);
        U = C8576dqs.U(set);
        C9698vM.e(aCE.d.d(acg, new C1353Yk(U, d2.b()), null, null, false, 14, null), 3, 1L, null, 4, null).subscribe();
    }
}
