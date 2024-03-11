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
public final class CLCSButtonType {
    public static final e c;
    private static final /* synthetic */ CLCSButtonType[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final C9033hu i;

    /* renamed from: o  reason: collision with root package name */
    private final String f13127o;
    public static final CLCSButtonType e = new CLCSButtonType("PRIMARY", 0, "PRIMARY");
    public static final CLCSButtonType b = new CLCSButtonType("SECONDARY", 1, "SECONDARY");
    public static final CLCSButtonType f = new CLCSButtonType("TERTIARY", 2, "TERTIARY");
    public static final CLCSButtonType d = new CLCSButtonType("SUPPLEMENTAL", 3, "SUPPLEMENTAL");
    public static final CLCSButtonType a = new CLCSButtonType("BRAND", 4, "BRAND");
    public static final CLCSButtonType j = new CLCSButtonType("UNKNOWN__", 5, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSButtonType> a() {
        return h;
    }

    private static final /* synthetic */ CLCSButtonType[] e() {
        return new CLCSButtonType[]{e, b, f, d, a, j};
    }

    public static CLCSButtonType valueOf(String str) {
        return (CLCSButtonType) Enum.valueOf(CLCSButtonType.class, str);
    }

    public static CLCSButtonType[] values() {
        return (CLCSButtonType[]) g.clone();
    }

    public final String b() {
        return this.f13127o;
    }

    private CLCSButtonType(String str, int i2, String str2) {
        this.f13127o = str2;
    }

    static {
        List j2;
        CLCSButtonType[] e2 = e();
        g = e2;
        h = C8600drp.e(e2);
        c = new e(null);
        j2 = C8569dql.j("PRIMARY", "SECONDARY", "TERTIARY", "SUPPLEMENTAL", "BRAND");
        i = new C9033hu("CLCSButtonType", j2);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu a() {
            return CLCSButtonType.i;
        }

        public final CLCSButtonType d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSButtonType.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSButtonType) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSButtonType cLCSButtonType = (CLCSButtonType) obj;
            return cLCSButtonType == null ? CLCSButtonType.j : cLCSButtonType;
        }
    }
}
