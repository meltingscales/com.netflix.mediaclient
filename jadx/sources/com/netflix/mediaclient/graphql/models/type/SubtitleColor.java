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
public final class SubtitleColor {
    public static final d d;
    private static final /* synthetic */ InterfaceC8598drn k;
    private static final /* synthetic */ SubtitleColor[] m;

    /* renamed from: o  reason: collision with root package name */
    private static final C9033hu f13183o;
    private final String l;
    public static final SubtitleColor f = new SubtitleColor("WHITE", 0, "WHITE");
    public static final SubtitleColor b = new SubtitleColor("BLACK", 1, "BLACK");
    public static final SubtitleColor h = new SubtitleColor("RED", 2, "RED");
    public static final SubtitleColor a = new SubtitleColor("GREEN", 3, "GREEN");
    public static final SubtitleColor c = new SubtitleColor("BLUE", 4, "BLUE");
    public static final SubtitleColor j = new SubtitleColor("YELLOW", 5, "YELLOW");
    public static final SubtitleColor g = new SubtitleColor("MAGENTA", 6, "MAGENTA");
    public static final SubtitleColor e = new SubtitleColor("CYAN", 7, "CYAN");
    public static final SubtitleColor i = new SubtitleColor("UNKNOWN__", 8, "UNKNOWN__");

    public static InterfaceC8598drn<SubtitleColor> a() {
        return k;
    }

    private static final /* synthetic */ SubtitleColor[] b() {
        return new SubtitleColor[]{f, b, h, a, c, j, g, e, i};
    }

    public static SubtitleColor valueOf(String str) {
        return (SubtitleColor) Enum.valueOf(SubtitleColor.class, str);
    }

    public static SubtitleColor[] values() {
        return (SubtitleColor[]) m.clone();
    }

    public final String e() {
        return this.l;
    }

    private SubtitleColor(String str, int i2, String str2) {
        this.l = str2;
    }

    static {
        List j2;
        SubtitleColor[] b2 = b();
        m = b2;
        k = C8600drp.e(b2);
        d = new d(null);
        j2 = C8569dql.j("WHITE", "BLACK", "RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "CYAN");
        f13183o = new C9033hu("SubtitleColor", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu e() {
            return SubtitleColor.f13183o;
        }

        public final SubtitleColor d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleColor.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleColor) obj).e(), (Object) str)) {
                    break;
                }
            }
            SubtitleColor subtitleColor = (SubtitleColor) obj;
            return subtitleColor == null ? SubtitleColor.i : subtitleColor;
        }
    }
}
