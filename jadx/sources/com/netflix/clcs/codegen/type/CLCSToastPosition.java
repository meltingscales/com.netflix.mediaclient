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
public final class CLCSToastPosition {
    public static final a a;
    private static final /* synthetic */ InterfaceC8598drn e;
    private static final /* synthetic */ CLCSToastPosition[] g;
    private static final C9033hu h;
    private final String j;
    public static final CLCSToastPosition c = new CLCSToastPosition("TOP", 0, "TOP");
    public static final CLCSToastPosition b = new CLCSToastPosition("BOTTOM", 1, "BOTTOM");
    public static final CLCSToastPosition d = new CLCSToastPosition("UNKNOWN__", 2, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSToastPosition> b() {
        return e;
    }

    private static final /* synthetic */ CLCSToastPosition[] e() {
        return new CLCSToastPosition[]{c, b, d};
    }

    public static CLCSToastPosition valueOf(String str) {
        return (CLCSToastPosition) Enum.valueOf(CLCSToastPosition.class, str);
    }

    public static CLCSToastPosition[] values() {
        return (CLCSToastPosition[]) g.clone();
    }

    public final String d() {
        return this.j;
    }

    private CLCSToastPosition(String str, int i, String str2) {
        this.j = str2;
    }

    static {
        List j;
        CLCSToastPosition[] e2 = e();
        g = e2;
        e = C8600drp.e(e2);
        a = new a(null);
        j = C8569dql.j("TOP", "BOTTOM");
        h = new C9033hu("CLCSToastPosition", j);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu a() {
            return CLCSToastPosition.h;
        }

        public final CLCSToastPosition d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSToastPosition.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSToastPosition) obj).d(), (Object) str)) {
                    break;
                }
            }
            CLCSToastPosition cLCSToastPosition = (CLCSToastPosition) obj;
            return cLCSToastPosition == null ? CLCSToastPosition.d : cLCSToastPosition;
        }
    }
}
