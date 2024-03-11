package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import org.linphone.core.Privacy;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int i;
        String privateImeOptions;
        int m2269getImeActioneUduSuo = imeOptions.m2269getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2260getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
            i = 6;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2264getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2262getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2263getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2265getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2266getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2267getSendeUduSuo())) {
            i = 4;
        } else {
            if (!ImeAction.m2256equalsimpl0(m2269getImeActioneUduSuo, companion.m2261getDoneeUduSuo())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int m2270getKeyboardTypePjHm6EE = imeOptions.m2270getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2295getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2288getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2291getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2294getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2296getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2290getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2293getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2292getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m2284equalsimpl0(m2270getKeyboardTypePjHm6EE, companion2.m2289getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m2256equalsimpl0(imeOptions.m2269getImeActioneUduSuo(), companion.m2260getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m2268getCapitalizationIUNYP9k = imeOptions.m2268getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m2274equalsimpl0(m2268getCapitalizationIUNYP9k, companion3.m2278getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m2274equalsimpl0(m2268getCapitalizationIUNYP9k, companion3.m2281getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m2274equalsimpl0(m2268getCapitalizationIUNYP9k, companion3.m2280getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= Privacy.DEFAULT;
            }
        }
        editorInfo.initialSelStart = TextRange.m2157getStartimpl(textFieldValue.m2302getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m2152getEndimpl(textFieldValue.m2302getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
