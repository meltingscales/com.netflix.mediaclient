package androidx.compose.ui.modifier;

import o.C8627dsp;
import o.drO;

/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    private final drO<T> defaultFactory;

    public /* synthetic */ ModifierLocal(drO dro, C8627dsp c8627dsp) {
        this(dro);
    }

    public final drO<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(drO<? extends T> dro) {
        this.defaultFactory = dro;
    }
}
