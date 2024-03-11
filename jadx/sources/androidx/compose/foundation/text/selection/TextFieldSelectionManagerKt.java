package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import o.C8657dts;
import o.dpR;
import o.drX;

/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void TextFieldSelectionHandle(final boolean z, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(Boolean.valueOf(z));
        boolean changed2 = startRestartGroup.changed(textFieldSelectionManager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if ((changed | changed2) || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        int i2 = i << 3;
        AndroidSelectionHandles_androidKt.SelectionHandle(new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1
            @Override // androidx.compose.foundation.text.selection.OffsetProvider
            /* renamed from: provide-F1C5BW0 */
            public final long mo403provideF1C5BW0() {
                return TextFieldSelectionManager.this.m544getHandlePositiontuRUvjQ$foundation_release(z);
            }
        }, z, resolvedTextDirection, TextRange.m2156getReversedimpl(textFieldSelectionManager.getValue$foundation_release().m2302getSelectiond9O1mEE()), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(textDragObserver, null)), startRestartGroup, (i2 & 112) | (i2 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return dpR.c;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextFieldSelectionManagerKt.TextFieldSelectionHandle(z, resolvedTextDirection, textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) == null || (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m531containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m544getHandlePositiontuRUvjQ$foundation_release(z));
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m545calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j) {
        int m2157getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextDelegate textDelegate;
        AnnotatedString text;
        int c;
        float a;
        Offset m542getCurrentDragPosition_m7T9E = textFieldSelectionManager.m542getCurrentDragPosition_m7T9E();
        if (m542getCurrentDragPosition_m7T9E == null) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        long m1146unboximpl = m542getCurrentDragPosition_m7T9E.m1146unboximpl();
        AnnotatedString transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m2157getStartimpl = TextRange.m2157getStartimpl(textFieldSelectionManager.getValue$foundation_release().m2302getSelectiond9O1mEE());
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            m2157getStartimpl = TextRange.m2152getEndimpl(textFieldSelectionManager.getValue$foundation_release().m2302getSelectiond9O1mEE());
        }
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release2 == null || (textDelegate = state$foundation_release2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        c = C8657dts.c(textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(m2157getStartimpl), 0, text.length());
        float m1137getXimpl = Offset.m1137getXimpl(layoutResult.m482translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m1146unboximpl));
        TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(c);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        a = C8657dts.a(m1137getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (Math.abs(m1137getXimpl - a) > IntSize.m2547getWidthimpl(j) / 2) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return OffsetKt.Offset(a, ((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
    }
}
