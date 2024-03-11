package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class DrawerKt$Scrim$dismissDrawer$1$1 extends SuspendLambda implements drX<PointerInputScope, InterfaceC8585dra<? super dpR>, Object> {
    final /* synthetic */ drO<dpR> $onClose;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$dismissDrawer$1$1(drO<dpR> dro, InterfaceC8585dra<? super DrawerKt$Scrim$dismissDrawer$1$1> interfaceC8585dra) {
        super(2, interfaceC8585dra);
        this.$onClose = dro;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
        DrawerKt$Scrim$dismissDrawer$1$1 drawerKt$Scrim$dismissDrawer$1$1 = new DrawerKt$Scrim$dismissDrawer$1$1(this.$onClose, interfaceC8585dra);
        drawerKt$Scrim$dismissDrawer$1$1.L$0 = obj;
        return drawerKt$Scrim$dismissDrawer$1$1;
    }

    @Override // o.drX
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return ((DrawerKt$Scrim$dismissDrawer$1$1) create(pointerInputScope, interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.label;
        if (i == 0) {
            C8556dpz.d(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final drO<dpR> dro = this.$onClose;
            drM<Offset, dpR> drm = new drM<Offset, dpR>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Offset offset) {
                    m592invokek4lQ0M(offset.m1146unboximpl());
                    return dpR.c;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m592invokek4lQ0M(long j) {
                    dro.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, drm, this, 7, null) == e) {
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
