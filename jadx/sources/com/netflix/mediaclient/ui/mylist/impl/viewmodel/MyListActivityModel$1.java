package com.netflix.mediaclient.ui.mylist.impl.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C7010coB;
import o.C7056cox;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* loaded from: classes6.dex */
public final class MyListActivityModel$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ C7010coB d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListActivityModel$1(C7010coB c7010coB, InterfaceC8585dra<? super MyListActivityModel$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = c7010coB;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new MyListActivityModel$1(this.d, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((MyListActivityModel$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            C7010coB c7010coB = this.d;
            this.e = 1;
            obj = c7010coB.e(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        final boolean booleanValue = ((Boolean) obj).booleanValue();
        this.d.b(new drM<C7056cox, C7056cox>() { // from class: com.netflix.mediaclient.ui.mylist.impl.viewmodel.MyListActivityModel$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C7056cox invoke(C7056cox c7056cox) {
                C8632dsu.c((Object) c7056cox, "");
                return C7056cox.copy$default(c7056cox, false, null, booleanValue, null, null, 27, null);
            }
        });
        return dpR.c;
    }
}
