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
public final class CLCSDesignTheme {
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final d d;
    private static final /* synthetic */ CLCSDesignTheme[] f;
    private static final C9033hu h;
    private final String j;
    public static final CLCSDesignTheme c = new CLCSDesignTheme("LIGHT", 0, "LIGHT");
    public static final CLCSDesignTheme e = new CLCSDesignTheme("DARK", 1, "DARK");
    public static final CLCSDesignTheme a = new CLCSDesignTheme("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSDesignTheme> a() {
        return b;
    }

    private static final /* synthetic */ CLCSDesignTheme[] d() {
        return new CLCSDesignTheme[]{c, e, a};
    }

    public static CLCSDesignTheme valueOf(String str) {
        return (CLCSDesignTheme) Enum.valueOf(CLCSDesignTheme.class, str);
    }

    public static CLCSDesignTheme[] values() {
        return (CLCSDesignTheme[]) f.clone();
    }

    public final String b() {
        return this.j;
    }

    private CLCSDesignTheme(String str, int i, String str2) {
        this.j = str2;
    }

    static {
        List j;
        CLCSDesignTheme[] d2 = d();
        f = d2;
        b = C8600drp.e(d2);
        d = new d(null);
        j = C8569dql.j("LIGHT", "DARK");
        h = new C9033hu("CLCSDesignTheme", j);
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu a() {
            return CLCSDesignTheme.h;
        }

        public final CLCSDesignTheme e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSDesignTheme.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSDesignTheme) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSDesignTheme cLCSDesignTheme = (CLCSDesignTheme) obj;
            return cLCSDesignTheme == null ? CLCSDesignTheme.a : cLCSDesignTheme;
        }
    }
}
