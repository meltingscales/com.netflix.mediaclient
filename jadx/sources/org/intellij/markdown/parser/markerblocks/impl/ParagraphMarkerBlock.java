package org.intellij.markdown.parser.markerblocks.impl;

import o.C8632dsu;
import o.drX;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkdownParserUtil;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;

/* loaded from: classes5.dex */
public final class ParagraphMarkerBlock extends MarkerBlockImpl {
    private final drX<LookaheadText.Position, MarkdownConstraints, Boolean> interruptsParagraph;

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
    /* JADX WARN: Multi-variable type inference failed */
    public ParagraphMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder.Marker marker, drX<? super LookaheadText.Position, ? super MarkdownConstraints, Boolean> drx) {
        super(markdownConstraints, marker);
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) marker, "");
        C8632dsu.c((Object) drx, "");
        this.interruptsParagraph = drx;
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
        if (position.getOffsetInCurrentLine() != -1) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() == -1) {
            if (MarkdownParserUtil.INSTANCE.calcNumberOfConsequentEols(position, getConstraints()) >= 2) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            MarkdownConstraints applyToNextLineAndAddModifiers = MarkdownConstraintsKt.applyToNextLineAndAddModifiers(getConstraints(), position);
            if (!MarkdownConstraintsKt.upstreamWith(applyToNextLineAndAddModifiers, getConstraints())) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            LookaheadText.Position nextPosition = position.nextPosition(MarkdownConstraintsKt.getCharsEaten(applyToNextLineAndAddModifiers, position.getCurrentLine()) + 1);
            if (nextPosition == null || this.interruptsParagraph.invoke(nextPosition, applyToNextLineAndAddModifiers).booleanValue()) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        throw new MarkdownParsingException("");
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.PARAGRAPH;
    }
}
