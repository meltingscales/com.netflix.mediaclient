package org.intellij.markdown.lexer;

import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public interface GeneratedLexer {
    IElementType advance();

    int getState();

    int getTokenEnd();

    int getTokenStart();

    void reset(CharSequence charSequence, int i, int i2, int i3);
}
