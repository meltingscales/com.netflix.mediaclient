package com.netflix.android.widgetry.utils.coroutines;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwU;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
final class ControlledRunner$cancelPreviousThenRun$2$newTask$1<T> extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super T>, Object> {
    int c;
    final /* synthetic */ drM<InterfaceC8585dra<? super T>, Object> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ControlledRunner$cancelPreviousThenRun$2$newTask$1(drM<? super InterfaceC8585dra<? super T>, ? extends Object> drm, InterfaceC8585dra<? super ControlledRunner$cancelPreviousThenRun$2$newTask$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.e = drm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new ControlledRunner$cancelPreviousThenRun$2$newTask$1(this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super T> interfaceC8585dra) {
        return ((ControlledRunner$cancelPreviousThenRun$2$newTask$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            drM<InterfaceC8585dra<? super T>, Object> drm = this.e;
            this.c = 1;
            obj = drm.invoke(this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
