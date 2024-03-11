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
public final class ArtworkFormat {
    public static final d a;
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ ArtworkFormat[] g;
    private static final C9033hu n;
    private final String l;
    public static final ArtworkFormat c = new ArtworkFormat("JPG", 0, "JPG");
    public static final ArtworkFormat b = new ArtworkFormat("PNG", 1, "PNG");
    public static final ArtworkFormat j = new ArtworkFormat("WEBP", 2, "WEBP");
    public static final ArtworkFormat i = new ArtworkFormat("SMV1", 3, "SMV1");
    public static final ArtworkFormat d = new ArtworkFormat("AVIF", 4, "AVIF");
    public static final ArtworkFormat e = new ArtworkFormat("ASTC", 5, "ASTC");
    public static final ArtworkFormat h = new ArtworkFormat("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ ArtworkFormat[] c() {
        return new ArtworkFormat[]{c, b, j, i, d, e, h};
    }

    public static InterfaceC8598drn<ArtworkFormat> d() {
        return f;
    }

    public static ArtworkFormat valueOf(String str) {
        return (ArtworkFormat) Enum.valueOf(ArtworkFormat.class, str);
    }

    public static ArtworkFormat[] values() {
        return (ArtworkFormat[]) g.clone();
    }

    public final String b() {
        return this.l;
    }

    private ArtworkFormat(String str, int i2, String str2) {
        this.l = str2;
    }

    static {
        List j2;
        ArtworkFormat[] c2 = c();
        g = c2;
        f = C8600drp.e(c2);
        a = new d(null);
        j2 = C8569dql.j("JPG", "PNG", "WEBP", "SMV1", "AVIF", "ASTC");
        n = new C9033hu("ArtworkFormat", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final ArtworkFormat c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = ArtworkFormat.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((ArtworkFormat) obj).b(), (Object) str)) {
                    break;
                }
            }
            ArtworkFormat artworkFormat = (ArtworkFormat) obj;
            return artworkFormat == null ? ArtworkFormat.h : artworkFormat;
        }
    }
}
