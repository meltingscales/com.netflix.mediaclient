package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

/* loaded from: classes5.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final String a;
    public static final DefaultIndenter d;
    private static final long serialVersionUID = 1;
    private final int c;
    private final String e;
    private final char[] j;

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
    public boolean d() {
        return false;
    }

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        a = str;
        d = new DefaultIndenter("  ", str);
    }

    public DefaultIndenter() {
        this("  ", a);
    }

    public DefaultIndenter(String str, String str2) {
        this.c = str.length();
        this.j = new char[str.length() * 16];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.j, i);
            i += str.length();
        }
        this.e = str2;
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.d
    public void a(JsonGenerator jsonGenerator, int i) {
        jsonGenerator.b(this.e);
        if (i <= 0) {
            return;
        }
        int i2 = i * this.c;
        while (true) {
            char[] cArr = this.j;
            if (i2 > cArr.length) {
                jsonGenerator.e(cArr, 0, cArr.length);
                i2 -= this.j.length;
            } else {
                jsonGenerator.e(cArr, 0, i2);
                return;
            }
        }
    }
}
