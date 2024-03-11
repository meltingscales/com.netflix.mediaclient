package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;
import o.dqZ;
import o.dwU;

/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope {
    private final dwU coroutineScope;
    private final AtomicReference<SessionMutex.Session<Object>> methodSessionMutex;

    @Override // o.dwU
    public dqZ getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m1060getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m1060getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }
}
