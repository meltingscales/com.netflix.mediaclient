package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.LazyThreadSafetyMode;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;

/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    private final InterfaceC8554dpx imm$delegate;
    private final SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat;
    private final View view;

    public InputMethodManagerImpl(View view) {
        InterfaceC8554dpx b;
        this.view = view;
        b = dpB.b(LazyThreadSafetyMode.e, new drO<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final android.view.inputmethod.InputMethodManager invoke() {
                View view2;
                view2 = InputMethodManagerImpl.this.view;
                Object systemService = view2.getContext().getSystemService("input_method");
                C8632dsu.d(systemService);
                return (android.view.inputmethod.InputMethodManager) systemService;
            }
        });
        this.imm$delegate = b;
        this.softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return getImm().isActive(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.softwareKeyboardControllerCompat.show();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.softwareKeyboardControllerCompat.hide();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i, ExtractedText extractedText) {
        getImm().updateExtractedText(this.view, i, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i, int i2, int i3, int i4) {
        getImm().updateSelection(this.view, i, i2, i3, i4);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        getImm().updateCursorAnchorInfo(this.view, cursorAnchorInfo);
    }
}
