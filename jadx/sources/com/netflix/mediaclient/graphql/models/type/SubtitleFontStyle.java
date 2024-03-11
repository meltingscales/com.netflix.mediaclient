package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SubtitleFontStyle {
    public static final d d;
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final /* synthetic */ SubtitleFontStyle[] m;
    private static final C9033hu n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13184o;
    public static final SubtitleFontStyle c = new SubtitleFontStyle("MONOSPACED_SERIF", 0, "MONOSPACED_SERIF");
    public static final SubtitleFontStyle f = new SubtitleFontStyle("PROPORTIONAL_SERIF", 1, "PROPORTIONAL_SERIF");
    public static final SubtitleFontStyle a = new SubtitleFontStyle("MONOSPACED_SANS_SERIF", 2, "MONOSPACED_SANS_SERIF");
    public static final SubtitleFontStyle j = new SubtitleFontStyle("PROPORTIONAL_SANS_SERIF", 3, "PROPORTIONAL_SANS_SERIF");
    public static final SubtitleFontStyle b = new SubtitleFontStyle("CASUAL", 4, "CASUAL");
    public static final SubtitleFontStyle e = new SubtitleFontStyle("CURSIVE", 5, "CURSIVE");
    public static final SubtitleFontStyle h = new SubtitleFontStyle("SMALL_CAPITALS", 6, "SMALL_CAPITALS");
    public static final SubtitleFontStyle g = new SubtitleFontStyle("UNKNOWN__", 7, "UNKNOWN__");

    private static final /* synthetic */ SubtitleFontStyle[] a() {
        return new SubtitleFontStyle[]{c, f, a, j, b, e, h, g};
    }

    public static InterfaceC8598drn<SubtitleFontStyle> e() {
        return i;
    }

    public static SubtitleFontStyle valueOf(String str) {
        return (SubtitleFontStyle) Enum.valueOf(SubtitleFontStyle.class, str);
    }

    public static SubtitleFontStyle[] values() {
        return (SubtitleFontStyle[]) m.clone();
    }

    public final String b() {
        return this.f13184o;
    }

    private SubtitleFontStyle(String str, int i2, String str2) {
        this.f13184o = str2;
    }

    static {
        List j2;
        SubtitleFontStyle[] a2 = a();
        m = a2;
        i = C8600drp.e(a2);
        d = new d(null);
        j2 = C8569dql.j("MONOSPACED_SERIF", "PROPORTIONAL_SERIF", "MONOSPACED_SANS_SERIF", "PROPORTIONAL_SANS_SERIF", "CASUAL", "CURSIVE", "SMALL_CAPITALS");
        n = new C9033hu("SubtitleFontStyle", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu e() {
            return SubtitleFontStyle.n;
        }

        public final SubtitleFontStyle d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleFontStyle.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleFontStyle) obj).b(), (Object) str)) {
                    break;
                }
            }
            SubtitleFontStyle subtitleFontStyle = (SubtitleFontStyle) obj;
            return subtitleFontStyle == null ? SubtitleFontStyle.g : subtitleFontStyle;
        }
    }
}
