package org.intellij.markdown.lexer;

import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.dqN;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownTokenTypes;

/* loaded from: classes5.dex */
public class MarkdownLexer {
    public static final Companion Companion = new Companion(null);
    private static final Set<IElementType> TOKENS_TO_MERGE;
    private final GeneratedLexer baseLexer;
    private int bufferEnd;
    private int bufferStart;
    private IElementType nextType;
    private CharSequence originalText;
    private final int state;
    private int tokenEnd;
    private int tokenStart;
    private IElementType type;

    public final int getBufferEnd() {
        return this.bufferEnd;
    }

    public final int getBufferStart() {
        return this.bufferStart;
    }

    public final CharSequence getOriginalText() {
        return this.originalText;
    }

    public final int getTokenEnd() {
        return this.tokenEnd;
    }

    public final int getTokenStart() {
        return this.tokenStart;
    }

    public final IElementType getType() {
        return this.type;
    }

    public MarkdownLexer(GeneratedLexer generatedLexer) {
        C8632dsu.c((Object) generatedLexer, "");
        this.baseLexer = generatedLexer;
        this.originalText = "";
        this.state = generatedLexer.getState();
    }

    public static /* synthetic */ void start$default(MarkdownLexer markdownLexer, CharSequence charSequence, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        markdownLexer.start(charSequence, i, i2, i3);
    }

    public final void start(CharSequence charSequence, int i, int i2, int i3) {
        C8632dsu.c((Object) charSequence, "");
        reset(charSequence, i, i2, i3);
        calcNextType();
    }

    public final boolean advance() {
        return locateToken();
    }

    private final boolean locateToken() {
        IElementType iElementType = this.nextType;
        this.type = iElementType;
        this.tokenStart = this.tokenEnd;
        if (iElementType == null) {
            return false;
        }
        calcNextType();
        return true;
    }

    private final void calcNextType() {
        IElementType iElementType;
        do {
            this.tokenEnd = this.baseLexer.getTokenEnd();
            IElementType advanceBase = advanceBase();
            this.nextType = advanceBase;
            iElementType = this.type;
            if (!C8632dsu.c(advanceBase, iElementType) || iElementType == null) {
                return;
            }
        } while (TOKENS_TO_MERGE.contains(iElementType));
    }

    private final IElementType advanceBase() {
        try {
            return this.baseLexer.advance();
        } catch (Exception unused) {
            throw new AssertionError("This could not be!");
        }
    }

    public final void reset(CharSequence charSequence, int i, int i2, int i3) {
        C8632dsu.c((Object) charSequence, "");
        this.originalText = charSequence;
        this.bufferStart = i;
        this.bufferEnd = i2;
        this.baseLexer.reset(charSequence, i, i2, i3);
        this.type = advanceBase();
        this.tokenStart = this.baseLexer.getTokenStart();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Set<IElementType> d;
        d = dqN.d(MarkdownTokenTypes.TEXT, MarkdownTokenTypes.WHITE_SPACE, MarkdownTokenTypes.CODE_LINE, MarkdownTokenTypes.LINK_ID, MarkdownTokenTypes.LINK_TITLE, MarkdownTokenTypes.URL, MarkdownTokenTypes.AUTOLINK, MarkdownTokenTypes.EMAIL_AUTOLINK, MarkdownTokenTypes.BAD_CHARACTER);
        TOKENS_TO_MERGE = d;
    }
}
