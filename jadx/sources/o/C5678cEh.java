package o;

import android.annotation.SuppressLint;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.SubscribersKt;
import o.C5678cEh;
import o.C8632dsu;
import o.InterfaceC5706cFi;
import o.cBA;
import o.cET;
import o.cEX;
import o.cGB;
import o.dpR;

@SuppressLint({"CheckResult"})
/* renamed from: o.cEh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5678cEh extends cDE implements InterfaceC5706cFi, cET, cEX {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final cGB j;

    @Override // o.cET
    public void a(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.e;
    }

    @Override // o.cEX
    public void b(boolean z) {
        this.d = z;
    }

    public boolean b() {
        return this.d;
    }

    public final void c(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.a;
    }

    @Override // o.InterfaceC5706cFi
    public void d(boolean z) {
        this.c = z;
    }

    public final void e(boolean z) {
        this.b = z;
    }

    @Override // o.InterfaceC5706cFi
    public void a(Observable<cBA> observable) {
        InterfaceC5706cFi.a.b(this, observable);
    }

    @Override // o.cET
    public void a_(Observable<cBA> observable) {
        cET.c.e(this, observable);
    }

    @Override // o.cEX
    public void d(Observable<cBA> observable) {
        cEX.b.b(this, observable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5678cEh(cGB cgb, Observable<cBA> observable, Observable<dpR> observable2) {
        super(observable, new InterfaceC5730cGf[]{cgb}, null, 4, null);
        C8632dsu.c((Object) cgb, "");
        C8632dsu.c((Object) observable, "");
        C8632dsu.c((Object) observable2, "");
        this.j = cgb;
        Observable<cBA> takeUntil = observable.takeUntil(observable2);
        C8632dsu.a(takeUntil, "");
        SubscribersKt.subscribeBy$default(takeUntil, (drM) null, (drO) null, new drM<cBA, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.presenter.PlayerLockPresenter$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(cBA cba) {
                e(cba);
                return dpR.c;
            }

            public final void e(cBA cba) {
                cGB cgb2;
                cGB cgb3;
                cGB cgb4;
                cGB cgb5;
                cGB cgb6;
                cGB cgb7;
                cGB cgb8;
                cGB cgb9;
                cGB cgb10;
                cGB cgb11;
                cGB cgb12;
                cGB cgb13;
                if (cba instanceof cBA.an) {
                    if (C5678cEh.this.a()) {
                        return;
                    }
                    cgb13 = C5678cEh.this.j;
                    cgb13.c();
                } else if (C8632dsu.c(cba, cBA.C5558t.d) || (cba instanceof cBA.C5556r)) {
                    if (C5678cEh.this.a()) {
                        return;
                    }
                    cgb2 = C5678cEh.this.j;
                    cgb2.c();
                } else if (cba instanceof cBA.X) {
                } else {
                    if (C8632dsu.c(cba, cBA.M.e) || C8632dsu.c(cba, cBA.K.a) || C8632dsu.c(cba, cBA.E.e)) {
                        cgb3 = C5678cEh.this.j;
                        cgb3.c();
                    } else if (C8632dsu.c(cba, cBA.C5548j.d)) {
                        if (C5678cEh.this.c() || C5678cEh.this.b() || !C5678cEh.this.a()) {
                            cgb11 = C5678cEh.this.j;
                            cgb11.c();
                            return;
                        }
                        cgb12 = C5678cEh.this.j;
                        cgb12.a();
                    } else if (cba instanceof cBA.C5545g) {
                        if (C5678cEh.this.c()) {
                            return;
                        }
                        cgb9 = C5678cEh.this.j;
                        if (cgb9.w() || !C5678cEh.this.a()) {
                            return;
                        }
                        cgb10 = C5678cEh.this.j;
                        cgb10.a();
                        C5678cEh.this.e(true);
                    } else if (C8632dsu.c(cba, cBA.C5541c.c)) {
                        cgb8 = C5678cEh.this.j;
                        cgb8.c();
                    } else if (cba instanceof cBA.ag) {
                        if (((cBA.ag) cba).c()) {
                            C5678cEh.this.c(true);
                            cgb6 = C5678cEh.this.j;
                            cgb6.d();
                            cgb7 = C5678cEh.this.j;
                            cgb7.a();
                            return;
                        }
                        C5678cEh.this.c(false);
                        cgb4 = C5678cEh.this.j;
                        cgb4.b();
                        cgb5 = C5678cEh.this.j;
                        cgb5.c();
                    }
                }
            }
        }, 3, (Object) null);
    }
}
