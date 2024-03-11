package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import kotlin.text.Regex;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.SetextHeaderMarkerBlock;

/* loaded from: classes5.dex */
public final class SetextHeaderProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    public static final Companion Companion = new Companion(null);
    private static final Regex REGEX = new Regex("^ {0,3}(-+|=+) *$");

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> i;
        CharSequence nextLineFromConstraints;
        List<MarkerBlock> e;
        List<MarkerBlock> i2;
        List<MarkerBlock> i3;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        if (stateInfo.getParagraphBlock() != null) {
            i3 = C8569dql.i();
            return i3;
        }
        MarkdownConstraints currentConstraints = stateInfo.getCurrentConstraints();
        if (!C8632dsu.c(stateInfo.getNextConstraints(), currentConstraints)) {
            i2 = C8569dql.i();
            return i2;
        } else if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, currentConstraints) && (nextLineFromConstraints = getNextLineFromConstraints(position, currentConstraints)) != null && REGEX.e(nextLineFromConstraints)) {
            e = C8566dqi.e(new SetextHeaderMarkerBlock(currentConstraints, productionHolder));
            return e;
        } else {
            i = C8569dql.i();
            return i;
        }
    }

    private final CharSequence getNextLineFromConstraints(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        String nextLine = position.getNextLine();
        if (nextLine == null) {
            return null;
        }
        MarkdownConstraints applyToNextLine = markdownConstraints.applyToNextLine(position.nextLinePosition());
        if (MarkdownConstraintsKt.extendsPrev(applyToNextLine, markdownConstraints)) {
            return MarkdownConstraintsKt.eatItselfFromString(applyToNextLine, nextLine);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
