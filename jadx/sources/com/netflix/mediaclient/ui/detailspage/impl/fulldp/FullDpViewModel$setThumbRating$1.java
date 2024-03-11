package com.netflix.mediaclient.ui.detailspage.impl.fulldp;

import com.netflix.mediaclient.servicemgr.interface_.details.ThumbRating;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3726bIj;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC3663bGe;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class FullDpViewModel$setThumbRating$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ C3726bIj c;
    int d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullDpViewModel$setThumbRating$1(C3726bIj c3726bIj, String str, int i, int i2, InterfaceC8585dra<? super FullDpViewModel$setThumbRating$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = c3726bIj;
        this.e = str;
        this.a = i;
        this.b = i2;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FullDpViewModel$setThumbRating$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FullDpViewModel$setThumbRating$1(this.c, this.e, this.a, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC3663bGe interfaceC3663bGe;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC3663bGe = this.c.d;
            String str = this.e;
            ThumbRating b = ThumbRating.d.b(this.a);
            int i2 = this.b;
            this.d = 1;
            if (interfaceC3663bGe.a(str, b, i2, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
            ((Result) obj).c();
        }
        return dpR.c;
    }
}
