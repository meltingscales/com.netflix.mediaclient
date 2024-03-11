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
public final class ArtworkGenreBranding {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final d c;
    private static final /* synthetic */ ArtworkGenreBranding[] h;
    private static final C9033hu j;
    private final String f;
    public static final ArtworkGenreBranding b = new ArtworkGenreBranding("N_FILM", 0, "N_FILM");
    public static final ArtworkGenreBranding e = new ArtworkGenreBranding("N_GAMES", 1, "N_GAMES");
    public static final ArtworkGenreBranding d = new ArtworkGenreBranding("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<ArtworkGenreBranding> b() {
        return a;
    }

    private static final /* synthetic */ ArtworkGenreBranding[] e() {
        return new ArtworkGenreBranding[]{b, e, d};
    }

    public static ArtworkGenreBranding valueOf(String str) {
        return (ArtworkGenreBranding) Enum.valueOf(ArtworkGenreBranding.class, str);
    }

    public static ArtworkGenreBranding[] values() {
        return (ArtworkGenreBranding[]) h.clone();
    }

    public final String d() {
        return this.f;
    }

    private ArtworkGenreBranding(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        ArtworkGenreBranding[] e2 = e();
        h = e2;
        a = C8600drp.e(e2);
        c = new d(null);
        j2 = C8569dql.j("N_FILM", "N_GAMES");
        j = new C9033hu("ArtworkGenreBranding", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArtworkGenreBranding c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkGenreBranding.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkGenreBranding) obj).d(), (Object) str)) {
                    break;
                }
            }
            ArtworkGenreBranding artworkGenreBranding = (ArtworkGenreBranding) obj;
            return artworkGenreBranding == null ? ArtworkGenreBranding.d : artworkGenreBranding;
        }
    }
}
