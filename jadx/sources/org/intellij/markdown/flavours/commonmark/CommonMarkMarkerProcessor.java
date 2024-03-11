package org.intellij.markdown.flavours.commonmark;

import java.util.List;
import o.C8563dqf;
import o.C8566dqi;
import o.C8569dql;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.MarkerProcessorFactory;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.providers.AtxHeaderProvider;
import org.intellij.markdown.parser.markerblocks.providers.BlockQuoteProvider;
import org.intellij.markdown.parser.markerblocks.providers.CodeBlockProvider;
import org.intellij.markdown.parser.markerblocks.providers.CodeFenceProvider;
import org.intellij.markdown.parser.markerblocks.providers.HorizontalRuleProvider;
import org.intellij.markdown.parser.markerblocks.providers.HtmlBlockProvider;
import org.intellij.markdown.parser.markerblocks.providers.LinkReferenceDefinitionProvider;
import org.intellij.markdown.parser.markerblocks.providers.ListMarkerProvider;
import org.intellij.markdown.parser.markerblocks.providers.SetextHeaderProvider;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public class CommonMarkMarkerProcessor extends MarkerProcessor<MarkerProcessor.StateInfo> {
    private final List<MarkerBlockProvider<MarkerProcessor.StateInfo>> markerBlockProviders;
    private MarkerProcessor.StateInfo stateInfo;

    @Override // org.intellij.markdown.parser.MarkerProcessor
    public List<MarkerBlockProvider<MarkerProcessor.StateInfo>> getMarkerBlockProviders() {
        return this.markerBlockProviders;
    }

    @Override // org.intellij.markdown.parser.MarkerProcessor
    public MarkerProcessor.StateInfo getStateInfo() {
        return this.stateInfo;
    }

    public void setStateInfo(MarkerProcessor.StateInfo stateInfo) {
        C8632dsu.c((Object) stateInfo, "");
        this.stateInfo = stateInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonMarkMarkerProcessor(ProductionHolder productionHolder, MarkdownConstraints markdownConstraints) {
        super(productionHolder, markdownConstraints);
        List<MarkerBlockProvider<MarkerProcessor.StateInfo>> j;
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) markdownConstraints, "");
        this.stateInfo = new MarkerProcessor.StateInfo(getStartConstraints(), getStartConstraints(), getMarkersStack());
        j = C8569dql.j(new CodeBlockProvider(), new HorizontalRuleProvider(), new CodeFenceProvider(), new SetextHeaderProvider(), new BlockQuoteProvider(), new ListMarkerProvider(), new AtxHeaderProvider(), new HtmlBlockProvider(), new LinkReferenceDefinitionProvider());
        this.markerBlockProviders = j;
    }

    @Override // org.intellij.markdown.parser.MarkerProcessor
    public void updateStateInfo(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        if (position.getOffsetInCurrentLine() == -1) {
            setStateInfo(new MarkerProcessor.StateInfo(getStartConstraints(), getTopBlockConstraints().applyToNextLine(position), getMarkersStack()));
        } else if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, getStateInfo().getNextConstraints())) {
            MarkdownConstraints nextConstraints = getStateInfo().getNextConstraints();
            MarkdownConstraints addModifierIfNeeded = getStateInfo().getNextConstraints().addModifierIfNeeded(position);
            if (addModifierIfNeeded == null) {
                addModifierIfNeeded = getStateInfo().getNextConstraints();
            }
            setStateInfo(new MarkerProcessor.StateInfo(nextConstraints, addModifierIfNeeded, getMarkersStack()));
        }
    }

    @Override // org.intellij.markdown.parser.MarkerProcessor
    public void populateConstraintsTokens(LookaheadText.Position position, MarkdownConstraints markdownConstraints, ProductionHolder productionHolder) {
        Character d;
        IElementType iElementType;
        List e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        if (markdownConstraints.getIndent() == 0) {
            return;
        }
        int offset = position.getOffset();
        int offset2 = position.getOffset();
        int offsetInCurrentLine = position.getOffsetInCurrentLine();
        int min = Math.min((offset2 - offsetInCurrentLine) + MarkdownConstraintsKt.getCharsEaten(markdownConstraints, position.getCurrentLine()), position.getNextLineOrEofOffset());
        d = C8563dqf.d(markdownConstraints.getTypes());
        if (d != null && d.charValue() == '>') {
            iElementType = MarkdownTokenTypes.BLOCK_QUOTE;
        } else if ((d != null && d.charValue() == '.') || (d != null && d.charValue() == ')')) {
            iElementType = MarkdownTokenTypes.LIST_NUMBER;
        } else {
            iElementType = MarkdownTokenTypes.LIST_BULLET;
        }
        e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(offset, min), iElementType));
        productionHolder.addProduction(e);
    }

    @Override // org.intellij.markdown.parser.MarkerProcessor
    public List<MarkerBlock> createNewMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        if (position.getOffsetInCurrentLine() == -1) {
            return getNO_BLOCKS();
        }
        return super.createNewMarkerBlocks(position, productionHolder);
    }

    /* loaded from: classes5.dex */
    public static final class Factory implements MarkerProcessorFactory {
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @Override // org.intellij.markdown.parser.MarkerProcessorFactory
        public MarkerProcessor<?> createMarkerProcessor(ProductionHolder productionHolder) {
            C8632dsu.c((Object) productionHolder, "");
            return new CommonMarkMarkerProcessor(productionHolder, CommonMarkdownConstraints.Companion.getBASE());
        }
    }
}
