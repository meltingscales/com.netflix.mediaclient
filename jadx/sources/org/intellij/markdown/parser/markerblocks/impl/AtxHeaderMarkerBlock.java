package org.intellij.markdown.parser.markerblocks.impl;

import java.util.List;
import o.C8569dql;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class AtxHeaderMarkerBlock extends MarkerBlockImpl {
    private final IElementType nodeType;

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return this.nodeType;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean isInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtxHeaderMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder productionHolder, C8654dtp c8654dtp, int i, int i2) {
        super(markdownConstraints, productionHolder.mark());
        List j;
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) c8654dtp, "");
        int currentPosition = productionHolder.getCurrentPosition();
        C8654dtp c8654dtp2 = new C8654dtp(c8654dtp.d() + currentPosition, c8654dtp.e() + currentPosition + 1);
        IElementType iElementType = MarkdownTokenTypes.ATX_HEADER;
        j = C8569dql.j(new SequentialParser.Node(c8654dtp2, iElementType), new SequentialParser.Node(new C8654dtp(currentPosition + c8654dtp.e() + 1, i), MarkdownTokenTypes.ATX_CONTENT), new SequentialParser.Node(new C8654dtp(i, i2), iElementType));
        productionHolder.addProduction(j);
        this.nodeType = calcNodeType((c8654dtp.e() - c8654dtp.d()) + 1);
    }

    private final IElementType calcNodeType(int i) {
        switch (i) {
            case 1:
                return MarkdownElementTypes.ATX_1;
            case 2:
                return MarkdownElementTypes.ATX_2;
            case 3:
                return MarkdownElementTypes.ATX_3;
            case 4:
                return MarkdownElementTypes.ATX_4;
            case 5:
                return MarkdownElementTypes.ATX_5;
            case 6:
                return MarkdownElementTypes.ATX_6;
            default:
                return MarkdownElementTypes.ATX_6;
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ClosingAction getDefaultAction() {
        return MarkerBlock.ClosingAction.DONE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public int calcNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return position.getNextLineOrEofOffset();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (position.getOffsetInCurrentLine() == -1) {
            return new MarkerBlock.ProcessingResult(MarkerBlock.ClosingAction.DROP, MarkerBlock.ClosingAction.DONE, MarkerBlock.EventAction.PROPAGATE);
        }
        return MarkerBlock.ProcessingResult.Companion.getCANCEL();
    }
}
