package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import o.C8589dre;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m2492constructorimpl(22);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final drM<? super Float, dpR> drm) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo201onPreScrollOzD1aCk(long j, int i) {
                float offsetToFloat = offsetToFloat(j);
                if (offsetToFloat < 0.0f && NestedScrollSource.m1676equalsimpl0(i, NestedScrollSource.Companion.m1680getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat));
                }
                return Offset.Companion.m1149getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo200onPostScrollDzOQY0M(long j, long j2, int i) {
                if (NestedScrollSource.m1676equalsimpl0(i, NestedScrollSource.Companion.m1680getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j2)));
                }
                return Offset.Companion.m1149getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
            public Object mo824onPreFlingQWom1Mo(long j, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
                float velocityToFloat = velocityToFloat(j);
                float requireOffset = SheetState.this.requireOffset();
                float minAnchor = SheetState.this.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (velocityToFloat < 0.0f && requireOffset > minAnchor) {
                    drm.invoke(C8589dre.e(velocityToFloat));
                } else {
                    j = Velocity.Companion.m2594getZero9UxMQ8M();
                }
                return Velocity.m2580boximpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo199onPostFlingRZ2iAVY(long j, long j2, InterfaceC8585dra<? super Velocity> interfaceC8585dra) {
                drm.invoke(C8589dre.e(velocityToFloat(j2)));
                return Velocity.m2580boximpl(j2);
            }

            private final long toOffset(float f) {
                Orientation orientation2 = orientation;
                float f2 = orientation2 == Orientation.Horizontal ? f : 0.0f;
                if (orientation2 != Orientation.Vertical) {
                    f = 0.0f;
                }
                return OffsetKt.Offset(f2, f);
            }

            private final float velocityToFloat(long j) {
                return orientation == Orientation.Horizontal ? Velocity.m2586getXimpl(j) : Velocity.m2587getYimpl(j);
            }

            private final float offsetToFloat(long j) {
                return orientation == Orientation.Horizontal ? Offset.m1137getXimpl(j) : Offset.m1138getYimpl(j);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.compose.runtime.Composer] */
    public static final SheetState rememberSheetState(boolean z, drM<? super SheetValue, Boolean> drm, SheetValue sheetValue, boolean z2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1032784200);
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        final SheetDefaultsKt$rememberSheetState$1 sheetDefaultsKt$rememberSheetState$1 = (i2 & 2) != 0 ? new drM<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1
            @Override // o.drM
            public final Boolean invoke(SheetValue sheetValue2) {
                return Boolean.TRUE;
            }
        } : drm;
        final SheetValue sheetValue2 = (i2 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:480)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z3), sheetDefaultsKt$rememberSheetState$1};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z3, sheetDefaultsKt$rememberSheetState$1, density);
        composer.startReplaceableGroup(1097108455);
        boolean z5 = (((i & 14) ^ 6) > 4 && composer.changed(z3)) || (i & 6) == 4;
        boolean changed = composer.changed(density);
        boolean z6 = (((i & 896) ^ 384) > 256 && composer.changed(sheetValue2)) || (i & 384) == 256;
        boolean z7 = (((i & 112) ^ 48) > 32 && composer.changed(sheetDefaultsKt$rememberSheetState$1)) || (i & 48) == 32;
        boolean z8 = (((i & 7168) ^ 3072) > 2048 && composer.changed(z4)) || (i & 3072) == 2048;
        Object rememberedValue = composer.rememberedValue();
        if ((z8 | z5 | changed | z6 | z7) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new drO<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // o.drO
                public final SheetState invoke() {
                    return new SheetState(z3, density, sheetValue2, sheetDefaultsKt$rememberSheetState$1, z4);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.rememberSaveable(objArr, Saver, null, rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetState;
    }
}
