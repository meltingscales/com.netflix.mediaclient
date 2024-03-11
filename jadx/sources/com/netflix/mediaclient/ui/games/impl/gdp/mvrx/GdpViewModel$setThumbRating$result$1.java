package com.netflix.mediaclient.ui.games.impl.gdp.mvrx;

import com.netflix.cl.ExtLogger;
import com.netflix.cl.Logger;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3952bQt;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.bNF;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class GdpViewModel$setThumbRating$result$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ TrackingInfo c;
    Object d;
    final /* synthetic */ int e;
    final /* synthetic */ C3952bQt f;
    int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GdpViewModel$setThumbRating$result$1(C3952bQt c3952bQt, int i, TrackingInfo trackingInfo, String str, int i2, InterfaceC8585dra<? super GdpViewModel$setThumbRating$result$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.f = c3952bQt;
        this.a = i;
        this.c = trackingInfo;
        this.b = str;
        this.e = i2;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((GdpViewModel$setThumbRating$result$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new GdpViewModel$setThumbRating$result$1(this.f, this.a, this.c, this.b, this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Long d;
        bNF bnf;
        Long l;
        Object obj2;
        e = C8586drb.e();
        int i = this.h;
        if (i == 0) {
            C8556dpz.d(obj);
            d = this.f.d(this.a, this.c);
            bnf = this.f.e;
            String str = this.b;
            ThumbRating b = ThumbRating.d.b(this.a);
            int i2 = this.e;
            this.d = d;
            this.h = 1;
            Object b2 = bnf.b(str, b, i2, this);
            if (b2 == e) {
                return e;
            }
            l = d;
            obj2 = b2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            l = (Long) this.d;
            C8556dpz.d(obj);
            obj2 = ((Result) obj).c();
        }
        if (Result.h(obj2)) {
            Logger.INSTANCE.endSession(l);
        } else {
            ExtLogger extLogger = ExtLogger.INSTANCE;
            Throwable d2 = Result.d(obj2);
            extLogger.failedAction(l, d2 != null ? d2.getMessage() : null);
            this.f.b(new drM<C3952bQt.c, C3952bQt.c>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$setThumbRating$result$1.1
                @Override // o.drM
                /* renamed from: e */
                public final C3952bQt.c invoke(C3952bQt.c cVar) {
                    C8632dsu.c((Object) cVar, "");
                    return C3952bQt.c.copy$default(cVar, null, null, true, 3, null);
                }
            });
        }
        return dpR.c;
    }
}
