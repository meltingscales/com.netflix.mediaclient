package o;

import io.reactivex.Observable;
import java.nio.ByteBuffer;
import o.cBA;

/* renamed from: o.cEq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5687cEq extends cEF {
    public static final c b = new c(null);
    private final cFW a;
    private boolean c;
    private final C8174dfR d;
    private boolean e;
    private long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5687cEq(cFW cfw, Observable<cBA> observable) {
        super(cfw, observable, null, 4, null);
        C8632dsu.c((Object) cfw, "");
        C8632dsu.c((Object) observable, "");
        this.a = cfw;
        this.d = new C8174dfR();
        this.g = -1L;
    }

    /* renamed from: o.cEq$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.ai) {
            this.a.b(((cBA.ai) cba).j());
            this.a.c();
        } else if (cba instanceof cBA.an) {
            cBA.an anVar = (cBA.an) cba;
            c(anVar.e(), anVar.b(), false, anVar.d());
            this.a.f();
            this.e = false;
            this.g = anVar.b();
        } else if (cba instanceof cBA.aq) {
            cBA.aq aqVar = (cBA.aq) cba;
            c(aqVar.a(), aqVar.d(), aqVar.c(), aqVar.b());
            this.e = aqVar.c();
            this.g = aqVar.d();
        } else if ((cba instanceof cBA.ap) || C8632dsu.c(cba, cBA.C5558t.d)) {
            this.a.c();
            this.e = false;
            this.g = -1L;
        } else if (cba instanceof cBA.C5549k) {
            this.c = ((cBA.C5549k) cba).a();
        }
    }

    private final void c(int i, int i2, boolean z, ByteBuffer byteBuffer) {
        C1044Mm.e("PlayerSeekbarBifPresenter", "updateInformation, currentProgress is " + i + " xPositionFromProgress is " + i2);
        cFW cfw = this.a;
        String b2 = this.d.b(i);
        C8632dsu.a(b2, "");
        cfw.b(b2, i2);
        if (a() && byteBuffer != null) {
            this.a.a(byteBuffer, i2);
            if (this.a.j()) {
                return;
            }
            this.a.h();
            return;
        }
        this.a.g();
    }

    private final boolean a() {
        if (C8171dfO.b()) {
            return this.c;
        }
        return true;
    }
}
