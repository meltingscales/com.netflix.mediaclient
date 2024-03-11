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
public final class CLCSInputStyle {
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final e e;
    private static final C9033hu g;
    private static final /* synthetic */ CLCSInputStyle[] h;
    private final String f;
    public static final CLCSInputStyle a = new CLCSInputStyle("BORDER", 0, "BORDER");
    public static final CLCSInputStyle c = new CLCSInputStyle("BORDERLESS", 1, "BORDERLESS");
    public static final CLCSInputStyle d = new CLCSInputStyle("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSInputStyle> a() {
        return b;
    }

    private static final /* synthetic */ CLCSInputStyle[] c() {
        return new CLCSInputStyle[]{a, c, d};
    }

    public static CLCSInputStyle valueOf(String str) {
        return (CLCSInputStyle) Enum.valueOf(CLCSInputStyle.class, str);
    }

    public static CLCSInputStyle[] values() {
        return (CLCSInputStyle[]) h.clone();
    }

    public final String e() {
        return this.f;
    }

    private CLCSInputStyle(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        List j;
        CLCSInputStyle[] c2 = c();
        h = c2;
        b = C8600drp.e(c2);
        e = new e(null);
        j = C8569dql.j("BORDER", "BORDERLESS");
        g = new C9033hu("CLCSInputStyle", j);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu a() {
            return CLCSInputStyle.g;
        }

        public final CLCSInputStyle d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSInputStyle.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSInputStyle) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSInputStyle cLCSInputStyle = (CLCSInputStyle) obj;
            return cLCSInputStyle == null ? CLCSInputStyle.d : cLCSInputStyle;
        }
    }
}
