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
public final class SubtitleOpacity {
    public static final c a;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ SubtitleOpacity[] h;
    private static final C9033hu i;
    private final String f;
    public static final SubtitleOpacity c = new SubtitleOpacity("OPAQUE", 0, "OPAQUE");
    public static final SubtitleOpacity d = new SubtitleOpacity("SEMI_TRANSPARENT", 1, "SEMI_TRANSPARENT");
    public static final SubtitleOpacity e = new SubtitleOpacity("NONE", 2, "NONE");
    public static final SubtitleOpacity b = new SubtitleOpacity("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<SubtitleOpacity> a() {
        return g;
    }

    private static final /* synthetic */ SubtitleOpacity[] b() {
        return new SubtitleOpacity[]{c, d, e, b};
    }

    public static SubtitleOpacity valueOf(String str) {
        return (SubtitleOpacity) Enum.valueOf(SubtitleOpacity.class, str);
    }

    public static SubtitleOpacity[] values() {
        return (SubtitleOpacity[]) h.clone();
    }

    public final String c() {
        return this.f;
    }

    private SubtitleOpacity(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j;
        SubtitleOpacity[] b2 = b();
        h = b2;
        g = C8600drp.e(b2);
        a = new c(null);
        j = C8569dql.j("OPAQUE", "SEMI_TRANSPARENT", "NONE");
        i = new C9033hu("SubtitleOpacity", j);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu b() {
            return SubtitleOpacity.i;
        }

        public final SubtitleOpacity a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleOpacity.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleOpacity) obj).c(), (Object) str)) {
                    break;
                }
            }
            SubtitleOpacity subtitleOpacity = (SubtitleOpacity) obj;
            return subtitleOpacity == null ? SubtitleOpacity.b : subtitleOpacity;
        }
    }
}
