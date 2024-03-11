package com.netflix.falcor.impl.parser;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class JsonGraphFormat {
    private static final /* synthetic */ JsonGraphFormat[] a;
    private static final /* synthetic */ InterfaceC8598drn c;
    public static final JsonGraphFormat d = new JsonGraphFormat("LEGACY", 0);
    public static final JsonGraphFormat e = new JsonGraphFormat("CANONICAL_V1", 1);

    private static final /* synthetic */ JsonGraphFormat[] d() {
        return new JsonGraphFormat[]{d, e};
    }

    public static JsonGraphFormat valueOf(String str) {
        return (JsonGraphFormat) Enum.valueOf(JsonGraphFormat.class, str);
    }

    public static JsonGraphFormat[] values() {
        return (JsonGraphFormat[]) a.clone();
    }

    private JsonGraphFormat(String str, int i) {
    }

    static {
        JsonGraphFormat[] d2 = d();
        a = d2;
        c = C8600drp.e(d2);
    }
}
