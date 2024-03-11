package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.List;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.lexer.TokenInfo;

/* loaded from: classes5.dex */
public final class LexerBasedTokensCache extends TokensCache {
    public static final Companion Companion = new Companion(null);
    private final List<TokenInfo> cachedTokens;
    private final List<TokenInfo> filteredTokens;
    private final CharSequence originalText;
    private final C8654dtp originalTextRange;

    @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache
    public List<TokenInfo> getCachedTokens() {
        return this.cachedTokens;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache
    public List<TokenInfo> getFilteredTokens() {
        return this.filteredTokens;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache
    public CharSequence getOriginalText() {
        return this.originalText;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache
    public C8654dtp getOriginalTextRange() {
        return this.originalTextRange;
    }

    public LexerBasedTokensCache(MarkdownLexer markdownLexer) {
        C8654dtp g;
        C8632dsu.c((Object) markdownLexer, "");
        Companion.ResultOfCaching cacheTokens = Companion.cacheTokens(markdownLexer);
        List<TokenInfo> component1 = cacheTokens.component1();
        List<TokenInfo> component2 = cacheTokens.component2();
        this.cachedTokens = component1;
        this.filteredTokens = component2;
        this.originalText = markdownLexer.getOriginalText();
        g = C8657dts.g(markdownLexer.getBufferStart(), markdownLexer.getBufferEnd());
        this.originalTextRange = g;
        verify();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        private final boolean isWhitespace(IElementType iElementType) {
            return C8632dsu.c(iElementType, MarkdownTokenTypes.WHITE_SPACE);
        }

        /* loaded from: classes5.dex */
        public static final class ResultOfCaching {
            private final List<TokenInfo> cachedTokens;
            private final List<TokenInfo> filteredTokens;

            public final List<TokenInfo> component1() {
                return this.cachedTokens;
            }

            public final List<TokenInfo> component2() {
                return this.filteredTokens;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ResultOfCaching) {
                    ResultOfCaching resultOfCaching = (ResultOfCaching) obj;
                    return C8632dsu.c(this.cachedTokens, resultOfCaching.cachedTokens) && C8632dsu.c(this.filteredTokens, resultOfCaching.filteredTokens);
                }
                return false;
            }

            public int hashCode() {
                return (this.cachedTokens.hashCode() * 31) + this.filteredTokens.hashCode();
            }

            public String toString() {
                return "ResultOfCaching(cachedTokens=" + this.cachedTokens + ", filteredTokens=" + this.filteredTokens + ')';
            }

            public ResultOfCaching(List<TokenInfo> list, List<TokenInfo> list2) {
                C8632dsu.c((Object) list, "");
                C8632dsu.c((Object) list2, "");
                this.cachedTokens = list;
                this.filteredTokens = list2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResultOfCaching cacheTokens(MarkdownLexer markdownLexer) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (markdownLexer.getType() != null) {
                boolean isWhitespace = isWhitespace(markdownLexer.getType());
                TokenInfo tokenInfo = new TokenInfo(markdownLexer.getType(), markdownLexer.getTokenStart(), markdownLexer.getTokenEnd(), arrayList.size(), isWhitespace ? -1 : arrayList2.size());
                arrayList.add(tokenInfo);
                if (!isWhitespace) {
                    arrayList2.add(tokenInfo);
                }
                markdownLexer.advance();
            }
            return new ResultOfCaching(arrayList, arrayList2);
        }
    }
}
