package org.intellij.markdown.ast;

import java.util.List;
import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public interface ASTNode {
    List<ASTNode> getChildren();

    int getEndOffset();

    int getStartOffset();

    IElementType getType();
}
