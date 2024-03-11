package o;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* renamed from: o.doi  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8512doi {
    private int a;
    private CoderResult c = CoderResult.UNDERFLOW;
    private boolean e;

    public CoderResult b() {
        return CoderResult.unmappableForLength(this.e ? 2 : 1);
    }

    public int c(char c, char[] cArr, int i, int i2) {
        CoderResult malformedForLength;
        int i3;
        if (!Character.isHighSurrogate(c)) {
            if (!Character.isLowSurrogate(c)) {
                this.a = c;
                this.e = false;
                i3 = c;
                this.c = null;
                return i3;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        } else if (i2 - i < 2) {
            malformedForLength = CoderResult.UNDERFLOW;
        } else {
            char c2 = cArr[i + 1];
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.a = codePoint;
                this.e = true;
                i3 = codePoint;
                this.c = null;
                return i3;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        }
        this.c = malformedForLength;
        return -1;
    }

    public int e(char c, CharBuffer charBuffer) {
        CoderResult malformedForLength;
        int i;
        if (!Character.isHighSurrogate(c)) {
            if (!Character.isLowSurrogate(c)) {
                this.a = c;
                this.e = false;
                i = c;
                this.c = null;
                return i;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        } else if (charBuffer.hasRemaining()) {
            char c2 = charBuffer.get();
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.a = codePoint;
                this.e = true;
                i = codePoint;
                this.c = null;
                return i;
            }
            malformedForLength = CoderResult.malformedForLength(1);
        } else {
            malformedForLength = CoderResult.UNDERFLOW;
        }
        this.c = malformedForLength;
        return -1;
    }

    public CoderResult e() {
        return this.c;
    }
}
