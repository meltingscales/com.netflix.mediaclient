package com.netflix.mediaclient.ui.commander.impl.ui.components;

import android.graphics.Bitmap;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntSize;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.PadKey;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C3556bCf;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class DPadKt$DPad$1$8$2 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ HapticFeedback b;
    final /* synthetic */ Bitmap c;
    final /* synthetic */ MutableState<Boolean> d;
    final /* synthetic */ MutableState<IntSize> e;
    final /* synthetic */ drM<PadKey, dpR> f;
    final /* synthetic */ Bitmap g;
    final /* synthetic */ Bitmap h;
    final /* synthetic */ MutableState<PadKey> i;
    final /* synthetic */ Bitmap j;
    private /* synthetic */ Object l;
    int n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DPadKt$DPad$1$8$2(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, MutableState<IntSize> mutableState, MutableState<PadKey> mutableState2, MutableState<Boolean> mutableState3, HapticFeedback hapticFeedback, drM<? super PadKey, dpR> drm, InterfaceC8585dra<? super DPadKt$DPad$1$8$2> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.g = bitmap;
        this.a = bitmap2;
        this.c = bitmap3;
        this.j = bitmap4;
        this.h = bitmap5;
        this.e = mutableState;
        this.i = mutableState2;
        this.d = mutableState3;
        this.b = hapticFeedback;
        this.f = drm;
    }

    @Override // o.drX
    /* renamed from: a */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DPadKt$DPad$1$8$2) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DPadKt$DPad$1$8$2 dPadKt$DPad$1$8$2 = new DPadKt$DPad$1$8$2(this.g, this.a, this.c, this.j, this.h, this.e, this.i, this.d, this.b, this.f, interfaceC8585dra);
        dPadKt$DPad$1$8$2.l = obj;
        return dPadKt$DPad$1$8$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.n;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.g, this.a, this.c, this.j, this.h, this.e, this.i, this.d, null);
            final HapticFeedback hapticFeedback = this.b;
            final drM<PadKey, dpR> drm = this.f;
            final MutableState<PadKey> mutableState = this.i;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DPadKt$DPad$1$8$2.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    a(offset.m1146unboximpl());
                    return dpR.c;
                }

                public final void a(long j) {
                    PadKey e2;
                    PadKey e3;
                    e2 = C3556bCf.e(mutableState);
                    if (e2 != PadKey.b) {
                        HapticFeedback.this.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
                        drM<PadKey, dpR> drm3 = drm;
                        e3 = C3556bCf.e(mutableState);
                        drm3.invoke(e3);
                        C3556bCf.e().getLogTag();
                    }
                }
            };
            this.n = 1;
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
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.components.DPadKt$DPad$1$8$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
        final /* synthetic */ Bitmap a;
        final /* synthetic */ MutableState<PadKey> b;
        final /* synthetic */ MutableState<Boolean> c;
        final /* synthetic */ Bitmap d;
        final /* synthetic */ MutableState<IntSize> e;
        final /* synthetic */ Bitmap f;
        /* synthetic */ long g;
        final /* synthetic */ Bitmap h;
        int i;
        final /* synthetic */ Bitmap j;
        private /* synthetic */ Object k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, MutableState<IntSize> mutableState, MutableState<PadKey> mutableState2, MutableState<Boolean> mutableState3, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(3, interfaceC8585dra);
            this.f = bitmap;
            this.a = bitmap2;
            this.d = bitmap3;
            this.j = bitmap4;
            this.h = bitmap5;
            this.e = mutableState;
            this.b = mutableState2;
            this.c = mutableState3;
        }

        public final Object e(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f, this.a, this.d, this.j, this.h, this.e, this.b, this.c, interfaceC8585dra);
            anonymousClass1.k = pressGestureScope;
            anonymousClass1.g = j;
            return anonymousClass1.invokeSuspend(dpR.c);
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return e(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            long j;
            boolean a;
            long j2;
            boolean a2;
            long j3;
            boolean a3;
            long j4;
            boolean a4;
            long j5;
            boolean a5;
            e = C8586drb.e();
            int i = this.i;
            if (i == 0) {
                C8556dpz.d(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.k;
                long j6 = this.g;
                Bitmap bitmap = this.f;
                j = C3556bCf.j(this.e);
                a = C3556bCf.a(bitmap, j6, j);
                if (a) {
                    C3556bCf.d(this.b, PadKey.j);
                    C3556bCf.c(this.c, true);
                } else {
                    Bitmap bitmap2 = this.a;
                    j2 = C3556bCf.j(this.e);
                    a2 = C3556bCf.a(bitmap2, j6, j2);
                    if (a2) {
                        C3556bCf.d(this.b, PadKey.a);
                        C3556bCf.c(this.c, true);
                    } else {
                        Bitmap bitmap3 = this.d;
                        j3 = C3556bCf.j(this.e);
                        a3 = C3556bCf.a(bitmap3, j6, j3);
                        if (a3) {
                            C3556bCf.d(this.b, PadKey.e);
                            C3556bCf.c(this.c, true);
                        } else {
                            Bitmap bitmap4 = this.j;
                            j4 = C3556bCf.j(this.e);
                            a4 = C3556bCf.a(bitmap4, j6, j4);
                            if (a4) {
                                C3556bCf.d(this.b, PadKey.c);
                                C3556bCf.c(this.c, true);
                            } else {
                                Bitmap bitmap5 = this.h;
                                j5 = C3556bCf.j(this.e);
                                a5 = C3556bCf.a(bitmap5, j6, j5);
                                if (a5) {
                                    C3556bCf.d(this.b, PadKey.d);
                                    C3556bCf.c(this.c, true);
                                }
                            }
                        }
                    }
                }
                C3556bCf.e().getLogTag();
                this.i = 1;
                if (pressGestureScope.awaitRelease(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            C3556bCf.c(this.c, false);
            C3556bCf.d(this.b, PadKey.b);
            C3556bCf.e().getLogTag();
            return dpR.c;
        }
    }
}
