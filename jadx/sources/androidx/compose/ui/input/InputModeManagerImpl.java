package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import o.C8627dsp;
import o.drM;

/* loaded from: classes.dex */
public final class InputModeManagerImpl implements InputModeManager {
    private final MutableState inputMode$delegate;
    private final drM<InputMode, Boolean> onRequestInputModeChange;

    public /* synthetic */ InputModeManagerImpl(int i, drM drm, C8627dsp c8627dsp) {
        this(i, drm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InputModeManagerImpl(int i, drM<? super InputMode, Boolean> drm) {
        MutableState mutableStateOf$default;
        this.onRequestInputModeChange = drm;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m1614boximpl(i), null, 2, null);
        this.inputMode$delegate = mutableStateOf$default;
    }

    /* renamed from: setInputMode-iuPiT84  reason: not valid java name */
    public void m1624setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m1614boximpl(i));
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo1623getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m1620unboximpl();
    }
}
