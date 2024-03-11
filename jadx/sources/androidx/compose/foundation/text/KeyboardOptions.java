package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, null, 31, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, C8627dsp c8627dsp) {
        this(i, z, i2, i3, platformImeOptions);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this.capitalization = i;
        this.autoCorrect = z;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, C8627dsp c8627dsp) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m2279getNoneIUNYP9k() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? KeyboardType.Companion.m2295getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m2260getDefaulteUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }
    }

    public final ImeOptions toImeOptions$foundation_release(boolean z) {
        return new ImeOptions(z, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, this.platformImeOptions, null);
    }

    /* renamed from: copy-ij11fho$default  reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m418copyij11fho$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.autoCorrect;
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        return keyboardOptions.m419copyij11fho(i, z2, i5, i6, platformImeOptions);
    }

    /* renamed from: copy-ij11fho  reason: not valid java name */
    public final KeyboardOptions m419copyij11fho(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i, z, i2, i3, platformImeOptions, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyboardOptions) {
            KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
            return KeyboardCapitalization.m2274equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m2284equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m2256equalsimpl0(this.imeAction, keyboardOptions.imeAction) && C8632dsu.c(this.platformImeOptions, keyboardOptions.platformImeOptions);
        }
        return false;
    }

    public int hashCode() {
        int m2275hashCodeimpl = KeyboardCapitalization.m2275hashCodeimpl(this.capitalization);
        int hashCode = Boolean.hashCode(this.autoCorrect);
        int m2285hashCodeimpl = KeyboardType.m2285hashCodeimpl(this.keyboardType);
        int m2257hashCodeimpl = ImeAction.m2257hashCodeimpl(this.imeAction);
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return (((((((m2275hashCodeimpl * 31) + hashCode) * 31) + m2285hashCodeimpl) * 31) + m2257hashCodeimpl) * 31) + (platformImeOptions != null ? platformImeOptions.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m2276toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m2286toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m2258toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ')';
    }
}
