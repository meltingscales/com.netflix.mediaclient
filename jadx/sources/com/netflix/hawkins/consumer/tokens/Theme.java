package com.netflix.hawkins.consumer.tokens;

import kotlin.NoWhenBranchMatchedException;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Theme {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ Theme[] e;
    public static final Theme b = new Theme("Dark", 0);
    public static final Theme a = new Theme("Light", 1);

    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ Theme[] e() {
        return new Theme[]{b, a};
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) e.clone();
    }

    private Theme(String str, int i) {
    }

    static {
        Theme[] e2 = e();
        e = e2;
        c = C8600drp.e(e2);
    }

    public final Theme c() {
        int i = e.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return a;
            }
            throw new NoWhenBranchMatchedException();
        }
        return b;
    }
}
