package com.netflix.mediaclient.ui.commander.impl.ui.components;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3567bCq;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class PlaybackSliderKt$PlaybackSlider$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<Boolean> a;
    int b;
    final /* synthetic */ float c;
    final /* synthetic */ MutableFloatState e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackSliderKt$PlaybackSlider$1$1(float f, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, InterfaceC8585dra<? super PlaybackSliderKt$PlaybackSlider$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = f;
        this.a = mutableState;
        this.e = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new PlaybackSliderKt$PlaybackSlider$1$1(this.c, this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlaybackSliderKt$PlaybackSlider$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean d;
        C8586drb.e();
        if (this.b == 0) {
            C8556dpz.d(obj);
            d = C3567bCq.d(this.a);
            if (!d) {
                C3567bCq.a(this.e, this.c);
            }
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
