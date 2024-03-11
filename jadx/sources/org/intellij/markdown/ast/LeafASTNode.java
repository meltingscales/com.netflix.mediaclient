package org.intellij.markdown.ast;

import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public class LeafASTNode extends ASTNodeImpl {
    public static final Companion Companion = new Companion(null);
    private static final ArrayList<ASTNode> EMPTY_CHILDREN = new ArrayList<>(0);

    @Override // org.intellij.markdown.ast.ASTNode
    public List<ASTNode> getChildren() {
        return EMPTY_CHILDREN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeafASTNode(IElementType iElementType, int i, int i2) {
        super(iElementType, i, i2);
        C8632dsu.c((Object) iElementType, "");
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
