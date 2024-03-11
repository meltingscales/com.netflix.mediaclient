package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5808cJc;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlayerTappableContainerKt$PlayerTappableContainer$8 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<dpR> a;
    final /* synthetic */ MutableState<Float> b;
    int c;
    final /* synthetic */ TransformableState d;
    final /* synthetic */ drO<dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerTappableContainerKt$PlayerTappableContainer$8(TransformableState transformableState, drO<dpR> dro, drO<dpR> dro2, MutableState<Float> mutableState, InterfaceC8585dra<? super PlayerTappableContainerKt$PlayerTappableContainer$8> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = transformableState;
        this.e = dro;
        this.a = dro2;
        this.b = mutableState;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerTappableContainerKt$PlayerTappableContainer$8) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlayerTappableContainerKt$PlayerTappableContainer$8(this.d, this.e, this.a, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float b;
        float b2;
        C8586drb.e();
        if (this.c == 0) {
            C8556dpz.d(obj);
            if (!this.d.isTransformInProgress()) {
                b = C5808cJc.b((MutableState<Float>) this.b);
                if (b >= 1.0f) {
                    b2 = C5808cJc.b((MutableState<Float>) this.b);
                    if (b2 > 1.0f) {
                        this.a.invoke();
                    }
                } else {
                    this.e.invoke();
                }
                C5808cJc.b(this.b, 1.0f);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
