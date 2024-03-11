package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        C8632dsu.d("");
        return null;
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        C8632dsu.d("");
        return null;
    }

    /* renamed from: runAction-KlQnJC8  reason: not valid java name */
    public final void m417runActionKlQnJC8(int i) {
        drM<KeyboardActionScope, dpR> drm;
        ImeAction.Companion companion = ImeAction.Companion;
        dpR dpr = null;
        if (ImeAction.m2256equalsimpl0(i, companion.m2261getDoneeUduSuo())) {
            drm = getKeyboardActions().getOnDone();
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2262getGoeUduSuo())) {
            drm = getKeyboardActions().getOnGo();
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2263getNexteUduSuo())) {
            drm = getKeyboardActions().getOnNext();
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2265getPreviouseUduSuo())) {
            drm = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2266getSearcheUduSuo())) {
            drm = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2267getSendeUduSuo())) {
            drm = getKeyboardActions().getOnSend();
        } else if (!ImeAction.m2256equalsimpl0(i, companion.m2260getDefaulteUduSuo()) && !ImeAction.m2256equalsimpl0(i, companion.m2264getNoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        } else {
            drm = null;
        }
        if (drm != null) {
            drm.invoke(this);
            dpr = dpR.c;
        }
        if (dpr == null) {
            m416defaultKeyboardActionKlQnJC8(i);
        }
    }

    /* renamed from: defaultKeyboardAction-KlQnJC8  reason: not valid java name */
    public void m416defaultKeyboardActionKlQnJC8(int i) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m2256equalsimpl0(i, companion.m2263getNexteUduSuo())) {
            getFocusManager().mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1086getNextdhqQ8s());
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2265getPreviouseUduSuo())) {
            getFocusManager().mo1090moveFocus3ESFkO8(FocusDirection.Companion.m1087getPreviousdhqQ8s());
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2261getDoneeUduSuo())) {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
        } else if (ImeAction.m2256equalsimpl0(i, companion.m2262getGoeUduSuo()) || ImeAction.m2256equalsimpl0(i, companion.m2266getSearcheUduSuo()) || ImeAction.m2256equalsimpl0(i, companion.m2267getSendeUduSuo()) || ImeAction.m2256equalsimpl0(i, companion.m2260getDefaulteUduSuo())) {
        } else {
            ImeAction.m2256equalsimpl0(i, companion.m2264getNoneeUduSuo());
        }
    }
}
