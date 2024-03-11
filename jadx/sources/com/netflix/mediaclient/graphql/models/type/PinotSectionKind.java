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
public final class PinotSectionKind {
    public static final e a;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ PinotSectionKind[] l;
    private static final C9033hu m;
    private final String n;
    public static final PinotSectionKind e = new PinotSectionKind("Carousel", 0, "Carousel");
    public static final PinotSectionKind c = new PinotSectionKind("CreatorHome", 1, "CreatorHome");
    public static final PinotSectionKind b = new PinotSectionKind("Gallery", 2, "Gallery");
    public static final PinotSectionKind i = new PinotSectionKind("List", 3, "List");
    public static final PinotSectionKind d = new PinotSectionKind("EntityNameList", 4, "EntityNameList");
    public static final PinotSectionKind f = new PinotSectionKind("SearchHints", 5, "SearchHints");
    public static final PinotSectionKind j = new PinotSectionKind("PrePlayRecap", 6, "PrePlayRecap");
    public static final PinotSectionKind g = new PinotSectionKind("UNKNOWN__", 7, "UNKNOWN__");

    private static final /* synthetic */ PinotSectionKind[] b() {
        return new PinotSectionKind[]{e, c, b, i, d, f, j, g};
    }

    public static InterfaceC8598drn<PinotSectionKind> e() {
        return h;
    }

    public static PinotSectionKind valueOf(String str) {
        return (PinotSectionKind) Enum.valueOf(PinotSectionKind.class, str);
    }

    public static PinotSectionKind[] values() {
        return (PinotSectionKind[]) l.clone();
    }

    public final String d() {
        return this.n;
    }

    private PinotSectionKind(String str, int i2, String str2) {
        this.n = str2;
    }

    static {
        List j2;
        PinotSectionKind[] b2 = b();
        l = b2;
        h = C8600drp.e(b2);
        a = new e(null);
        j2 = C8569dql.j("Carousel", "CreatorHome", "Gallery", "List", "EntityNameList", "SearchHints", "PrePlayRecap");
        m = new C9033hu("PinotSectionKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final PinotSectionKind c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotSectionKind.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotSectionKind) obj).d(), (Object) str)) {
                    break;
                }
            }
            PinotSectionKind pinotSectionKind = (PinotSectionKind) obj;
            return pinotSectionKind == null ? PinotSectionKind.g : pinotSectionKind;
        }
    }
}
