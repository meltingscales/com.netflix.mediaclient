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
public final class TitleGroupMemberKind {
    public static final e d;
    private static final C9033hu g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ TitleGroupMemberKind[] j;
    private final String f;
    public static final TitleGroupMemberKind i = new TitleGroupMemberKind("UNSPECIFIED", 0, "UNSPECIFIED");
    public static final TitleGroupMemberKind b = new TitleGroupMemberKind("TITLE", 1, "TITLE");
    public static final TitleGroupMemberKind a = new TitleGroupMemberKind("COLLECTION", 2, "COLLECTION");
    public static final TitleGroupMemberKind c = new TitleGroupMemberKind("GAME", 3, "GAME");
    public static final TitleGroupMemberKind e = new TitleGroupMemberKind("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<TitleGroupMemberKind> b() {
        return h;
    }

    private static final /* synthetic */ TitleGroupMemberKind[] e() {
        return new TitleGroupMemberKind[]{i, b, a, c, e};
    }

    public static TitleGroupMemberKind valueOf(String str) {
        return (TitleGroupMemberKind) Enum.valueOf(TitleGroupMemberKind.class, str);
    }

    public static TitleGroupMemberKind[] values() {
        return (TitleGroupMemberKind[]) j.clone();
    }

    public final String a() {
        return this.f;
    }

    private TitleGroupMemberKind(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        TitleGroupMemberKind[] e2 = e();
        j = e2;
        h = C8600drp.e(e2);
        d = new e(null);
        j2 = C8569dql.j("UNSPECIFIED", "TITLE", "COLLECTION", "GAME");
        g = new C9033hu("TitleGroupMemberKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu a() {
            return TitleGroupMemberKind.g;
        }

        public final TitleGroupMemberKind d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = TitleGroupMemberKind.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((TitleGroupMemberKind) obj).a(), (Object) str)) {
                    break;
                }
            }
            TitleGroupMemberKind titleGroupMemberKind = (TitleGroupMemberKind) obj;
            return titleGroupMemberKind == null ? TitleGroupMemberKind.e : titleGroupMemberKind;
        }
    }
}
