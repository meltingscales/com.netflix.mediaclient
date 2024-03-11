package com.netflix.mediaclient.commanderinfra.impl;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C1301Wk;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8812dzl;
import o.VF;
import o.VQ;
import o.dpR;
import o.drX;
import o.dwU;
import o.dyQ;

/* loaded from: classes3.dex */
public final class CommanderUiInfraImpl$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int b;
    final /* synthetic */ C1301Wk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommanderUiInfraImpl$1(C1301Wk c1301Wk, InterfaceC8585dra<? super CommanderUiInfraImpl$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = c1301Wk;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CommanderUiInfraImpl$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CommanderUiInfraImpl$1(this.e, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        InterfaceC8812dzl interfaceC8812dzl;
        e = C8586drb.e();
        int i = this.b;
        if (i == 0) {
            C8556dpz.d(obj);
            interfaceC8812dzl = this.e.c;
            final C1301Wk c1301Wk = this.e;
            dyQ dyq = new dyQ() { // from class: com.netflix.mediaclient.commanderinfra.impl.CommanderUiInfraImpl$1.2
                @Override // o.dyQ
                public /* synthetic */ Object emit(Object obj2, InterfaceC8585dra interfaceC8585dra) {
                    return c(((Boolean) obj2).booleanValue(), interfaceC8585dra);
                }

                public final Object c(boolean z, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
                    VF vf;
                    C1301Wk.d.getLogTag();
                    vf = C1301Wk.this.j;
                    for (VQ vq : vf.a()) {
                        vq.d(z);
                    }
                    return dpR.c;
                }
            };
            this.b = 1;
            if (interfaceC8812dzl.collect(dyq, this) == e) {
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
