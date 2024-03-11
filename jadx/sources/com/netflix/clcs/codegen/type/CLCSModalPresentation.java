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
public final class CLCSModalPresentation {
    public static final e d;
    private static final /* synthetic */ CLCSModalPresentation[] g;
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final C9033hu j;
    private final String l;
    public static final CLCSModalPresentation b = new CLCSModalPresentation("BOTTOM_SHEET", 0, "BOTTOM_SHEET");
    public static final CLCSModalPresentation a = new CLCSModalPresentation("DIALOG", 1, "DIALOG");
    public static final CLCSModalPresentation e = new CLCSModalPresentation("FLY_OVER", 2, "FLY_OVER");
    public static final CLCSModalPresentation c = new CLCSModalPresentation("FULL_SCREEN", 3, "FULL_SCREEN");
    public static final CLCSModalPresentation f = new CLCSModalPresentation("SIDE_PANEL", 4, "SIDE_PANEL");
    public static final CLCSModalPresentation h = new CLCSModalPresentation("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ CLCSModalPresentation[] b() {
        return new CLCSModalPresentation[]{b, a, e, c, f, h};
    }

    public static InterfaceC8598drn<CLCSModalPresentation> c() {
        return i;
    }

    public static CLCSModalPresentation valueOf(String str) {
        return (CLCSModalPresentation) Enum.valueOf(CLCSModalPresentation.class, str);
    }

    public static CLCSModalPresentation[] values() {
        return (CLCSModalPresentation[]) g.clone();
    }

    public final String a() {
        return this.l;
    }

    private CLCSModalPresentation(String str, int i2, String str2) {
        this.l = str2;
    }

    static {
        List j2;
        CLCSModalPresentation[] b2 = b();
        g = b2;
        i = C8600drp.e(b2);
        d = new e(null);
        j2 = C8569dql.j("BOTTOM_SHEET", "DIALOG", "FLY_OVER", "FULL_SCREEN", "SIDE_PANEL");
        j = new C9033hu("CLCSModalPresentation", j2);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu e() {
            return CLCSModalPresentation.j;
        }

        public final CLCSModalPresentation a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSModalPresentation.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSModalPresentation) obj).a(), (Object) str)) {
                    break;
                }
            }
            CLCSModalPresentation cLCSModalPresentation = (CLCSModalPresentation) obj;
            return cLCSModalPresentation == null ? CLCSModalPresentation.h : cLCSModalPresentation;
        }
    }
}
