package org.intellij.markdown.parser;

import java.util.Collection;
import java.util.List;
import o.C8566dqi;
import o.C8576dqs;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.ASTNodeBuilder;
import org.intellij.markdown.ast.CompositeASTNode;
import org.intellij.markdown.ast.LeafASTNode;
import org.intellij.markdown.flavours.MarkdownFlavourDescriptor;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.sequentialparsers.LexerBasedTokensCache;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParserUtil;

/* loaded from: classes5.dex */
public final class MarkdownParser {
    private final boolean assertionsEnabled;
    private final MarkdownFlavourDescriptor flavour;

    public MarkdownParser(MarkdownFlavourDescriptor markdownFlavourDescriptor, boolean z) {
        C8632dsu.c((Object) markdownFlavourDescriptor, "");
        this.flavour = markdownFlavourDescriptor;
        this.assertionsEnabled = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarkdownParser(MarkdownFlavourDescriptor markdownFlavourDescriptor) {
        this(markdownFlavourDescriptor, true);
        C8632dsu.c((Object) markdownFlavourDescriptor, "");
    }

    public final ASTNode buildMarkdownTreeFromString(String str) {
        C8632dsu.c((Object) str, "");
        return parse(MarkdownElementTypes.MARKDOWN_FILE, str, true);
    }

    public final ASTNode parse(IElementType iElementType, String str, boolean z) {
        C8632dsu.c((Object) iElementType, "");
        C8632dsu.c((Object) str, "");
        try {
            return doParse(iElementType, str, z);
        } catch (MarkdownParsingException e) {
            if (this.assertionsEnabled) {
                throw e;
            }
            return topLevelFallback(iElementType, str);
        }
    }

    public final ASTNode parseInline(IElementType iElementType, CharSequence charSequence, int i, int i2) {
        C8632dsu.c((Object) iElementType, "");
        C8632dsu.c((Object) charSequence, "");
        try {
            return doParseInline(iElementType, charSequence, i, i2);
        } catch (MarkdownParsingException e) {
            if (this.assertionsEnabled) {
                throw e;
            }
            return inlineFallback(iElementType, i, i2);
        }
    }

    private final ASTNode doParse(IElementType iElementType, String str, boolean z) {
        ASTNodeBuilder aSTNodeBuilder;
        ProductionHolder productionHolder = new ProductionHolder();
        MarkerProcessor<?> createMarkerProcessor = this.flavour.getMarkerProcessorFactory().createMarkerProcessor(productionHolder);
        ProductionHolder.Marker mark = productionHolder.mark();
        for (LookaheadText.Position startPosition = new LookaheadText(str).getStartPosition(); startPosition != null; startPosition = createMarkerProcessor.processPosition(startPosition)) {
            productionHolder.updatePosition(startPosition.getOffset());
        }
        productionHolder.updatePosition(str.length());
        createMarkerProcessor.flushMarkers();
        mark.done(iElementType);
        if (z) {
            aSTNodeBuilder = new InlineExpandingASTNodeBuilder(this, str);
        } else {
            aSTNodeBuilder = new ASTNodeBuilder(str);
        }
        return new TopLevelBuilder(aSTNodeBuilder).buildTree(productionHolder.getProduction());
    }

    private final ASTNode doParseInline(IElementType iElementType, CharSequence charSequence, int i, int i2) {
        List e;
        List<SequentialParser.Node> g;
        MarkdownLexer createInlinesLexer = this.flavour.createInlinesLexer();
        MarkdownLexer.start$default(createInlinesLexer, charSequence, i, i2, 0, 8, null);
        LexerBasedTokensCache lexerBasedTokensCache = new LexerBasedTokensCache(createInlinesLexer);
        C8654dtp c8654dtp = new C8654dtp(0, lexerBasedTokensCache.getFilteredTokens().size());
        Collection<SequentialParser.Node> runParsingSequence = this.flavour.getSequentialParserManager().runParsingSequence(lexerBasedTokensCache, SequentialParserUtil.Companion.filterBlockquotes(lexerBasedTokensCache, c8654dtp));
        InlineBuilder inlineBuilder = new InlineBuilder(new ASTNodeBuilder(charSequence), lexerBasedTokensCache);
        e = C8566dqi.e(new SequentialParser.Node(c8654dtp, iElementType));
        g = C8576dqs.g((Collection) runParsingSequence, (Iterable) e);
        return inlineBuilder.buildTree(g);
    }

    private final ASTNode topLevelFallback(IElementType iElementType, String str) {
        List e;
        e = C8566dqi.e(inlineFallback(MarkdownElementTypes.PARAGRAPH, 0, str.length()));
        return new CompositeASTNode(iElementType, e);
    }

    private final ASTNode inlineFallback(IElementType iElementType, int i, int i2) {
        List e;
        e = C8566dqi.e(new LeafASTNode(MarkdownTokenTypes.TEXT, i, i2));
        return new CompositeASTNode(iElementType, e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class InlineExpandingASTNodeBuilder extends ASTNodeBuilder {
        final /* synthetic */ MarkdownParser this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InlineExpandingASTNodeBuilder(MarkdownParser markdownParser, CharSequence charSequence) {
            super(charSequence);
            C8632dsu.c((Object) markdownParser, "");
            C8632dsu.c((Object) charSequence, "");
            this.this$0 = markdownParser;
        }

        @Override // org.intellij.markdown.ast.ASTNodeBuilder
        public List<ASTNode> createLeafNodes(IElementType iElementType, int i, int i2) {
            List<ASTNode> e;
            C8632dsu.c((Object) iElementType, "");
            if (C8632dsu.c(iElementType, MarkdownElementTypes.PARAGRAPH) || C8632dsu.c(iElementType, MarkdownTokenTypes.ATX_CONTENT) || C8632dsu.c(iElementType, MarkdownTokenTypes.SETEXT_CONTENT) || C8632dsu.c(iElementType, GFMTokenTypes.CELL)) {
                e = C8566dqi.e(this.this$0.parseInline(iElementType, getText(), i, i2));
                return e;
            }
            return super.createLeafNodes(iElementType, i, i2);
        }
    }
}
