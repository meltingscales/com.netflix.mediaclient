package org.intellij.markdown.parser;

import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.ASTNodeBuilder;
import org.intellij.markdown.parser.TreeBuilder;

/* loaded from: classes5.dex */
public final class TopLevelBuilder extends TreeBuilder {
    @Override // org.intellij.markdown.parser.TreeBuilder
    protected void flushEverythingBeforeEvent(TreeBuilder.MyEvent myEvent, List<TreeBuilder.MyASTNodeWrapper> list) {
        C8632dsu.c((Object) myEvent, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopLevelBuilder(ASTNodeBuilder aSTNodeBuilder) {
        super(aSTNodeBuilder);
        C8632dsu.c((Object) aSTNodeBuilder, "");
    }

    @Override // org.intellij.markdown.parser.TreeBuilder
    protected TreeBuilder.MyASTNodeWrapper createASTNodeOnClosingEvent(TreeBuilder.MyEvent myEvent, List<TreeBuilder.MyASTNodeWrapper> list, boolean z) {
        Object x;
        Object B;
        Object B2;
        Object y;
        C8632dsu.c((Object) myEvent, "");
        C8632dsu.c((Object) list, "");
        IElementType type = myEvent.getInfo().getType();
        int d = myEvent.getInfo().getRange().d();
        int e = myEvent.getInfo().getRange().e();
        if ((type instanceof MarkdownElementType) && ((MarkdownElementType) type).isToken()) {
            y = C8576dqs.y(getNodeBuilder().createLeafNodes(type, d, e));
            return new TreeBuilder.MyASTNodeWrapper((ASTNode) y, d, e);
        }
        ArrayList arrayList = new ArrayList(list.size());
        x = C8576dqs.x(list);
        TreeBuilder.MyASTNodeWrapper myASTNodeWrapper = (TreeBuilder.MyASTNodeWrapper) x;
        addRawTokens(arrayList, d, myASTNodeWrapper == null ? e : myASTNodeWrapper.getStartTokenIndex());
        int size = list.size() - 1;
        int i = 1;
        if (1 <= size) {
            while (true) {
                TreeBuilder.MyASTNodeWrapper myASTNodeWrapper2 = list.get(i - 1);
                arrayList.add(myASTNodeWrapper2.getAstNode());
                addRawTokens(arrayList, myASTNodeWrapper2.getEndTokenIndex(), list.get(i).getStartTokenIndex());
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        if (!list.isEmpty()) {
            B = C8576dqs.B((List<? extends Object>) list);
            arrayList.add(((TreeBuilder.MyASTNodeWrapper) B).getAstNode());
            B2 = C8576dqs.B((List<? extends Object>) list);
            addRawTokens(arrayList, ((TreeBuilder.MyASTNodeWrapper) B2).getEndTokenIndex(), e);
        }
        return new TreeBuilder.MyASTNodeWrapper(getNodeBuilder().createCompositeNode(type, arrayList), d, e);
    }

    private final void addRawTokens(List<ASTNode> list, int i, int i2) {
        if (i != i2) {
            list.addAll(getNodeBuilder().createLeafNodes(MarkdownTokenTypes.WHITE_SPACE, i, i2));
        }
    }
}
