package com.netflix.mediaclient.graphql.models.type;

import java.util.Iterator;
import java.util.List;
import o.C8566dqi;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class UiExperienceType {
    public static final c a;
    private static final /* synthetic */ UiExperienceType[] b;
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final C9033hu j;
    private final String g;
    public static final UiExperienceType e = new UiExperienceType("NEW_MEMBER_CATEGORIES", 0, "NEW_MEMBER_CATEGORIES");
    public static final UiExperienceType d = new UiExperienceType("UNKNOWN__", 1, "UNKNOWN__");

    private static final /* synthetic */ UiExperienceType[] a() {
        return new UiExperienceType[]{e, d};
    }

    public static InterfaceC8598drn<UiExperienceType> e() {
        return c;
    }

    public static UiExperienceType valueOf(String str) {
        return (UiExperienceType) Enum.valueOf(UiExperienceType.class, str);
    }

    public static UiExperienceType[] values() {
        return (UiExperienceType[]) b.clone();
    }

    public final String d() {
        return this.g;
    }

    private UiExperienceType(String str, int i, String str2) {
        this.g = str2;
    }

    static {
        List e2;
        UiExperienceType[] a2 = a();
        b = a2;
        c = C8600drp.e(a2);
        a = new c(null);
        e2 = C8566dqi.e("NEW_MEMBER_CATEGORIES");
        j = new C9033hu("UiExperienceType", e2);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final UiExperienceType a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UiExperienceType.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UiExperienceType) obj).d(), (Object) str)) {
                    break;
                }
            }
            UiExperienceType uiExperienceType = (UiExperienceType) obj;
            return uiExperienceType == null ? UiExperienceType.d : uiExperienceType;
        }
    }
}
