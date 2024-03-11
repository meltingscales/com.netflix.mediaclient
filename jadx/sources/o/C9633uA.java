package o;

import io.reactivex.Observable;
import o.AbstractC9683uy;

/* renamed from: o.uA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9633uA extends AbstractC9940zU<AbstractC9683uy, AbstractC9672un> {
    private InterfaceC9680uv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9633uA(InterfaceC9680uv interfaceC9680uv, Observable<AbstractC9683uy> observable) {
        super(observable, interfaceC9680uv);
        C8632dsu.c((Object) interfaceC9680uv, "");
        C8632dsu.c((Object) observable, "");
        this.a = interfaceC9680uv;
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9683uy abstractC9683uy) {
        C8632dsu.c((Object) abstractC9683uy, "");
        if (abstractC9683uy instanceof AbstractC9683uy.b) {
            this.a.a();
            if (((AbstractC9683uy.b) abstractC9683uy).c()) {
                this.a.h();
            } else {
                this.a.i();
            }
        } else if (C8632dsu.c(abstractC9683uy, AbstractC9683uy.e.b)) {
            this.a.c();
        } else if (abstractC9683uy instanceof AbstractC9683uy.c) {
            this.a.c();
        }
    }
}
