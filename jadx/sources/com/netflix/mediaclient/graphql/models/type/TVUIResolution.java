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
public final class TVUIResolution {
    public static final d b;
    private static final C9033hu h;
    private static final /* synthetic */ TVUIResolution[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String f;
    public static final TVUIResolution d = new TVUIResolution("TVUI_720P", 0, "TVUI_720P");
    public static final TVUIResolution e = new TVUIResolution("TVUI_1080P", 1, "TVUI_1080P");
    public static final TVUIResolution a = new TVUIResolution("TVUI_4K", 2, "TVUI_4K");
    public static final TVUIResolution c = new TVUIResolution("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<TVUIResolution> a() {
        return j;
    }

    private static final /* synthetic */ TVUIResolution[] c() {
        return new TVUIResolution[]{d, e, a, c};
    }

    public static TVUIResolution valueOf(String str) {
        return (TVUIResolution) Enum.valueOf(TVUIResolution.class, str);
    }

    public static TVUIResolution[] values() {
        return (TVUIResolution[]) i.clone();
    }

    public final String b() {
        return this.f;
    }

    private TVUIResolution(String str, int i2, String str2) {
        this.f = str2;
    }

    static {
        List j2;
        TVUIResolution[] c2 = c();
        i = c2;
        j = C8600drp.e(c2);
        b = new d(null);
        j2 = C8569dql.j("TVUI_720P", "TVUI_1080P", "TVUI_4K");
        h = new C9033hu("TVUIResolution", j2);
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final TVUIResolution c(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = TVUIResolution.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((TVUIResolution) obj).b(), (Object) str)) {
                    break;
                }
            }
            TVUIResolution tVUIResolution = (TVUIResolution) obj;
            return tVUIResolution == null ? TVUIResolution.c : tVUIResolution;
        }
    }
}
