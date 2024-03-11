package org.intellij.markdown.parser.sequentialparsers.impl;

import java.util.Collection;
import java.util.List;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.sequentialparsers.LocalParsingResult;
import org.intellij.markdown.parser.sequentialparsers.RangesListBuilder;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParserUtil;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class LinkParserUtil {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final LocalParsingResult parseLinkDestination(TokensCache.Iterator iterator) {
            List e;
            C8632dsu.c((Object) iterator, "");
            if (!C8632dsu.c(iterator.getType(), MarkdownTokenTypes.EOL) && !C8632dsu.c(iterator.getType(), MarkdownTokenTypes.RPAREN)) {
                int index = iterator.getIndex();
                boolean c = C8632dsu.c(iterator.getType(), MarkdownTokenTypes.LT);
                if (c) {
                    iterator = iterator.advance();
                }
                boolean z = false;
                while (iterator.getType() != null && (!c || !C8632dsu.c(iterator.getType(), MarkdownTokenTypes.GT))) {
                    if (!c) {
                        if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.LPAREN)) {
                            if (z) {
                                break;
                            }
                            z = true;
                        }
                        IElementType rawLookup = iterator.rawLookup(1);
                        if (SequentialParserUtil.Companion.isWhitespace(iterator, 1) || rawLookup == null) {
                            break;
                        } else if (!C8632dsu.c(rawLookup, MarkdownTokenTypes.RPAREN)) {
                            continue;
                        } else if (!z) {
                            break;
                        } else {
                            z = false;
                        }
                    }
                    iterator = iterator.advance();
                }
                if (iterator.getType() != null && !z) {
                    e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(index, iterator.getIndex() + 1), MarkdownElementTypes.LINK_DESTINATION));
                    return new LocalParsingResult(iterator, e);
                }
            }
            return null;
        }

        public final LocalParsingResult parseLinkLabel(TokensCache.Iterator iterator) {
            IElementType iElementType;
            int index;
            List e;
            C8632dsu.c((Object) iterator, "");
            if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.LBRACKET)) {
                int index2 = iterator.getIndex();
                RangesListBuilder rangesListBuilder = new RangesListBuilder();
                TokensCache.Iterator advance = iterator.advance();
                while (true) {
                    IElementType type = advance.getType();
                    iElementType = MarkdownTokenTypes.RBRACKET;
                    if (C8632dsu.c(type, iElementType) || advance.getType() == null) {
                        break;
                    }
                    rangesListBuilder.put(advance.getIndex());
                    if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.LBRACKET)) {
                        break;
                    }
                    advance = advance.advance();
                }
                if (!C8632dsu.c(advance.getType(), iElementType) || (index = advance.getIndex()) == index2 + 1) {
                    return null;
                }
                e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(index2, index + 1), MarkdownElementTypes.LINK_LABEL));
                return new LocalParsingResult(advance, (Collection<SequentialParser.Node>) e, rangesListBuilder.get());
            }
            return null;
        }

        public final LocalParsingResult parseLinkText(TokensCache.Iterator iterator) {
            List e;
            C8632dsu.c((Object) iterator, "");
            if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.LBRACKET)) {
                int index = iterator.getIndex();
                RangesListBuilder rangesListBuilder = new RangesListBuilder();
                TokensCache.Iterator advance = iterator.advance();
                int i = 1;
                while (advance.getType() != null && (!C8632dsu.c(advance.getType(), MarkdownTokenTypes.RBRACKET) || i - 1 != 0)) {
                    rangesListBuilder.put(advance.getIndex());
                    if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.LBRACKET)) {
                        i++;
                    }
                    advance = advance.advance();
                }
                if (C8632dsu.c(advance.getType(), MarkdownTokenTypes.RBRACKET)) {
                    e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(index, advance.getIndex() + 1), MarkdownElementTypes.LINK_TEXT));
                    return new LocalParsingResult(advance, (Collection<SequentialParser.Node>) e, rangesListBuilder.get());
                }
                return null;
            }
            return null;
        }

        public final LocalParsingResult parseLinkTitle(TokensCache.Iterator iterator) {
            IElementType type;
            List e;
            C8632dsu.c((Object) iterator, "");
            if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.EOL)) {
                return null;
            }
            int index = iterator.getIndex();
            if (C8632dsu.c(iterator.getType(), MarkdownTokenTypes.SINGLE_QUOTE) || C8632dsu.c(iterator.getType(), MarkdownTokenTypes.DOUBLE_QUOTE)) {
                type = iterator.getType();
            } else if (!C8632dsu.c(iterator.getType(), MarkdownTokenTypes.LPAREN)) {
                return null;
            } else {
                type = MarkdownTokenTypes.RPAREN;
            }
            TokensCache.Iterator advance = iterator.advance();
            while (advance.getType() != null && !C8632dsu.c(advance.getType(), type)) {
                advance = advance.advance();
            }
            if (advance.getType() != null) {
                e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(index, advance.getIndex() + 1), MarkdownElementTypes.LINK_TITLE));
                return new LocalParsingResult(advance, e);
            }
            return null;
        }
    }
}
