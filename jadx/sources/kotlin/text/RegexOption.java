package kotlin.text;

import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class RegexOption {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ RegexOption[] h;
    private final int g;
    private final int k;
    public static final RegexOption e = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final RegexOption i = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
    public static final RegexOption d = new RegexOption("LITERAL", 2, 16, 0, 2, null);
    public static final RegexOption j = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
    public static final RegexOption c = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
    public static final RegexOption a = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final RegexOption b = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ RegexOption[] d() {
        return new RegexOption[]{e, i, d, j, c, a, b};
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) h.clone();
    }

    public int c() {
        return this.k;
    }

    private RegexOption(String str, int i2, int i3, int i4) {
        this.k = i3;
        this.g = i4;
    }

    /* synthetic */ RegexOption(String str, int i2, int i3, int i4, int i5, C8627dsp c8627dsp) {
        this(str, i2, i3, (i5 & 2) != 0 ? i3 : i4);
    }

    static {
        RegexOption[] d2 = d();
        h = d2;
        f = C8600drp.e(d2);
    }
}
