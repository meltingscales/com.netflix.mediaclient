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
public final class CLCSLoggableSessionType {
    public static final c a;
    private static final /* synthetic */ CLCSLoggableSessionType[] f;
    private static final C9033hu h;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String i;
    public static final CLCSLoggableSessionType b = new CLCSLoggableSessionType("EndPresentation", 0, "EndPresentation");
    public static final CLCSLoggableSessionType d = new CLCSLoggableSessionType("Presentation", 1, "Presentation");
    public static final CLCSLoggableSessionType c = new CLCSLoggableSessionType("Context", 2, "Context");
    public static final CLCSLoggableSessionType e = new CLCSLoggableSessionType("EndContext", 3, "EndContext");
    public static final CLCSLoggableSessionType g = new CLCSLoggableSessionType("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ CLCSLoggableSessionType[] b() {
        return new CLCSLoggableSessionType[]{b, d, c, e, g};
    }

    public static InterfaceC8598drn<CLCSLoggableSessionType> d() {
        return j;
    }

    public static CLCSLoggableSessionType valueOf(String str) {
        return (CLCSLoggableSessionType) Enum.valueOf(CLCSLoggableSessionType.class, str);
    }

    public static CLCSLoggableSessionType[] values() {
        return (CLCSLoggableSessionType[]) f.clone();
    }

    public final String e() {
        return this.i;
    }

    private CLCSLoggableSessionType(String str, int i, String str2) {
        this.i = str2;
    }

    static {
        List j2;
        CLCSLoggableSessionType[] b2 = b();
        f = b2;
        j = C8600drp.e(b2);
        a = new c(null);
        j2 = C8569dql.j("EndPresentation", "Presentation", "Context", "EndContext");
        h = new C9033hu("CLCSLoggableSessionType", j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu e() {
            return CLCSLoggableSessionType.h;
        }

        public final CLCSLoggableSessionType d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSLoggableSessionType.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSLoggableSessionType) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSLoggableSessionType cLCSLoggableSessionType = (CLCSLoggableSessionType) obj;
            return cLCSLoggableSessionType == null ? CLCSLoggableSessionType.g : cLCSLoggableSessionType;
        }
    }
}
