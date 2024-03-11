package org.intellij.markdown.parser.markerblocks.impl;

import java.util.List;
import kotlin.text.Regex;
import o.C8566dqi;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkdownParserUtil;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class HtmlBlockMarkerBlock extends MarkerBlockImpl {
    private final Regex endCheckingRegex;
    private final ProductionHolder productionHolder;

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean isInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlBlockMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder productionHolder, Regex regex, LookaheadText.Position position) {
        super(markdownConstraints, productionHolder.mark());
        List e;
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) position, "");
        this.productionHolder = productionHolder;
        this.endCheckingRegex = regex;
        e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(position.getOffset(), position.getNextLineOrEofOffset()), MarkdownTokenTypes.HTML_BLOCK_CONTENT));
        productionHolder.addProduction(e);
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ClosingAction getDefaultAction() {
        return MarkerBlock.ClosingAction.DONE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        List e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (position.getOffsetInCurrentLine() != -1) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        String prevLine = position.getPrevLine();
        if (prevLine == null) {
            return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
        }
        if (!MarkdownConstraintsKt.extendsPrev(getConstraints().applyToNextLine(position), getConstraints())) {
            return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
        }
        if (this.endCheckingRegex == null && MarkdownParserUtil.INSTANCE.calcNumberOfConsequentEols(position, getConstraints()) >= 2) {
            return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
        }
        Regex regex = this.endCheckingRegex;
        if (regex != null && Regex.a(regex, prevLine, 0, 2, null) != null) {
            return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
        }
        if (position.getCurrentLine().length() > 0) {
            ProductionHolder productionHolder = this.productionHolder;
            e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(position.getOffset() + 1 + MarkdownConstraintsKt.getCharsEaten(getConstraints(), position.getCurrentLine()), position.getNextLineOrEofOffset()), MarkdownTokenTypes.HTML_BLOCK_CONTENT));
            productionHolder.addProduction(e);
        }
        return MarkerBlock.ProcessingResult.Companion.getCANCEL();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public int calcNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return position.getNextLineOrEofOffset();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.HTML_BLOCK;
    }
}
