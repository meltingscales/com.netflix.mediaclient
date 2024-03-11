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
public final class CLCSTextAlignment {
    public static final b e;
    private static final C9033hu h;
    private static final /* synthetic */ CLCSTextAlignment[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    public static final CLCSTextAlignment a = new CLCSTextAlignment("START", 0, "START");
    public static final CLCSTextAlignment c = new CLCSTextAlignment("CENTER", 1, "CENTER");
    public static final CLCSTextAlignment d = new CLCSTextAlignment("END", 2, "END");
    public static final CLCSTextAlignment b = new CLCSTextAlignment("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSTextAlignment> d() {
        return j;
    }

    private static final /* synthetic */ CLCSTextAlignment[] e() {
        return new CLCSTextAlignment[]{a, c, d, b};
    }

    public static CLCSTextAlignment valueOf(String str) {
        return (CLCSTextAlignment) Enum.valueOf(CLCSTextAlignment.class, str);
    }

    public static CLCSTextAlignment[] values() {
        return (CLCSTextAlignment[]) i.clone();
    }

    public final String c() {
        return this.g;
    }

    private CLCSTextAlignment(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        CLCSTextAlignment[] e2 = e();
        i = e2;
        j = C8600drp.e(e2);
        e = new b(null);
        j2 = C8569dql.j("START", "CENTER", "END");
        h = new C9033hu("CLCSTextAlignment", j2);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu a() {
            return CLCSTextAlignment.h;
        }

        public final CLCSTextAlignment a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSTextAlignment.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSTextAlignment) obj).c(), (Object) str)) {
                    break;
                }
            }
            CLCSTextAlignment cLCSTextAlignment = (CLCSTextAlignment) obj;
            return cLCSTextAlignment == null ? CLCSTextAlignment.b : cLCSTextAlignment;
        }
    }
}
