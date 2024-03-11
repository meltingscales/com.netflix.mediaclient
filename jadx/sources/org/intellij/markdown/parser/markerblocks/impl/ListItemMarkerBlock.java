package org.intellij.markdown.parser.markerblocks.impl;

import o.C8632dsu;
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
public final class ListItemMarkerBlock extends MarkerBlockImpl {
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean allowsSubBlocks() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder.Marker marker) {
        super(markdownConstraints, marker);
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) marker, "");
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean isInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return position.getOffsetInCurrentLine() == -1;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ClosingAction getDefaultAction() {
        return MarkerBlock.ClosingAction.DONE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public int calcNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        Integer nextLineOffset = position.getNextLineOffset();
        if (nextLineOffset == null) {
            return -1;
        }
        return nextLineOffset.intValue();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() == -1) {
            MarkdownParserUtil markdownParserUtil = MarkdownParserUtil.INSTANCE;
            int calcNumberOfConsequentEols = markdownParserUtil.calcNumberOfConsequentEols(position, getConstraints());
            if (calcNumberOfConsequentEols >= 3) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            LookaheadText.Position firstNonWhitespaceLinePos = markdownParserUtil.getFirstNonWhitespaceLinePos(position, calcNumberOfConsequentEols);
            if (firstNonWhitespaceLinePos == null) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            if (!MarkdownConstraintsKt.extendsPrev(MarkdownConstraintsKt.applyToNextLineAndAddModifiers(getConstraints(), firstNonWhitespaceLinePos), getConstraints())) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        throw new MarkdownParsingException("");
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.LIST_ITEM;
    }
}
