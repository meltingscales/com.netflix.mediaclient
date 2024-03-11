package com.netflix.mediaclient.ui.commander.impl.ui.modes.playback;

import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bCW;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class CondensedPlaybackKt$CondensedProgressIndicator$1$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    int a;
    final /* synthetic */ MutableState<Float> b;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CondensedPlaybackKt$CondensedProgressIndicator$1$1(float f, MutableState<Float> mutableState, InterfaceC8585dra<? super CondensedPlaybackKt$CondensedProgressIndicator$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = f;
        this.b = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new CondensedPlaybackKt$CondensedProgressIndicator$1$1(this.d, this.b, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((CondensedPlaybackKt$CondensedProgressIndicator$1$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8586drb.e();
        if (this.a == 0) {
            C8556dpz.d(obj);
            bCW.d(this.b, this.d);
            return dpR.c;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
