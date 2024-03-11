package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC9013ha;
import o.AbstractC9015hc;
import o.C8576dqs;
import o.C8632dsu;
import o.C8955gV;
import o.C8957gX;
import o.C9014hb;
import o.C9016hd;
import o.C9031hs;

/* renamed from: o.hb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9014hb {
    public static final <T> AbstractC9013ha<T> d(AbstractC9013ha<? extends T>... abstractC9013haArr) {
        List D;
        Set W;
        C8632dsu.c((Object) abstractC9013haArr, "");
        D = C8563dqf.D(abstractC9013haArr);
        W = C8576dqs.W(D);
        return new AbstractC9013ha.a(W);
    }

    public static final AbstractC9013ha<C9016hd> e(String str) {
        C8632dsu.c((Object) str, "");
        return new AbstractC9013ha.b(new C9016hd(str));
    }

    public static final AbstractC9013ha<C8955gV> c(String... strArr) {
        Set G;
        C8632dsu.c((Object) strArr, "");
        G = C8563dqf.G(strArr);
        return new AbstractC9013ha.b(new C8955gV(G));
    }

    public static final <T> boolean d(AbstractC9013ha<? extends T> abstractC9013ha, drM<? super T, Boolean> drm) {
        C8632dsu.c((Object) abstractC9013ha, "");
        C8632dsu.c((Object) drm, "");
        if (!C8632dsu.c(abstractC9013ha, AbstractC9013ha.f.c)) {
            if (!C8632dsu.c(abstractC9013ha, AbstractC9013ha.d.c)) {
                if (abstractC9013ha instanceof AbstractC9013ha.c) {
                    if (!d(((AbstractC9013ha.c) abstractC9013ha).b(), drm)) {
                    }
                } else if (!(abstractC9013ha instanceof AbstractC9013ha.e)) {
                    if (!(abstractC9013ha instanceof AbstractC9013ha.a)) {
                        if (abstractC9013ha instanceof AbstractC9013ha.b) {
                            return drm.invoke((Object) ((AbstractC9013ha.b) abstractC9013ha).c()).booleanValue();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Set<AbstractC9013ha<T>> c = ((AbstractC9013ha.a) abstractC9013ha).c();
                    if (!(c instanceof Collection) || !c.isEmpty()) {
                        Iterator<T> it = c.iterator();
                        while (it.hasNext()) {
                            if (!d((AbstractC9013ha) it.next(), drm)) {
                            }
                        }
                    }
                } else {
                    Set<AbstractC9013ha<T>> c2 = ((AbstractC9013ha.e) abstractC9013ha).c();
                    if (!(c2 instanceof Collection) || !c2.isEmpty()) {
                        Iterator<T> it2 = c2.iterator();
                        while (it2.hasNext()) {
                            if (d((AbstractC9013ha) it2.next(), drm)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d(AbstractC9013ha<? extends AbstractC9015hc> abstractC9013ha, final Set<String> set, final String str, final Set<C9031hs> set2, List<? extends Object> list) {
        C8632dsu.c((Object) abstractC9013ha, "");
        final List i = list != null ? C8576dqs.i(list, 1) : null;
        return d(abstractC9013ha, new drM<AbstractC9015hc, Boolean>() { // from class: com.apollographql.apollo3.api.BooleanExpressions$evaluate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(AbstractC9015hc abstractC9015hc) {
                boolean b;
                C8632dsu.c((Object) abstractC9015hc, "");
                if (abstractC9015hc instanceof C9016hd) {
                    Set<String> set3 = set;
                    b = set3 == null || !set3.contains(((C9016hd) abstractC9015hc).b());
                } else if (abstractC9015hc instanceof C8957gX) {
                    Set<C9031hs> set4 = set2;
                    List<Object> list2 = i;
                    C8632dsu.d(list2);
                    b = C9014hb.c(set4, list2, ((C8957gX) abstractC9015hc).d());
                } else if (!(abstractC9015hc instanceof C8955gV)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    b = C8576dqs.b((Iterable<? extends String>) ((C8955gV) abstractC9015hc).c(), str);
                }
                return Boolean.valueOf(b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Set<C9031hs> set, List<? extends Object> list, String str) {
        if (set == null) {
            return true;
        }
        return set.contains(new C9031hs(list, str));
    }
}
