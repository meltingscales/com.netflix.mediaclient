package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.Collection;
import java.util.List;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;
import org.intellij.markdown.parser.sequentialparsers.impl.LinkParserUtil;

/* loaded from: classes5.dex */
public final class InlineLinkParser implements SequentialParser {
    public static final Companion Companion = new Companion(null);

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        LocalParsingResult parseInlineLink;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        RangesListBuilder rangesListBuilder = new RangesListBuilder();
        TokensCache.Iterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        while (rangesListIterator.getType() != null) {
            if (C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.LBRACKET) && (parseInlineLink = Companion.parseInlineLink(rangesListIterator)) != null) {
                rangesListIterator = parseInlineLink.getIteratorPosition().advance();
                parsingResultBuilder = parsingResultBuilder.withOtherParsingResult(parseInlineLink);
            } else {
                rangesListBuilder.put(rangesListIterator.getIndex());
                rangesListIterator = rangesListIterator.advance();
            }
        }
        return parsingResultBuilder.withFurtherProcessing(rangesListBuilder.get());
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final LocalParsingResult parseInlineLink(TokensCache.Iterator iterator) {
            List g;
            List g2;
            List b;
            C8632dsu.c((Object) iterator, "");
            int index = iterator.getIndex();
            LinkParserUtil.Companion companion = LinkParserUtil.Companion;
            LocalParsingResult parseLinkText = companion.parseLinkText(iterator);
            if (parseLinkText == null) {
                return null;
            }
            TokensCache.Iterator iteratorPosition = parseLinkText.getIteratorPosition();
            if (C8632dsu.c(iteratorPosition.rawLookup(1), MarkdownTokenTypes.LPAREN)) {
                TokensCache.Iterator advance = iteratorPosition.advance().advance();
                IElementType type = advance.getType();
                IElementType iElementType = MarkdownTokenTypes.EOL;
                if (C8632dsu.c(type, iElementType)) {
                    advance = advance.advance();
                }
                LocalParsingResult parseLinkDestination = companion.parseLinkDestination(advance);
                if (parseLinkDestination != null) {
                    advance = parseLinkDestination.getIteratorPosition().advance();
                    if (C8632dsu.c(advance.getType(), iElementType)) {
                        advance = advance.advance();
                    }
                }
                LocalParsingResult parseLinkTitle = companion.parseLinkTitle(advance);
                if (parseLinkTitle != null) {
                    advance = parseLinkTitle.getIteratorPosition().advance();
                    if (C8632dsu.c(advance.getType(), iElementType)) {
                        advance = advance.advance();
                    }
                }
                if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.RPAREN)) {
                    Collection<SequentialParser.Node> parsedNodes = parseLinkText.getParsedNodes();
                    Collection<SequentialParser.Node> parsedNodes2 = parseLinkDestination == null ? null : parseLinkDestination.getParsedNodes();
                    g = C8576dqs.g((Collection) parsedNodes, parsedNodes2 == null ? C8569dql.i() : parsedNodes2);
                    Collection<SequentialParser.Node> parsedNodes3 = parseLinkTitle != null ? parseLinkTitle.getParsedNodes() : null;
                    g2 = C8576dqs.g((Collection) g, parsedNodes3 == null ? C8569dql.i() : parsedNodes3);
                    b = C8576dqs.b((Collection<? extends SequentialParser.Node>) ((Collection<? extends Object>) g2), new SequentialParser.Node(new C8654dtp(index, advance.getIndex() + 1), MarkdownElementTypes.INLINE_LINK));
                    return new LocalParsingResult(advance, b, parseLinkText.getRangesToProcessFurther());
                }
                return null;
            }
            return null;
        }
    }
}
