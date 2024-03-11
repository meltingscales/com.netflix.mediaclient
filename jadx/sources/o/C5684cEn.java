package o;

import com.netflix.mediaclient.ui.player.v2.interactive.Interactivity;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import o.C5684cEn;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cBO;
import o.cEW;
import o.cFV;
import o.dpR;

/* renamed from: o.cEn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5684cEn extends cEF implements cEW, InterfaceC5706cFi {
    public static final a b = new a(null);
    private boolean a;
    private int c;
    private int d;
    private Interactivity e;
    private int f;
    private final C8174dfR g;
    private boolean h;
    private final cFV i;
    private boolean j;

    public final int a() {
        return this.c;
    }

    @Override // o.cEW
    public void a(Interactivity interactivity) {
        this.e = interactivity;
    }

    public Interactivity c() {
        return this.e;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.a = z;
    }

    public final void e(int i) {
        this.c = i;
    }

    public final void e(boolean z) {
        this.h = z;
    }

    public boolean i() {
        return this.a;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cEW
    public void e(Observable<cBA> observable) {
        cEW.d.a(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5684cEn(cFV cfv, Observable<cBA> observable, Observable<dpR> observable2) {
        super(cfv, observable, null, 4, null);
        C8632dsu.c((Object) cfv, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.i = cfv;
        this.g = new C8174dfR();
        Observable<cBO> takeUntil = cfv.v().takeUntil(observable2);
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<cBO, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerSeekbarPresenter$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBO cbo) {
                d(cbo);
                return dpR.c;
            }

            public final void d(cBO cbo) {
                cFV cfv2;
                cFV cfv3;
                cFV cfv4;
                cFV cfv5;
                cFV cfv6;
                cFV cfv7;
                if (cbo instanceof cBO.C5577m) {
                    C5684cEn.this.e(true);
                    cfv5 = C5684cEn.this.i;
                    cfv5.f();
                    cfv6 = C5684cEn.this.i;
                    cfv6.d(C5684cEn.this.a());
                    cfv7 = C5684cEn.this.i;
                    cfv7.i();
                } else if (cbo instanceof cBO.C5579o) {
                    C5684cEn.this.e(((cBO.C5579o) cbo).d());
                    cfv4 = C5684cEn.this.i;
                    cfv4.d(C5684cEn.this.a());
                } else if (cbo instanceof cBO.C5582r) {
                    C5684cEn.this.e(false);
                    cfv2 = C5684cEn.this.i;
                    cfv2.g();
                    cfv3 = C5684cEn.this.i;
                    cfv3.j();
                }
            }
        }, 3, (Object) null);
    }

    /* renamed from: o.cEn$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerSeekbarPresenter");
        }
    }

    @Override // o.cEF, o.cDE, o.AbstractC9940zU
    public void onEvent(cBA cba) {
        List<Long> i;
        C8632dsu.c((Object) cba, "");
        super.onEvent(cba);
        if (cba instanceof cBA.C5542d) {
            if (((cBA.C5542d) cba).c() == Interactivity.e) {
                this.i.c();
                return;
            }
            return;
        }
        boolean z = false;
        if (cba instanceof cBA.ai) {
            if (c() != Interactivity.e) {
                this.i.d();
                cBA.ai aiVar = (cBA.ai) cba;
                this.c = aiVar.c();
                int a2 = aiVar.a();
                this.f = a2;
                this.i.e(a2);
                if (!aiVar.i() && f()) {
                    z = true;
                }
                d(this.c, this.f, z);
            }
        } else if (C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
            if (c() == Interactivity.e) {
                this.i.c();
            } else if (this.h) {
            } else {
                this.i.b();
            }
        } else if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
            if (this.j) {
                return;
            }
            this.i.c();
        } else if (cba instanceof cBA.X) {
            this.c = ((cBA.X) cba).b();
            if (this.i.w()) {
                c(this.c, this.f);
            }
        } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
            d(this.c, this.f, false);
        } else if (cba instanceof cBA.C5552n) {
            int max = Math.max(((cBA.C5552n) cba).d(), 0);
            this.d = max;
            this.i.a(max);
        } else if (cba instanceof cBA.C5562x) {
            this.i.a(((cBA.C5562x) cba).b());
        } else if (cba instanceof cBA.aj) {
            cFV cfv = this.i;
            i = C8569dql.i();
            cfv.a(i);
        } else if (cba instanceof cBA.C5563y) {
            this.i.e(((cBA.C5563y) cba).a());
        } else if (cba instanceof cBA.az) {
            this.j = ((cBA.az) cba).c();
        }
    }

    public boolean f() {
        return (i() || n() || c() == Interactivity.e) ? false : true;
    }

    public void d(int i, int i2, boolean z) {
        c(i, i2);
        if (z) {
            bK_();
        }
    }

    @Override // o.cEF
    public void bK_() {
        if (f()) {
            super.bK_();
        }
    }

    protected final void c(int i, int i2) {
        this.i.b(i);
        cFV cfv = this.i;
        String b2 = this.g.b(i2 - i);
        C8632dsu.a(b2, "");
        cfv.b(b2);
    }
}
