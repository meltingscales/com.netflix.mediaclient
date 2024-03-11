package org.intellij.markdown.lexer;

import o.C8632dsu;
import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public final class TokenInfo {
    private final int normIndex;
    private final int rawIndex;
    private final int tokenEnd;
    private final int tokenStart;
    private final IElementType type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenInfo) {
            TokenInfo tokenInfo = (TokenInfo) obj;
            return C8632dsu.c(this.type, tokenInfo.type) && this.tokenStart == tokenInfo.tokenStart && this.tokenEnd == tokenInfo.tokenEnd && this.rawIndex == tokenInfo.rawIndex && this.normIndex == tokenInfo.normIndex;
        }
        return false;
    }

    public final int getNormIndex() {
        return this.normIndex;
    }

    public final int getRawIndex() {
        return this.rawIndex;
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

    public int hashCode() {
        IElementType iElementType = this.type;
        return ((((((((iElementType == null ? 0 : iElementType.hashCode()) * 31) + this.tokenStart) * 31) + this.tokenEnd) * 31) + this.rawIndex) * 31) + this.normIndex;
    }

    public String toString() {
        return "TokenInfo(type=" + this.type + ", tokenStart=" + this.tokenStart + ", tokenEnd=" + this.tokenEnd + ", rawIndex=" + this.rawIndex + ", normIndex=" + this.normIndex + ')';
    }

    public TokenInfo(IElementType iElementType, int i, int i2, int i3, int i4) {
        this.type = iElementType;
        this.tokenStart = i;
        this.tokenEnd = i2;
        this.rawIndex = i3;
        this.normIndex = i4;
    }
}
