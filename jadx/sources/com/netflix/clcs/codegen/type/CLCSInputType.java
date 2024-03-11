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
public final class CLCSInputType {
    public static final a d;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ CLCSInputType[] i;
    private static final C9033hu j;
    private final String f;
    public static final CLCSInputType c = new CLCSInputType("TEXT", 0, "TEXT");
    public static final CLCSInputType a = new CLCSInputType("EMAIL", 1, "EMAIL");
    public static final CLCSInputType b = new CLCSInputType("PASSWORD", 2, "PASSWORD");
    public static final CLCSInputType e = new CLCSInputType("TELEPHONE", 3, "TELEPHONE");
    public static final CLCSInputType g = new CLCSInputType("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSInputType> b() {
        return h;
    }

    private static final /* synthetic */ CLCSInputType[] d() {
        return new CLCSInputType[]{c, a, b, e, g};
    }

    public static CLCSInputType valueOf(String str) {
        return (CLCSInputType) Enum.valueOf(CLCSInputType.class, str);
    }

    public static CLCSInputType[] values() {
        return (CLCSInputType[]) i.clone();
    }

    public final String c() {
        return this.f;
    }

    private CLCSInputType(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        CLCSInputType[] d2 = d();
        i = d2;
        h = C8600drp.e(d2);
        d = new a(null);
        j2 = C8569dql.j("TEXT", "EMAIL", "PASSWORD", "TELEPHONE");
        j = new C9033hu("CLCSInputType", j2);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu a() {
            return CLCSInputType.j;
        }

        public final CLCSInputType a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSInputType.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSInputType) obj).c(), (Object) str)) {
                    break;
                }
            }
            CLCSInputType cLCSInputType = (CLCSInputType) obj;
            return cLCSInputType == null ? CLCSInputType.g : cLCSInputType;
        }
    }
}
