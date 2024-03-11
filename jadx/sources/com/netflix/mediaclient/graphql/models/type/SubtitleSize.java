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
public final class SubtitleSize {
    public static final c e;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu h;
    private static final /* synthetic */ SubtitleSize[] i;
    private final String f;
    public static final SubtitleSize c = new SubtitleSize("SMALL", 0, "SMALL");
    public static final SubtitleSize d = new SubtitleSize("MEDIUM", 1, "MEDIUM");
    public static final SubtitleSize a = new SubtitleSize("LARGE", 2, "LARGE");
    public static final SubtitleSize b = new SubtitleSize("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<SubtitleSize> a() {
        return g;
    }

    private static final /* synthetic */ SubtitleSize[] c() {
        return new SubtitleSize[]{c, d, a, b};
    }

    public static SubtitleSize valueOf(String str) {
        return (SubtitleSize) Enum.valueOf(SubtitleSize.class, str);
    }

    public static SubtitleSize[] values() {
        return (SubtitleSize[]) i.clone();
    }

    public final String b() {
        return this.f;
    }

    private SubtitleSize(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j;
        SubtitleSize[] c2 = c();
        i = c2;
        g = C8600drp.e(c2);
        e = new c(null);
        j = C8569dql.j("SMALL", "MEDIUM", "LARGE");
        h = new C9033hu("SubtitleSize", j);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu d() {
            return SubtitleSize.h;
        }

        public final SubtitleSize c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleSize.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleSize) obj).b(), (Object) str)) {
                    break;
                }
            }
            SubtitleSize subtitleSize = (SubtitleSize) obj;
            return subtitleSize == null ? SubtitleSize.b : subtitleSize;
        }
    }
}
