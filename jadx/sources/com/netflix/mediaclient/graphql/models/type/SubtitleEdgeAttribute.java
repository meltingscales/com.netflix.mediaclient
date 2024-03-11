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
public final class SubtitleEdgeAttribute {
    public static final b a;
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ SubtitleEdgeAttribute[] g;
    private static final C9033hu i;
    private final String l;
    public static final SubtitleEdgeAttribute e = new SubtitleEdgeAttribute("NONE", 0, "NONE");
    public static final SubtitleEdgeAttribute b = new SubtitleEdgeAttribute("RAISED", 1, "RAISED");
    public static final SubtitleEdgeAttribute d = new SubtitleEdgeAttribute("DEPRESSED", 2, "DEPRESSED");
    public static final SubtitleEdgeAttribute j = new SubtitleEdgeAttribute("UNIFORM", 3, "UNIFORM");
    public static final SubtitleEdgeAttribute c = new SubtitleEdgeAttribute("DROP_SHADOW", 4, "DROP_SHADOW");
    public static final SubtitleEdgeAttribute h = new SubtitleEdgeAttribute("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ SubtitleEdgeAttribute[] b() {
        return new SubtitleEdgeAttribute[]{e, b, d, j, c, h};
    }

    public static InterfaceC8598drn<SubtitleEdgeAttribute> d() {
        return f;
    }

    public static SubtitleEdgeAttribute valueOf(String str) {
        return (SubtitleEdgeAttribute) Enum.valueOf(SubtitleEdgeAttribute.class, str);
    }

    public static SubtitleEdgeAttribute[] values() {
        return (SubtitleEdgeAttribute[]) g.clone();
    }

    public final String c() {
        return this.l;
    }

    private SubtitleEdgeAttribute(String str, int i2, String str2) {
        this.l = str2;
    }

    static {
        List j2;
        SubtitleEdgeAttribute[] b2 = b();
        g = b2;
        f = C8600drp.e(b2);
        a = new b(null);
        j2 = C8569dql.j("NONE", "RAISED", "DEPRESSED", "UNIFORM", "DROP_SHADOW");
        i = new C9033hu("SubtitleEdgeAttribute", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu e() {
            return SubtitleEdgeAttribute.i;
        }

        public final SubtitleEdgeAttribute e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleEdgeAttribute.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleEdgeAttribute) obj).c(), (Object) str)) {
                    break;
                }
            }
            SubtitleEdgeAttribute subtitleEdgeAttribute = (SubtitleEdgeAttribute) obj;
            return subtitleEdgeAttribute == null ? SubtitleEdgeAttribute.h : subtitleEdgeAttribute;
        }
    }
}
