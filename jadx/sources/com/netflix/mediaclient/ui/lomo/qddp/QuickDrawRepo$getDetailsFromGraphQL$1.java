package com.netflix.mediaclient.ui.lomo.qddp;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.lomo.qddp.QuickDrawRepo$getDetailsFromGraphQL$1;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.C1596aHd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4004bSr;
import o.InterfaceC5241buz;
import o.dpD;
import o.dqD;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public final class QuickDrawRepo$getDetailsFromGraphQL$1 extends Lambda implements drM<InterfaceC4004bSr, SingleSource<? extends InterfaceC5241buz>> {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickDrawRepo$getDetailsFromGraphQL$1(String str) {
        super(1);
        this.a = str;
    }

    @Override // o.drM
    /* renamed from: a */
    public final SingleSource<? extends InterfaceC5241buz> invoke(final InterfaceC4004bSr interfaceC4004bSr) {
        C8632dsu.c((Object) interfaceC4004bSr, "");
        Single<InterfaceC5241buz> b = interfaceC4004bSr.b(this.a, true);
        final String str = this.a;
        final drM<Throwable, SingleSource<? extends InterfaceC5241buz>> drm = new drM<Throwable, SingleSource<? extends InterfaceC5241buz>>() { // from class: com.netflix.mediaclient.ui.lomo.qddp.QuickDrawRepo$getDetailsFromGraphQL$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final SingleSource<? extends InterfaceC5241buz> invoke(Throwable th) {
                Map b2;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                ErrorType errorType = ErrorType.l;
                b2 = dqD.b(dpD.a(SignupConstants.Field.VIDEO_ID, str));
                k = dqE.k(b2);
                C1596aHd c1596aHd = new C1596aHd("Fetching DP Lite video details from cache failed", th, errorType, false, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd.a;
                if (errorType2 != null) {
                    c1596aHd.e.put("errorType", errorType2.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c = errorType2.c();
                        c1596aHd.a(c + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
                return interfaceC4004bSr.b(str, false);
            }
        };
        return b.onErrorResumeNext(new Function() { // from class: o.ceH
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource c;
                c = QuickDrawRepo$getDetailsFromGraphQL$1.c(drM.this, obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (SingleSource) drm.invoke(obj);
    }
}
