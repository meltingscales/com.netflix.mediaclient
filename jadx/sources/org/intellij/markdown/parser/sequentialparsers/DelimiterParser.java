package org.intellij.markdown.parser.sequentialparsers;

import java.util.List;
import kotlin.Pair;
import o.C8627dsp;
import o.C8632dsu;
import o.dpD;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public abstract class DelimiterParser {
    public static final Companion Companion = new Companion(null);

    public abstract void process(TokensCache tokensCache, TokensCache.Iterator iterator, List<Info> list, SequentialParser.ParsingResultBuilder parsingResultBuilder);

    public abstract int scan(TokensCache tokensCache, TokensCache.Iterator iterator, List<Info> list);

    /* loaded from: classes5.dex */
    public static final class Info {
        private boolean canClose;
        private boolean canOpen;
        private int closerIndex;
        private final int length;
        private char marker;
        private final int position;
        private final IElementType tokenType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Info) {
                Info info = (Info) obj;
                return C8632dsu.c(this.tokenType, info.tokenType) && this.position == info.position && this.length == info.length && this.canOpen == info.canOpen && this.canClose == info.canClose && this.marker == info.marker && this.closerIndex == info.closerIndex;
            }
            return false;
        }

        public final boolean getCanClose() {
            return this.canClose;
        }

        public final boolean getCanOpen() {
            return this.canOpen;
        }

        public final int getCloserIndex() {
            return this.closerIndex;
        }

        public final int getLength() {
            return this.length;
        }

        public final char getMarker() {
            return this.marker;
        }

        public final int getPosition() {
            return this.position;
        }

        public final IElementType getTokenType() {
            return this.tokenType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.tokenType.hashCode();
            int i = this.position;
            int i2 = this.length;
            boolean z = this.canOpen;
            int i3 = z;
            if (z != 0) {
                i3 = 1;
            }
            boolean z2 = this.canClose;
            return (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.marker) * 31) + this.closerIndex;
        }

        public final void setCanClose(boolean z) {
            this.canClose = z;
        }

        public final void setCanOpen(boolean z) {
            this.canOpen = z;
        }

        public final void setCloserIndex(int i) {
            this.closerIndex = i;
        }

        public String toString() {
            return "Info(tokenType=" + this.tokenType + ", position=" + this.position + ", length=" + this.length + ", canOpen=" + this.canOpen + ", canClose=" + this.canClose + ", marker=" + this.marker + ", closerIndex=" + this.closerIndex + ')';
        }

        public Info(IElementType iElementType, int i, int i2, boolean z, boolean z2, char c, int i3) {
            C8632dsu.c((Object) iElementType, "");
            this.tokenType = iElementType;
            this.position = i;
            this.length = i2;
            this.canOpen = z;
            this.canClose = z2;
            this.marker = c;
            this.closerIndex = i3;
        }

        public /* synthetic */ Info(IElementType iElementType, int i, int i2, boolean z, boolean z2, char c, int i3, int i4, C8627dsp c8627dsp) {
            this(iElementType, i, (i4 & 4) != 0 ? 0 : i2, z, z2, c, (i4 & 64) != 0 ? -1 : i3);
        }
    }

    public Pair<Boolean, Boolean> canOpenClose(TokensCache tokensCache, TokensCache.Iterator iterator, TokensCache.Iterator iterator2, boolean z) {
        boolean z2;
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) iterator2, "");
        boolean isLeftFlankingRun = isLeftFlankingRun(iterator, iterator2);
        boolean isRightFlankingRun = isRightFlankingRun(tokensCache, iterator, iterator2);
        if (z) {
            z2 = isLeftFlankingRun;
        } else {
            z2 = isLeftFlankingRun && (!isRightFlankingRun || SequentialParserUtil.Companion.isPunctuation(iterator, -1));
        }
        if (!z) {
            isRightFlankingRun = isRightFlankingRun && (!isLeftFlankingRun || SequentialParserUtil.Companion.isPunctuation(iterator2, 1));
        }
        return dpD.a(Boolean.valueOf(z2), Boolean.valueOf(isRightFlankingRun));
    }

    public boolean isLeftFlankingRun(TokensCache.Iterator iterator, TokensCache.Iterator iterator2) {
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) iterator2, "");
        return !isWhitespace(iterator2, 1) && (!isPunctuation(iterator2, 1) || isWhitespace(iterator, -1) || isPunctuation(iterator, -1));
    }

    public boolean isRightFlankingRun(TokensCache tokensCache, TokensCache.Iterator iterator, TokensCache.Iterator iterator2) {
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) iterator2, "");
        return (iterator.charLookup(-1) == Companion.getType(iterator) || isWhitespace(iterator, -1) || (isPunctuation(iterator, -1) && !isWhitespace(iterator2, 1) && !isPunctuation(iterator2, 1))) ? false : true;
    }

    public boolean isWhitespace(TokensCache.Iterator iterator, int i) {
        C8632dsu.c((Object) iterator, "");
        return SequentialParserUtil.Companion.isWhitespace(iterator, i);
    }

    public boolean isPunctuation(TokensCache.Iterator iterator, int i) {
        C8632dsu.c((Object) iterator, "");
        return SequentialParserUtil.Companion.isPunctuation(iterator, i);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final char getType(TokensCache.Iterator iterator) {
            C8632dsu.c((Object) iterator, "");
            return iterator.getFirstChar();
        }
    }
}
