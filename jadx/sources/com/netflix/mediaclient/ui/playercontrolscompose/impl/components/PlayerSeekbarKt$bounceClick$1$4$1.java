package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PlayerSeekbarKt$bounceClick$1$4$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ MutableState<ViewState> a;
    int d;
    private /* synthetic */ Object e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarKt$bounceClick$1$4$1(MutableState<ViewState> mutableState, InterfaceC8585dra<? super PlayerSeekbarKt$bounceClick$1$4$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.a = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        PlayerSeekbarKt$bounceClick$1$4$1 playerSeekbarKt$bounceClick$1$4$1 = new PlayerSeekbarKt$bounceClick$1$4$1(this.a, interfaceC8585dra);
        playerSeekbarKt$bounceClick$1$4$1.e = obj;
        return playerSeekbarKt$bounceClick$1$4$1;
    }

    @Override // o.drX
    /* renamed from: e */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((PlayerSeekbarKt$bounceClick$1$4$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.playercontrolscompose.impl.components.PlayerSeekbarKt$bounceClick$1$4$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements drX<AwaitPointerEventScope, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        private /* synthetic */ Object c;
        final /* synthetic */ MutableState<ViewState> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<ViewState> mutableState, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, interfaceC8585dra);
            anonymousClass1.c = obj;
            return anonymousClass1;
        }

        @Override // o.drX
        /* renamed from: d */
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            ViewState d;
            MutableState<ViewState> mutableState;
            ViewState viewState;
            e = C8586drb.e();
            int i = this.a;
            if (i == 0) {
                C8556dpz.d(obj);
                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.c;
                MutableState<ViewState> mutableState2 = this.e;
                d = PlayerSeekbarKt$bounceClick$1.d((MutableState<ViewState>) mutableState2);
                if (d == ViewState.b) {
                    this.c = mutableState2;
                    this.a = 1;
                    if (TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null) == e) {
                        return e;
                    }
                    mutableState = mutableState2;
                    viewState = ViewState.d;
                } else {
                    this.c = mutableState2;
                    this.a = 2;
                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null) == e) {
                        return e;
                    }
                    mutableState = mutableState2;
                    viewState = ViewState.b;
                }
            } else if (i == 1) {
                mutableState = (MutableState) this.c;
                C8556dpz.d(obj);
                viewState = ViewState.d;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mutableState = (MutableState) this.c;
                C8556dpz.d(obj);
                viewState = ViewState.b;
            }
            PlayerSeekbarKt$bounceClick$1.a(mutableState, viewState);
            return dpR.c;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, null);
            this.d = 1;
            if (((PointerInputScope) this.e).awaitPointerEventScope(anonymousClass1, this) == e) {
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
