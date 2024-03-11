package com.netflix.mediaclient.ui.playercontrolscompose.impl.components;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TranslateOrigin {
    private static final /* synthetic */ InterfaceC8598drn a;
    public static final TranslateOrigin c = new TranslateOrigin("Top", 0);
    public static final TranslateOrigin d = new TranslateOrigin("Bottom", 1);
    private static final /* synthetic */ TranslateOrigin[] e;

    private static final /* synthetic */ TranslateOrigin[] e() {
        return new TranslateOrigin[]{c, d};
    }

    public static TranslateOrigin valueOf(String str) {
        return (TranslateOrigin) Enum.valueOf(TranslateOrigin.class, str);
    }

    public static TranslateOrigin[] values() {
        return (TranslateOrigin[]) e.clone();
    }

    private TranslateOrigin(String str, int i) {
    }

    static {
        TranslateOrigin[] e2 = e();
        e = e2;
        a = C8600drp.e(e2);
    }
}
