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
public final class PinotEntityKind {
    public static final b a;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ PinotEntityKind[] i;
    private static final C9033hu n;
    private final String m;
    public static final PinotEntityKind b = new PinotEntityKind("CHARACTER", 0, "CHARACTER");
    public static final PinotEntityKind d = new PinotEntityKind("GAME", 1, "GAME");
    public static final PinotEntityKind c = new PinotEntityKind("GENERIC_CONTAINER", 2, "GENERIC_CONTAINER");
    public static final PinotEntityKind e = new PinotEntityKind("GENRE", 3, "GENRE");
    public static final PinotEntityKind j = new PinotEntityKind("PERSON", 4, "PERSON");
    public static final PinotEntityKind h = new PinotEntityKind("VIDEO", 5, "VIDEO");
    public static final PinotEntityKind f = new PinotEntityKind("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ PinotEntityKind[] d() {
        return new PinotEntityKind[]{b, d, c, e, j, h, f};
    }

    public static InterfaceC8598drn<PinotEntityKind> e() {
        return g;
    }

    public static PinotEntityKind valueOf(String str) {
        return (PinotEntityKind) Enum.valueOf(PinotEntityKind.class, str);
    }

    public static PinotEntityKind[] values() {
        return (PinotEntityKind[]) i.clone();
    }

    public final String c() {
        return this.m;
    }

    private PinotEntityKind(String str, int i2, String str2) {
        this.m = str2;
    }

    static {
        List j2;
        PinotEntityKind[] d2 = d();
        i = d2;
        g = C8600drp.e(d2);
        a = new b(null);
        j2 = C8569dql.j("CHARACTER", "GAME", "GENERIC_CONTAINER", "GENRE", "PERSON", "VIDEO");
        n = new C9033hu("PinotEntityKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final PinotEntityKind e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotEntityKind.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotEntityKind) obj).c(), (Object) str)) {
                    break;
                }
            }
            PinotEntityKind pinotEntityKind = (PinotEntityKind) obj;
            return pinotEntityKind == null ? PinotEntityKind.f : pinotEntityKind;
        }
    }
}
