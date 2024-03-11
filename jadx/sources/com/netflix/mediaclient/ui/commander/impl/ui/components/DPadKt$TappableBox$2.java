package com.netflix.mediaclient.ui.commander.impl.ui.components;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PadKey;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3556bCf;
import o.C8556dpz;
import o.C8586drb;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class DPadKt$TappableBox$2 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ HapticFeedback a;
    final /* synthetic */ drM<PadKey, dpR> b;
    final /* synthetic */ drM<Boolean, dpR> c;
    final /* synthetic */ PadKey d;
    final /* synthetic */ drM<PadKey, dpR> e;
    private /* synthetic */ Object g;
    int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DPadKt$TappableBox$2(drM<? super PadKey, dpR> drm, PadKey padKey, drM<? super Boolean, dpR> drm2, HapticFeedback hapticFeedback, drM<? super PadKey, dpR> drm3, InterfaceC8585dra<? super DPadKt$TappableBox$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = drm;
        this.d = padKey;
        this.c = drm2;
        this.a = hapticFeedback;
        this.e = drm3;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DPadKt$TappableBox$2) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DPadKt$TappableBox$2 dPadKt$TappableBox$2 = new DPadKt$TappableBox$2(this.b, this.d, this.c, this.a, this.e, interfaceC8585dra);
        dPadKt$TappableBox$2.g = obj;
        return dPadKt$TappableBox$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.j;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.d, this.c, null);
            final PadKey padKey = this.d;
            final HapticFeedback hapticFeedback = this.a;
            final drM<PadKey, dpR> drm = this.e;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DPadKt$TappableBox$2.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    c(offset.m1146unboximpl());
                    return dpR.c;
                }

                public final void c(long j) {
                    if (PadKey.this != PadKey.b) {
                        hapticFeedback.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
                        drm.invoke(PadKey.this);
                        C3556bCf.e().getLogTag();
                    }
                }
            };
            this.j = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, drm2, this, 3, null) == e) {
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
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.components.DPadKt$TappableBox$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ drM<PadKey, dpR> a;
        final /* synthetic */ drM<Boolean, dpR> b;
        private /* synthetic */ Object c;
        final /* synthetic */ PadKey d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(drM<? super PadKey, dpR> drm, PadKey padKey, drM<? super Boolean, dpR> drm2, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(3, interfaceC8585dra);
            this.a = drm;
            this.d = padKey;
            this.b = drm2;
        }

        public final Object c(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.a, this.d, this.b, interfaceC8585dra);
            anonymousClass1.c = pressGestureScope;
            return anonymousClass1.invokeSuspend(dpR.c);
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return c(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.e;
            if (i == 0) {
                C8556dpz.d(obj);
                this.a.invoke(this.d);
                this.b.invoke(C8589dre.e(true));
                C3556bCf.e().getLogTag();
                this.e = 1;
                if (((PressGestureScope) this.c).awaitRelease(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            this.b.invoke(C8589dre.e(false));
            this.a.invoke(PadKey.b);
            C3556bCf.e().getLogTag();
            return dpR.c;
        }
    }
}
