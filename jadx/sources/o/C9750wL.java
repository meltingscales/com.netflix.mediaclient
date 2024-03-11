package o;

import io.reactivex.Observable;
import o.AbstractC9766wb;

/* renamed from: o.wL  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9750wL extends AbstractC9709vX {
    public static final c d = new c(null);
    private final InterfaceC9747wI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9750wL(InterfaceC9747wI interfaceC9747wI, Observable<AbstractC9766wb> observable) {
        super(interfaceC9747wI, observable);
        C8632dsu.c((Object) interfaceC9747wI, "");
        C8632dsu.c((Object) observable, "");
        this.b = interfaceC9747wI;
    }

    /* renamed from: o.wL$c */
    /* loaded from: classes2.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MdxPostPlayUIPresenter");
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (abstractC9766wb instanceof AbstractC9766wb.C9780n) {
            this.b.j();
        } else if (abstractC9766wb instanceof AbstractC9766wb.z) {
            this.b.c();
        } else if (abstractC9766wb instanceof AbstractC9766wb.D) {
            AbstractC9766wb.D d2 = (AbstractC9766wb.D) abstractC9766wb;
            this.b.d(d2.j(), d2.d(), d2.c(), d2.b(), d2.e());
            this.b.a();
        }
    }
}
