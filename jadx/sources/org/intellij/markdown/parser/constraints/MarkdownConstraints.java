package org.intellij.markdown.parser.constraints;

import org.intellij.markdown.parser.LookaheadText;

/* loaded from: classes5.dex */
public interface MarkdownConstraints {
    MarkdownConstraints addModifierIfNeeded(LookaheadText.Position position);

    MarkdownConstraints applyToNextLine(LookaheadText.Position position);

    boolean containsListMarkers(int i);

    int getCharsEaten();

    int getIndent();

    char[] getTypes();

    boolean[] isExplicit();

    boolean startsWith(MarkdownConstraints markdownConstraints);
}
