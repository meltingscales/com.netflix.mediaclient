package com.netflix.hawkins.internal.material3;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextFieldType {
    private static final /* synthetic */ TextFieldType[] c;
    private static final /* synthetic */ InterfaceC8598drn d;
    public static final TextFieldType b = new TextFieldType("Filled", 0);
    public static final TextFieldType e = new TextFieldType("Outlined", 1);
    public static final TextFieldType a = new TextFieldType("Hawkins", 2);

    private static final /* synthetic */ TextFieldType[] b() {
        return new TextFieldType[]{b, e, a};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) c.clone();
    }

    private TextFieldType(String str, int i) {
    }

    static {
        TextFieldType[] b2 = b();
        c = b2;
        d = C8600drp.e(b2);
    }
}
