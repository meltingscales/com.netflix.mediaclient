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
public final class EditProfileErrorCode {
    public static final a c;
    private static final C9033hu k;
    private static final /* synthetic */ InterfaceC8598drn l;
    private static final /* synthetic */ EditProfileErrorCode[] n;
    private final String m;
    public static final EditProfileErrorCode b = new EditProfileErrorCode("GUID_IS_REQUIRED", 0, "GUID_IS_REQUIRED");
    public static final EditProfileErrorCode f = new EditProfileErrorCode("INVALID_PROFILE_GUID", 1, "INVALID_PROFILE_GUID");
    public static final EditProfileErrorCode d = new EditProfileErrorCode("AVATAR_KEY_DEPRECATED", 2, "AVATAR_KEY_DEPRECATED");
    public static final EditProfileErrorCode e = new EditProfileErrorCode("AVATAR_KEY_EXISTS", 3, "AVATAR_KEY_EXISTS");
    public static final EditProfileErrorCode i = new EditProfileErrorCode("INVALID_OWNER_EXPERIENCE_TYPE", 4, "INVALID_OWNER_EXPERIENCE_TYPE");
    public static final EditProfileErrorCode g = new EditProfileErrorCode("MATURITY_LEVEL_MISMATCH", 5, "MATURITY_LEVEL_MISMATCH");
    public static final EditProfileErrorCode a = new EditProfileErrorCode("FAMILY_PROFILE_EXISTS", 6, "FAMILY_PROFILE_EXISTS");
    public static final EditProfileErrorCode h = new EditProfileErrorCode("NAME_ALREADY_EXISTS", 7, "NAME_ALREADY_EXISTS");
    public static final EditProfileErrorCode j = new EditProfileErrorCode("SERVICE_ERROR", 8, "SERVICE_ERROR");

    /* renamed from: o  reason: collision with root package name */
    public static final EditProfileErrorCode f13177o = new EditProfileErrorCode("UNKNOWN__", 9, "UNKNOWN__");

    private static final /* synthetic */ EditProfileErrorCode[] a() {
        return new EditProfileErrorCode[]{b, f, d, e, i, g, a, h, j, f13177o};
    }

    public static InterfaceC8598drn<EditProfileErrorCode> e() {
        return l;
    }

    public static EditProfileErrorCode valueOf(String str) {
        return (EditProfileErrorCode) Enum.valueOf(EditProfileErrorCode.class, str);
    }

    public static EditProfileErrorCode[] values() {
        return (EditProfileErrorCode[]) n.clone();
    }

    public final String c() {
        return this.m;
    }

    private EditProfileErrorCode(String str, int i2, String str2) {
        this.m = str2;
    }

    static {
        List j2;
        EditProfileErrorCode[] a2 = a();
        n = a2;
        l = C8600drp.e(a2);
        c = new a(null);
        j2 = C8569dql.j("GUID_IS_REQUIRED", "INVALID_PROFILE_GUID", "AVATAR_KEY_DEPRECATED", "AVATAR_KEY_EXISTS", "INVALID_OWNER_EXPERIENCE_TYPE", "MATURITY_LEVEL_MISMATCH", "FAMILY_PROFILE_EXISTS", "NAME_ALREADY_EXISTS", "SERVICE_ERROR");
        k = new C9033hu("EditProfileErrorCode", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu b() {
            return EditProfileErrorCode.k;
        }

        public final EditProfileErrorCode b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = EditProfileErrorCode.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((EditProfileErrorCode) obj).c(), (Object) str)) {
                    break;
                }
            }
            EditProfileErrorCode editProfileErrorCode = (EditProfileErrorCode) obj;
            return editProfileErrorCode == null ? EditProfileErrorCode.f13177o : editProfileErrorCode;
        }
    }
}
