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
public final class PinotSearchArtworkFallbackStrategy {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final b b;
    private static final C9033hu g;
    private static final /* synthetic */ PinotSearchArtworkFallbackStrategy[] i;
    private final String h;
    public static final PinotSearchArtworkFallbackStrategy c = new PinotSearchArtworkFallbackStrategy("STILL", 0, "STILL");
    public static final PinotSearchArtworkFallbackStrategy e = new PinotSearchArtworkFallbackStrategy("STORY_ART", 1, "STORY_ART");
    public static final PinotSearchArtworkFallbackStrategy d = new PinotSearchArtworkFallbackStrategy("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<PinotSearchArtworkFallbackStrategy> a() {
        return a;
    }

    private static final /* synthetic */ PinotSearchArtworkFallbackStrategy[] d() {
        return new PinotSearchArtworkFallbackStrategy[]{c, e, d};
    }

    public static PinotSearchArtworkFallbackStrategy valueOf(String str) {
        return (PinotSearchArtworkFallbackStrategy) Enum.valueOf(PinotSearchArtworkFallbackStrategy.class, str);
    }

    public static PinotSearchArtworkFallbackStrategy[] values() {
        return (PinotSearchArtworkFallbackStrategy[]) i.clone();
    }

    public final String e() {
        return this.h;
    }

    private PinotSearchArtworkFallbackStrategy(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j;
        PinotSearchArtworkFallbackStrategy[] d2 = d();
        i = d2;
        a = C8600drp.e(d2);
        b = new b(null);
        j = C8569dql.j("STILL", "STORY_ART");
        g = new C9033hu("PinotSearchArtworkFallbackStrategy", j);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final PinotSearchArtworkFallbackStrategy a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotSearchArtworkFallbackStrategy.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotSearchArtworkFallbackStrategy) obj).e(), (Object) str)) {
                    break;
                }
            }
            PinotSearchArtworkFallbackStrategy pinotSearchArtworkFallbackStrategy = (PinotSearchArtworkFallbackStrategy) obj;
            return pinotSearchArtworkFallbackStrategy == null ? PinotSearchArtworkFallbackStrategy.d : pinotSearchArtworkFallbackStrategy;
        }
    }
}
