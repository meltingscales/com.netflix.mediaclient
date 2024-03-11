package com.netflix.mediaclient.service.player.subtitles.text;

import android.graphics.Typeface;
import o.C8168dfL;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum c uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class FontFamilyMapping {
    public static final FontFamilyMapping a;
    public static final FontFamilyMapping b;
    public static final FontFamilyMapping c;
    public static final FontFamilyMapping d;
    public static final FontFamilyMapping e;
    public static final FontFamilyMapping f;
    public static final FontFamilyMapping g;
    public static final FontFamilyMapping h;
    public static final FontFamilyMapping i;
    public static final FontFamilyMapping j;
    public static final FontFamilyMapping k;
    public static final FontFamilyMapping l;
    public static final FontFamilyMapping m;
    public static final FontFamilyMapping n;

    /* renamed from: o  reason: collision with root package name */
    public static final FontFamilyMapping f13228o;
    public static final FontFamilyMapping r;
    private static final /* synthetic */ FontFamilyMapping[] t;
    private Typeface q;
    private String s;

    private static /* synthetic */ FontFamilyMapping[] c() {
        return new FontFamilyMapping[]{c, d, h, f, j, g, i, m, l, b, e, n, r, a, f13228o, k};
    }

    public String b() {
        return this.s;
    }

    public Typeface d() {
        return this.q;
    }

    public static FontFamilyMapping valueOf(String str) {
        return (FontFamilyMapping) Enum.valueOf(FontFamilyMapping.class, str);
    }

    public static FontFamilyMapping[] values() {
        return (FontFamilyMapping[]) t.clone();
    }

    static {
        Typeface typeface = Typeface.SANS_SERIF;
        c = new FontFamilyMapping("defaultType", 0, typeface, "default");
        Typeface typeface2 = Typeface.MONOSPACE;
        d = new FontFamilyMapping("monospaceSansSerif", 1, typeface2, "monospaceSansSerif");
        h = new FontFamilyMapping("monospaceSansSerifApi", 2, typeface2, "monospaced_sans_serif");
        f = new FontFamilyMapping("monospaceSerif", 3, typeface2, "monospaceSerif");
        j = new FontFamilyMapping("monospaceSerifApi", 4, typeface2, "monospaced_serif");
        g = new FontFamilyMapping("proportionalSansSerif", 5, typeface, "proportionalSansSerif");
        i = new FontFamilyMapping("proportionalSansSerifApi", 6, typeface, "proportional_sans_serif");
        Typeface typeface3 = Typeface.SERIF;
        m = new FontFamilyMapping("proportionalSerif", 7, typeface3, "proportionalSerif");
        l = new FontFamilyMapping("proportionalSerifApi", 8, typeface3, "proportional_serif");
        b = new FontFamilyMapping("casual", 9, typeface, "casual");
        e = new FontFamilyMapping("cursive", 10, typeface, "cursive");
        n = new FontFamilyMapping("smallCapitals", 11, typeface, "smallCapitals");
        r = new FontFamilyMapping("smallCapitalsApi", 12, typeface, "small_capitals");
        a = new FontFamilyMapping("monospace", 13, typeface2, "monospace");
        f13228o = new FontFamilyMapping("sansSerif", 14, typeface, "sansSerif");
        k = new FontFamilyMapping("serif", 15, typeface3, "serif");
        t = c();
    }

    private FontFamilyMapping(String str, int i2, Typeface typeface, String str2) {
        this.q = typeface;
        this.s = str2;
    }

    public static FontFamilyMapping c(String str) {
        FontFamilyMapping[] values;
        if (C8168dfL.g(str)) {
            return null;
        }
        for (FontFamilyMapping fontFamilyMapping : values()) {
            if (fontFamilyMapping.b().equalsIgnoreCase(str)) {
                return fontFamilyMapping;
            }
        }
        return null;
    }
}
