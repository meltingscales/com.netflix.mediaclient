package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final PositionCalculator rootPositionCalculator;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private drM<? super Matrix, dpR> textFieldToRootTransform = new drM<Matrix, dpR>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        /* renamed from: invoke-58bKbWc  reason: not valid java name */
        public final void m2249invoke58bKbWc(float[] fArr) {
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(Matrix matrix) {
            m2249invoke58bKbWc(matrix.m1382unboximpl());
            return dpR.c;
        }
    };
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m1370constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(PositionCalculator positionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = positionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    public final void requestUpdate(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.includeInsertionMarker = z3;
        this.includeCharacterBounds = z4;
        this.includeEditorBounds = z5;
        this.includeLineBounds = z6;
        if (z) {
            this.hasPendingImmediateRequest = true;
            if (this.textFieldValue != null) {
                updateCursorAnchorInfo();
            }
        }
        this.monitorEnabled = z2;
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, drM<? super Matrix, dpR> drm, Rect rect, Rect rect2) {
        this.textFieldValue = textFieldValue;
        this.offsetMapping = offsetMapping;
        this.textLayoutResult = textLayoutResult;
        this.textFieldToRootTransform = drm;
        this.innerTextFieldBounds = rect;
        this.decorationBoxBounds = rect2;
        if (this.hasPendingImmediateRequest || this.monitorEnabled) {
            updateCursorAnchorInfo();
        }
    }

    public final void invalidate() {
        this.textFieldValue = null;
        this.offsetMapping = null;
        this.textLayoutResult = null;
        this.textFieldToRootTransform = new drM<Matrix, dpR>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1
            /* renamed from: invoke-58bKbWc  reason: not valid java name */
            public final void m2248invoke58bKbWc(float[] fArr) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(Matrix matrix) {
                m2248invoke58bKbWc(matrix.m1382unboximpl());
                return dpR.c;
            }
        };
        this.innerTextFieldBounds = null;
        this.decorationBoxBounds = null;
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(Matrix.m1368boximpl(this.matrix));
            this.rootPositionCalculator.mo1763localToScreen58bKbWc(this.matrix);
            AndroidMatrixConversions_androidKt.m1200setFromEL8BTi8(this.androidMatrix, this.matrix);
            InputMethodManager inputMethodManager = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            C8632dsu.d(textFieldValue);
            OffsetMapping offsetMapping = this.offsetMapping;
            C8632dsu.d(offsetMapping);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            C8632dsu.d(textLayoutResult);
            android.graphics.Matrix matrix = this.androidMatrix;
            Rect rect = this.innerTextFieldBounds;
            C8632dsu.d(rect);
            Rect rect2 = this.decorationBoxBounds;
            C8632dsu.d(rect2);
            inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
