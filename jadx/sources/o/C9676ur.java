package o;

import io.reactivex.Observable;
import o.AbstractC9683uy;

/* renamed from: o.ur  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9676ur extends AbstractC9940zU<AbstractC9683uy, AbstractC9672un> {
    private final InterfaceC9677us e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9676ur(InterfaceC9677us interfaceC9677us, Observable<AbstractC9683uy> observable) {
        super(observable, interfaceC9677us);
        C8632dsu.c((Object) interfaceC9677us, "");
        C8632dsu.c((Object) observable, "");
        this.e = interfaceC9677us;
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9683uy abstractC9683uy) {
        C8632dsu.c((Object) abstractC9683uy, "");
        if (abstractC9683uy instanceof AbstractC9683uy.b) {
            this.e.c();
        } else if (C8632dsu.c(abstractC9683uy, AbstractC9683uy.e.b)) {
            this.e.c();
        } else if (abstractC9683uy instanceof AbstractC9683uy.c) {
            this.e.a();
            if (((AbstractC9683uy.c) abstractC9683uy).e()) {
                this.e.j();
            } else {
                this.e.f();
            }
        }
    }
}
