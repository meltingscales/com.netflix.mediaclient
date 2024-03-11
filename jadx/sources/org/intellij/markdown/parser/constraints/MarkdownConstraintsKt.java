package org.intellij.markdown.parser.constraints;

import o.C8632dsu;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;

/* loaded from: classes5.dex */
public final class MarkdownConstraintsKt {
    public static final boolean extendsList(MarkdownConstraints markdownConstraints, MarkdownConstraints markdownConstraints2) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) markdownConstraints2, "");
        if (markdownConstraints2.getTypes().length != 0) {
            return markdownConstraints.startsWith(markdownConstraints2) && !markdownConstraints.containsListMarkers(markdownConstraints2.getTypes().length - 1);
        }
        throw new IllegalArgumentException("List constraints should contain at least one item");
    }

    public static final boolean extendsPrev(MarkdownConstraints markdownConstraints, MarkdownConstraints markdownConstraints2) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) markdownConstraints2, "");
        return markdownConstraints.startsWith(markdownConstraints2) && !markdownConstraints.containsListMarkers(markdownConstraints2.getTypes().length);
    }

    public static final boolean upstreamWith(MarkdownConstraints markdownConstraints, MarkdownConstraints markdownConstraints2) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) markdownConstraints2, "");
        return markdownConstraints2.startsWith(markdownConstraints) && !containsListMarkers(markdownConstraints);
    }

    public static final CharSequence eatItselfFromString(MarkdownConstraints markdownConstraints, CharSequence charSequence) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) charSequence, "");
        return charSequence.length() < markdownConstraints.getCharsEaten() ? "" : charSequence.subSequence(markdownConstraints.getCharsEaten(), charSequence.length());
    }

    public static final MarkdownConstraints applyToNextLineAndAddModifiers(MarkdownConstraints markdownConstraints, LookaheadText.Position position) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) position, "");
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() == -1) {
            MarkdownConstraints applyToNextLine = markdownConstraints.applyToNextLine(position);
            String currentLine = position.getCurrentLine();
            while (true) {
                MarkdownConstraints addModifierIfNeeded = applyToNextLine.addModifierIfNeeded(position.nextPosition(getCharsEaten(applyToNextLine, currentLine) + 1));
                if (addModifierIfNeeded == null) {
                    return applyToNextLine;
                }
                applyToNextLine = addModifierIfNeeded;
            }
        } else {
            throw new MarkdownParsingException("");
        }
    }

    public static final int getCharsEaten(MarkdownConstraints markdownConstraints, CharSequence charSequence) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) charSequence, "");
        return Math.min(markdownConstraints.getCharsEaten(), charSequence.length());
    }

    private static final boolean containsListMarkers(MarkdownConstraints markdownConstraints) {
        return markdownConstraints.containsListMarkers(markdownConstraints.getTypes().length);
    }
}
