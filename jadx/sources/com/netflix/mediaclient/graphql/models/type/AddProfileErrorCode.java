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
public final class AddProfileErrorCode {
    public static final d b;
    private static final C9033hu g;
    private static final /* synthetic */ AddProfileErrorCode[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String k;
    public static final AddProfileErrorCode a = new AddProfileErrorCode("ACCOUNT_NOT_FOUND", 0, "ACCOUNT_NOT_FOUND");
    public static final AddProfileErrorCode c = new AddProfileErrorCode("NAME_IS_REQUIRED", 1, "NAME_IS_REQUIRED");
    public static final AddProfileErrorCode d = new AddProfileErrorCode("NAME_ALREADY_EXISTS", 2, "NAME_ALREADY_EXISTS");
    public static final AddProfileErrorCode f = new AddProfileErrorCode("TOO_MANY_PROFILES", 3, "TOO_MANY_PROFILES");
    public static final AddProfileErrorCode e = new AddProfileErrorCode("SERVICE_ERROR", 4, "SERVICE_ERROR");
    public static final AddProfileErrorCode h = new AddProfileErrorCode("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ AddProfileErrorCode[] c() {
        return new AddProfileErrorCode[]{a, c, d, f, e, h};
    }

    public static InterfaceC8598drn<AddProfileErrorCode> e() {
        return j;
    }

    public static AddProfileErrorCode valueOf(String str) {
        return (AddProfileErrorCode) Enum.valueOf(AddProfileErrorCode.class, str);
    }

    public static AddProfileErrorCode[] values() {
        return (AddProfileErrorCode[]) i.clone();
    }

    public final String d() {
        return this.k;
    }

    private AddProfileErrorCode(String str, int i2, String str2) {
        this.k = str2;
    }

    static {
        List j2;
        AddProfileErrorCode[] c2 = c();
        i = c2;
        j = C8600drp.e(c2);
        b = new d(null);
        j2 = C8569dql.j("ACCOUNT_NOT_FOUND", "NAME_IS_REQUIRED", "NAME_ALREADY_EXISTS", "TOO_MANY_PROFILES", "SERVICE_ERROR");
        g = new C9033hu("AddProfileErrorCode", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu d() {
            return AddProfileErrorCode.g;
        }

        public final AddProfileErrorCode d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = AddProfileErrorCode.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((AddProfileErrorCode) obj).d(), (Object) str)) {
                    break;
                }
            }
            AddProfileErrorCode addProfileErrorCode = (AddProfileErrorCode) obj;
            return addProfileErrorCode == null ? AddProfileErrorCode.h : addProfileErrorCode;
        }
    }
}
