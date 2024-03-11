package com.netflix.mediaclient.servicemgr.interface_;

import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SupplementalMessageType {
    public static final e c;
    private static final /* synthetic */ SupplementalMessageType[] q;
    private static final /* synthetic */ InterfaceC8598drn r;
    private final int t;
    public static final SupplementalMessageType g = new SupplementalMessageType("REGULAR", 0, 0);
    public static final SupplementalMessageType j = new SupplementalMessageType("TOP_10", 1, 1);
    public static final SupplementalMessageType s = new SupplementalMessageType("WARNING_NOTIFICATION", 2, 2);
    public static final SupplementalMessageType a = new SupplementalMessageType("BLM", 3, 3);
    public static final SupplementalMessageType m = new SupplementalMessageType("TOP_20", 4, 4);
    public static final SupplementalMessageType n = new SupplementalMessageType("TOP_50", 5, 5);
    public static final SupplementalMessageType b = new SupplementalMessageType("EXPIRY_MESSAGE", 6, 6);
    public static final SupplementalMessageType d = new SupplementalMessageType("AWARD", 7, 7);
    public static final SupplementalMessageType k = new SupplementalMessageType("TOP_THUMBS", 8, 8);

    /* renamed from: o  reason: collision with root package name */
    public static final SupplementalMessageType f13237o = new SupplementalMessageType("TUDUM", 9, 9);
    public static final SupplementalMessageType h = new SupplementalMessageType("MOST_LIKED", 10, 10);
    public static final SupplementalMessageType i = new SupplementalMessageType("LIVE", 11, 11);
    public static final SupplementalMessageType l = new SupplementalMessageType("UNKNOWN", 12, -1);
    public static final SupplementalMessageType e = new SupplementalMessageType("CONTENT_EXPIRY", 13, -2);
    public static final SupplementalMessageType f = new SupplementalMessageType("NEW_SEASON", 14, 12);

    private static final /* synthetic */ SupplementalMessageType[] a() {
        return new SupplementalMessageType[]{g, j, s, a, m, n, b, d, k, f13237o, h, i, l, e, f};
    }

    public static SupplementalMessageType valueOf(String str) {
        return (SupplementalMessageType) Enum.valueOf(SupplementalMessageType.class, str);
    }

    public static SupplementalMessageType[] values() {
        return (SupplementalMessageType[]) q.clone();
    }

    public final int d() {
        return this.t;
    }

    private SupplementalMessageType(String str, int i2, int i3) {
        this.t = i3;
    }

    static {
        SupplementalMessageType[] a2 = a();
        q = a2;
        r = C8600drp.e(a2);
        c = new e(null);
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final SupplementalMessageType b(String str) {
            SupplementalMessageType supplementalMessageType;
            SupplementalMessageType supplementalMessageType2 = SupplementalMessageType.l;
            if (str == null) {
                return supplementalMessageType2;
            }
            SupplementalMessageType[] values = SupplementalMessageType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    supplementalMessageType = null;
                    break;
                }
                supplementalMessageType = values[i];
                if (C8632dsu.c((Object) supplementalMessageType.name(), (Object) str)) {
                    break;
                }
                i++;
            }
            return supplementalMessageType == null ? supplementalMessageType2 : supplementalMessageType;
        }

        public final SupplementalMessageType e(int i) {
            SupplementalMessageType supplementalMessageType;
            SupplementalMessageType supplementalMessageType2 = SupplementalMessageType.l;
            SupplementalMessageType[] values = SupplementalMessageType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    supplementalMessageType = null;
                    break;
                }
                supplementalMessageType = values[i2];
                if (supplementalMessageType.d() == i) {
                    break;
                }
                i2++;
            }
            return supplementalMessageType == null ? supplementalMessageType2 : supplementalMessageType;
        }
    }
}
