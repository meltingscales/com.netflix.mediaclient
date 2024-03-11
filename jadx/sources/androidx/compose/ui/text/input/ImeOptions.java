package androidx.compose.ui.text.input;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class ImeOptions {
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, 63, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, C8627dsp c8627dsp) {
        this(z, i, z2, i2, i3, platformImeOptions);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m2268getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m2269getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m2270getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, C8627dsp c8627dsp) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? KeyboardCapitalization.Companion.m2279getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? KeyboardType.Companion.m2295getTextPjHm6EE() : i2, (i4 & 16) != 0 ? ImeAction.Companion.m2260getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, null);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImeOptions) {
            ImeOptions imeOptions = (ImeOptions) obj;
            return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m2274equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m2284equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m2256equalsimpl0(this.imeAction, imeOptions.imeAction) && C8632dsu.c(this.platformImeOptions, imeOptions.platformImeOptions);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.singleLine);
        int m2275hashCodeimpl = KeyboardCapitalization.m2275hashCodeimpl(this.capitalization);
        int hashCode2 = Boolean.hashCode(this.autoCorrect);
        int m2285hashCodeimpl = KeyboardType.m2285hashCodeimpl(this.keyboardType);
        int m2257hashCodeimpl = ImeAction.m2257hashCodeimpl(this.imeAction);
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return (((((((((hashCode * 31) + m2275hashCodeimpl) * 31) + hashCode2) * 31) + m2285hashCodeimpl) * 31) + m2257hashCodeimpl) * 31) + (platformImeOptions != null ? platformImeOptions.hashCode() : 0);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m2276toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m2286toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m2258toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ')';
    }
}
