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
public final class CLCSStackContentJustification {
    public static final c a;
    private static final C9033hu f;
    private static final /* synthetic */ InterfaceC8598drn i;
    private static final /* synthetic */ CLCSStackContentJustification[] j;

    /* renamed from: o  reason: collision with root package name */
    private final String f13129o;
    public static final CLCSStackContentJustification g = new CLCSStackContentJustification("START", 0, "START");
    public static final CLCSStackContentJustification c = new CLCSStackContentJustification("CENTER", 1, "CENTER");
    public static final CLCSStackContentJustification e = new CLCSStackContentJustification("END", 2, "END");
    public static final CLCSStackContentJustification b = new CLCSStackContentJustification("SPACE_BETWEEN", 3, "SPACE_BETWEEN");
    public static final CLCSStackContentJustification d = new CLCSStackContentJustification("SPACE_EVENLY", 4, "SPACE_EVENLY");
    public static final CLCSStackContentJustification h = new CLCSStackContentJustification("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ CLCSStackContentJustification[] c() {
        return new CLCSStackContentJustification[]{g, c, e, b, d, h};
    }

    public static InterfaceC8598drn<CLCSStackContentJustification> d() {
        return i;
    }

    public static CLCSStackContentJustification valueOf(String str) {
        return (CLCSStackContentJustification) Enum.valueOf(CLCSStackContentJustification.class, str);
    }

    public static CLCSStackContentJustification[] values() {
        return (CLCSStackContentJustification[]) j.clone();
    }

    public final String e() {
        return this.f13129o;
    }

    private CLCSStackContentJustification(String str, int i2, String str2) {
        this.f13129o = str2;
    }

    static {
        List j2;
        CLCSStackContentJustification[] c2 = c();
        j = c2;
        i = C8600drp.e(c2);
        a = new c(null);
        j2 = C8569dql.j("START", "CENTER", "END", "SPACE_BETWEEN", "SPACE_EVENLY");
        f = new C9033hu("CLCSStackContentJustification", j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu b() {
            return CLCSStackContentJustification.f;
        }

        public final CLCSStackContentJustification a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSStackContentJustification.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSStackContentJustification) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSStackContentJustification cLCSStackContentJustification = (CLCSStackContentJustification) obj;
            return cLCSStackContentJustification == null ? CLCSStackContentJustification.h : cLCSStackContentJustification;
        }
    }
}
