package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmutableBool implements State<Boolean> {
    private final boolean value;

    public ImmutableBool(boolean z) {
        this.value = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
