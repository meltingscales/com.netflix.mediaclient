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
public final class CLCSRdidAccessState {
    public static final e c;
    private static final C9033hu g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final /* synthetic */ CLCSRdidAccessState[] i;
    private final String f;
    public static final CLCSRdidAccessState a = new CLCSRdidAccessState("APPROVED", 0, "APPROVED");
    public static final CLCSRdidAccessState d = new CLCSRdidAccessState("DENIED", 1, "DENIED");
    public static final CLCSRdidAccessState b = new CLCSRdidAccessState("UNDETERMINED", 2, "UNDETERMINED");
    public static final CLCSRdidAccessState e = new CLCSRdidAccessState("RESTRICTED", 3, "RESTRICTED");
    public static final CLCSRdidAccessState j = new CLCSRdidAccessState("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSRdidAccessState> a() {
        return h;
    }

    private static final /* synthetic */ CLCSRdidAccessState[] c() {
        return new CLCSRdidAccessState[]{a, d, b, e, j};
    }

    public static CLCSRdidAccessState valueOf(String str) {
        return (CLCSRdidAccessState) Enum.valueOf(CLCSRdidAccessState.class, str);
    }

    public static CLCSRdidAccessState[] values() {
        return (CLCSRdidAccessState[]) i.clone();
    }

    public final String b() {
        return this.f;
    }

    private CLCSRdidAccessState(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        CLCSRdidAccessState[] c2 = c();
        i = c2;
        h = C8600drp.e(c2);
        c = new e(null);
        j2 = C8569dql.j("APPROVED", "DENIED", "UNDETERMINED", "RESTRICTED");
        g = new C9033hu("CLCSRdidAccessState", j2);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final CLCSRdidAccessState e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSRdidAccessState.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSRdidAccessState) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSRdidAccessState cLCSRdidAccessState = (CLCSRdidAccessState) obj;
            return cLCSRdidAccessState == null ? CLCSRdidAccessState.j : cLCSRdidAccessState;
        }
    }
}
