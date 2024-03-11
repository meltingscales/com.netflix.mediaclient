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
public final class PinotSearchArtworkType {
    public static final b d;
    private static final C9033hu f;
    private static final /* synthetic */ PinotSearchArtworkType[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String h;
    public static final PinotSearchArtworkType a = new PinotSearchArtworkType("boxshot", 0, "boxshot");
    public static final PinotSearchArtworkType b = new PinotSearchArtworkType("sdp", 1, "sdp");
    public static final PinotSearchArtworkType c = new PinotSearchArtworkType("CREATOR_CARD_LOGO", 2, "CREATOR_CARD_LOGO");
    public static final PinotSearchArtworkType e = new PinotSearchArtworkType("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<PinotSearchArtworkType> a() {
        return j;
    }

    private static final /* synthetic */ PinotSearchArtworkType[] c() {
        return new PinotSearchArtworkType[]{a, b, c, e};
    }

    public static PinotSearchArtworkType valueOf(String str) {
        return (PinotSearchArtworkType) Enum.valueOf(PinotSearchArtworkType.class, str);
    }

    public static PinotSearchArtworkType[] values() {
        return (PinotSearchArtworkType[]) i.clone();
    }

    public final String e() {
        return this.h;
    }

    private PinotSearchArtworkType(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        PinotSearchArtworkType[] c2 = c();
        i = c2;
        j = C8600drp.e(c2);
        d = new b(null);
        j2 = C8569dql.j("boxshot", "sdp", "CREATOR_CARD_LOGO");
        f = new C9033hu("PinotSearchArtworkType", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final PinotSearchArtworkType e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotSearchArtworkType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotSearchArtworkType) obj).e(), (Object) str)) {
                    break;
                }
            }
            PinotSearchArtworkType pinotSearchArtworkType = (PinotSearchArtworkType) obj;
            return pinotSearchArtworkType == null ? PinotSearchArtworkType.e : pinotSearchArtworkType;
        }
    }
}
