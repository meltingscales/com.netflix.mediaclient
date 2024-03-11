package com.netflix.mediaclient.commanderinfra.impl;

import android.graphics.drawable.Drawable;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1302Wl;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.InterfaceC8822dzv;
import o.VM;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;

/* loaded from: classes3.dex */
public final class BifInfraImpl$startListeningForBifFrames$2 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ InterfaceC8822dzv<Drawable> b;
    final /* synthetic */ C1302Wl c;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BifInfraImpl$startListeningForBifFrames$2(InterfaceC8822dzv<? extends Drawable> interfaceC8822dzv, C1302Wl c1302Wl, InterfaceC8585dra<? super BifInfraImpl$startListeningForBifFrames$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = interfaceC8822dzv;
        this.c = c1302Wl;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((BifInfraImpl$startListeningForBifFrames$2) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new BifInfraImpl$startListeningForBifFrames$2(this.b, this.c, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            InterfaceC8822dzv<Drawable> interfaceC8822dzv = this.b;
            final C1302Wl c1302Wl = this.c;
            dyQ<? super Drawable> dyq = new dyQ() { // from class: com.netflix.mediaclient.commanderinfra.impl.BifInfraImpl$startListeningForBifFrames$2.2
                @Override // o.dyQ
                /* renamed from: c */
                public final Object emit(Drawable drawable, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    InterfaceC8812dzl interfaceC8812dzl;
                    C1302Wl.c.getLogTag();
                    if (drawable != null) {
                        interfaceC8812dzl = C1302Wl.this.e;
                        interfaceC8812dzl.d(new VM(drawable));
                    }
                    return dpR.c;
                }
            };
            this.e = 1;
            if (interfaceC8822dzv.collect(dyq, this) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        throw new KotlinNothingValueException();
    }
}
