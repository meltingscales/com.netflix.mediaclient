package o;

import io.reactivex.Observable;
import o.AbstractC9766wb;

/* renamed from: o.wO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9753wO extends AbstractC9709vX {
    public static final b a = new b(null);
    private final InterfaceC9755wQ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9753wO(InterfaceC9755wQ interfaceC9755wQ, Observable<AbstractC9766wb> observable) {
        super(interfaceC9755wQ, observable);
        C8632dsu.c((Object) interfaceC9755wQ, "");
        C8632dsu.c((Object) observable, "");
        this.e = interfaceC9755wQ;
    }

    /* renamed from: o.wO$b */
    /* loaded from: classes2.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MdxSkipIntroUIPresenter");
        }
    }

    @Override // o.AbstractC9940zU
    public void onEvent(AbstractC9766wb abstractC9766wb) {
        C8632dsu.c((Object) abstractC9766wb, "");
        if (abstractC9766wb instanceof AbstractC9766wb.C9786u) {
            this.e.b();
        } else if ((abstractC9766wb instanceof AbstractC9766wb.A) || (abstractC9766wb instanceof AbstractC9766wb.C9787v)) {
            this.e.d();
        } else if (abstractC9766wb instanceof AbstractC9766wb.J) {
            AbstractC9766wb.J j = (AbstractC9766wb.J) abstractC9766wb;
            this.e.c(j.d(), j.c());
        } else if (abstractC9766wb instanceof AbstractC9766wb.L) {
            this.e.g();
        }
    }
}
