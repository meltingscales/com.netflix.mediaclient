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
public final class UXConfigPinotSectionKind {
    public static final a a;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final /* synthetic */ UXConfigPinotSectionKind[] i;
    private static final C9033hu k;

    /* renamed from: o  reason: collision with root package name */
    private final String f13186o;
    public static final UXConfigPinotSectionKind d = new UXConfigPinotSectionKind("Carousel", 0, "Carousel");
    public static final UXConfigPinotSectionKind e = new UXConfigPinotSectionKind("CreatorHome", 1, "CreatorHome");
    public static final UXConfigPinotSectionKind c = new UXConfigPinotSectionKind("Gallery", 2, "Gallery");
    public static final UXConfigPinotSectionKind j = new UXConfigPinotSectionKind("List", 3, "List");
    public static final UXConfigPinotSectionKind b = new UXConfigPinotSectionKind("EntityNameList", 4, "EntityNameList");
    public static final UXConfigPinotSectionKind h = new UXConfigPinotSectionKind("SearchHints", 5, "SearchHints");
    public static final UXConfigPinotSectionKind f = new UXConfigPinotSectionKind("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ UXConfigPinotSectionKind[] a() {
        return new UXConfigPinotSectionKind[]{d, e, c, j, b, h, f};
    }

    public static InterfaceC8598drn<UXConfigPinotSectionKind> d() {
        return g;
    }

    public static UXConfigPinotSectionKind valueOf(String str) {
        return (UXConfigPinotSectionKind) Enum.valueOf(UXConfigPinotSectionKind.class, str);
    }

    public static UXConfigPinotSectionKind[] values() {
        return (UXConfigPinotSectionKind[]) i.clone();
    }

    public final String b() {
        return this.f13186o;
    }

    private UXConfigPinotSectionKind(String str, int i2, String str2) {
        this.f13186o = str2;
    }

    static {
        List j2;
        UXConfigPinotSectionKind[] a2 = a();
        i = a2;
        g = C8600drp.e(a2);
        a = new a(null);
        j2 = C8569dql.j("Carousel", "CreatorHome", "Gallery", "List", "EntityNameList", "SearchHints");
        k = new C9033hu("UXConfigPinotSectionKind", j2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final UXConfigPinotSectionKind c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = UXConfigPinotSectionKind.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((UXConfigPinotSectionKind) obj).b(), (Object) str)) {
                    break;
                }
            }
            UXConfigPinotSectionKind uXConfigPinotSectionKind = (UXConfigPinotSectionKind) obj;
            return uXConfigPinotSectionKind == null ? UXConfigPinotSectionKind.f : uXConfigPinotSectionKind;
        }
    }
}
