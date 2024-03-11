package org.intellij.markdown.ast;

import java.util.List;

/* loaded from: classes5.dex */
public class CompositeASTNode extends ASTNodeImpl {
    private final List<ASTNode> children;

    @Override // org.intellij.markdown.ast.ASTNode
    public final List<ASTNode> getChildren() {
        return this.children;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CompositeASTNode(org.intellij.markdown.IElementType r4, java.util.List<? extends org.intellij.markdown.ast.ASTNode> r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            java.lang.Object r0 = o.C8570dqm.d(r5)
            org.intellij.markdown.ast.ASTNode r0 = (org.intellij.markdown.ast.ASTNode) r0
            r1 = 0
            if (r0 != 0) goto L13
            r0 = r1
            goto L17
        L13:
            int r0 = r0.getStartOffset()
        L17:
            java.lang.Object r2 = o.C8570dqm.i(r5)
            org.intellij.markdown.ast.ASTNode r2 = (org.intellij.markdown.ast.ASTNode) r2
            if (r2 != 0) goto L20
            goto L24
        L20:
            int r1 = r2.getEndOffset()
        L24:
            r3.<init>(r4, r0, r1)
            r3.children = r5
            java.util.Iterator r4 = r5.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r4.next()
            org.intellij.markdown.ast.ASTNode r5 = (org.intellij.markdown.ast.ASTNode) r5
            boolean r0 = r5 instanceof org.intellij.markdown.ast.ASTNodeImpl
            if (r0 == 0) goto L2d
            org.intellij.markdown.ast.ASTNodeImpl r5 = (org.intellij.markdown.ast.ASTNodeImpl) r5
            r5.setParent$markdown(r3)
            goto L2d
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.ast.CompositeASTNode.<init>(org.intellij.markdown.IElementType, java.util.List):void");
    }
}
