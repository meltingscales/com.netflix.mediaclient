package com.netflix.mediaclient.ui.featureeducationvideoexperience.impl;

import androidx.compose.runtime.MutableState;
import io.reactivex.Single;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC5100bsQ;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.bMU;
import o.dAU;
import o.dpR;
import o.drX;
import o.dwU;

/* loaded from: classes4.dex */
public final class FeatureEducationVideoKt$FeatureEducationVideo$1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    Object a;
    final /* synthetic */ Single<AbstractC5100bsQ> b;
    int c;
    final /* synthetic */ MutableState<AbstractC5100bsQ> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureEducationVideoKt$FeatureEducationVideo$1(Single<AbstractC5100bsQ> single, MutableState<AbstractC5100bsQ> mutableState, InterfaceC8585dra<? super FeatureEducationVideoKt$FeatureEducationVideo$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = single;
        this.d = mutableState;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((FeatureEducationVideoKt$FeatureEducationVideo$1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new FeatureEducationVideoKt$FeatureEducationVideo$1(this.b, this.d, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        MutableState<AbstractC5100bsQ> mutableState;
        e = C8586drb.e();
        int i = this.c;
        if (i == 0) {
            C8556dpz.d(obj);
            MutableState<AbstractC5100bsQ> mutableState2 = this.d;
            Single<AbstractC5100bsQ> single = this.b;
            this.a = mutableState2;
            this.c = 1;
            Object d = dAU.d(single, this);
            if (d == e) {
                return e;
            }
            mutableState = mutableState2;
            obj = d;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mutableState = (MutableState) this.a;
            C8556dpz.d(obj);
        }
        bMU.e(mutableState, (AbstractC5100bsQ) obj);
        return dpR.c;
    }
}
