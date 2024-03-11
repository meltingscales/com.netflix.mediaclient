package com.netflix.clcs.codegen.type;

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
/* loaded from: classes2.dex */
public final class CLCSImageResolutionMode {
    public static final c i;
    private static final /* synthetic */ InterfaceC8598drn q;
    private static final /* synthetic */ CLCSImageResolutionMode[] r;
    private static final C9033hu s;
    private final String p;
    public static final CLCSImageResolutionMode d = new CLCSImageResolutionMode("ANDROID_LDPI", 0, "ANDROID_LDPI");
    public static final CLCSImageResolutionMode a = new CLCSImageResolutionMode("ANDROID_MDPI", 1, "ANDROID_MDPI");
    public static final CLCSImageResolutionMode e = new CLCSImageResolutionMode("ANDROID_HDPI", 2, "ANDROID_HDPI");
    public static final CLCSImageResolutionMode b = new CLCSImageResolutionMode("ANDROID_XHDPI", 3, "ANDROID_XHDPI");
    public static final CLCSImageResolutionMode c = new CLCSImageResolutionMode("ANDROID_XXHDPI", 4, "ANDROID_XXHDPI");
    public static final CLCSImageResolutionMode j = new CLCSImageResolutionMode("IOS_1X", 5, "IOS_1X");
    public static final CLCSImageResolutionMode f = new CLCSImageResolutionMode("IOS_2X", 6, "IOS_2X");
    public static final CLCSImageResolutionMode g = new CLCSImageResolutionMode("IOS_3X", 7, "IOS_3X");
    public static final CLCSImageResolutionMode l = new CLCSImageResolutionMode("TV_720P", 8, "TV_720P");
    public static final CLCSImageResolutionMode h = new CLCSImageResolutionMode("TV_1080P", 9, "TV_1080P");
    public static final CLCSImageResolutionMode k = new CLCSImageResolutionMode("TV_2160P", 10, "TV_2160P");
    public static final CLCSImageResolutionMode n = new CLCSImageResolutionMode("WEB_1X", 11, "WEB_1X");
    public static final CLCSImageResolutionMode m = new CLCSImageResolutionMode("WEB_2X", 12, "WEB_2X");

    /* renamed from: o  reason: collision with root package name */
    public static final CLCSImageResolutionMode f13128o = new CLCSImageResolutionMode("UNKNOWN__", 13, "UNKNOWN__");

    private static final /* synthetic */ CLCSImageResolutionMode[] a() {
        return new CLCSImageResolutionMode[]{d, a, e, b, c, j, f, g, l, h, k, n, m, f13128o};
    }

    public static InterfaceC8598drn<CLCSImageResolutionMode> e() {
        return q;
    }

    public static CLCSImageResolutionMode valueOf(String str) {
        return (CLCSImageResolutionMode) Enum.valueOf(CLCSImageResolutionMode.class, str);
    }

    public static CLCSImageResolutionMode[] values() {
        return (CLCSImageResolutionMode[]) r.clone();
    }

    public final String b() {
        return this.p;
    }

    private CLCSImageResolutionMode(String str, int i2, String str2) {
        this.p = str2;
    }

    static {
        List j2;
        CLCSImageResolutionMode[] a2 = a();
        r = a2;
        q = C8600drp.e(a2);
        i = new c(null);
        j2 = C8569dql.j("ANDROID_LDPI", "ANDROID_MDPI", "ANDROID_HDPI", "ANDROID_XHDPI", "ANDROID_XXHDPI", "IOS_1X", "IOS_2X", "IOS_3X", "TV_720P", "TV_1080P", "TV_2160P", "WEB_1X", "WEB_2X");
        s = new C9033hu("CLCSImageResolutionMode", j2);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final CLCSImageResolutionMode e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSImageResolutionMode.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSImageResolutionMode) obj).b(), (Object) str)) {
                    break;
                }
            }
            CLCSImageResolutionMode cLCSImageResolutionMode = (CLCSImageResolutionMode) obj;
            return cLCSImageResolutionMode == null ? CLCSImageResolutionMode.f13128o : cLCSImageResolutionMode;
        }
    }
}
