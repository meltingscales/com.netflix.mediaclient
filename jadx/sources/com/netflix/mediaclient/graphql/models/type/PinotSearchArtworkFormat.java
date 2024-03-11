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
public final class PinotSearchArtworkFormat {
    public static final a a;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ PinotSearchArtworkFormat[] i;
    private static final C9033hu j;
    private final String h;
    public static final PinotSearchArtworkFormat d = new PinotSearchArtworkFormat("astc", 0, "astc");
    public static final PinotSearchArtworkFormat b = new PinotSearchArtworkFormat("jpg", 1, "jpg");
    public static final PinotSearchArtworkFormat c = new PinotSearchArtworkFormat("png", 2, "png");
    public static final PinotSearchArtworkFormat f = new PinotSearchArtworkFormat("webp", 3, "webp");
    public static final PinotSearchArtworkFormat e = new PinotSearchArtworkFormat("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ PinotSearchArtworkFormat[] b() {
        return new PinotSearchArtworkFormat[]{d, b, c, f, e};
    }

    public static InterfaceC8598drn<PinotSearchArtworkFormat> c() {
        return g;
    }

    public static PinotSearchArtworkFormat valueOf(String str) {
        return (PinotSearchArtworkFormat) Enum.valueOf(PinotSearchArtworkFormat.class, str);
    }

    public static PinotSearchArtworkFormat[] values() {
        return (PinotSearchArtworkFormat[]) i.clone();
    }

    public final String e() {
        return this.h;
    }

    private PinotSearchArtworkFormat(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        PinotSearchArtworkFormat[] b2 = b();
        i = b2;
        g = C8600drp.e(b2);
        a = new a(null);
        j2 = C8569dql.j("astc", "jpg", "png", "webp");
        j = new C9033hu("PinotSearchArtworkFormat", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final PinotSearchArtworkFormat b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotSearchArtworkFormat.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotSearchArtworkFormat) obj).e(), (Object) str)) {
                    break;
                }
            }
            PinotSearchArtworkFormat pinotSearchArtworkFormat = (PinotSearchArtworkFormat) obj;
            return pinotSearchArtworkFormat == null ? PinotSearchArtworkFormat.e : pinotSearchArtworkFormat;
        }
    }
}
