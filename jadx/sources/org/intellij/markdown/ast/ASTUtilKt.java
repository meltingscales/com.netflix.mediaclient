package org.intellij.markdown.ast;

import o.C8632dsu;

/* loaded from: classes5.dex */
public final class ASTUtilKt {
    public static final CharSequence getTextInNode(ASTNode aSTNode, CharSequence charSequence) {
        C8632dsu.c((Object) aSTNode, "");
        C8632dsu.c((Object) charSequence, "");
        return charSequence.subSequence(aSTNode.getStartOffset(), aSTNode.getEndOffset());
    }
}
