package o;

import io.reactivex.Observable;
import o.AbstractC9766wb;

/* renamed from: o.wy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9811wy extends AbstractC9709vX {
    public static final b a = new b(null);
    private final InterfaceC9746wH e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9811wy(InterfaceC9746wH interfaceC9746wH, Observable<AbstractC9766wb> observable) {
        super(interfaceC9746wH, observable);
        C8632dsu.c((Object) interfaceC9746wH, "");
        C8632dsu.c((Object) observable, "");
        this.e = interfaceC9746wH;
    }

    /* renamed from: o.wy$b */
    /* loaded from: classes2.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MdxDetailsUIPresenter");
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (abstractC9766wb instanceof AbstractC9766wb.C9780n) {
            this.e.g();
        } else if (abstractC9766wb instanceof AbstractC9766wb.w) {
            this.e.a(true);
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9788x) {
            this.e.a(false);
        } else if (abstractC9766wb instanceof AbstractC9766wb.C9778l) {
            this.e.b(((AbstractC9766wb.C9778l) abstractC9766wb).d());
        } else if (abstractC9766wb instanceof AbstractC9766wb.O) {
        } else {
            if (abstractC9766wb instanceof AbstractC9766wb.C9771e) {
                this.e.i();
                AbstractC9766wb.C9771e c9771e = (AbstractC9766wb.C9771e) abstractC9766wb;
                this.e.b(c9771e.b().j(), c9771e.b().g(), c9771e.b().c(), c9771e.b().d());
            } else if (abstractC9766wb instanceof AbstractC9766wb.X) {
                this.e.d(false);
            } else if (abstractC9766wb instanceof AbstractC9766wb.R) {
                this.e.d(true);
            } else if (abstractC9766wb instanceof AbstractC9766wb.M) {
                AbstractC9766wb.M m = (AbstractC9766wb.M) abstractC9766wb;
                this.e.a(m.c(), m.b());
            }
        }
    }
}
