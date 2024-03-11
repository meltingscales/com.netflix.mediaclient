package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.netflix.android.org.json.zip.JSONzip;
import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TextFieldState {
    private LayoutCoordinates _layoutCoordinates;
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private TextInputSession inputSession;
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final drM<ImeAction, dpR> onImeActionPerformed;
    private final drM<TextFieldValue, dpR> onValueChange;
    private drM<? super TextFieldValue, dpR> onValueChangeOriginal;
    private final EditProcessor processor = new EditProcessor();
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;
    private final MutableState showCursorHandle$delegate;
    private final MutableState showFloatingToolbar$delegate;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final drM<ImeAction, dpR> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final drM<TextFieldValue, dpR> getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<TextLayoutResultProxy> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m2490boximpl(Dp.m2492constructorimpl(0)), null, 2, null);
        this.minHeightForSingleLineField$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layoutResultState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.handleState$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showFloatingToolbar$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default8;
        this.isLayoutResultStale = true;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isInTouchMode$delegate = mutableStateOf$default9;
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.onValueChangeOriginal = new drM<TextFieldValue, dpR>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChangeOriginal$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return dpR.c;
            }
        };
        this.onValueChange = new drM<TextFieldValue, dpR>() { // from class: androidx.compose.foundation.text.TextFieldState$onValueChange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
                drM drm;
                String text = textFieldValue.getText();
                AnnotatedString untransformedText = TextFieldState.this.getUntransformedText();
                if (!C8632dsu.c((Object) text, (Object) (untransformedText != null ? untransformedText.getText() : null))) {
                    TextFieldState.this.setHandleState(HandleState.None);
                }
                drm = TextFieldState.this.onValueChangeOriginal;
                drm.invoke(textFieldValue);
                TextFieldState.this.getRecomposeScope().invalidate();
            }
        };
        this.onImeActionPerformed = new drM<ImeAction, dpR>() { // from class: androidx.compose.foundation.text.TextFieldState$onImeActionPerformed$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ImeAction imeAction) {
                m476invokeKlQnJC8(imeAction.m2259unboximpl());
                return dpR.c;
            }

            /* renamed from: invoke-KlQnJC8  reason: not valid java name */
            public final void m476invokeKlQnJC8(int i) {
                KeyboardActionRunner keyboardActionRunner;
                keyboardActionRunner = TextFieldState.this.keyboardActionRunner;
                keyboardActionRunner.m417runActionKlQnJC8(i);
            }
        };
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4  reason: not valid java name */
    public final void m474setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m2490boximpl(f));
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: update-fnh65Uc  reason: not valid java name */
    public final void m475updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver resolver, drM<? super TextFieldValue, dpR> drm, KeyboardActions keyboardActions, FocusManager focusManager, long j) {
        List i;
        TextDelegate m449updateTextDelegaterm0N8CA;
        this.onValueChangeOriginal = drm;
        this.selectionPaint.mo1208setColor8_81llA(j);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate textDelegate = this.textDelegate;
        i = C8569dql.i();
        m449updateTextDelegaterm0N8CA = TextDelegateKt.m449updateTextDelegaterm0N8CA(textDelegate, annotatedString2, textStyle, density, resolver, (r23 & 32) != 0 ? true : z, (r23 & 64) != 0 ? TextOverflow.Companion.m2457getClipgIe3tQ8() : 0, (r23 & 128) != 0 ? Integer.MAX_VALUE : 0, (r23 & JSONzip.end) != 0 ? 1 : 0, i);
        if (this.textDelegate != m449updateTextDelegaterm0N8CA) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m449updateTextDelegaterm0N8CA;
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM  reason: not valid java name */
    public final float m473getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m2498unboximpl();
    }

    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final void setHandleState(HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }
}
