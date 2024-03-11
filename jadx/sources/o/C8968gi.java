package o;

import o.AbstractC8899fS;
import o.InterfaceC8888fH;

/* renamed from: o.gi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8968gi<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> implements InterfaceC8890fJ<VM, S> {
    @Override // o.InterfaceC8890fJ
    public S d(Class<? extends VM> cls, Class<? extends S> cls2, AbstractC8979gt abstractC8979gt, C8975gp<VM, S> c8975gp) {
        drM<S, S> e;
        S invoke;
        Class<? extends S> b;
        Class<? extends VM> d;
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        C8632dsu.c((Object) abstractC8979gt, "");
        if (c8975gp != null && (d = c8975gp.d()) != null) {
            cls = d;
        }
        if (c8975gp != null && (b = c8975gp.b()) != null) {
            cls2 = b;
        }
        S s = (S) C8891fK.c(cls, abstractC8979gt);
        if (s == null) {
            s = (S) C8891fK.b(cls, cls2, abstractC8979gt.b());
        }
        return (c8975gp == null || (e = c8975gp.e()) == null || (invoke = e.invoke(s)) == null) ? s : invoke;
    }
}
