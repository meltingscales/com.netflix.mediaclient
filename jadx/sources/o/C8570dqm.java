package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: o.dqm */
/* loaded from: classes.dex */
public final class C8570dqm extends C8576dqs {
    public static /* synthetic */ int a(Iterable iterable, int i) {
        return C8572dqo.d(iterable, i);
    }

    public static /* synthetic */ int a(List list) {
        return C8569dql.t(list);
    }

    public static /* synthetic */ List c() {
        return C8569dql.i();
    }

    public static /* synthetic */ List c(Collection collection, Object obj) {
        return C8576dqs.b((Collection<? extends Object>) collection, obj);
    }

    public static /* synthetic */ Set c(Iterable iterable, Iterable iterable2) {
        return C8576dqs.j(iterable, iterable2);
    }

    public static /* synthetic */ boolean c(Collection collection, Iterable iterable) {
        return C8571dqn.b(collection, iterable);
    }

    public static /* synthetic */ int[] c(Collection collection) {
        return C8576dqs.m(collection);
    }

    public static /* synthetic */ Appendable d(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, drM drm, int i2, Object obj) {
        Appendable e;
        e = C8576dqs.e(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : drm);
        return e;
    }

    public static /* synthetic */ List d(Iterable iterable, Object obj) {
        return C8576dqs.c(iterable, obj);
    }

    public static /* synthetic */ void e() {
        C8569dql.h();
    }

    public static /* synthetic */ Comparable m(Iterable iterable) {
        return C8576dqs.J(iterable);
    }

    public static /* synthetic */ List w(Iterable iterable) {
        return C8576dqs.U(iterable);
    }
}
