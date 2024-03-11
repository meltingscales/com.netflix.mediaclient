package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8632dsu;
import o.C8654dtp;
import o.C8672dug;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.AtxHeaderMarkerBlock;

/* loaded from: classes5.dex */
public final class AtxHeaderProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> i;
        List<MarkerBlock> e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        C8654dtp matches = matches(position);
        if (matches != null) {
            e = C8566dqi.e(new AtxHeaderMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder, matches, calcTailStartPos(position, matches.e()), position.getNextLineOrEofOffset()));
            return e;
        }
        i = C8569dql.i();
        return i;
    }

    private final int calcTailStartPos(LookaheadText.Position position, int i) {
        boolean c;
        boolean c2;
        CharSequence currentLineFromPosition = position.getCurrentLineFromPosition();
        int length = currentLineFromPosition.length() - 1;
        while (length > i) {
            c2 = C8672dug.c(currentLineFromPosition.charAt(length));
            if (!c2) {
                break;
            }
            length--;
        }
        while (length > i && currentLineFromPosition.charAt(length) == '#' && currentLineFromPosition.charAt(length - 1) != '\\') {
            length--;
        }
        int i2 = length + 1;
        if (i2 < currentLineFromPosition.length()) {
            c = C8672dug.c(currentLineFromPosition.charAt(length));
            if (c && currentLineFromPosition.charAt(i2) == '#') {
                return position.getOffset() + length + 1;
            }
        }
        return position.getOffset() + currentLineFromPosition.length();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return matches(position) != null;
    }

    private final C8654dtp matches(LookaheadText.Position position) {
        List j;
        if (position.getOffsetInCurrentLine() != -1) {
            CharSequence currentLineFromPosition = position.getCurrentLineFromPosition();
            int passSmallIndent$default = MarkerBlockProvider.Companion.passSmallIndent$default(MarkerBlockProvider.Companion, currentLineFromPosition, 0, 2, null);
            if (passSmallIndent$default < currentLineFromPosition.length() && currentLineFromPosition.charAt(passSmallIndent$default) == '#') {
                int i = passSmallIndent$default;
                for (int i2 = 0; i2 < 6; i2++) {
                    if (i < currentLineFromPosition.length() && currentLineFromPosition.charAt(i) == '#') {
                        i++;
                    }
                }
                if (i < currentLineFromPosition.length()) {
                    j = C8569dql.j(' ', '\t');
                    if (!j.contains(Character.valueOf(currentLineFromPosition.charAt(i)))) {
                        return null;
                    }
                }
                return new C8654dtp(passSmallIndent$default, i - 1);
            }
        }
        return null;
    }
}
