package org.intellij.markdown.ast.impl;

import java.util.List;
import o.C8632dsu;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.CompositeASTNode;

/* loaded from: classes5.dex */
public final class ListItemCompositeNode extends CompositeASTNode {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemCompositeNode(List<? extends ASTNode> list) {
        super(MarkdownElementTypes.LIST_ITEM, list);
        C8632dsu.c((Object) list, "");
    }
}
