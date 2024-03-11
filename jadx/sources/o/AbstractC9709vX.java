package o;

import io.reactivex.Observable;

/* renamed from: o.vX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9709vX extends AbstractC9940zU<AbstractC9766wb, AbstractC9791we> {
    private final C8174dfR e;

    public final C8174dfR d() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9709vX(InterfaceC9939zT<AbstractC9791we> interfaceC9939zT, Observable<AbstractC9766wb> observable) {
        super(observable, interfaceC9939zT);
        C8632dsu.c((Object) interfaceC9939zT, "");
        C8632dsu.c((Object) observable, "");
        this.e = new C8174dfR();
    }
}
