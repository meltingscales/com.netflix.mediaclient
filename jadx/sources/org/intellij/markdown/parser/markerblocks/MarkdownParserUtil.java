package org.intellij.markdown.parser.markerblocks;

import o.C8632dsu;
import o.drM;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;

/* loaded from: classes5.dex */
public final class MarkdownParserUtil {
    public static final MarkdownParserUtil INSTANCE = new MarkdownParserUtil();

    private MarkdownParserUtil() {
    }

    public final int calcNumberOfConsequentEols(LookaheadText.Position position, final MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() == -1) {
            drM<LookaheadText.Position, Boolean> drm = new drM<LookaheadText.Position, Boolean>() { // from class: org.intellij.markdown.parser.markerblocks.MarkdownParserUtil$calcNumberOfConsequentEols$isClearLine$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
                    if ((r4 == null ? null : r4.charsToNonWhitespace()) == null) goto L10;
                 */
                @Override // o.drM
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(org.intellij.markdown.parser.LookaheadText.Position r4) {
                    /*
                        r3 = this;
                        java.lang.String r0 = ""
                        o.C8632dsu.c(r4, r0)
                        org.intellij.markdown.parser.constraints.MarkdownConstraints r0 = org.intellij.markdown.parser.constraints.MarkdownConstraints.this
                        org.intellij.markdown.parser.constraints.MarkdownConstraints r0 = r0.applyToNextLine(r4)
                        java.lang.String r1 = r4.getCurrentLine()
                        int r1 = org.intellij.markdown.parser.constraints.MarkdownConstraintsKt.getCharsEaten(r0, r1)
                        org.intellij.markdown.parser.constraints.MarkdownConstraints r2 = org.intellij.markdown.parser.constraints.MarkdownConstraints.this
                        boolean r0 = org.intellij.markdown.parser.constraints.MarkdownConstraintsKt.upstreamWith(r0, r2)
                        if (r0 == 0) goto L36
                        java.lang.String r0 = r4.getCurrentLine()
                        int r0 = r0.length()
                        r2 = 1
                        if (r1 >= r0) goto L37
                        int r1 = r1 + r2
                        org.intellij.markdown.parser.LookaheadText$Position r4 = r4.nextPosition(r1)
                        if (r4 != 0) goto L2f
                        r4 = 0
                        goto L33
                    L2f:
                        java.lang.Integer r4 = r4.charsToNonWhitespace()
                    L33:
                        if (r4 != 0) goto L36
                        goto L37
                    L36:
                        r2 = 0
                    L37:
                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.markerblocks.MarkdownParserUtil$calcNumberOfConsequentEols$isClearLine$1.invoke(org.intellij.markdown.parser.LookaheadText$Position):java.lang.Boolean");
                }
            };
            int i = 1;
            while (drm.invoke(position).booleanValue() && (position = position.nextLinePosition()) != null && (i = i + 1) <= 4) {
            }
            return i;
        }
        throw new MarkdownParsingException("");
    }

    public final LookaheadText.Position getFirstNonWhitespaceLinePos(LookaheadText.Position position, int i) {
        C8632dsu.c((Object) position, "");
        LookaheadText.Position position2 = position;
        for (int i2 = 0; i2 < i - 1; i2++) {
            position2 = position.nextLinePosition();
            if (position2 == null) {
                return null;
            }
        }
        while (position2.charsToNonWhitespace() == null) {
            position2 = position2.nextLinePosition();
            if (position2 == null) {
                return null;
            }
        }
        return position2;
    }

    public final boolean hasCodeBlockIndent(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        int charsEaten = MarkdownConstraintsKt.getCharsEaten(markdownConstraints, position.getCurrentLine());
        if (position.getOffsetInCurrentLine() >= charsEaten + 4) {
            return true;
        }
        int offsetInCurrentLine = position.getOffsetInCurrentLine();
        if (charsEaten <= offsetInCurrentLine) {
            while (position.getCurrentLine().charAt(charsEaten) != '\t') {
                if (charsEaten == offsetInCurrentLine) {
                    return false;
                }
                charsEaten++;
            }
            return true;
        }
        return false;
    }

    public final boolean isEmptyOrSpaces(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        int i = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            i++;
            if (charAt != ' ' && charAt != '\t') {
                return false;
            }
        }
        return true;
    }

    public final LookaheadText.Position findNonEmptyLineWithSameConstraints(MarkdownConstraints markdownConstraints, LookaheadText.Position position) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) position, "");
        do {
            MarkdownConstraints applyToNextLineAndAddModifiers = MarkdownConstraintsKt.applyToNextLineAndAddModifiers(markdownConstraints, position);
            if (!MarkdownConstraintsKt.upstreamWith(applyToNextLineAndAddModifiers, markdownConstraints) || !MarkdownConstraintsKt.extendsPrev(applyToNextLineAndAddModifiers, markdownConstraints)) {
                return null;
            }
            if (!INSTANCE.isEmptyOrSpaces(MarkdownConstraintsKt.eatItselfFromString(applyToNextLineAndAddModifiers, position.getCurrentLine()))) {
                return position;
            }
            position = position.nextLinePosition();
        } while (position != null);
        return null;
    }
}
