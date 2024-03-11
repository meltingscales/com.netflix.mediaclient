package androidx.compose.ui.text.input;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PlatformImeOptions {
    private final String privateImeOptions;

    public PlatformImeOptions() {
        this(null, 1, null);
    }

    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public PlatformImeOptions(String str) {
        this.privateImeOptions = str;
    }

    public /* synthetic */ PlatformImeOptions(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlatformImeOptions) && C8632dsu.c((Object) this.privateImeOptions, (Object) ((PlatformImeOptions) obj).privateImeOptions);
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.privateImeOptions + ')';
    }
}
