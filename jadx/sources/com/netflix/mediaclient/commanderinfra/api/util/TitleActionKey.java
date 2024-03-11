package com.netflix.mediaclient.commanderinfra.api.util;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TitleActionKey {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ TitleActionKey[] b;
    public static final TitleActionKey c = new TitleActionKey("Play", 0);

    private static final /* synthetic */ TitleActionKey[] c() {
        return new TitleActionKey[]{c};
    }

    public static TitleActionKey valueOf(String str) {
        return (TitleActionKey) Enum.valueOf(TitleActionKey.class, str);
    }

    public static TitleActionKey[] values() {
        return (TitleActionKey[]) b.clone();
    }

    private TitleActionKey(String str, int i) {
    }

    static {
        TitleActionKey[] c2 = c();
        b = c2;
        a = C8600drp.e(c2);
    }
}
