package org.intellij.markdown.html;

import o.C8672dug;
import o.duD;

/* loaded from: classes5.dex */
public final class CommonDefsImplJvmKt {
    public static final boolean isWhitespace(char c) {
        boolean c2;
        if (c != 0 && !Character.isSpaceChar(c)) {
            c2 = C8672dug.c(c);
            if (!c2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isPunctuation(char c) {
        return isAsciiPunctuationFix(c) || ((1676673024 >> Character.getType(c)) & 1) != 0;
    }

    private static final boolean isAsciiPunctuationFix(char c) {
        boolean a;
        a = duD.a((CharSequence) "$^`", c, false, 2, (Object) null);
        return a;
    }
}
