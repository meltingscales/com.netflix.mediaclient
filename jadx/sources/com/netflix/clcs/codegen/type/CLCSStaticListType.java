package com.netflix.clcs.codegen.type;

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
/* loaded from: classes2.dex */
public final class CLCSStaticListType {
    public static final b d;
    private static final C9033hu f;
    private static final /* synthetic */ CLCSStaticListType[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final String g;
    public static final CLCSStaticListType e = new CLCSStaticListType("ORDERED", 0, "ORDERED");
    public static final CLCSStaticListType c = new CLCSStaticListType("UNORDERED", 1, "UNORDERED");
    public static final CLCSStaticListType a = new CLCSStaticListType("UNSTYLED", 2, "UNSTYLED");
    public static final CLCSStaticListType b = new CLCSStaticListType("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ CLCSStaticListType[] d() {
        return new CLCSStaticListType[]{e, c, a, b};
    }

    public static InterfaceC8598drn<CLCSStaticListType> e() {
        return i;
    }

    public static CLCSStaticListType valueOf(String str) {
        return (CLCSStaticListType) Enum.valueOf(CLCSStaticListType.class, str);
    }

    public static CLCSStaticListType[] values() {
        return (CLCSStaticListType[]) h.clone();
    }

    public final String c() {
        return this.g;
    }

    private CLCSStaticListType(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j;
        CLCSStaticListType[] d2 = d();
        h = d2;
        i = C8600drp.e(d2);
        d = new b(null);
        j = C8569dql.j("ORDERED", "UNORDERED", "UNSTYLED");
        f = new C9033hu("CLCSStaticListType", j);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu d() {
            return CLCSStaticListType.f;
        }

        public final CLCSStaticListType d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSStaticListType.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSStaticListType) obj).c(), (Object) str)) {
                    break;
                }
            }
            CLCSStaticListType cLCSStaticListType = (CLCSStaticListType) obj;
            return cLCSStaticListType == null ? CLCSStaticListType.b : cLCSStaticListType;
        }
    }
}
