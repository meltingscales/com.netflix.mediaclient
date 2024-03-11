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
public final class TextEvidenceClassification {
    public static final b e;
    private static final /* synthetic */ InterfaceC8598drn p;
    private static final /* synthetic */ TextEvidenceClassification[] q;
    private static final C9033hu t;
    private final String s;
    public static final TextEvidenceClassification g = new TextEvidenceClassification("REGULAR", 0, "REGULAR");
    public static final TextEvidenceClassification j = new TextEvidenceClassification("TOP_10", 1, "TOP_10");
    public static final TextEvidenceClassification f = new TextEvidenceClassification("TOP_20", 2, "TOP_20");
    public static final TextEvidenceClassification l = new TextEvidenceClassification("TOP_50", 3, "TOP_50");
    public static final TextEvidenceClassification k = new TextEvidenceClassification("WARNING_NOTIFICATION", 4, "WARNING_NOTIFICATION");
    public static final TextEvidenceClassification b = new TextEvidenceClassification("BLM", 5, "BLM");
    public static final TextEvidenceClassification a = new TextEvidenceClassification("EXPIRY_MESSAGE", 6, "EXPIRY_MESSAGE");
    public static final TextEvidenceClassification c = new TextEvidenceClassification("AWARD", 7, "AWARD");
    public static final TextEvidenceClassification n = new TextEvidenceClassification("TOP_THUMBS", 8, "TOP_THUMBS");
    public static final TextEvidenceClassification m = new TextEvidenceClassification("TUDUM", 9, "TUDUM");
    public static final TextEvidenceClassification h = new TextEvidenceClassification("MOST_LIKED", 10, "MOST_LIKED");
    public static final TextEvidenceClassification d = new TextEvidenceClassification("LIVE", 11, "LIVE");
    public static final TextEvidenceClassification i = new TextEvidenceClassification("NEW_SEASON", 12, "NEW_SEASON");

    /* renamed from: o  reason: collision with root package name */
    public static final TextEvidenceClassification f13185o = new TextEvidenceClassification("UNKNOWN__", 13, "UNKNOWN__");

    private static final /* synthetic */ TextEvidenceClassification[] c() {
        return new TextEvidenceClassification[]{g, j, f, l, k, b, a, c, n, m, h, d, i, f13185o};
    }

    public static InterfaceC8598drn<TextEvidenceClassification> d() {
        return p;
    }

    public static TextEvidenceClassification valueOf(String str) {
        return (TextEvidenceClassification) Enum.valueOf(TextEvidenceClassification.class, str);
    }

    public static TextEvidenceClassification[] values() {
        return (TextEvidenceClassification[]) q.clone();
    }

    public final String e() {
        return this.s;
    }

    private TextEvidenceClassification(String str, int i2, String str2) {
        this.s = str2;
    }

    static {
        List j2;
        TextEvidenceClassification[] c2 = c();
        q = c2;
        p = C8600drp.e(c2);
        e = new b(null);
        j2 = C8569dql.j("REGULAR", "TOP_10", "TOP_20", "TOP_50", "WARNING_NOTIFICATION", "BLM", "EXPIRY_MESSAGE", "AWARD", "TOP_THUMBS", "TUDUM", "MOST_LIKED", "LIVE", "NEW_SEASON");
        t = new C9033hu("TextEvidenceClassification", j2);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu d() {
            return TextEvidenceClassification.t;
        }

        public final TextEvidenceClassification d(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = TextEvidenceClassification.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((TextEvidenceClassification) obj).e(), (Object) str)) {
                    break;
                }
            }
            TextEvidenceClassification textEvidenceClassification = (TextEvidenceClassification) obj;
            return textEvidenceClassification == null ? TextEvidenceClassification.f13185o : textEvidenceClassification;
        }
    }
}
