package com.netflix.mediaclient.graphql.models.type;

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
/* loaded from: classes3.dex */
public final class RemoveProfileErrorCode {
    public static final e e;
    private static final /* synthetic */ RemoveProfileErrorCode[] g;
    private static final /* synthetic */ InterfaceC8598drn h;
    private static final C9033hu j;
    private final String f;
    public static final RemoveProfileErrorCode c = new RemoveProfileErrorCode("GUID_IS_REQUIRED", 0, "GUID_IS_REQUIRED");
    public static final RemoveProfileErrorCode d = new RemoveProfileErrorCode("INVALID_PROFILE_GUID", 1, "INVALID_PROFILE_GUID");
    public static final RemoveProfileErrorCode a = new RemoveProfileErrorCode("SERVICE_ERROR", 2, "SERVICE_ERROR");
    public static final RemoveProfileErrorCode b = new RemoveProfileErrorCode("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<RemoveProfileErrorCode> b() {
        return h;
    }

    private static final /* synthetic */ RemoveProfileErrorCode[] e() {
        return new RemoveProfileErrorCode[]{c, d, a, b};
    }

    public static RemoveProfileErrorCode valueOf(String str) {
        return (RemoveProfileErrorCode) Enum.valueOf(RemoveProfileErrorCode.class, str);
    }

    public static RemoveProfileErrorCode[] values() {
        return (RemoveProfileErrorCode[]) g.clone();
    }

    public final String c() {
        return this.f;
    }

    private RemoveProfileErrorCode(String str, int i, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        RemoveProfileErrorCode[] e2 = e();
        g = e2;
        h = C8600drp.e(e2);
        e = new e(null);
        j2 = C8569dql.j("GUID_IS_REQUIRED", "INVALID_PROFILE_GUID", "SERVICE_ERROR");
        j = new C9033hu("RemoveProfileErrorCode", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu d() {
            return RemoveProfileErrorCode.j;
        }

        public final RemoveProfileErrorCode b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = RemoveProfileErrorCode.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((RemoveProfileErrorCode) obj).c(), (Object) str)) {
                    break;
                }
            }
            RemoveProfileErrorCode removeProfileErrorCode = (RemoveProfileErrorCode) obj;
            return removeProfileErrorCode == null ? RemoveProfileErrorCode.b : removeProfileErrorCode;
        }
    }
}
