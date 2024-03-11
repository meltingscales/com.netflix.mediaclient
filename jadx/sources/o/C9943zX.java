package o;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import o.InterfaceC8962gc;

/* renamed from: o.zX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9943zX<S extends InterfaceC8962gc> extends AbstractC8919fm<S> {
    private final Observable<dpR> b;
    private final PublishSubject<dpR> e;

    public final Observable<dpR> g() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9943zX(S s) {
        super(s);
        C8632dsu.c((Object) s, "");
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.e = create;
        this.b = create;
    }

    @Override // o.AbstractC8919fm, o.AbstractC8899fS
    public void d() {
        super.d();
        try {
            this.e.onNext(dpR.c);
            this.e.onComplete();
        } catch (CancellationException unused) {
        }
    }

    public final <T, V> AbstractC8918fl<V> b(AbstractC8918fl<? extends T> abstractC8918fl, drM<? super T, ? extends V> drm) {
        C8632dsu.c((Object) abstractC8918fl, "");
        C8632dsu.c((Object) drm, "");
        C8974go c8974go = C8974go.e;
        if (C8632dsu.c(abstractC8918fl, c8974go)) {
            return c8974go;
        }
        if (abstractC8918fl instanceof C8932fz) {
            return new C8932fz(null, 1, null);
        }
        if (abstractC8918fl instanceof C8971gl) {
            return new C8971gl(drm.invoke((Object) ((C8971gl) abstractC8918fl).c()));
        }
        if (abstractC8918fl instanceof C8927fu) {
            return new C8927fu(((C8927fu) abstractC8918fl).b(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
