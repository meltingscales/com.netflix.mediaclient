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
public final class CLCSButtonSize {
    public static final d d;
    private static final C9033hu g;
    private static final /* synthetic */ CLCSButtonSize[] h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String k;
    public static final CLCSButtonSize e = new CLCSButtonSize("COMPACT", 0, "COMPACT");
    public static final CLCSButtonSize f = new CLCSButtonSize("STANDARD", 1, "STANDARD");
    public static final CLCSButtonSize a = new CLCSButtonSize("LARGE", 2, "LARGE");
    public static final CLCSButtonSize b = new CLCSButtonSize("EXTRA_LARGE", 3, "EXTRA_LARGE");
    public static final CLCSButtonSize c = new CLCSButtonSize("JUMBO", 4, "JUMBO");
    public static final CLCSButtonSize i = new CLCSButtonSize("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ CLCSButtonSize[] c() {
        return new CLCSButtonSize[]{e, f, a, b, c, i};
    }

    public static InterfaceC8598drn<CLCSButtonSize> e() {
        return j;
    }

    public static CLCSButtonSize valueOf(String str) {
        return (CLCSButtonSize) Enum.valueOf(CLCSButtonSize.class, str);
    }

    public static CLCSButtonSize[] values() {
        return (CLCSButtonSize[]) h.clone();
    }

    public final String b() {
        return this.k;
    }

    private CLCSButtonSize(String str, int i2, String str2) {
        this.k = str2;
    }

    static {
        List j2;
        CLCSButtonSize[] c2 = c();
        h = c2;
        j = C8600drp.e(c2);
        d = new d(null);
        j2 = C8569dql.j("COMPACT", "STANDARD", "LARGE", "EXTRA_LARGE", "JUMBO");
        g = new C9033hu("CLCSButtonSize", j2);
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu b() {
            return CLCSButtonSize.g;
        }

        public final CLCSButtonSize a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSButtonSize.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSButtonSize) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSButtonSize cLCSButtonSize = (CLCSButtonSize) obj;
            return cLCSButtonSize == null ? CLCSButtonSize.i : cLCSButtonSize;
        }
    }
}
