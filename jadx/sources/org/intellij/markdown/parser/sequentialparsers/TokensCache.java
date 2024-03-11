package org.intellij.markdown.parser.sequentialparsers;

import java.util.List;
import o.C8576dqs;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.lexer.TokenInfo;

/* loaded from: classes5.dex */
public abstract class TokensCache {
    public abstract List<TokenInfo> getCachedTokens();

    public abstract List<TokenInfo> getFilteredTokens();

    public abstract CharSequence getOriginalText();

    public abstract C8654dtp getOriginalTextRange();

    public final char getRawCharAt(int i) {
        if (i >= getOriginalTextRange().d() && i <= getOriginalTextRange().e()) {
            return getOriginalText().charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void verify() {
        int size = getCachedTokens().size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                Compat compat = Compat.INSTANCE;
                if (getCachedTokens().get(i2).getRawIndex() != i2) {
                    throw new MarkdownParsingException("");
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        int size2 = getFilteredTokens().size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i4 = i + 1;
            Compat compat2 = Compat.INSTANCE;
            if (getFilteredTokens().get(i).getNormIndex() != i) {
                throw new MarkdownParsingException("");
            }
            if (i4 > size2) {
                return;
            }
            i = i4;
        }
    }

    /* loaded from: classes5.dex */
    public final class RangesListIterator extends Iterator {
        private final int listIndex;
        private final List<C8654dtp> ranges;

        private RangesListIterator(List<C8654dtp> list, int i, int i2) {
            super(TokensCache.this, i2);
            this.ranges = list;
            this.listIndex = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public RangesListIterator(org.intellij.markdown.parser.sequentialparsers.TokensCache r3, java.util.List<o.C8654dtp> r4) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r3, r0)
                o.C8632dsu.c(r4, r0)
                org.intellij.markdown.parser.sequentialparsers.TokensCache.this = r3
                java.lang.Object r0 = o.C8570dqm.d(r4)
                o.dtp r0 = (o.C8654dtp) r0
                if (r0 != 0) goto L13
                goto L19
            L13:
                java.lang.Integer r0 = r0.h()
                if (r0 != 0) goto L1b
            L19:
                r0 = -1
                goto L1f
            L1b:
                int r0 = r0.intValue()
            L1f:
                r1 = 0
                r2.<init>(r4, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.sequentialparsers.TokensCache.RangesListIterator.<init>(org.intellij.markdown.parser.sequentialparsers.TokensCache, java.util.List):void");
        }

        @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache.Iterator
        public RangesListIterator advance() {
            Object f;
            if (this.listIndex >= this.ranges.size()) {
                return this;
            }
            if (getIndex() == this.ranges.get(this.listIndex).e()) {
                TokensCache tokensCache = TokensCache.this;
                List<C8654dtp> list = this.ranges;
                int i = this.listIndex + 1;
                f = C8576dqs.f((List<? extends Object>) list, i);
                C8654dtp c8654dtp = (C8654dtp) f;
                Integer h = c8654dtp == null ? null : c8654dtp.h();
                return new RangesListIterator(list, i, h == null ? TokensCache.this.getFilteredTokens().size() : h.intValue());
            }
            return new RangesListIterator(this.ranges, this.listIndex, getIndex() + 1);
        }

        @Override // org.intellij.markdown.parser.sequentialparsers.TokensCache.Iterator
        public IElementType rawLookup(int i) {
            Object f;
            f = C8576dqs.f((List<? extends Object>) this.ranges, this.listIndex);
            C8654dtp c8654dtp = (C8654dtp) f;
            if (c8654dtp == null) {
                return null;
            }
            int d = c8654dtp.d();
            int e = c8654dtp.e();
            int index = getIndex() + i;
            if (d > index || index > e) {
                return null;
            }
            return super.rawLookup(i);
        }
    }

    /* loaded from: classes5.dex */
    public class Iterator {
        private final int index;
        final /* synthetic */ TokensCache this$0;

        public final int getIndex() {
            return this.index;
        }

        public Iterator(TokensCache tokensCache, int i) {
            C8632dsu.c((Object) tokensCache, "");
            this.this$0 = tokensCache;
            this.index = i;
        }

        public final IElementType getType() {
            return info(0).getType();
        }

        public final char getFirstChar() {
            return this.this$0.getRawCharAt(info(0).getTokenStart());
        }

        public final int getLength() {
            return info(0).getTokenEnd() - info(0).getTokenStart();
        }

        public final int getStart() {
            return info(0).getTokenStart();
        }

        public final int getEnd() {
            return info(0).getTokenEnd();
        }

        public Iterator advance() {
            return new Iterator(this.this$0, this.index + 1);
        }

        private final TokenInfo info(int i) {
            int size;
            int i2 = this.index;
            if (i2 < 0) {
                return new TokenInfo(null, this.this$0.getOriginalTextRange().d(), this.this$0.getOriginalTextRange().d(), 0, 0);
            }
            if (i2 > this.this$0.getFilteredTokens().size()) {
                return new TokenInfo(null, this.this$0.getOriginalTextRange().e() + 1, this.this$0.getOriginalTextRange().e() + 1, 0, 0);
            }
            if (this.index < this.this$0.getFilteredTokens().size()) {
                size = this.this$0.getFilteredTokens().get(this.index).getRawIndex();
            } else {
                size = this.this$0.getCachedTokens().size();
            }
            int i3 = size + i;
            if (i3 < 0) {
                return new TokenInfo(null, this.this$0.getOriginalTextRange().d(), this.this$0.getOriginalTextRange().d(), 0, 0);
            }
            if (i3 >= this.this$0.getCachedTokens().size()) {
                return new TokenInfo(null, this.this$0.getOriginalTextRange().e() + 1, this.this$0.getOriginalTextRange().e() + 1, 0, 0);
            }
            return this.this$0.getCachedTokens().get(i3);
        }

        public IElementType rawLookup(int i) {
            return info(i).getType();
        }

        public final int rawStart(int i) {
            return info(i).getTokenStart();
        }

        public char charLookup(int i) {
            if (i == 0) {
                return this.this$0.getRawCharAt(getStart());
            }
            if (i != -1) {
                if (i == 1) {
                    return this.this$0.getRawCharAt(getEnd());
                }
                return this.this$0.getRawCharAt(i > 0 ? rawStart(i) : rawStart(i + 1) - 1);
            }
            return this.this$0.getRawCharAt(getStart() - 1);
        }

        public String toString() {
            return "Iterator: " + this.index + ": " + getType();
        }
    }
}
