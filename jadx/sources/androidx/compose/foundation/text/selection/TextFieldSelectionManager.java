package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private drM<? super TextFieldValue, dpR> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final drM<TextFieldValue, dpR> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(drM<? super TextFieldValue, dpR> drm) {
        this.onValueChange = drm;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new drM<TextFieldValue, dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return dpR.c;
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (C8627dsp) null), null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.Companion.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.editable$delegate = mutableStateOf$default2;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m1149getZeroF1C5BW0();
        this.dragTotalDistance = companion.m1149getZeroF1C5BW0();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default4;
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (C8627dsp) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo451onDownk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo453onStartk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                TextFieldValue m537createTextFieldValueFDrldGo;
                long j2;
                TextLayoutResultProxy layoutResult2;
                long m540updateSelection8UEBfa8;
                if (TextFieldSelectionManager.this.getDraggingHandle() != null) {
                    return;
                }
                TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null || !layoutResult2.m481isPositionOnTextk4lQ0M(j)) {
                    TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, null));
                        m537createTextFieldValueFDrldGo = textFieldSelectionManager.m537createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                        textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                        textFieldSelectionManager.setHandleState(HandleState.Cursor);
                        HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
                        }
                        textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m537createTextFieldValueFDrldGo);
                    }
                } else if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                } else {
                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release(false);
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    m540updateSelection8UEBfa8 = textFieldSelectionManager2.m540updateSelection8UEBfa8(TextFieldValue.m2297copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.Companion.m2162getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j, true, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                    TextFieldSelectionManager.this.dragBeginOffsetInText = Integer.valueOf(TextRange.m2157getStartimpl(m540updateSelection8UEBfa8));
                }
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager3.dragBeginPosition;
                textFieldSelectionManager3.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(j2));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m1149getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo452onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                Integer num;
                Integer num2;
                long j5;
                int m480getOffsetForPosition3MmeM6k;
                Integer num3;
                long m540updateSelection8UEBfa8;
                long j6;
                SelectionAdjustment characterWithWordAccelerate;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1142plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j3 = textFieldSelectionManager2.dragBeginPosition;
                    j4 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(Offset.m1142plusMKHz9U(j3, j4)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        Offset m542getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                        C8632dsu.d(m542getCurrentDragPosition_m7T9E);
                        if (!layoutResult.m481isPositionOnTextk4lQ0M(m542getCurrentDragPosition_m7T9E.m1146unboximpl())) {
                            OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            j6 = textFieldSelectionManager2.dragBeginPosition;
                            int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(layoutResult, j6, false, 2, null));
                            OffsetMapping offsetMapping$foundation_release2 = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            Offset m542getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                            C8632dsu.d(m542getCurrentDragPosition_m7T9E2);
                            if (transformedToOriginal == offsetMapping$foundation_release2.transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(layoutResult, m542getCurrentDragPosition_m7T9E2.m1146unboximpl(), false, 2, null))) {
                                characterWithWordAccelerate = SelectionAdjustment.Companion.getNone();
                            } else {
                                characterWithWordAccelerate = SelectionAdjustment.Companion.getCharacterWithWordAccelerate();
                            }
                            TextFieldValue value$foundation_release = textFieldSelectionManager2.getValue$foundation_release();
                            Offset m542getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                            C8632dsu.d(m542getCurrentDragPosition_m7T9E3);
                            m540updateSelection8UEBfa8 = textFieldSelectionManager2.m540updateSelection8UEBfa8(value$foundation_release, m542getCurrentDragPosition_m7T9E3.m1146unboximpl(), false, false, characterWithWordAccelerate, true);
                            TextRange.m2145boximpl(m540updateSelection8UEBfa8);
                        }
                    }
                    num2 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num2 != null) {
                        m480getOffsetForPosition3MmeM6k = num2.intValue();
                    } else {
                        j5 = textFieldSelectionManager2.dragBeginPosition;
                        m480getOffsetForPosition3MmeM6k = layoutResult.m480getOffsetForPosition3MmeM6k(j5, false);
                    }
                    Offset m542getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                    C8632dsu.d(m542getCurrentDragPosition_m7T9E4);
                    int m480getOffsetForPosition3MmeM6k2 = layoutResult.m480getOffsetForPosition3MmeM6k(m542getCurrentDragPosition_m7T9E4.m1146unboximpl(), false);
                    num3 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num3 == null && m480getOffsetForPosition3MmeM6k == m480getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation_release2 = textFieldSelectionManager2.getValue$foundation_release();
                    Offset m542getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                    C8632dsu.d(m542getCurrentDragPosition_m7T9E5);
                    m540updateSelection8UEBfa8 = textFieldSelectionManager2.m540updateSelection8UEBfa8(value$foundation_release2, m542getCurrentDragPosition_m7T9E5.m1146unboximpl(), false, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                    TextRange.m2145boximpl(m540updateSelection8UEBfa8);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo513onExtendk4lQ0M(long j) {
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m540updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j, false, false, SelectionAdjustment.Companion.getNone(), false);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo514onExtendDragk4lQ0M(long j) {
                TextFieldState state$foundation_release;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m540updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j, false, false, SelectionAdjustment.Companion.getNone(), false);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo515onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                TextFieldState state$foundation_release;
                long j2;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                j2 = TextFieldSelectionManager.this.dragBeginPosition;
                textFieldSelectionManager.m540updateSelection8UEBfa8(value$foundation_release, j2, true, false, selectionAdjustment, false);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo512onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
                TextFieldState state$foundation_release;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m540updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j, false, false, selectionAdjustment, false);
                return true;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : undoManager);
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (textDelegate = textFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean z) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo453onStartk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo451onDownk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager.this.setDraggingHandle(z ? Handle.SelectionStart : Handle.SelectionEnd);
                long m524getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m524getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m544getHandlePositiontuRUvjQ$foundation_release(z));
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m524getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m1149getZeroF1C5BW0();
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setInTouchMode(true);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo452onDragk4lQ0M(long j) {
                long j2;
                long j3;
                long j4;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1142plusMKHz9U(j2, j);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager2.dragBeginPosition;
                j4 = TextFieldSelectionManager.this.dragTotalDistance;
                textFieldSelectionManager2.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(Offset.m1142plusMKHz9U(j3, j4)));
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset m542getCurrentDragPosition_m7T9E = TextFieldSelectionManager.this.m542getCurrentDragPosition_m7T9E();
                C8632dsu.d(m542getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m540updateSelection8UEBfa8(value$foundation_release, m542getCurrentDragPosition_m7T9E.m1146unboximpl(), false, z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo451onDownk4lQ0M(long j) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo453onStartk4lQ0M(long j) {
                TextLayoutResultProxy layoutResult;
                long m524getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m524getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m544getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m524getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(m483translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m1149getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo452onDragk4lQ0M(long j) {
                long j2;
                TextLayoutResultProxy layoutResult;
                long j3;
                long j4;
                HapticFeedback hapticFeedBack;
                TextFieldValue m537createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m1142plusMKHz9U(j2, j);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j3 = textFieldSelectionManager2.dragBeginPosition;
                j4 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m539setCurrentDragPosition_kEHs6E(Offset.m1126boximpl(Offset.m1142plusMKHz9U(j3, j4)));
                OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                Offset m542getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m542getCurrentDragPosition_m7T9E();
                C8632dsu.d(m542getCurrentDragPosition_m7T9E);
                int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(layoutResult, m542getCurrentDragPosition_m7T9E.m1146unboximpl(), false, 2, null));
                long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (TextRange.m2150equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m2302getSelectiond9O1mEE())) {
                    return;
                }
                TextFieldState state$foundation_release2 = textFieldSelectionManager2.getState$foundation_release();
                if ((state$foundation_release2 == null || state$foundation_release2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
                }
                drM<TextFieldValue, dpR> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                m537createTextFieldValueFDrldGo = textFieldSelectionManager2.m537createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                onValueChange$foundation_release.invoke(m537createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m539setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z);
    }

    public final void enterSelectionMode$foundation_release(boolean z) {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && !textFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(z);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m538deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m541deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m541deselect_kEHs6E$foundation_release(Offset offset) {
        HandleState handleState;
        int m2154getMaximpl;
        if (!TextRange.m2151getCollapsedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
            if (offset != null && layoutResult != null) {
                m2154getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m479getOffsetForPosition3MmeM6k$default(layoutResult, offset.m1146unboximpl(), false, 2, null));
            } else {
                m2154getMaximpl = TextRange.m2154getMaximpl(getValue$foundation_release().m2302getSelectiond9O1mEE());
            }
            this.onValueChange.invoke(TextFieldValue.m2297copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m2154getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (offset != null && getValue$foundation_release().getText().length() > 0) {
            handleState = HandleState.Cursor;
        } else {
            handleState = HandleState.None;
        }
        setHandleState(handleState);
        updateFloatingToolbar(false);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean z) {
        if (TextRange.m2151getCollapsedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (z) {
            int m2154getMaximpl = TextRange.m2154getMaximpl(getValue$foundation_release().m2302getSelectiond9O1mEE());
            this.onValueChange.invoke(m537createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m2154getMaximpl, m2154getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m2155getMinimpl = TextRange.m2155getMinimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()) + text.length();
        this.onValueChange.invoke(m537createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m2155getMinimpl, m2155getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m2151getCollapsedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m2155getMinimpl = TextRange.m2155getMinimpl(getValue$foundation_release().m2302getSelectiond9O1mEE());
        this.onValueChange.invoke(m537createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m2155getMinimpl, m2155getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m537createTextFieldValueFDrldGo = m537createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m537createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m2297copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m537createTextFieldValueFDrldGo.m2302getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m544getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.Companion.m1148getUnspecifiedF1C5BW0();
        }
        if (C8632dsu.c((Object) transformedText$foundation_release.getText(), (Object) value.getLayoutInput().getText().getText())) {
            long m2302getSelectiond9O1mEE = getValue$foundation_release().m2302getSelectiond9O1mEE();
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z ? TextRange.m2157getStartimpl(m2302getSelectiond9O1mEE) : TextRange.m2152getEndimpl(m2302getSelectiond9O1mEE)), z, TextRange.m2156getReversedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()));
        }
        return Offset.Companion.m1148getUnspecifiedF1C5BW0();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m543getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int c;
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m2157getStartimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        TextLayoutResultProxy layoutResult = textFieldState != null ? textFieldState.getLayoutResult() : null;
        C8632dsu.d(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        c = C8657dts.c(originalToTransformed, 0, value.getLayoutInput().getText().length());
        Rect cursorRect = value.getCursorRect(c);
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo193toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(z);
        }
        if (z) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || textFieldState.isInTouchMode()) {
            boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
            drO<dpR> dro = (TextRange.m2151getCollapsedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()) || z) ? null : new drO<dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            };
            drO<dpR> dro2 = (TextRange.m2151getCollapsedimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()) || !getEditable() || z) ? null : new drO<dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionManager.this.cut$foundation_release();
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            };
            drO<dpR> dro3 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new drO<dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionManager.this.paste$foundation_release();
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                }
            } : null;
            drO<dpR> dro4 = TextRange.m2153getLengthimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()) != getValue$foundation_release().getText().length() ? new drO<dpR>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // o.drO
                public /* bridge */ /* synthetic */ dpR invoke() {
                    invoke2();
                    return dpR.c;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TextFieldSelectionManager.this.selectAll$foundation_release();
                }
            } : null;
            TextToolbar textToolbar = this.textToolbar;
            if (textToolbar != null) {
                textToolbar.showMenu(getContentRect(), dro, dro3, dro2, dro4);
            }
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !C8632dsu.c((Object) this.oldValue.getText(), (Object) getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float f;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m2157getStartimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m2152getEndimpl(getValue$foundation_release().m2302getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.state;
                long m1149getZeroF1C5BW0 = (textFieldState2 == null || (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m1149getZeroF1C5BW0() : layoutCoordinates4.mo1811localToRootMKHz9U(m544getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState textFieldState3 = this.state;
                long m1149getZeroF1C5BW02 = (textFieldState3 == null || (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m1149getZeroF1C5BW0() : layoutCoordinates3.mo1811localToRootMKHz9U(m544getHandlePositiontuRUvjQ$foundation_release(false));
                TextFieldState textFieldState4 = this.state;
                float f2 = 0.0f;
                if (textFieldState4 == null || (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) == null) {
                    f = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    f = Offset.m1138getYimpl(layoutCoordinates2.mo1811localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    f2 = Offset.m1138getYimpl(layoutCoordinates.mo1811localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m1137getXimpl(m1149getZeroF1C5BW0), Offset.m1137getXimpl(m1149getZeroF1C5BW02)), Math.min(f, f2), Math.max(Offset.m1137getXimpl(m1149getZeroF1C5BW0), Offset.m1137getXimpl(m1149getZeroF1C5BW02)), Math.max(Offset.m1138getYimpl(m1149getZeroF1C5BW0), Offset.m1138getYimpl(m1149getZeroF1C5BW02)) + (Dp.m2492constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8  reason: not valid java name */
    public final long m540updateSelection8UEBfa8(TextFieldValue textFieldValue, long j, boolean z, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3) {
        TextLayoutResultProxy layoutResult;
        HapticFeedback hapticFeedback;
        int i;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m2162getZerod9O1mEE();
        }
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m2157getStartimpl(textFieldValue.m2302getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m2152getEndimpl(textFieldValue.m2302getSelectiond9O1mEE())));
        int m480getOffsetForPosition3MmeM6k = layoutResult.m480getOffsetForPosition3MmeM6k(j, false);
        int m2157getStartimpl = (z2 || z) ? m480getOffsetForPosition3MmeM6k : TextRange.m2157getStartimpl(TextRange);
        int m2152getEndimpl = (!z2 || z) ? m480getOffsetForPosition3MmeM6k : TextRange.m2152getEndimpl(TextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        int i2 = -1;
        if (!z && selectionLayout != null && (i = this.previousRawDragOffset) != -1) {
            i2 = i;
        }
        SelectionLayout m525getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m525getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), m2157getStartimpl, m2152getEndimpl, i2, TextRange, z, z2);
        if (!m525getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m2302getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = m525getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = m480getOffsetForPosition3MmeM6k;
        Selection adjust = selectionAdjustment.adjust(m525getTextFieldSelectionLayoutRcvTLA);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
        if (TextRange.m2150equalsimpl0(TextRange2, textFieldValue.m2302getSelectiond9O1mEE())) {
            return textFieldValue.m2302getSelectiond9O1mEE();
        }
        boolean z4 = TextRange.m2156getReversedimpl(TextRange2) != TextRange.m2156getReversedimpl(textFieldValue.m2302getSelectiond9O1mEE()) && TextRange.m2150equalsimpl0(TextRangeKt.TextRange(TextRange.m2152getEndimpl(TextRange2), TextRange.m2157getStartimpl(TextRange2)), textFieldValue.m2302getSelectiond9O1mEE());
        boolean z5 = TextRange.m2151getCollapsedimpl(TextRange2) && TextRange.m2151getCollapsedimpl(textFieldValue.m2302getSelectiond9O1mEE());
        if (z3 && textFieldValue.getText().length() > 0 && !z4 && !z5 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo1603performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1611getTextHandleMove5zf0vsI());
        }
        TextFieldValue m537createTextFieldValueFDrldGo = m537createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2);
        this.onValueChange.invoke(m537createTextFieldValueFDrldGo);
        setHandleState(TextRange.m2151getCollapsedimpl(m537createTextFieldValueFDrldGo.m2302getSelectiond9O1mEE()) ? HandleState.Cursor : HandleState.Selection);
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setInTouchMode(z3);
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 != null) {
            textFieldState3.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState4 = this.state;
        if (textFieldState4 != null) {
            textFieldState4.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        return TextRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (textFieldState.getHandleState() == handleState) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                textFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo  reason: not valid java name */
    public final TextFieldValue m537createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (C8627dsp) null);
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value$delegate.setValue(textFieldValue);
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m542getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E  reason: not valid java name */
    public final void m539setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }
}
