package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import o.C8627dsp;

/* loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers;
    private final MutableState<Boolean> _isWindowFocused;

    public WindowInfoImpl() {
        MutableState<Boolean> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this._isWindowFocused = mutableStateOf$default;
    }

    public void setWindowFocused(boolean z) {
        this._isWindowFocused.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0  reason: not valid java name */
    public void m2017setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m1746boximpl(i));
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    static {
        MutableState<PointerKeyboardModifiers> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m1746boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
        GlobalKeyboardModifiers = mutableStateOf$default;
    }
}
