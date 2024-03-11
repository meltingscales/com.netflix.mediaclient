package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C5808cJc;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class PlayerTappableContainerKt$PlayerTappableContainer$10$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<dpR> a;
    final /* synthetic */ int b;
    final /* synthetic */ MutableState<Float> c;
    final /* synthetic */ State<drO<dpR>> d;
    final /* synthetic */ State<drO<dpR>> e;
    private /* synthetic */ Object h;
    int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerTappableContainerKt$PlayerTappableContainer$10$1(int i, MutableState<Float> mutableState, State<? extends drO<dpR>> state, State<? extends drO<dpR>> state2, drO<dpR> dro, InterfaceC8585dra<? super PlayerTappableContainerKt$PlayerTappableContainer$10$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = i;
        this.c = mutableState;
        this.e = state;
        this.d = state2;
        this.a = dro;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayerTappableContainerKt$PlayerTappableContainer$10$1 playerTappableContainerKt$PlayerTappableContainer$10$1 = new PlayerTappableContainerKt$PlayerTappableContainer$10$1(this.b, this.c, this.e, this.d, this.a, interfaceC8585dra);
        playerTappableContainerKt$PlayerTappableContainer$10$1.h = obj;
        return playerTappableContainerKt$PlayerTappableContainer$10$1;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerTappableContainerKt$PlayerTappableContainer$10$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.i;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.h;
            final int i2 = this.b;
            final MutableState<Float> mutableState = this.c;
            final State<drO<dpR>> state = this.e;
            final State<drO<dpR>> state2 = this.d;
            drM<Offset, dpR> drm = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTappableContainerKt$PlayerTappableContainer$10$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    b(offset.m1146unboximpl());
                    return dpR.c;
                }

                public final void b(long j) {
                    float a;
                    float a2;
                    drO b;
                    drO c;
                    float m1137getXimpl = Offset.m1137getXimpl(j);
                    a = C5808cJc.a(mutableState);
                    float f = 2;
                    if (m1137getXimpl < (a / f) - i2) {
                        c = C5808cJc.c(state);
                        c.invoke();
                        return;
                    }
                    float m1137getXimpl2 = Offset.m1137getXimpl(j);
                    a2 = C5808cJc.a(mutableState);
                    if (m1137getXimpl2 > (a2 / f) + i2) {
                        b = C5808cJc.b(state2);
                        b.invoke();
                    }
                }
            };
            final drO<dpR> dro = this.a;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerTappableContainerKt$PlayerTappableContainer$10$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    c(offset.m1146unboximpl());
                    return dpR.c;
                }

                public final void c(long j) {
                    dro.invoke();
                }
            };
            this.i = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, drm, null, null, drm2, this, 6, null) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }
}
