package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class AutolinkParser implements SequentialParser {
    private final List<IElementType> typesAfterLT;

    /* JADX WARN: Multi-variable type inference failed */
    public AutolinkParser(List<? extends IElementType> list) {
        C8632dsu.c((Object) list, "");
        this.typesAfterLT = list;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser
    public SequentialParser.ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list) {
        IElementType rawLookup;
        IElementType iElementType;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        SequentialParser.ParsingResultBuilder parsingResultBuilder = new SequentialParser.ParsingResultBuilder();
        RangesListBuilder rangesListBuilder = new RangesListBuilder();
        TokensCache.RangesListIterator rangesListIterator = new TokensCache.RangesListIterator(tokensCache, list);
        while (rangesListIterator.getType() != null) {
            if (C8632dsu.c(rangesListIterator.getType(), MarkdownTokenTypes.LT) && (rawLookup = rangesListIterator.rawLookup(1)) != null && this.typesAfterLT.contains(rawLookup)) {
                int index = rangesListIterator.getIndex();
                while (true) {
                    IElementType type = rangesListIterator.getType();
                    iElementType = MarkdownTokenTypes.GT;
                    if (C8632dsu.c(type, iElementType) || rangesListIterator.getType() == null) {
                        break;
                    }
                    rangesListIterator = rangesListIterator.advance();
                }
                if (C8632dsu.c(rangesListIterator.getType(), iElementType)) {
                    parsingResultBuilder.withNode(new SequentialParser.Node(new C8654dtp(index, rangesListIterator.getIndex() + 1), MarkdownElementTypes.AUTOLINK));
                }
            } else {
                rangesListBuilder.put(rangesListIterator.getIndex());
            }
            rangesListIterator = rangesListIterator.advance();
        }
        return parsingResultBuilder.withFurtherProcessing(rangesListBuilder.get());
    }
}
