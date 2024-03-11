package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1390Zo;
import o.aCE;

@Singleton
/* renamed from: o.cjA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6744cjA implements InterfaceC6778cji {
    private final aCE e;

    @Inject
    public C6744cjA(aCE ace) {
        C8632dsu.c((Object) ace, "");
        this.e = ace;
    }

    @Override // o.InterfaceC6778cji
    public Object c(String str, InterfaceC8585dra<? super C8954gU<C1390Zo.c>> interfaceC8585dra) {
        return aCE.d.c(this.e, new C1390Zo(str), null, false, null, false, interfaceC8585dra, 30, null);
    }
}
