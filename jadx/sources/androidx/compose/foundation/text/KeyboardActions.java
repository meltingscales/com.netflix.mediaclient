package androidx.compose.foundation.text;

import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final drM<KeyboardActionScope, dpR> onDone;
    private final drM<KeyboardActionScope, dpR> onGo;
    private final drM<KeyboardActionScope, dpR> onNext;
    private final drM<KeyboardActionScope, dpR> onPrevious;
    private final drM<KeyboardActionScope, dpR> onSearch;
    private final drM<KeyboardActionScope, dpR> onSend;

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final drM<KeyboardActionScope, dpR> getOnDone() {
        return this.onDone;
    }

    public final drM<KeyboardActionScope, dpR> getOnGo() {
        return this.onGo;
    }

    public final drM<KeyboardActionScope, dpR> getOnNext() {
        return this.onNext;
    }

    public final drM<KeyboardActionScope, dpR> getOnPrevious() {
        return this.onPrevious;
    }

    public final drM<KeyboardActionScope, dpR> getOnSearch() {
        return this.onSearch;
    }

    public final drM<KeyboardActionScope, dpR> getOnSend() {
        return this.onSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(drM<? super KeyboardActionScope, dpR> drm, drM<? super KeyboardActionScope, dpR> drm2, drM<? super KeyboardActionScope, dpR> drm3, drM<? super KeyboardActionScope, dpR> drm4, drM<? super KeyboardActionScope, dpR> drm5, drM<? super KeyboardActionScope, dpR> drm6) {
        this.onDone = drm;
        this.onGo = drm2;
        this.onNext = drm3;
        this.onPrevious = drm4;
        this.onSearch = drm5;
        this.onSend = drm6;
    }

    public /* synthetic */ KeyboardActions(drM drm, drM drm2, drM drm3, drM drm4, drM drm5, drM drm6, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : drm, (i & 2) != 0 ? null : drm2, (i & 4) != 0 ? null : drm3, (i & 8) != 0 ? null : drm4, (i & 16) != 0 ? null : drm5, (i & 32) != 0 ? null : drm6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyboardActions) {
            KeyboardActions keyboardActions = (KeyboardActions) obj;
            return C8632dsu.c(this.onDone, keyboardActions.onDone) && C8632dsu.c(this.onGo, keyboardActions.onGo) && C8632dsu.c(this.onNext, keyboardActions.onNext) && C8632dsu.c(this.onPrevious, keyboardActions.onPrevious) && C8632dsu.c(this.onSearch, keyboardActions.onSearch) && C8632dsu.c(this.onSend, keyboardActions.onSend);
        }
        return false;
    }

    public int hashCode() {
        drM<KeyboardActionScope, dpR> drm = this.onDone;
        int hashCode = drm != null ? drm.hashCode() : 0;
        drM<KeyboardActionScope, dpR> drm2 = this.onGo;
        int hashCode2 = drm2 != null ? drm2.hashCode() : 0;
        drM<KeyboardActionScope, dpR> drm3 = this.onNext;
        int hashCode3 = drm3 != null ? drm3.hashCode() : 0;
        drM<KeyboardActionScope, dpR> drm4 = this.onPrevious;
        int hashCode4 = drm4 != null ? drm4.hashCode() : 0;
        drM<KeyboardActionScope, dpR> drm5 = this.onSearch;
        int hashCode5 = drm5 != null ? drm5.hashCode() : 0;
        drM<KeyboardActionScope, dpR> drm6 = this.onSend;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (drm6 != null ? drm6.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }
}
