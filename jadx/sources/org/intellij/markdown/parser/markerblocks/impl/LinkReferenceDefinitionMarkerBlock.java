package org.intellij.markdown.parser.markerblocks.impl;

import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;

/* loaded from: classes5.dex */
public final class LinkReferenceDefinitionMarkerBlock extends MarkerBlockImpl {
    private final int endPosition;

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public int calcNextInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return this.endPosition;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock
    public boolean isInterestingOffset(LookaheadText.Position position) {
        C8632dsu.c((Object) position, "");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkReferenceDefinitionMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder.Marker marker, int i) {
        super(markdownConstraints, marker);
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) marker, "");
        this.endPosition = i;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ClosingAction getDefaultAction() {
        return MarkerBlock.ClosingAction.DONE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public MarkerBlock.ProcessingResult doProcessToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (position.getOffset() < this.endPosition) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.LINK_DEFINITION;
    }
}
