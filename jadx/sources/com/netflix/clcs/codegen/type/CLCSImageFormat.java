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
public final class CLCSImageFormat {
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final c e;
    private static final /* synthetic */ CLCSImageFormat[] i;
    private static final C9033hu j;
    private final String f;
    public static final CLCSImageFormat d = new CLCSImageFormat("JPEG", 0, "JPEG");
    public static final CLCSImageFormat b = new CLCSImageFormat("PNG", 1, "PNG");
    public static final CLCSImageFormat a = new CLCSImageFormat("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ CLCSImageFormat[] a() {
        return new CLCSImageFormat[]{d, b, a};
    }

    public static InterfaceC8598drn<CLCSImageFormat> c() {
        return c;
    }

    public static CLCSImageFormat valueOf(String str) {
        return (CLCSImageFormat) Enum.valueOf(CLCSImageFormat.class, str);
    }

    public static CLCSImageFormat[] values() {
        return (CLCSImageFormat[]) i.clone();
    }

    public final String e() {
        return this.f;
    }

    private CLCSImageFormat(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        CLCSImageFormat[] a2 = a();
        i = a2;
        c = C8600drp.e(a2);
        e = new c(null);
        j2 = C8569dql.j("JPEG", "PNG");
        j = new C9033hu("CLCSImageFormat", j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final CLCSImageFormat c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSImageFormat.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSImageFormat) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSImageFormat cLCSImageFormat = (CLCSImageFormat) obj;
            return cLCSImageFormat == null ? CLCSImageFormat.a : cLCSImageFormat;
        }
    }
}
