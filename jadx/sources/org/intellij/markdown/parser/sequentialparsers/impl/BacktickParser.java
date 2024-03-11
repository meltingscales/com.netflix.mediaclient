package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class BacktickParser implements SequentialParser {
    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        TokensCache.Iterator findOfSize;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        RangesListBuilder rangesListBuilder = new RangesListBuilder();
        TokensCache.Iterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        while (rangesListIterator.getType() != null) {
            if ((C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.BACKTICK) || C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.ESCAPED_BACKTICKS)) && (findOfSize = findOfSize(rangesListIterator.advance(), getLength(rangesListIterator, true))) != null) {
                parsingResultBuilder.withNode(new SequentialParser.Node(new C8654dtp(rangesListIterator.getIndex(), findOfSize.getIndex() + 1), MarkdownElementTypes.CODE_SPAN));
                rangesListIterator = findOfSize.advance();
            } else {
                rangesListBuilder.put(rangesListIterator.getIndex());
                rangesListIterator = rangesListIterator.advance();
            }
        }
        return parsingResultBuilder.withFurtherProcessing(rangesListBuilder.get());
    }

    private final TokensCache.Iterator findOfSize(TokensCache.Iterator iterator, int i) {
        while (iterator.getType() != null) {
            if ((C8632dsu.c(iterator.getType(), MarkdownTokenTypes.BACKTICK) || C8632dsu.c(iterator.getType(), MarkdownTokenTypes.ESCAPED_BACKTICKS)) && getLength(iterator, false) == i) {
                return iterator;
            }
            iterator = iterator.advance();
        }
        return null;
    }

    private final int getLength(TokensCache.Iterator iterator, boolean z) {
        return iterator.getLength() - (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.ESCAPED_BACKTICKS) ? z ? 2 : 1 : 0);
    }
}
