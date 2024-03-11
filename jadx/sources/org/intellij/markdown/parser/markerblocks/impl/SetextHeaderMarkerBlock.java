package org.intellij.markdown.parser.markerblocks.impl;

import java.util.List;
import o.C8566dqi;
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
public final class SetextHeaderMarkerBlock extends MarkerBlockImpl {
    private final ProductionHolder.Marker contentMarker;
    private IElementType nodeType;
    private final ProductionHolder productionHolder;

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return this.nodeType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetextHeaderMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder productionHolder) {
        super(markdownConstraints, productionHolder.mark());
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        this.productionHolder = productionHolder;
        this.contentMarker = productionHolder.mark();
        this.nodeType = MarkdownElementTypes.SETEXT_1;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean isInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return position.getOffsetInCurrentLine() == -1;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public int calcNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return position.getNextLineOrEofOffset();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ClosingAction getDefaultAction() {
        return MarkerBlock.ClosingAction.DONE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        IElementType iElementType;
        List e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (position.getOffsetInCurrentLine() != -1) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        Integer charsToNonWhitespace = position.charsToNonWhitespace();
        if (charsToNonWhitespace == null) {
            MarkerBlock.ClosingAction closingAction = MarkerBlock.ClosingAction.DROP;
            return new MarkerBlock.ProcessingResult(closingAction, closingAction, MarkerBlock.EventAction.PROPAGATE);
        }
        LookaheadText.Position nextPosition = position.nextPosition(charsToNonWhitespace.intValue());
        if (nextPosition != null && nextPosition.getChar() == '-') {
            this.nodeType = MarkdownElementTypes.SETEXT_2;
        }
        Integer valueOf = nextPosition == null ? null : Integer.valueOf(nextPosition.getOffset());
        int offset = valueOf == null ? position.getOffset() : valueOf.intValue();
        if (C8632dsu.c(this.nodeType, MarkdownElementTypes.SETEXT_2)) {
            iElementType = MarkdownTokenTypes.SETEXT_2;
        } else {
            iElementType = MarkdownTokenTypes.SETEXT_1;
        }
        this.contentMarker.done(MarkdownTokenTypes.SETEXT_CONTENT);
        ProductionHolder productionHolder = this.productionHolder;
        e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(offset, position.getNextLineOrEofOffset()), iElementType));
        productionHolder.addProduction(e);
        int nextLineOrEofOffset = position.getNextLineOrEofOffset();
        MarkerBlock.ProcessingResult.Companion companion = MarkerBlock.ProcessingResult.Companion;
        scheduleProcessingResult(nextLineOrEofOffset, companion.getDEFAULT());
        return companion.getCANCEL();
    }
}
