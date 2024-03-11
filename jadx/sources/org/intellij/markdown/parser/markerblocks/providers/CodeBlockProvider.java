package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkdownParserUtil;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.CodeBlockMarkerBlock;

/* loaded from: classes5.dex */
public final class CodeBlockProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> i;
        List<MarkerBlock> e;
        List<MarkerBlock> i2;
        List<MarkerBlock> i3;
        List<MarkerBlock> i4;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        if (MarkdownConstraintsKt.getCharsEaten(stateInfo.getNextConstraints(), position.getCurrentLine()) > position.getOffsetInCurrentLine()) {
            i4 = C8569dql.i();
            return i4;
        }
        Integer charsToNonWhitespace = position.charsToNonWhitespace();
        if (charsToNonWhitespace == null) {
            i3 = C8569dql.i();
            return i3;
        }
        LookaheadText.Position nextPosition = position.nextPosition(charsToNonWhitespace.intValue());
        if (nextPosition == null) {
            i2 = C8569dql.i();
            return i2;
        } else if (MarkdownParserUtil.INSTANCE.hasCodeBlockIndent(nextPosition, stateInfo.getCurrentConstraints())) {
            e = C8566dqi.e(new CodeBlockMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder, position));
            return e;
        } else {
            i = C8569dql.i();
            return i;
        }
    }
}
