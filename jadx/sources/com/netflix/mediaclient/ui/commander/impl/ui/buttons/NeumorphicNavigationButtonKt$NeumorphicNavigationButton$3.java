package com.netflix.mediaclient.ui.commander.impl.ui.buttons;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.netflix.mediaclient.ui.commander.impl.ui.menu.NavigationMenuAction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.bBZ;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drM<NavigationMenuAction, dpR> a;
    final /* synthetic */ HapticFeedback b;
    final /* synthetic */ NavigationMenuAction c;
    final /* synthetic */ MutableState<Boolean> d;
    int e;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3(MutableState<Boolean> mutableState, HapticFeedback hapticFeedback, drM<? super NavigationMenuAction, dpR> drm, NavigationMenuAction navigationMenuAction, InterfaceC8585dra<? super NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.d = mutableState;
        this.b = hapticFeedback;
        this.a = drm;
        this.c = navigationMenuAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3 neumorphicNavigationButtonKt$NeumorphicNavigationButton$3 = new NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3(this.d, this.b, this.a, this.c, interfaceC8585dra);
        neumorphicNavigationButtonKt$NeumorphicNavigationButton$3.i = obj;
        return neumorphicNavigationButtonKt$NeumorphicNavigationButton$3;
    }

    @Override // o.drX
    /* renamed from: d */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, null);
            final HapticFeedback hapticFeedback = this.b;
            final drM<NavigationMenuAction, dpR> drm = this.a;
            final NavigationMenuAction navigationMenuAction = this.c;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.buttons.NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    e(offset.m1146unboximpl());
                    return dpR.c;
                }

                public final void e(long j) {
                    HapticFeedback.this.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
                    drm.invoke(navigationMenuAction);
                }
            };
            this.e = 1;
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
    /* renamed from: com.netflix.mediaclient.ui.commander.impl.ui.buttons.NeumorphicNavigationButtonKt$NeumorphicNavigationButton$3$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC8612dsa<PressGestureScope, Offset, InterfaceC8585dra<? super dpR>, Object> {
        private /* synthetic */ Object a;
        final /* synthetic */ MutableState<Boolean> c;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<Boolean> mutableState, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(3, interfaceC8585dra);
            this.c = mutableState;
        }

        public final Object a(PressGestureScope pressGestureScope, long j, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, interfaceC8585dra);
            anonymousClass1.a = pressGestureScope;
            return anonymousClass1.invokeSuspend(dpR.c);
        }

        @Override // o.InterfaceC8612dsa
        public /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
            return a(pressGestureScope, offset.m1146unboximpl(), interfaceC8585dra);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object e;
            e = C8586drb.e();
            int i = this.e;
            if (i == 0) {
                C8556dpz.d(obj);
                bBZ.b(this.c, true);
                this.e = 1;
                if (((PressGestureScope) this.a).awaitRelease(this) == e) {
                    return e;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C8556dpz.d(obj);
            }
            bBZ.b(this.c, false);
            return dpR.c;
        }
    }
}
