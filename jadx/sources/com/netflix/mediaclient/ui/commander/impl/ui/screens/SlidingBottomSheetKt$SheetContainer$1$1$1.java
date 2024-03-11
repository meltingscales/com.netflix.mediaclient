package com.netflix.mediaclient.ui.commander.impl.ui.screens;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
final class SlidingBottomSheetKt$SheetContainer$1$1$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ drM<Boolean, dpR> b;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingBottomSheetKt$SheetContainer$1$1$1(drM<? super Boolean, dpR> drm, InterfaceC8585dra<? super SlidingBottomSheetKt$SheetContainer$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = drm;
    }

    @Override // o.drX
    /* renamed from: b */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((SlidingBottomSheetKt$SheetContainer$1$1$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        SlidingBottomSheetKt$SheetContainer$1$1$1 slidingBottomSheetKt$SheetContainer$1$1$1 = new SlidingBottomSheetKt$SheetContainer$1$1$1(this.b, interfaceC8585dra);
        slidingBottomSheetKt$SheetContainer$1$1$1.a = obj;
        return slidingBottomSheetKt$SheetContainer$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, null);
            this.e = 1;
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
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.screens.SlidingBottomSheetKt$SheetContainer$1$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drM<Boolean, dpR> a;
        int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(drM<? super Boolean, dpR> drm, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(3, interfaceC8585dra);
            this.a = drm;
        }

        public final Object b(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return new AnonymousClass1(this.a, interfaceC8585dra).invokeSuspend(dpR.c);
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return b(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C8586drb.e();
            if (this.c == 0) {
                C8556dpz.d(obj);
                this.a.invoke(C8589dre.e(false));
                return dpR.c;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
