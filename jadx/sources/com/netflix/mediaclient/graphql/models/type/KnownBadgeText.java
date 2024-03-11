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
public final class KnownBadgeText {
    private static final /* synthetic */ KnownBadgeText[] a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final e e;
    private static final C9033hu f;
    private final String h;
    public static final KnownBadgeText d = new KnownBadgeText("NEW_FOR_YOU", 0, "NEW_FOR_YOU");
    public static final KnownBadgeText c = new KnownBadgeText("UNKNOWN__", 1, "UNKNOWN__");

    public static InterfaceC8598drn<KnownBadgeText> a() {
        return b;
    }

    private static final /* synthetic */ KnownBadgeText[] e() {
        return new KnownBadgeText[]{d, c};
    }

    public static KnownBadgeText valueOf(String str) {
        return (KnownBadgeText) Enum.valueOf(KnownBadgeText.class, str);
    }

    public static KnownBadgeText[] values() {
        return (KnownBadgeText[]) a.clone();
    }

    public final String b() {
        return this.h;
    }

    private KnownBadgeText(String str, int i, String str2) {
        this.h = str2;
    }

    static {
        List e2;
        KnownBadgeText[] e3 = e();
        a = e3;
        b = C8600drp.e(e3);
        e = new e(null);
        e2 = C8566dqi.e("NEW_FOR_YOU");
        f = new C9033hu("KnownBadgeText", e2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final KnownBadgeText e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = KnownBadgeText.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((KnownBadgeText) obj).b(), (Object) str)) {
                    break;
                }
            }
            KnownBadgeText knownBadgeText = (KnownBadgeText) obj;
            return knownBadgeText == null ? KnownBadgeText.c : knownBadgeText;
        }
    }
}
