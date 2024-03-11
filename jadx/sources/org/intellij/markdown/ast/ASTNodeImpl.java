package org.intellij.markdown.ast;

import o.C8632dsu;
import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public abstract class ASTNodeImpl implements ASTNode {
    private final int endOffset;
    private ASTNode parent;
    private final int startOffset;
    private final IElementType type;

    @Override // org.intellij.markdown.ast.ASTNode
    public int getEndOffset() {
        return this.endOffset;
    }

    @Override // org.intellij.markdown.ast.ASTNode
    public int getStartOffset() {
        return this.startOffset;
    }

    @Override // org.intellij.markdown.ast.ASTNode
    public IElementType getType() {
        return this.type;
    }

    public final void setParent$markdown(ASTNode aSTNode) {
        this.parent = aSTNode;
    }

    public ASTNodeImpl(IElementType iElementType, int i, int i2) {
        C8632dsu.c((Object) iElementType, "");
        this.type = iElementType;
        this.startOffset = i;
        this.endOffset = i2;
    }
}
