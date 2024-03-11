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
public final class PinotUnifiedEntityKind {
    public static final a d;
    private static final C9033hu f;
    private static final /* synthetic */ PinotUnifiedEntityKind[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final String n;
    public static final PinotUnifiedEntityKind a = new PinotUnifiedEntityKind("Character", 0, "Character");
    public static final PinotUnifiedEntityKind c = new PinotUnifiedEntityKind("Collection", 1, "Collection");
    public static final PinotUnifiedEntityKind b = new PinotUnifiedEntityKind("Game", 2, "Game");
    public static final PinotUnifiedEntityKind e = new PinotUnifiedEntityKind("Person", 3, "Person");
    public static final PinotUnifiedEntityKind g = new PinotUnifiedEntityKind("Video", 4, "Video");
    public static final PinotUnifiedEntityKind j = new PinotUnifiedEntityKind("UNKNOWN__", 5, "UNKNOWN__");

    public static InterfaceC8598drn<PinotUnifiedEntityKind> a() {
        return i;
    }

    private static final /* synthetic */ PinotUnifiedEntityKind[] d() {
        return new PinotUnifiedEntityKind[]{a, c, b, e, g, j};
    }

    public static PinotUnifiedEntityKind valueOf(String str) {
        return (PinotUnifiedEntityKind) Enum.valueOf(PinotUnifiedEntityKind.class, str);
    }

    public static PinotUnifiedEntityKind[] values() {
        return (PinotUnifiedEntityKind[]) h.clone();
    }

    public final String c() {
        return this.n;
    }

    private PinotUnifiedEntityKind(String str, int i2, String str2) {
        this.n = str2;
    }

    static {
        List j2;
        PinotUnifiedEntityKind[] d2 = d();
        h = d2;
        i = C8600drp.e(d2);
        d = new a(null);
        j2 = C8569dql.j("Character", "Collection", "Game", "Person", "Video");
        f = new C9033hu("PinotUnifiedEntityKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final PinotUnifiedEntityKind b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = PinotUnifiedEntityKind.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((PinotUnifiedEntityKind) obj).c(), (Object) str)) {
                    break;
                }
            }
            PinotUnifiedEntityKind pinotUnifiedEntityKind = (PinotUnifiedEntityKind) obj;
            return pinotUnifiedEntityKind == null ? PinotUnifiedEntityKind.j : pinotUnifiedEntityKind;
        }
    }
}
