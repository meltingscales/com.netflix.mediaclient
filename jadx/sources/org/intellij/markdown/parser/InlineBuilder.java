package org.intellij.markdown.parser;

import java.util.ArrayList;
import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.ASTNodeBuilder;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.TreeBuilder;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class InlineBuilder extends TreeBuilder {
    private int currentTokenPosition;
    private final TokensCache tokensCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineBuilder(ASTNodeBuilder aSTNodeBuilder, TokensCache tokensCache) {
        super(aSTNodeBuilder);
        C8632dsu.c((Object) aSTNodeBuilder, "");
        C8632dsu.c((Object) tokensCache, "");
        this.tokensCache = tokensCache;
        this.currentTokenPosition = -1;
    }

    @Override // org.intellij.markdown.parser.TreeBuilder
    protected void flushEverythingBeforeEvent(TreeBuilder.MyEvent myEvent, List<TreeBuilder.MyASTNodeWrapper> list) {
        C8632dsu.c((Object) myEvent, "");
        if (this.currentTokenPosition == -1) {
            this.currentTokenPosition = myEvent.getPosition();
        }
        while (this.currentTokenPosition < myEvent.getPosition()) {
            flushOneTokenToTree(this.tokensCache, list, this.currentTokenPosition);
            this.currentTokenPosition++;
        }
    }

    private final void flushOneTokenToTree(TokensCache tokensCache, List<TreeBuilder.MyASTNodeWrapper> list, int i) {
        TokensCache.Iterator iterator = new TokensCache.Iterator(tokensCache, i);
        Compat compat = Compat.INSTANCE;
        if (iterator.getType() != null) {
            ASTNodeBuilder nodeBuilder = getNodeBuilder();
            IElementType type = iterator.getType();
            C8632dsu.d(type);
            for (ASTNode aSTNode : nodeBuilder.createLeafNodes(type, iterator.getStart(), iterator.getEnd())) {
                if (list != null) {
                    list.add(new TreeBuilder.MyASTNodeWrapper(aSTNode, iterator.getIndex(), iterator.getIndex() + 1));
                }
            }
            return;
        }
        throw new MarkdownParsingException("");
    }

    @Override // org.intellij.markdown.parser.TreeBuilder
    protected TreeBuilder.MyASTNodeWrapper createASTNodeOnClosingEvent(TreeBuilder.MyEvent myEvent, List<TreeBuilder.MyASTNodeWrapper> list, boolean z) {
        Object B;
        TreeBuilder.MyASTNodeWrapper myASTNodeWrapper;
        C8632dsu.c((Object) myEvent, "");
        C8632dsu.c((Object) list, "");
        IElementType type = myEvent.getInfo().getType();
        int d = myEvent.getInfo().getRange().d();
        int e = myEvent.getInfo().getRange().e();
        ArrayList arrayList = new ArrayList(list.size());
        if (z) {
            addRawTokens(this.tokensCache, arrayList, d, -1, -1);
        }
        int size = list.size();
        if (1 < size) {
            int i = 1;
            while (true) {
                int i2 = i + 1;
                arrayList.add(list.get(i - 1).getAstNode());
                addRawTokens(this.tokensCache, arrayList, myASTNodeWrapper.getEndTokenIndex() - 1, 1, new TokensCache.Iterator(this.tokensCache, list.get(i).getStartTokenIndex()).getStart());
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        if (!list.isEmpty()) {
            B = C8576dqs.B((List<? extends Object>) list);
            arrayList.add(((TreeBuilder.MyASTNodeWrapper) B).getAstNode());
        }
        if (z) {
            TokensCache tokensCache = this.tokensCache;
            addRawTokens(tokensCache, arrayList, e - 1, 1, new TokensCache.Iterator(tokensCache, e).getStart());
        }
        return new TreeBuilder.MyASTNodeWrapper(getNodeBuilder().createCompositeNode(type, arrayList), d, e);
    }

    private final void addRawTokens(TokensCache tokensCache, List<ASTNode> list, int i, int i2, int i3) {
        TokensCache.Iterator iterator = new TokensCache.Iterator(tokensCache, i);
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (iterator.rawLookup(i5) == null || iterator.rawStart(i5) == i3) {
                break;
            }
            i4 = i5;
        }
        while (i4 != 0) {
            IElementType rawLookup = iterator.rawLookup(i4);
            C8632dsu.d(rawLookup);
            list.addAll(getNodeBuilder().createLeafNodes(rawLookup, iterator.rawStart(i4), iterator.rawStart(i4 + 1)));
            i4 -= i2;
        }
    }
}
