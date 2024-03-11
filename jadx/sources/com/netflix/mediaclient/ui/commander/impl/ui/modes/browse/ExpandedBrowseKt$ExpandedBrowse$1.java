package com.netflix.mediaclient.ui.commander.impl.ui.modes.browse;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drX;

/* loaded from: classes4.dex */
public final class ExpandedBrowseKt$ExpandedBrowse$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ FocusManager c;
    int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandedBrowseKt$ExpandedBrowse$1(FocusManager focusManager, InterfaceC8585dra<? super ExpandedBrowseKt$ExpandedBrowse$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.c = focusManager;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((ExpandedBrowseKt$ExpandedBrowse$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        ExpandedBrowseKt$ExpandedBrowse$1 expandedBrowseKt$ExpandedBrowse$1 = new ExpandedBrowseKt$ExpandedBrowse$1(this.c, interfaceC8585dra);
        expandedBrowseKt$ExpandedBrowse$1.e = obj;
        return expandedBrowseKt$ExpandedBrowse$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.d = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, null, this, 11, null) == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.modes.browse.ExpandedBrowseKt$ExpandedBrowse$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
        int a;
        final /* synthetic */ FocusManager c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FocusManager focusManager, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(3, interfaceC8585dra);
            this.c = focusManager;
        }

        public final Object d(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return new AnonymousClass1(this.c, interfaceC8585dra).invokeSuspend(dpR.c);
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return d(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.a == 0) {
                C8556dpz.d(obj);
                FocusManager.clearFocus$default(this.c, false, 1, null);
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
