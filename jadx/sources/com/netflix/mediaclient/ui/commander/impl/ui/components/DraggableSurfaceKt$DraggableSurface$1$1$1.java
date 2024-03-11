package com.netflix.mediaclient.ui.commander.impl.ui.components;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Dp;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8632dsu;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* loaded from: classes4.dex */
public final class DraggableSurfaceKt$DraggableSurface$1$1$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    private /* synthetic */ Object a;
    final /* synthetic */ drM<Boolean, dpR> b;
    final /* synthetic */ drX<PointerInputChange, Dp, dpR> c;
    int d;
    final /* synthetic */ drO<dpR> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableSurfaceKt$DraggableSurface$1$1$1(drM<? super Boolean, dpR> drm, drO<dpR> dro, drX<? super PointerInputChange, ? super Dp, dpR> drx, InterfaceC8585dra<? super DraggableSurfaceKt$DraggableSurface$1$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.b = drm;
        this.e = dro;
        this.c = drx;
    }

    @Override // o.drX
    /* renamed from: c */
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DraggableSurfaceKt$DraggableSurface$1$1$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DraggableSurfaceKt$DraggableSurface$1$1$1 draggableSurfaceKt$DraggableSurface$1$1$1 = new DraggableSurfaceKt$DraggableSurface$1$1$1(this.b, this.e, this.c, interfaceC8585dra);
        draggableSurfaceKt$DraggableSurface$1$1$1.a = obj;
        return draggableSurfaceKt$DraggableSurface$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.d;
        if (i == 0) {
            C8556dpz.d(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.a;
            final drM<Boolean, dpR> drm = this.b;
            drM<Offset, dpR> drm2 = new drM<Offset, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DraggableSurfaceKt$DraggableSurface$1$1$1.1
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
                    drm.invoke(Boolean.TRUE);
                }
            };
            final drO<dpR> dro = this.e;
            drO<dpR> dro2 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DraggableSurfaceKt$DraggableSurface$1$1$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    e();
                    return dpR.c;
                }

                public final void e() {
                    dro.invoke();
                }
            };
            final drM<Boolean, dpR> drm3 = this.b;
            drO<dpR> dro3 = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DraggableSurfaceKt$DraggableSurface$1$1$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    c();
                    return dpR.c;
                }

                public final void c() {
                    drm3.invoke(Boolean.FALSE);
                }
            };
            final drX<PointerInputChange, Dp, dpR> drx = this.c;
            drX<PointerInputChange, Float, dpR> drx2 = new drX<PointerInputChange, Float, dpR>() { // from class: com.netflix.mediaclient.ui.commander.impl.ui.components.DraggableSurfaceKt$DraggableSurface$1$1$1.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(PointerInputChange pointerInputChange, Float f) {
                    c(pointerInputChange, f.floatValue());
                    return dpR.c;
                }

                public final void c(PointerInputChange pointerInputChange, float f) {
                    C8632dsu.c((Object) pointerInputChange, "");
                    drx.invoke(pointerInputChange, Dp.m2490boximpl(pointerInputScope.mo189toDpu2uoSUM(f)));
                }
            };
            this.d = 1;
            if (DragGestureDetectorKt.detectVerticalDragGestures(pointerInputScope, drm2, dro2, dro3, drx2, this) == e) {
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
