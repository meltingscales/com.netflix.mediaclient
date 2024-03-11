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
public final class ArtworkFallbackStrategy {
    public static final d a;
    private static final /* synthetic */ ArtworkFallbackStrategy[] g;
    private static final C9033hu h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String f;
    public static final ArtworkFallbackStrategy e = new ArtworkFallbackStrategy("STILL", 0, "STILL");
    public static final ArtworkFallbackStrategy c = new ArtworkFallbackStrategy("STORY_ART", 1, "STORY_ART");
    public static final ArtworkFallbackStrategy b = new ArtworkFallbackStrategy("VERTICAL_STORY_ART", 2, "VERTICAL_STORY_ART");
    public static final ArtworkFallbackStrategy d = new ArtworkFallbackStrategy("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<ArtworkFallbackStrategy> b() {
        return j;
    }

    private static final /* synthetic */ ArtworkFallbackStrategy[] e() {
        return new ArtworkFallbackStrategy[]{e, c, b, d};
    }

    public static ArtworkFallbackStrategy valueOf(String str) {
        return (ArtworkFallbackStrategy) Enum.valueOf(ArtworkFallbackStrategy.class, str);
    }

    public static ArtworkFallbackStrategy[] values() {
        return (ArtworkFallbackStrategy[]) g.clone();
    }

    public final String c() {
        return this.f;
    }

    private ArtworkFallbackStrategy(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        ArtworkFallbackStrategy[] e2 = e();
        g = e2;
        j = C8600drp.e(e2);
        a = new d(null);
        j2 = C8569dql.j("STILL", "STORY_ART", "VERTICAL_STORY_ART");
        h = new C9033hu("ArtworkFallbackStrategy", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArtworkFallbackStrategy a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkFallbackStrategy.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkFallbackStrategy) obj).c(), (Object) str)) {
                    break;
                }
            }
            ArtworkFallbackStrategy artworkFallbackStrategy = (ArtworkFallbackStrategy) obj;
            return artworkFallbackStrategy == null ? ArtworkFallbackStrategy.d : artworkFallbackStrategy;
        }
    }
}
