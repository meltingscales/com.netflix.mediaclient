package com.netflix.hawkins.consumer.component.button;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8749dxc;
import o.InterfaceC8585dra;
import o.KA;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes3.dex */
public final class HawkinsButtonCountdownKt$StartCountdown$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<Boolean> a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Animatable<Float, AnimationVector1D> c;
    final /* synthetic */ long d;
    final /* synthetic */ MutableState<Boolean> e;
    final /* synthetic */ drO<dpR> h;
    final /* synthetic */ drO<dpR> i;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HawkinsButtonCountdownKt$StartCountdown$3(drO<dpR> dro, boolean z, Animatable<Float, AnimationVector1D> animatable, long j, drO<dpR> dro2, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, InterfaceC8585dra<? super HawkinsButtonCountdownKt$StartCountdown$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.h = dro;
        this.b = z;
        this.c = animatable;
        this.d = j;
        this.i = dro2;
        this.a = mutableState;
        this.e = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new HawkinsButtonCountdownKt$StartCountdown$3(this.h, this.b, this.c, this.d, this.i, this.a, this.e, interfaceC8585dra);
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((HawkinsButtonCountdownKt$StartCountdown$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        boolean b;
        e = C8586drb.e();
        int i = this.j;
        if (i == 0) {
            C8556dpz.d(obj);
            b = KA.b((MutableState<Boolean>) this.a);
            if (!b) {
                this.h.invoke();
                if (this.b) {
                    Animatable<Float, AnimationVector1D> animatable = this.c;
                    Float e2 = C8589dre.e(100.0f);
                    TweenSpec tween$default = AnimationSpecKt.tween$default((int) this.d, 0, EasingKt.getLinearEasing(), 2, null);
                    this.j = 1;
                    if (Animatable.animateTo$default(animatable, e2, tween$default, null, null, this, 12, null) == e) {
                        return e;
                    }
                } else {
                    long j = this.d;
                    this.j = 2;
                    if (C8749dxc.b(j, this) == e) {
                        return e;
                    }
                }
            }
            return dpR.c;
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        KA.b(this.e, true);
        this.i.invoke();
        return dpR.c;
    }
}
