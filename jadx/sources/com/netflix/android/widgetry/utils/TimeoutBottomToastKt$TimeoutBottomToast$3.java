package com.netflix.android.widgetry.utils;

import android.content.Context;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.State;
import com.netflix.mediaclient.util.AccessibilityUtils;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.C8749dxc;
import o.C9869yC;
import o.InterfaceC8585dra;
import o.dpR;
import o.drO;
import o.drX;
import o.dwU;

/* loaded from: classes2.dex */
public final class TimeoutBottomToastKt$TimeoutBottomToast$3 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ State<Context> a;
    final /* synthetic */ State<drO<dpR>> b;
    final /* synthetic */ MutableTransitionState<Boolean> c;
    final /* synthetic */ String d;
    final /* synthetic */ State<Integer> e;
    final /* synthetic */ String h;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimeoutBottomToastKt$TimeoutBottomToast$3(String str, String str2, MutableTransitionState<Boolean> mutableTransitionState, State<? extends Context> state, State<Integer> state2, State<? extends drO<dpR>> state3, InterfaceC8585dra<? super TimeoutBottomToastKt$TimeoutBottomToast$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = str;
        this.h = str2;
        this.c = mutableTransitionState;
        this.a = state;
        this.e = state2;
        this.b = state3;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(dwU dwu, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((TimeoutBottomToastKt$TimeoutBottomToast$3) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        return new TimeoutBottomToastKt$TimeoutBottomToast$3(this.d, this.h, this.c, this.a, this.e, this.b, interfaceC8585dra);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        Context i;
        Context i2;
        int e2;
        Context i3;
        drO b;
        e = C8586drb.e();
        int i4 = this.j;
        if (i4 == 0) {
            C8556dpz.d(obj);
            String str = this.d;
            if (str != null) {
                i3 = C9869yC.i(this.a);
                AccessibilityUtils.b(i3, str);
            }
            i = C9869yC.i(this.a);
            AccessibilityUtils.b(i, this.h);
            String str2 = this.h;
            i2 = C9869yC.i(this.a);
            AccessibilityUtils.b(i2, str2);
            e2 = C9869yC.e(this.e);
            this.j = 1;
            if (C8749dxc.b(e2, this) == e) {
                return e;
            }
        } else if (i4 != 1) {
            if (i4 == 2) {
                C8556dpz.d(obj);
                b = C9869yC.b(this.b);
                b.invoke();
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        this.c.setTargetState(C8589dre.e(false));
        MutableTransitionState<Boolean> mutableTransitionState = this.c;
        this.j = 2;
        if (C9869yC.b(mutableTransitionState, 0L, 0L, this, 3, null) == e) {
            return e;
        }
        b = C9869yC.b(this.b);
        b.invoke();
        return dpR.c;
    }
}
