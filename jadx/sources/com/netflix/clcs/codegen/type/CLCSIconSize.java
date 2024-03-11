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
public final class CLCSIconSize {
    public static final b c;
    private static final /* synthetic */ CLCSIconSize[] f;
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final C9033hu j;
    private final String h;
    public static final CLCSIconSize b = new CLCSIconSize("SMALL", 0, "SMALL");
    public static final CLCSIconSize a = new CLCSIconSize("STANDARD", 1, "STANDARD");
    public static final CLCSIconSize e = new CLCSIconSize("LARGE", 2, "LARGE");
    public static final CLCSIconSize d = new CLCSIconSize("JUMBO", 3, "JUMBO");
    public static final CLCSIconSize g = new CLCSIconSize("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSIconSize> a() {
        return i;
    }

    private static final /* synthetic */ CLCSIconSize[] e() {
        return new CLCSIconSize[]{b, a, e, d, g};
    }

    public static CLCSIconSize valueOf(String str) {
        return (CLCSIconSize) Enum.valueOf(CLCSIconSize.class, str);
    }

    public static CLCSIconSize[] values() {
        return (CLCSIconSize[]) f.clone();
    }

    public final String b() {
        return this.h;
    }

    private CLCSIconSize(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        CLCSIconSize[] e2 = e();
        f = e2;
        i = C8600drp.e(e2);
        c = new b(null);
        j2 = C8569dql.j("SMALL", "STANDARD", "LARGE", "JUMBO");
        j = new C9033hu("CLCSIconSize", j2);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu b() {
            return CLCSIconSize.j;
        }

        public final CLCSIconSize e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSIconSize.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSIconSize) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSIconSize cLCSIconSize = (CLCSIconSize) obj;
            return cLCSIconSize == null ? CLCSIconSize.g : cLCSIconSize;
        }
    }
}
