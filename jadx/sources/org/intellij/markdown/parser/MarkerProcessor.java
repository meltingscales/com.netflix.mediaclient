package org.intellij.markdown.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8632dsu;
import o.drX;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor.StateInfo;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.ParagraphMarkerBlock;

/* loaded from: classes5.dex */
public abstract class MarkerProcessor<T extends StateInfo> {
    private final List<MarkerBlock> NO_BLOCKS;
    private final drX<LookaheadText.Position, MarkdownConstraints, Boolean> interruptsParagraph;
    private final List<MarkerBlock> markersStack;
    private int nextInterestingPosForExistingMarkers;
    private final ProductionHolder productionHolder;
    private final MarkdownConstraints startConstraints;
    private MarkdownConstraints topBlockConstraints;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract List<MarkerBlockProvider<T>> getMarkerBlockProviders();

    public final List<MarkerBlock> getMarkersStack() {
        return this.markersStack;
    }

    public final List<MarkerBlock> getNO_BLOCKS() {
        return this.NO_BLOCKS;
    }

    public final MarkdownConstraints getStartConstraints() {
        return this.startConstraints;
    }

    protected abstract T getStateInfo();

    public final MarkdownConstraints getTopBlockConstraints() {
        return this.topBlockConstraints;
    }

    protected abstract void populateConstraintsTokens(LookaheadText.Position position, MarkdownConstraints markdownConstraints, ProductionHolder productionHolder);

    protected abstract void updateStateInfo(LookaheadText.Position position);

