package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.List;
import kotlin.Pair;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.DelimiterParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class EmphStrongDelimiterParser extends DelimiterParser {
    public static final Companion Companion = new Companion(null);

    @Override // org.intellij.markdown.parser.sequentialparsers.DelimiterParser
    public int scan(TokensCache tokensCache, TokensCache.Iterator iterator, List<DelimiterParser.Info> list) {
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) list, "");
        int i = 0;
        if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.EMPH)) {
            char type = DelimiterParser.Companion.getType(iterator);
            TokensCache.Iterator iterator2 = iterator;
            int i2 = 0;
            int i3 = 1;
            do {
                i2++;
                if (!C8632dsu.c(iterator2.rawLookup(1), MarkdownTokenTypes.EMPH) || DelimiterParser.Companion.getType(iterator2.advance()) != type) {
                    break;
                }
                iterator2 = iterator2.advance();
                i3++;
            } while (i2 < 50);
            int i4 = i3;
            Pair<Boolean, Boolean> canOpenClose = canOpenClose(tokensCache, iterator, iterator2, type == '*');
            boolean booleanValue = canOpenClose.b().booleanValue();
            boolean booleanValue2 = canOpenClose.c().booleanValue();
            if (i4 > 0) {
                while (true) {
                    IElementType iElementType = MarkdownTokenTypes.EMPH;
                    int index = iterator.getIndex() + i;
                    i++;
                    list.add(new DelimiterParser.Info(iElementType, index, i4, booleanValue, booleanValue2, type, 0, 64, null));
                    if (i >= i4) {
                        break;
                    }
                }
            }
            return i4;
        }
        return 0;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.DelimiterParser
    public void process(TokensCache tokensCache, TokensCache.Iterator iterator, List<DelimiterParser.Info> list, SequentialParser.ParsingResultBuilder parsingResultBuilder) {
        SequentialParser.Node node;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) parsingResultBuilder, "");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (z) {
                z = false;
            } else {
                DelimiterParser.Info info = list.get(size);
                if (C8632dsu.c(info.getTokenType(), MarkdownTokenTypes.EMPH) && info.getCloserIndex() != -1) {
                    z = Companion.areAdjacentSameMarkers(list, size, info.getCloserIndex());
                    DelimiterParser.Info info2 = list.get(info.getCloserIndex());
                    if (z) {
                        node = new SequentialParser.Node(new C8654dtp(info.getPosition() - 1, info2.getPosition() + 2), MarkdownElementTypes.STRONG);
                    } else {
                        node = new SequentialParser.Node(new C8654dtp(info.getPosition(), info2.getPosition() + 1), MarkdownElementTypes.EMPH);
                    }
                    parsingResultBuilder.withNode(node);
                }
            }
            if (i < 0) {
                return;
            }
            size = i;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean areAdjacentSameMarkers(List<DelimiterParser.Info> list, int i, int i2) {
            C8632dsu.c((Object) list, "");
            DelimiterParser.Info info = list.get(i);
            DelimiterParser.Info info2 = list.get(i2);
            if (i > 0) {
                int i3 = i - 1;
                if (list.get(i3).getCloserIndex() == info.getCloserIndex() + 1 && list.get(i3).getMarker() == info.getMarker() && list.get(i3).getPosition() == info.getPosition() - 1 && list.get(info.getCloserIndex() + 1).getPosition() == info2.getPosition() + 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
