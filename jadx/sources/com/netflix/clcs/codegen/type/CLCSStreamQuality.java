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
public final class CLCSStreamQuality {
    public static final e b;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu i;
    private static final /* synthetic */ CLCSStreamQuality[] j;
    private final String h;
    public static final CLCSStreamQuality d = new CLCSStreamQuality("SD", 0, "SD");
    public static final CLCSStreamQuality e = new CLCSStreamQuality("HD", 1, "HD");
    public static final CLCSStreamQuality a = new CLCSStreamQuality("UHD", 2, "UHD");
    public static final CLCSStreamQuality c = new CLCSStreamQuality("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSStreamQuality> a() {
        return g;
    }

    private static final /* synthetic */ CLCSStreamQuality[] b() {
        return new CLCSStreamQuality[]{d, e, a, c};
    }

    public static CLCSStreamQuality valueOf(String str) {
        return (CLCSStreamQuality) Enum.valueOf(CLCSStreamQuality.class, str);
    }

    public static CLCSStreamQuality[] values() {
        return (CLCSStreamQuality[]) j.clone();
    }

    public final String e() {
        return this.h;
    }

    private CLCSStreamQuality(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        CLCSStreamQuality[] b2 = b();
        j = b2;
        g = C8600drp.e(b2);
        b = new e(null);
        j2 = C8569dql.j("SD", "HD", "UHD");
        i = new C9033hu("CLCSStreamQuality", j2);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final CLCSStreamQuality e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSStreamQuality.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSStreamQuality) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSStreamQuality cLCSStreamQuality = (CLCSStreamQuality) obj;
            return cLCSStreamQuality == null ? CLCSStreamQuality.c : cLCSStreamQuality;
        }
    }
}
