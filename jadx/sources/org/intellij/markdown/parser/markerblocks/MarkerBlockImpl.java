package org.intellij.markdown.parser.markerblocks;

import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;

/* loaded from: classes5.dex */
public abstract class MarkerBlockImpl implements MarkerBlock {
    private final MarkdownConstraints constraints;
    private int lastInterestingOffset;
    private final ProductionHolder.Marker marker;
    private MarkerBlock.ProcessingResult scheduledResult;

    protected abstract int calcNextInterestingOffset(LookaheadText.Position position);

    protected abstract MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints);

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public final MarkdownConstraints getBlockConstraints() {
        return this.constraints;
    }

    public final MarkdownConstraints getConstraints() {
        return this.constraints;
    }

    protected abstract MarkerBlock.ClosingAction getDefaultAction();

    public abstract IElementType getDefaultNodeType();

    public final void scheduleProcessingResult(int i, MarkerBlock.ProcessingResult processingResult) {
        C8632dsu.c((Object) processingResult, "");
        this.lastInterestingOffset = i;
        this.scheduledResult = processingResult;
    }

    public MarkerBlockImpl(MarkdownConstraints markdownConstraints, ProductionHolder.Marker marker) {
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) marker, "");
        this.constraints = markdownConstraints;
        this.marker = marker;
        this.lastInterestingOffset = -2;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public final int getNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        if (this.scheduledResult != null) {
            return position.getOffset() + 1;
        }
        int i = this.lastInterestingOffset;
        if (i != -1 && i <= position.getOffset()) {
            this.lastInterestingOffset = calcNextInterestingOffset(position);
        }
        return this.lastInterestingOffset;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public final MarkerBlock.ProcessingResult processToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (this.lastInterestingOffset != position.getOffset() && this.scheduledResult != null) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        int i = this.lastInterestingOffset;
        if (i == -1 || i > position.getOffset()) {
            return MarkerBlock.ProcessingResult.Companion.getPASS();
        }
        if (this.lastInterestingOffset >= position.getOffset() || isInterestingOffset(position)) {
            MarkerBlock.ProcessingResult processingResult = this.scheduledResult;
            if (processingResult != null) {
                C8632dsu.d(processingResult);
                return processingResult;
            }
            return doProcessToken(position, markdownConstraints);
        }
        return MarkerBlock.ProcessingResult.Companion.getPASS();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean acceptAction(MarkerBlock.ClosingAction closingAction) {
        C8632dsu.c((Object) closingAction, "");
        if (closingAction == MarkerBlock.ClosingAction.DEFAULT) {
            closingAction = getDefaultAction();
        }
        closingAction.doAction(this.marker, getDefaultNodeType());
        return closingAction != MarkerBlock.ClosingAction.NOTHING;
    }
}
