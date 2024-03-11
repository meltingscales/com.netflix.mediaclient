package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;
import o.dsT;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    private final InterfaceC8554dpx baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private drM<? super List<? extends EditCommand>, dpR> onEditCommand;
    private drM<? super ImeAction, dpR> onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final View getView() {
        return this.view;
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        InterfaceC8554dpx b;
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new drM<List<? extends EditCommand>, dpR>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return dpR.c;
            }
        };
        this.onImeActionPerformed = new drM<ImeAction, dpR>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            /* renamed from: invoke-KlQnJC8  reason: not valid java name */
            public final void m2303invokeKlQnJC8(int i) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ImeAction imeAction) {
                m2303invokeKlQnJC8(imeAction.m2259unboximpl());
                return dpR.c;
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m2162getZerod9O1mEE(), (TextRange) null, 4, (C8627dsp) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        b = dpB.b(LazyThreadSafetyMode.e, new drO<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(TextInputServiceAndroid.this.getView(), false);
            }
        });
        this.baseInputConnection$delegate = b;
        this.cursorAnchorInfoController = new CursorAnchorInfoController(positionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, PositionCalculator positionCalculator, InputMethodManager inputMethodManager, Executor executor, int i, C8627dsp c8627dsp) {
        this(view, positionCalculator, inputMethodManager, (i & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    public TextInputServiceAndroid(View view, PositionCalculator positionCalculator) {
        this(view, positionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (this.editorHasFocus) {
            TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
            TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
            RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onEditCommands(List<? extends EditCommand> list) {
                    drM drm;
                    drm = TextInputServiceAndroid.this.onEditCommand;
                    drm.invoke(list);
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                /* renamed from: onImeAction-KlQnJC8 */
                public void mo2271onImeActionKlQnJC8(int i) {
                    drM drm;
                    drm = TextInputServiceAndroid.this.onImeActionPerformed;
                    drm.invoke(ImeAction.m2253boximpl(i));
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onKeyEvent(KeyEvent keyEvent) {
                    BaseInputConnection baseInputConnection;
                    baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                    baseInputConnection.sendKeyEvent(keyEvent);
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                    CursorAnchorInfoController cursorAnchorInfoController;
                    cursorAnchorInfoController = TextInputServiceAndroid.this.cursorAnchorInfoController;
                    cursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                    List list;
                    List list2;
                    List list3;
                    list = TextInputServiceAndroid.this.ics;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list2 = TextInputServiceAndroid.this.ics;
                        if (C8632dsu.c(((WeakReference) list2.get(i)).get(), recordingInputConnection2)) {
                            list3 = TextInputServiceAndroid.this.ics;
                            list3.remove(i);
                            return;
                        }
                    }
                }
            }, this.imeOptions.getAutoCorrect());
            this.ics.add(new WeakReference<>(recordingInputConnection));
            return recordingInputConnection;
        }
        return null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, drM<? super List<? extends EditCommand>, dpR> drm, drM<? super ImeAction, dpR> drm2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = drm;
        this.onImeActionPerformed = drm2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new drM<List<? extends EditCommand>, dpR>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends EditCommand> list) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(List<? extends EditCommand> list) {
                invoke2(list);
                return dpR.c;
            }
        };
        this.onImeActionPerformed = new drM<ImeAction, dpR>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            /* renamed from: invoke-KlQnJC8  reason: not valid java name */
            public final void m2304invokeKlQnJC8(int i) {
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ImeAction imeAction) {
                m2304invokeKlQnJC8(imeAction.m2259unboximpl());
                return dpR.c;
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void processInputCommands() {
        /*
            r6 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r2 = r6.textInputCommandQueue
            int r3 = r2.getSize()
            if (r3 <= 0) goto L22
            java.lang.Object[] r2 = r2.getContent()
            r4 = 0
        L17:
            r5 = r2[r4]
            androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r5 = (androidx.compose.ui.text.input.TextInputServiceAndroid.TextInputCommand) r5
            processInputCommands$applyToState(r5, r0, r1)
            int r4 = r4 + 1
            if (r4 < r3) goto L17
        L22:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand> r2 = r6.textInputCommandQueue
            r2.clear()
            T r2 = r0.d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = o.C8632dsu.c(r2, r3)
            if (r2 == 0) goto L34
            r6.restartInputImmediately()
        L34:
            T r1 = r1.d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L41
            boolean r1 = r1.booleanValue()
            r6.setKeyboardVisibleImmediately(r1)
        L41:
            T r0 = r0.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = o.C8632dsu.c(r0, r1)
            if (r0 == 0) goto L4e
            r6.restartInputImmediately()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.processInputCommands():void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            ?? r3 = Boolean.TRUE;
            objectRef.d = r3;
            objectRef2.d = r3;
        } else if (i == 2) {
            ?? r32 = Boolean.FALSE;
            objectRef.d = r32;
            objectRef2.d = r32;
        } else if ((i == 3 || i == 4) && !C8632dsu.c(objectRef.d, Boolean.FALSE)) {
            objectRef2.d = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (TextRange.m2150equalsimpl0(this.state.m2302getSelectiond9O1mEE(), textFieldValue2.m2302getSelectiond9O1mEE()) && C8632dsu.c(this.state.m2301getCompositionMzsxiRA(), textFieldValue2.m2301getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (C8632dsu.c(textFieldValue, textFieldValue2)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int m2155getMinimpl = TextRange.m2155getMinimpl(textFieldValue2.m2302getSelectiond9O1mEE());
                int m2154getMaximpl = TextRange.m2154getMaximpl(textFieldValue2.m2302getSelectiond9O1mEE());
                TextRange m2301getCompositionMzsxiRA = this.state.m2301getCompositionMzsxiRA();
                int m2155getMinimpl2 = m2301getCompositionMzsxiRA != null ? TextRange.m2155getMinimpl(m2301getCompositionMzsxiRA.m2161unboximpl()) : -1;
                TextRange m2301getCompositionMzsxiRA2 = this.state.m2301getCompositionMzsxiRA();
                inputMethodManager.updateSelection(m2155getMinimpl, m2154getMaximpl, m2155getMinimpl2, m2301getCompositionMzsxiRA2 != null ? TextRange.m2154getMaximpl(m2301getCompositionMzsxiRA2.m2161unboximpl()) : -1);
            }
        } else if (textFieldValue != null && (!C8632dsu.c((Object) textFieldValue.getText(), (Object) textFieldValue2.getText()) || (TextRange.m2150equalsimpl0(textFieldValue.m2302getSelectiond9O1mEE(), textFieldValue2.m2302getSelectiond9O1mEE()) && !C8632dsu.c(textFieldValue.m2301getCompositionMzsxiRA(), textFieldValue2.m2301getCompositionMzsxiRA())))) {
            restartInputImmediately();
        } else {
            int size2 = this.ics.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RecordingInputConnection recordingInputConnection2 = this.ics.get(i2).get();
                if (recordingInputConnection2 != null) {
                    recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        int e;
        int e2;
        int e3;
        int e4;
        Rect rect2;
        e = dsT.e(rect.getLeft());
        e2 = dsT.e(rect.getTop());
        e3 = dsT.e(rect.getRight());
        e4 = dsT.e(rect.getBottom());
        this.focusedRect = new Rect(e, e2, e3, e4);
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, drM<? super Matrix, dpR> drm, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, drm, rect, rect2);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        if (z) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(TextInputServiceAndroid.this);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }
}
