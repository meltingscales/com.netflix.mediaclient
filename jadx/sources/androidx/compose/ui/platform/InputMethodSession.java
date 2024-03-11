package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper_androidKt;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
final class InputMethodSession {
    private NullableInputConnectionWrapper connection;
    private boolean disposed;
    private final Object lock;
    private final drO<dpR> onConnectionClosed;
    private final PlatformTextInputMethodRequest request;

    public final boolean isActive() {
        return !this.disposed;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            NullableInputConnectionWrapper nullableInputConnectionWrapper = this.connection;
            if (nullableInputConnectionWrapper != null) {
                nullableInputConnectionWrapper.disposeDelegate();
            }
            NullableInputConnectionWrapper NullableInputConnectionWrapper = NullableInputConnectionWrapper_androidKt.NullableInputConnectionWrapper(this.request.createInputConnection(editorInfo), this.onConnectionClosed);
            this.connection = NullableInputConnectionWrapper;
            return NullableInputConnectionWrapper;
        }
    }
}
