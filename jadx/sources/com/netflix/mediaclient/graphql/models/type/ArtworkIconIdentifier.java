package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8566dqi;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ArtworkIconIdentifier {
    private static final /* synthetic */ ArtworkIconIdentifier[] b;
    public static final a c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private static final C9033hu h;
    private final String i;
    public static final ArtworkIconIdentifier a = new ArtworkIconIdentifier("NEW_EPISODES", 0, "NEW_EPISODES");
    public static final ArtworkIconIdentifier e = new ArtworkIconIdentifier("UNKNOWN__", 1, "UNKNOWN__");

    private static final /* synthetic */ ArtworkIconIdentifier[] d() {
        return new ArtworkIconIdentifier[]{a, e};
    }

    public static InterfaceC8598drn<ArtworkIconIdentifier> e() {
        return d;
    }

    public static ArtworkIconIdentifier valueOf(String str) {
        return (ArtworkIconIdentifier) Enum.valueOf(ArtworkIconIdentifier.class, str);
    }

    public static ArtworkIconIdentifier[] values() {
        return (ArtworkIconIdentifier[]) b.clone();
    }

    public final String b() {
        return this.i;
    }

    private ArtworkIconIdentifier(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List e2;
        ArtworkIconIdentifier[] d2 = d();
        b = d2;
        d = C8600drp.e(d2);
        c = new a(null);
        e2 = C8566dqi.e("NEW_EPISODES");
        h = new C9033hu("ArtworkIconIdentifier", e2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final ArtworkIconIdentifier b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkIconIdentifier.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkIconIdentifier) obj).b(), (Object) str)) {
                    break;
                }
            }
            ArtworkIconIdentifier artworkIconIdentifier = (ArtworkIconIdentifier) obj;
            return artworkIconIdentifier == null ? ArtworkIconIdentifier.e : artworkIconIdentifier;
        }
    }
}
