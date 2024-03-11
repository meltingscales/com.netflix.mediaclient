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
public final class SubtitleTextOpacity {
    public static final e a;
    private static final /* synthetic */ InterfaceC8598drn b;
    public static final SubtitleTextOpacity c = new SubtitleTextOpacity("OPAQUE", 0, "OPAQUE");
    public static final SubtitleTextOpacity d = new SubtitleTextOpacity("SEMI_TRANSPARENT", 1, "SEMI_TRANSPARENT");
    public static final SubtitleTextOpacity e = new SubtitleTextOpacity("UNKNOWN__", 2, "UNKNOWN__");
    private static final C9033hu i;
    private static final /* synthetic */ SubtitleTextOpacity[] j;
    private final String h;

    private static final /* synthetic */ SubtitleTextOpacity[] a() {
        return new SubtitleTextOpacity[]{c, d, e};
    }

    public static InterfaceC8598drn<SubtitleTextOpacity> d() {
        return b;
    }

    public static SubtitleTextOpacity valueOf(String str) {
        return (SubtitleTextOpacity) Enum.valueOf(SubtitleTextOpacity.class, str);
    }

    public static SubtitleTextOpacity[] values() {
        return (SubtitleTextOpacity[]) j.clone();
    }

    public final String e() {
        return this.h;
    }

    private SubtitleTextOpacity(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        SubtitleTextOpacity[] a2 = a();
        j = a2;
        b = C8600drp.e(a2);
        a = new e(null);
        j2 = C8569dql.j("OPAQUE", "SEMI_TRANSPARENT");
        i = new C9033hu("SubtitleTextOpacity", j2);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final SubtitleTextOpacity b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = SubtitleTextOpacity.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((SubtitleTextOpacity) obj).e(), (Object) str)) {
                    break;
                }
            }
            SubtitleTextOpacity subtitleTextOpacity = (SubtitleTextOpacity) obj;
            return subtitleTextOpacity == null ? SubtitleTextOpacity.e : subtitleTextOpacity;
        }
    }
}
