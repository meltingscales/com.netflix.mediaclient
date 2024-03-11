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
public final class UpdateSubtitleAppearanceErrorCode {
    public static final d d;
    private static final C9033hu g;
    private static final /* synthetic */ UpdateSubtitleAppearanceErrorCode[] h;
    private static final /* synthetic */ InterfaceC8598drn i;
    private final String f;
    public static final UpdateSubtitleAppearanceErrorCode e = new UpdateSubtitleAppearanceErrorCode("GUID_IS_REQUIRED", 0, "GUID_IS_REQUIRED");
    public static final UpdateSubtitleAppearanceErrorCode c = new UpdateSubtitleAppearanceErrorCode("INVALID_PROFILE_GUID", 1, "INVALID_PROFILE_GUID");
    public static final UpdateSubtitleAppearanceErrorCode a = new UpdateSubtitleAppearanceErrorCode("SERVER_ERROR", 2, "SERVER_ERROR");
    public static final UpdateSubtitleAppearanceErrorCode b = new UpdateSubtitleAppearanceErrorCode("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ UpdateSubtitleAppearanceErrorCode[] b() {
        return new UpdateSubtitleAppearanceErrorCode[]{e, c, a, b};
    }

    public static InterfaceC8598drn<UpdateSubtitleAppearanceErrorCode> c() {
        return i;
    }

    public static UpdateSubtitleAppearanceErrorCode valueOf(String str) {
        return (UpdateSubtitleAppearanceErrorCode) Enum.valueOf(UpdateSubtitleAppearanceErrorCode.class, str);
    }

    public static UpdateSubtitleAppearanceErrorCode[] values() {
        return (UpdateSubtitleAppearanceErrorCode[]) h.clone();
    }

    public final String e() {
        return this.f;
    }

    private UpdateSubtitleAppearanceErrorCode(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j;
        UpdateSubtitleAppearanceErrorCode[] b2 = b();
        h = b2;
        i = C8600drp.e(b2);
        d = new d(null);
        j = C8569dql.j("GUID_IS_REQUIRED", "INVALID_PROFILE_GUID", "SERVER_ERROR");
        g = new C9033hu("UpdateSubtitleAppearanceErrorCode", j);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final C9033hu b() {
            return UpdateSubtitleAppearanceErrorCode.g;
        }

        public final UpdateSubtitleAppearanceErrorCode c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UpdateSubtitleAppearanceErrorCode.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UpdateSubtitleAppearanceErrorCode) obj).e(), (Object) str)) {
                    break;
                }
            }
            UpdateSubtitleAppearanceErrorCode updateSubtitleAppearanceErrorCode = (UpdateSubtitleAppearanceErrorCode) obj;
            return updateSubtitleAppearanceErrorCode == null ? UpdateSubtitleAppearanceErrorCode.b : updateSubtitleAppearanceErrorCode;
        }
    }
}
