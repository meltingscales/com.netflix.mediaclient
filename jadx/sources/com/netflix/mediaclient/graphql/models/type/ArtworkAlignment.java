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
public final class ArtworkAlignment {
    public static final ArtworkAlignment a = new ArtworkAlignment("CENTER", 0, "CENTER");
    public static final ArtworkAlignment b = new ArtworkAlignment("RIGHT", 1, "RIGHT");
    public static final ArtworkAlignment c = new ArtworkAlignment("LEFT", 2, "LEFT");
    public static final ArtworkAlignment d = new ArtworkAlignment("UNKNOWN__", 3, "UNKNOWN__");
    public static final b e;
    private static final C9033hu f;
    private static final /* synthetic */ ArtworkAlignment[] g;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String i;

    private static final /* synthetic */ ArtworkAlignment[] a() {
        return new ArtworkAlignment[]{a, b, c, d};
    }

    public static InterfaceC8598drn<ArtworkAlignment> e() {
        return j;
    }

    public static ArtworkAlignment valueOf(String str) {
        return (ArtworkAlignment) Enum.valueOf(ArtworkAlignment.class, str);
    }

    public static ArtworkAlignment[] values() {
        return (ArtworkAlignment[]) g.clone();
    }

    public final String c() {
        return this.i;
    }

    private ArtworkAlignment(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j2;
        ArtworkAlignment[] a2 = a();
        g = a2;
        j = C8600drp.e(a2);
        e = new b(null);
        j2 = C8569dql.j("CENTER", "RIGHT", "LEFT");
        f = new C9033hu("ArtworkAlignment", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final ArtworkAlignment c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkAlignment.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkAlignment) obj).c(), (Object) str)) {
                    break;
                }
            }
            ArtworkAlignment artworkAlignment = (ArtworkAlignment) obj;
            return artworkAlignment == null ? ArtworkAlignment.d : artworkAlignment;
        }
    }
}
