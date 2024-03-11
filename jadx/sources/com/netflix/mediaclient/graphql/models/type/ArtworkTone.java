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
public final class ArtworkTone {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final d d;
    private static final C9033hu h;
    private static final /* synthetic */ ArtworkTone[] i;
    private final String j;
    public static final ArtworkTone e = new ArtworkTone("LIGHT", 0, "LIGHT");
    public static final ArtworkTone b = new ArtworkTone("DARK", 1, "DARK");
    public static final ArtworkTone c = new ArtworkTone("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ ArtworkTone[] d() {
        return new ArtworkTone[]{e, b, c};
    }

    public static InterfaceC8598drn<ArtworkTone> e() {
        return a;
    }

    public static ArtworkTone valueOf(String str) {
        return (ArtworkTone) Enum.valueOf(ArtworkTone.class, str);
    }

    public static ArtworkTone[] values() {
        return (ArtworkTone[]) i.clone();
    }

    public final String a() {
        return this.j;
    }

    private ArtworkTone(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        List j;
        ArtworkTone[] d2 = d();
        i = d2;
        a = C8600drp.e(d2);
        d = new d(null);
        j = C8569dql.j("LIGHT", "DARK");
        h = new C9033hu("ArtworkTone", j);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArtworkTone c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkTone.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkTone) obj).a(), (Object) str)) {
                    break;
                }
            }
            ArtworkTone artworkTone = (ArtworkTone) obj;
            return artworkTone == null ? ArtworkTone.c : artworkTone;
        }
    }
}