    public MarkerProcessor(ProductionHolder productionHolder, MarkdownConstraints markdownConstraints) {
        List<MarkerBlock> i;
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) markdownConstraints, "");
        this.productionHolder = productionHolder;
        this.startConstraints = markdownConstraints;
        i = C8569dql.i();
        this.NO_BLOCKS = i;
        this.markersStack = new ArrayList();
        this.topBlockConstraints = markdownConstraints;
        this.nextInterestingPosForExistingMarkers = -1;
        this.interruptsParagraph = new drX<LookaheadText.Position, MarkdownConstraints, Boolean>(this) { // from class: org.intellij.markdown.parser.MarkerProcessor$interruptsParagraph$1
            final /* synthetic */ MarkerProcessor<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.this$0 = this;
            }

            @Override // o.drX
            public final Boolean invoke(LookaheadText.Position position, MarkdownConstraints markdownConstraints2) {
                boolean z;
                C8632dsu.c((Object) position, "");
                C8632dsu.c((Object) markdownConstraints2, "");
                Iterator it = this.this$0.getMarkerBlockProviders().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((MarkerBlockProvider) it.next()).interruptsParagraph(position, markdownConstraints2)) {
                        z = true;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
    }

    public List<MarkerBlock> createNewMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder) {
        List<MarkerBlock> i;
        List<MarkerBlock> e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        Compat compat = Compat.INSTANCE;
        if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, getStateInfo().getCurrentConstraints())) {
            for (MarkerBlockProvider<T> markerBlockProvider : getMarkerBlockProviders()) {
                List<MarkerBlock> createMarkerBlocks = markerBlockProvider.createMarkerBlocks(position, productionHolder, getStateInfo());
                if (!createMarkerBlocks.isEmpty()) {
                    return createMarkerBlocks;
                }
            }
            if (position.getOffsetInCurrentLine() >= MarkdownConstraintsKt.getCharsEaten(getStateInfo().getNextConstraints(), position.getCurrentLine()) && position.charsToNonWhitespace() != null) {
                e = C8566dqi.e(new ParagraphMarkerBlock(getStateInfo().getCurrentConstraints(), productionHolder.mark(), this.interruptsParagraph));
                return e;
            }
            i = C8569dql.i();
            return i;
        }
        throw new MarkdownParsingException("");
    }

    public final LookaheadText.Position processPosition(LookaheadText.Position position) {
        boolean z;
        int charsEaten;
        Object D;
        C8632dsu.c((Object) position, "");
        updateStateInfo(position);
        if (position.getOffset() >= this.nextInterestingPosForExistingMarkers) {
            processMarkers(position);
            z = true;
        } else {
            z = false;
        }
        if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, getStateInfo().getCurrentConstraints())) {
            D = C8576dqs.D((List<? extends Object>) this.markersStack);
            MarkerBlock markerBlock = (MarkerBlock) D;
            if (markerBlock == null || markerBlock.allowsSubBlocks()) {
                for (MarkerBlock markerBlock2 : createNewMarkerBlocks(position, this.productionHolder)) {
                    addNewMarkerBlock(markerBlock2);
                    z = true;
                }
            }
        }
        if (z) {
            this.nextInterestingPosForExistingMarkers = calculateNextPosForExistingMarkers(position);
        }
        if ((position.getOffsetInCurrentLine() == -1 || MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, getStateInfo().getCurrentConstraints())) && (charsEaten = MarkdownConstraintsKt.getCharsEaten(getStateInfo().getNextConstraints(), position.getCurrentLine()) - position.getOffsetInCurrentLine()) > 0) {
            if (position.getOffsetInCurrentLine() != -1 && getStateInfo().getNextConstraints().getIndent() <= this.topBlockConstraints.getIndent()) {
                populateConstraintsTokens(position, getStateInfo().getNextConstraints(), this.productionHolder);
            }
            return position.nextPosition(charsEaten);
        }
        return position.nextPosition(this.nextInterestingPosForExistingMarkers - position.getOffset());
    }

    private final int calculateNextPosForExistingMarkers(LookaheadText.Position position) {
        Object D;
        D = C8576dqs.D((List<? extends Object>) this.markersStack);
        MarkerBlock markerBlock = (MarkerBlock) D;
        Integer valueOf = markerBlock == null ? null : Integer.valueOf(markerBlock.getNextInterestingOffset(position));
        int nextLineOrEofOffset = valueOf == null ? position.getNextLineOrEofOffset() : valueOf.intValue();
        if (nextLineOrEofOffset == -1) {
            return Integer.MAX_VALUE;
        }
        return nextLineOrEofOffset;
    }

    public final void addNewMarkerBlock(MarkerBlock markerBlock) {
        C8632dsu.c((Object) markerBlock, "");
        this.markersStack.add(markerBlock);
        relaxTopConstraints();
    }

    public final void flushMarkers() {
        closeChildren(-1, MarkerBlock.ClosingAction.DEFAULT);
    }

    private final boolean processMarkers(LookaheadText.Position position) {
        int size = this.markersStack.size();
        while (size > 0) {
            size--;
            if (size < this.markersStack.size()) {
                MarkerBlock markerBlock = this.markersStack.get(size);
                MarkerBlock.ProcessingResult processToken = markerBlock.processToken(position, getStateInfo().getCurrentConstraints());
                if (C8632dsu.c(processToken, MarkerBlock.ProcessingResult.Companion.getPASS())) {
                    continue;
                } else {
                    applyProcessingResult(size, markerBlock, processToken);
                    if (processToken.getEventAction() == MarkerBlock.EventAction.CANCEL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void applyProcessingResult(int i, MarkerBlock markerBlock, MarkerBlock.ProcessingResult processingResult) {
        closeChildren(i, processingResult.getChildrenAction());
        if (markerBlock.acceptAction(processingResult.getSelfAction())) {
            this.markersStack.remove(i);
            relaxTopConstraints();
        }
    }

    private final void closeChildren(int i, MarkerBlock.ClosingAction closingAction) {
        if (closingAction != MarkerBlock.ClosingAction.NOTHING) {
            for (int size = this.markersStack.size() - 1; size > i; size--) {
                boolean acceptAction = this.markersStack.get(size).acceptAction(closingAction);
                Compat compat = Compat.INSTANCE;
                if (!acceptAction) {
                    throw new MarkdownParsingException("If closing action is not NOTHING, marker should be gone");
                }
                this.markersStack.remove(size);
            }
            relaxTopConstraints();
        }
    }

    private final void relaxTopConstraints() {
        Object B;
        MarkdownConstraints blockConstraints;
        if (this.markersStack.isEmpty()) {
            blockConstraints = this.startConstraints;
        } else {
            B = C8576dqs.B((List<? extends Object>) this.markersStack);
            blockConstraints = ((MarkerBlock) B).getBlockConstraints();
        }
        this.topBlockConstraints = blockConstraints;
    }

    /* loaded from: classes5.dex */
    public static class StateInfo {
        private final MarkdownConstraints currentConstraints;
        private final List<MarkerBlock> markersStack;
        private final MarkdownConstraints nextConstraints;

        public final MarkdownConstraints getCurrentConstraints() {
            return this.currentConstraints;
        }

        public final MarkdownConstraints getNextConstraints() {
            return this.nextConstraints;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StateInfo(MarkdownConstraints markdownConstraints, MarkdownConstraints markdownConstraints2, List<? extends MarkerBlock> list) {
            C8632dsu.c((Object) markdownConstraints, "");
            C8632dsu.c((Object) markdownConstraints2, "");
            C8632dsu.c((Object) list, "");
            this.currentConstraints = markdownConstraints;
            this.nextConstraints = markdownConstraints2;
            this.markersStack = list;
        }

        public final MarkerBlock getLastBlock() {
            Object D;
            D = C8576dqs.D((List<? extends Object>) this.markersStack);
            return (MarkerBlock) D;
        }

        public boolean equals(Object obj) {
            StateInfo stateInfo = obj instanceof StateInfo ? (StateInfo) obj : null;
            return stateInfo != null && C8632dsu.c(this.currentConstraints, stateInfo.currentConstraints) && C8632dsu.c(this.nextConstraints, stateInfo.nextConstraints) && C8632dsu.c(this.markersStack, stateInfo.markersStack);
        }

        public int hashCode() {
            int hashCode = this.currentConstraints.hashCode();
            return (((hashCode * 37) + this.nextConstraints.hashCode()) * 37) + this.markersStack.hashCode();
        }

        public final ParagraphMarkerBlock getParagraphBlock() {
            Object obj;
            Iterator<T> it = this.markersStack.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MarkerBlock) obj) instanceof ParagraphMarkerBlock) {
                    break;
                }
            }
            return (ParagraphMarkerBlock) obj;
        }
    }
}
