package com.netflix.mediaclient.ui.repository;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.MoneyballData;
import com.netflix.mediaclient.ui.repository.MoneyballRepository$runMoneyballRequest$1$1;
import io.reactivex.SingleEmitter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.C1596aHd;
import o.C8128deY;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.aMU;
import o.aMX;
import o.dpR;
import o.dqE;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class MoneyballRepository$runMoneyballRequest$1$1 extends Lambda implements drM<aMU, dpR> {
    final /* synthetic */ drX<aMU, aMX, dpR> a;
    final /* synthetic */ boolean d;
    final /* synthetic */ SingleEmitter<MoneyballData> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MoneyballRepository$runMoneyballRequest$1$1(drX<? super aMU, ? super aMX, dpR> drx, SingleEmitter<MoneyballData> singleEmitter, boolean z) {
        super(1);
        this.a = drx;
        this.e = singleEmitter;
        this.d = z;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(aMU amu) {
        d(amu);
        return dpR.c;
    }

    public final void d(aMU amu) {
        drX<aMU, aMX, dpR> drx = this.a;
        C8632dsu.d(amu);
        final SingleEmitter<MoneyballData> singleEmitter = this.e;
        final boolean z = this.d;
        drx.invoke(amu, new aMX() { // from class: o.cQR
            @Override // o.aMX
            public final void onDataFetched(MoneyballData moneyballData, Status status, int i) {
                MoneyballRepository$runMoneyballRequest$1$1.c(SingleEmitter.this, z, moneyballData, status, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SingleEmitter singleEmitter, boolean z, MoneyballData moneyballData, Status status, int i) {
        Map k;
        Throwable th;
        C8632dsu.c((Object) singleEmitter, "");
        if (status.j() && moneyballData != null) {
            singleEmitter.onSuccess(moneyballData);
            return;
        }
        if (z && !status.g()) {
            String obj = status.toString();
            String a = C8128deY.a(status);
            if (a != null) {
                obj = ((Object) obj) + " (code: " + a + ")";
            }
            String d = C8128deY.d(status);
            if (d != null) {
                obj = ((Object) obj) + " (message: " + d + ")";
            }
            if (status.e() != null) {
                obj = ((Object) obj) + " caused by: " + status.e();
            }
            String str = obj;
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            Throwable e = status.e();
            if (e == null) {
                e = new Exception(status.b());
            }
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd(str, e, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c = dVar2.c();
            if (c != null) {
                c.d(c1596aHd, th);
            } else {
                dVar2.e().b(c1596aHd, th);
            }
        }
        Throwable e2 = status.e();
        if (e2 == null) {
            e2 = new Throwable("Unknown Moneyball Error");
        }
        singleEmitter.onError(e2);
    }
}
