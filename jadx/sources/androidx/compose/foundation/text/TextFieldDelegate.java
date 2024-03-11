package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        /* renamed from: layout-_EkL_-Y$foundation_release  reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m455layout_EkL_Y$foundation_release(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult m448layoutNN6EwU = textDelegate.m448layoutNN6EwU(j, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf(IntSize.m2547getWidthimpl(m448layoutNN6EwU.m2143getSizeYbymL2g())), Integer.valueOf(IntSize.m2546getHeightimpl(m448layoutNN6EwU.m2143getSizeYbymL2g())), m448layoutNN6EwU);
        }

        public final void draw$foundation_release(Canvas canvas, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int originalToTransformed;
            int originalToTransformed2;
            if (!TextRange.m2151getCollapsedimpl(textFieldValue.m2302getSelectiond9O1mEE()) && (originalToTransformed = offsetMapping.originalToTransformed(TextRange.m2155getMinimpl(textFieldValue.m2302getSelectiond9O1mEE()))) != (originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            Rect rect;
            if (z) {
                int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m2154getMaximpl(textFieldValue.m2302getSelectiond9O1mEE()));
                if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed);
                } else if (originalToTransformed != 0) {
                    rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
                } else {
                    rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m2546getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long mo1811localToRootMKHz9U = layoutCoordinates.mo1811localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m1162Recttz77jQw(OffsetKt.Offset(Offset.m1137getXimpl(mo1811localToRootMKHz9U), Offset.m1138getYimpl(mo1811localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        public final void updateTextLayoutResult$foundation_release(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new drM<Matrix, dpR>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Matrix matrix) {
                    m457invoke58bKbWc(matrix.m1382unboximpl());
                    return dpR.c;
                }

                /* renamed from: invoke-58bKbWc  reason: not valid java name */
                public final void m457invoke58bKbWc(float[] fArr) {
                    LayoutCoordinatesKt.findRootCoordinates(LayoutCoordinates.this).mo1813transformFromEL8BTi8(LayoutCoordinates.this, fArr);
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> list, EditProcessor editProcessor, drM<? super TextFieldValue, dpR> drm, TextInputSession textInputSession) {
            TextFieldValue apply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            drm.invoke(apply);
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation_release  reason: not valid java name */
        public final void m456setCursorOffsetULxng0E$foundation_release(long j, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, drM<? super TextFieldValue, dpR> drm) {
            drm.invoke(TextFieldValue.m2297copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, final EditProcessor editProcessor, ImeOptions imeOptions, final drM<? super TextFieldValue, dpR> drm, drM<? super ImeAction, dpR> drm2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? startInput = textInputService.startInput(textFieldValue, imeOptions, new drM<List<? extends EditCommand>, dpR>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // o.drM
                public /* bridge */ /* synthetic */ dpR invoke(List<? extends EditCommand> list) {
                    invoke2(list);
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends EditCommand> list) {
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(list, EditProcessor.this, drm, objectRef.d);
                }
            }, drm2);
            objectRef.d = startInput;
            return startInput;
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, drM<? super TextFieldValue, dpR> drm, drM<? super ImeAction, dpR> drm2) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, drm, drm2);
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, drM<? super TextFieldValue, dpR> drm) {
            drm.invoke(TextFieldValue.m2297copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        /* renamed from: applyCompositionDecoration-72CqOWE  reason: not valid java name */
        public final TransformedText m454applyCompositionDecoration72CqOWE(long j, TransformedText transformedText) {
            int originalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m2157getStartimpl(j));
            int originalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m2152getEndimpl(j));
            int min = Math.min(originalToTransformed, originalToTransformed2);
            int max = Math.max(originalToTransformed, originalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 61439, null), min, max);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }
    }
}
