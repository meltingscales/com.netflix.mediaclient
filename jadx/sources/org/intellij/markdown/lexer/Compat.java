package org.intellij.markdown.lexer;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class Compat {
    public static final Compat INSTANCE = new Compat();

    public final int charCount(int i) {
        return i >= 65536 ? 2 : 1;
    }

    public final int toCodePoint(char c, char c2) {
        return ((c << '\n') + c2) - 56613888;
    }

    private Compat() {
    }

    public final int offsetByCodePoints(CharSequence charSequence, int i, int i2) {
        C8632dsu.c((Object) charSequence, "");
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i < length && i3 < i2) {
                int i4 = i + 1;
                i = (Character.isHighSurrogate(charSequence.charAt(i)) && i4 < length && Character.isLowSurrogate(charSequence.charAt(i4))) ? i + 2 : i4;
                i3++;
            }
            if (i3 < i2) {
                throw new IndexOutOfBoundsException();
            }
        } else {
            while (i > 0 && i2 < 0) {
                int i5 = i - 1;
                i = (Character.isLowSurrogate(charSequence.charAt(i5)) && i5 > 0 && Character.isHighSurrogate(charSequence.charAt(i + (-2)))) ? i - 2 : i5;
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
        }
        return i;
    }

    public final int codePointAt(CharSequence charSequence, int i) {
        int i2;
        C8632dsu.c((Object) charSequence, "");
        char charAt = charSequence.charAt(i);
        if (Character.isHighSurrogate(charAt) && (i2 = i + 1) < charSequence.length()) {
            char charAt2 = charSequence.charAt(i2);
            if (Character.isLowSurrogate(charAt2)) {
                return toCodePoint(charAt, charAt2);
            }
        }
        return charAt;
    }
}
