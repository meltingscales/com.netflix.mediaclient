package org.intellij.markdown.parser;

import java.util.List;
import o.C8632dsu;
import o.dsA;
import o.duD;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;

/* loaded from: classes5.dex */
public final class LookaheadText {
    private final List<String> lines;
    private final Position startPosition;
    private final CharSequence text;

    public final Position getStartPosition() {
        return this.startPosition;
    }

    public LookaheadText(CharSequence charSequence) {
        List<String> b;
        C8632dsu.c((Object) charSequence, "");
        this.text = charSequence;
        b = duD.b(charSequence, new char[]{'\n'}, false, 0, 6, (Object) null);
        this.lines = b;
        this.startPosition = charSequence.length() > 0 ? Position.nextPosition$default(new Position(this, 0, -1, -1), 0, 1, null) : null;
    }

    /* loaded from: classes5.dex */
    public final class Position {
        private final String currentLine;
        private final int globalPos;
        private final int lineN;
        private final int localPos;
        final /* synthetic */ LookaheadText this$0;

        public final String getCurrentLine() {
            return this.currentLine;
        }

        public final int getOffset() {
            return this.globalPos;
        }

        public final int getOffsetInCurrentLine() {
            return this.localPos;
        }

        public int hashCode() {
            return this.globalPos;
        }

        public Position(LookaheadText lookaheadText, int i, int i2, int i3) {
            C8632dsu.c((Object) lookaheadText, "");
            this.this$0 = lookaheadText;
            this.lineN = i;
            this.localPos = i2;
            this.globalPos = i3;
            String str = (String) lookaheadText.lines.get(i);
            this.currentLine = str;
            Compat compat = Compat.INSTANCE;
            if (i2 < -1 || i2 >= str.length()) {
                throw new MarkdownParsingException("");
            }
        }

        public final CharSequence getOriginalText() {
            return this.this$0.text;
        }

        public String toString() {
            String substring;
            StringBuilder sb = new StringBuilder();
            sb.append("Position: '");
            int i = this.localPos;
            if (i == -1) {
                substring = C8632dsu.d("\\n", (Object) this.currentLine);
            } else {
                String str = this.currentLine;
                if (str != null) {
                    substring = str.substring(i);
                    C8632dsu.a(substring, "");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            sb.append(substring);
            sb.append('\'');
            return sb.toString();
        }

        public final Integer getNextLineOffset() {
            if (this.lineN + 1 < this.this$0.lines.size()) {
                return Integer.valueOf(this.globalPos + (this.currentLine.length() - this.localPos));
            }
            return null;
        }

        public final int getNextLineOrEofOffset() {
            return this.globalPos + (this.currentLine.length() - this.localPos);
        }

        public final CharSequence getCurrentLineFromPosition() {
            String str = this.currentLine;
            int offsetInCurrentLine = getOffsetInCurrentLine();
            if (str != null) {
                String substring = str.substring(offsetInCurrentLine);
                C8632dsu.a(substring, "");
                return substring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        public final String getNextLine() {
            if (this.lineN + 1 < this.this$0.lines.size()) {
                return (String) this.this$0.lines.get(this.lineN + 1);
            }
            return null;
        }

        public final String getPrevLine() {
            if (this.lineN > 0) {
                return (String) this.this$0.lines.get(this.lineN - 1);
            }
            return null;
        }

        public final char getChar() {
            return this.this$0.text.charAt(this.globalPos);
        }

        public static /* synthetic */ Position nextPosition$default(Position position, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return position.nextPosition(i);
        }

        public final Position nextPosition(int i) {
            Position position = this;
            while (i != 0) {
                if (position.localPos + i < position.currentLine.length()) {
                    return new Position(this.this$0, position.lineN, position.localPos + i, position.globalPos + i);
                }
                if (position.getNextLineOffset() == null) {
                    return null;
                }
                int length = position.currentLine.length() - position.localPos;
                i -= length;
                position = new Position(this.this$0, position.lineN + 1, -1, position.globalPos + length);
            }
            return position;
        }

        public final Position nextLinePosition() {
            Integer nextLineOffset = getNextLineOffset();
            if (nextLineOffset == null) {
                return null;
            }
            return nextPosition(nextLineOffset.intValue() - getOffset());
        }

        public final Integer charsToNonWhitespace() {
            String str = this.currentLine;
            for (int max = Math.max(this.localPos, 0); max < str.length(); max++) {
                char charAt = str.charAt(max);
                if (charAt != ' ' && charAt != '\t') {
                    return Integer.valueOf(max - this.localPos);
                }
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C8632dsu.c(dsA.a(obj.getClass()), dsA.a(Position.class)) && this.globalPos == ((Position) obj).globalPos;
        }
    }
}
