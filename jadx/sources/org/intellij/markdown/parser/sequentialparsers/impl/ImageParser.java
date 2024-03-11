package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class ImageParser implements SequentialParser {
    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        RangesListBuilder rangesListBuilder = new RangesListBuilder();
        TokensCache.Iterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        while (rangesListIterator.getType() != null) {
            if (C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.EXCLAMATION_MARK) && C8632dsu.c(rangesListIterator.rawLookup(1), MarkdownTokenTypes.LBRACKET)) {
                LocalParsingResult parseInlineLink = InlineLinkParser.Companion.parseInlineLink(rangesListIterator.advance());
                if (parseInlineLink == null) {
                    parseInlineLink = ReferenceLinkParser.Companion.parseReferenceLink(rangesListIterator.advance());
                }
                if (parseInlineLink != null) {
                    parsingResultBuilder = parsingResultBuilder.withNode(new SequentialParser.Node(new C8654dtp(rangesListIterator.getIndex(), parseInlineLink.getIteratorPosition().getIndex() + 1), MarkdownElementTypes.IMAGE)).withOtherParsingResult(parseInlineLink);
                    rangesListIterator = parseInlineLink.getIteratorPosition().advance();
                }
            }
            rangesListBuilder.put(rangesListIterator.getIndex());
            rangesListIterator = rangesListIterator.advance();
        }
        return parsingResultBuilder.withFurtherProcessing(rangesListBuilder.get());
    }
}
