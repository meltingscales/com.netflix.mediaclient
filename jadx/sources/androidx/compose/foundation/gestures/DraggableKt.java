package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.unit.Velocity;
import o.InterfaceC8585dra;
import o.InterfaceC8612dsa;
import o.dpR;
import o.drM;
import o.drO;
import o.dwU;
import o.dyI;

/* loaded from: classes.dex */
public final class DraggableKt {
    private static final DragScope NoOpDragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DraggableKt$NoOpDragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f) {
        }
    };

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, InterfaceC8612dsa<? super dwU, ? super Offset, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa, InterfaceC8612dsa<? super dwU, ? super Float, ? super InterfaceC8585dra<? super dpR>, ? extends Object> interfaceC8612dsa2, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, new drM<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // o.drM
            public final Boolean invoke(PointerInputChange pointerInputChange) {
                return Boolean.TRUE;
            }
        }, orientation, z, mutableInteractionSource, new drO<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                return Boolean.valueOf(z2);
            }
        }, interfaceC8612dsa, new DraggableKt$draggable$5(interfaceC8612dsa2, orientation, null), z3));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0287 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x01fa -> B:174:0x025f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0240 -> B:169:0x024c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x0289 -> B:133:0x016f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, o.drM<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r22, o.drO<java.lang.Boolean> r23, androidx.compose.ui.input.pointer.util.VelocityTracker r24, androidx.compose.foundation.gestures.PointerDirectionConfig r25, o.InterfaceC8585dra<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> r26) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.drM, o.drO, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.PointerDirectionConfig, o.dra):java.lang.Object");
    }

    /* renamed from: awaitDrag-Su4bsnU */
    public static final Object m179awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, final VelocityTracker velocityTracker, final dyI<? super DragEvent> dyi, final boolean z, drM<? super PointerInputChange, Boolean> drm, InterfaceC8585dra<? super Boolean> interfaceC8585dra) {
        dyi.d((dyI<? super DragEvent>) new DragEvent.DragStarted(Offset.m1141minusMKHz9U(pointerInputChange.m1729getPositionF1C5BW0(), OffsetKt.Offset(Offset.m1137getXimpl(j) * Math.signum(Offset.m1137getXimpl(pointerInputChange.m1729getPositionF1C5BW0())), Offset.m1138getYimpl(j) * Math.signum(Offset.m1138getYimpl(pointerInputChange.m1729getPositionF1C5BW0())))), null));
        dyi.d((dyI<? super DragEvent>) new DragEvent.DragDelta(z ? Offset.m1143timestuRUvjQ(j, -1.0f) : j, null));
        return m180onDragOrUpAxegvzg(awaitPointerEventScope, drm, pointerInputChange.m1727getIdJ3iCeTQ(), new drM<PointerInputChange, dpR>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange pointerInputChange2) {
                VelocityTrackerKt.addPointerInputChange(VelocityTracker.this, pointerInputChange2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return;
                }
                long positionChange = PointerEventKt.positionChange(pointerInputChange2);
                pointerInputChange2.consume();
                dyI<DragEvent> dyi2 = dyi;
                if (z) {
                    positionChange = Offset.m1143timestuRUvjQ(positionChange, -1.0f);
                }
                dyi2.d((dyI<DragEvent>) new DragEvent.DragDelta(positionChange, null));
            }
        }, interfaceC8585dra);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00f6, code lost:
        if (r1.invoke(r14).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0085 -> B:92:0x008a). Please submit an issue!!! */
    /* renamed from: onDragOrUp-Axegvzg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m180onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, o.drM<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r18, long r19, o.drM<? super androidx.compose.ui.input.pointer.PointerInputChange, o.dpR> r21, o.InterfaceC8585dra<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m180onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, o.drM, long, o.drM, o.dra):java.lang.Object");
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m181toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m1138getYimpl(j) : Offset.m1137getXimpl(j);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m182toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m2587getYimpl(j) : Velocity.m2586getXimpl(j);
    }
}
