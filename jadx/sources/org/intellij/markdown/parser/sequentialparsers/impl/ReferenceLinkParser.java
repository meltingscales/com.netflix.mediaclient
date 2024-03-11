package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.Collection;
import java.util.List;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;
import org.intellij.markdown.parser.sequentialparsers.impl.LinkParserUtil;

/* loaded from: classes5.dex */
public final class ReferenceLinkParser implements SequentialParser {
    public static final Companion Companion = new Companion(null);

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        LocalParsingResult parseReferenceLink;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        RangesListBuilder rangesListBuilder = new RangesListBuilder();
        TokensCache.Iterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        while (rangesListIterator.getType() != null) {
            if (C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.LBRACKET) && (parseReferenceLink = Companion.parseReferenceLink(rangesListIterator)) != null) {
                rangesListIterator = parseReferenceLink.getIteratorPosition().advance();
                parsingResultBuilder = parsingResultBuilder.withOtherParsingResult(parseReferenceLink);
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

        public final LocalParsingResult parseReferenceLink(TokensCache.Iterator iterator) {
            C8632dsu.c((Object) iterator, "");
            LocalParsingResult parseFullReferenceLink = parseFullReferenceLink(iterator);
            return parseFullReferenceLink == null ? parseShortReferenceLink(iterator) : parseFullReferenceLink;
        }

        private final LocalParsingResult parseFullReferenceLink(TokensCache.Iterator iterator) {
            List g;
            List b;
            List g2;
            int index = iterator.getIndex();
            LinkParserUtil.Companion companion = LinkParserUtil.Companion;
            LocalParsingResult parseLinkText = companion.parseLinkText(iterator);
            if (parseLinkText == null) {
                return null;
            }
            TokensCache.Iterator advance = parseLinkText.getIteratorPosition().advance();
            if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.EOL)) {
                advance = advance.advance();
            }
            LocalParsingResult parseLinkLabel = companion.parseLinkLabel(advance);
            if (parseLinkLabel == null) {
                return null;
            }
            TokensCache.Iterator iteratorPosition = parseLinkLabel.getIteratorPosition();
            g = C8576dqs.g((Collection) parseLinkText.getParsedNodes(), (Iterable) parseLinkLabel.getParsedNodes());
            b = C8576dqs.b((Collection<? extends SequentialParser.Node>) ((Collection<? extends Object>) g), new SequentialParser.Node(new C8654dtp(index, iteratorPosition.getIndex() + 1), MarkdownElementTypes.FULL_REFERENCE_LINK));
            g2 = C8576dqs.g((Collection) parseLinkText.getRangesToProcessFurther(), (Iterable) parseLinkLabel.getRangesToProcessFurther());
            return new LocalParsingResult(iteratorPosition, (Collection<SequentialParser.Node>) b, (Collection<? extends List<C8654dtp>>) g2);
        }

        private final LocalParsingResult parseShortReferenceLink(TokensCache.Iterator iterator) {
            List b;
            int index = iterator.getIndex();
            LocalParsingResult parseLinkLabel = LinkParserUtil.Companion.parseLinkLabel(iterator);
            if (parseLinkLabel == null) {
                return null;
            }
            TokensCache.Iterator iteratorPosition = parseLinkLabel.getIteratorPosition();
            TokensCache.Iterator advance = iteratorPosition.advance();
            if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.EOL)) {
                advance = advance.advance();
            }
            if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.LBRACKET) && C8632dsu.c(advance.rawLookup(1), MarkdownTokenTypes.RBRACKET)) {
                iteratorPosition = advance.advance();
            }
            b = C8576dqs.b((Collection<? extends SequentialParser.Node>) ((Collection<? extends Object>) parseLinkLabel.getParsedNodes()), new SequentialParser.Node(new C8654dtp(index, iteratorPosition.getIndex() + 1), MarkdownElementTypes.SHORT_REFERENCE_LINK));
            return new LocalParsingResult(iteratorPosition, b, parseLinkLabel.getRangesToProcessFurther());
        }
    }
}
