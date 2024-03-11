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
public final class TVUIArtworkRoundingStrategy {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final d b;
    private static final C9033hu g;
    private static final /* synthetic */ TVUIArtworkRoundingStrategy[] h;
    private final String j;
    public static final TVUIArtworkRoundingStrategy e = new TVUIArtworkRoundingStrategy("CEILING", 0, "CEILING");
    public static final TVUIArtworkRoundingStrategy d = new TVUIArtworkRoundingStrategy("FLOOR", 1, "FLOOR");
    public static final TVUIArtworkRoundingStrategy c = new TVUIArtworkRoundingStrategy("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ TVUIArtworkRoundingStrategy[] c() {
        return new TVUIArtworkRoundingStrategy[]{e, d, c};
    }

    public static InterfaceC8598drn<TVUIArtworkRoundingStrategy> e() {
        return a;
    }

    public static TVUIArtworkRoundingStrategy valueOf(String str) {
        return (TVUIArtworkRoundingStrategy) Enum.valueOf(TVUIArtworkRoundingStrategy.class, str);
    }

    public static TVUIArtworkRoundingStrategy[] values() {
        return (TVUIArtworkRoundingStrategy[]) h.clone();
    }

    public final String d() {
        return this.j;
    }

    private TVUIArtworkRoundingStrategy(String str, int i, String str2) {
        this.j = str2;
    }

    static {
        List j;
        TVUIArtworkRoundingStrategy[] c2 = c();
        h = c2;
        a = C8600drp.e(c2);
        b = new d(null);
        j = C8569dql.j("CEILING", "FLOOR");
        g = new C9033hu("TVUIArtworkRoundingStrategy", j);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final TVUIArtworkRoundingStrategy d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = TVUIArtworkRoundingStrategy.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((TVUIArtworkRoundingStrategy) obj).d(), (Object) str)) {
                    break;
                }
            }
            TVUIArtworkRoundingStrategy tVUIArtworkRoundingStrategy = (TVUIArtworkRoundingStrategy) obj;
            return tVUIArtworkRoundingStrategy == null ? TVUIArtworkRoundingStrategy.c : tVUIArtworkRoundingStrategy;
        }
    }
}
