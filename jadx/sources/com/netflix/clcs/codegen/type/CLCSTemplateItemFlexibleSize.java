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
public final class CLCSTemplateItemFlexibleSize {
    public static final c d;
    private static final /* synthetic */ CLCSTemplateItemFlexibleSize[] f;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu j;
    private final String i;
    public static final CLCSTemplateItemFlexibleSize e = new CLCSTemplateItemFlexibleSize("AUTO", 0, "AUTO");
    public static final CLCSTemplateItemFlexibleSize c = new CLCSTemplateItemFlexibleSize("GROW", 1, "GROW");
    public static final CLCSTemplateItemFlexibleSize b = new CLCSTemplateItemFlexibleSize("NONE", 2, "NONE");
    public static final CLCSTemplateItemFlexibleSize a = new CLCSTemplateItemFlexibleSize("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSTemplateItemFlexibleSize> b() {
        return g;
    }

    private static final /* synthetic */ CLCSTemplateItemFlexibleSize[] c() {
        return new CLCSTemplateItemFlexibleSize[]{e, c, b, a};
    }

    public static CLCSTemplateItemFlexibleSize valueOf(String str) {
        return (CLCSTemplateItemFlexibleSize) Enum.valueOf(CLCSTemplateItemFlexibleSize.class, str);
    }

    public static CLCSTemplateItemFlexibleSize[] values() {
        return (CLCSTemplateItemFlexibleSize[]) f.clone();
    }

    public final String d() {
        return this.i;
    }

    private CLCSTemplateItemFlexibleSize(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j2;
        CLCSTemplateItemFlexibleSize[] c2 = c();
        f = c2;
        g = C8600drp.e(c2);
        d = new c(null);
        j2 = C8569dql.j("AUTO", "GROW", "NONE");
        j = new C9033hu("CLCSTemplateItemFlexibleSize", j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu d() {
            return CLCSTemplateItemFlexibleSize.j;
        }

        public final CLCSTemplateItemFlexibleSize a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSTemplateItemFlexibleSize.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSTemplateItemFlexibleSize) obj).d(), (Object) str)) {
                    break;
                }
            }
            CLCSTemplateItemFlexibleSize cLCSTemplateItemFlexibleSize = (CLCSTemplateItemFlexibleSize) obj;
            return cLCSTemplateItemFlexibleSize == null ? CLCSTemplateItemFlexibleSize.a : cLCSTemplateItemFlexibleSize;
        }
    }
}
