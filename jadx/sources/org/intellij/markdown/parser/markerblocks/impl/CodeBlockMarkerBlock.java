package org.intellij.markdown.parser.markerblocks.impl;

import java.util.List;
import o.C8566dqi;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;
import org.intellij.markdown.parser.markerblocks.MarkdownParserUtil;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class CodeBlockMarkerBlock extends MarkerBlockImpl {
    private final ProductionHolder productionHolder;
    private int realInterestingOffset;

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
    public CodeBlockMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder productionHolder, LookaheadText.Position position) {
        super(markdownConstraints, productionHolder.mark());
        List e;
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) position, "");
        this.productionHolder = productionHolder;
        e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(position.getOffset(), position.getNextLineOrEofOffset()), MarkdownTokenTypes.CODE_LINE));
        productionHolder.addProduction(e);
        this.realInterestingOffset = -1;
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
        LookaheadText.Position nextPosition;
        List e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (position.getOffset() < this.realInterestingOffset) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        if (position.getOffsetInCurrentLine() != -1) {
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() == -1) {
            MarkdownParserUtil markdownParserUtil = MarkdownParserUtil.INSTANCE;
            LookaheadText.Position findNonEmptyLineWithSameConstraints = markdownParserUtil.findNonEmptyLineWithSameConstraints(getConstraints(), position);
            if (findNonEmptyLineWithSameConstraints == null) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            MarkdownConstraints applyToNextLineAndAddModifiers = MarkdownConstraintsKt.applyToNextLineAndAddModifiers(getConstraints(), findNonEmptyLineWithSameConstraints);
            LookaheadText.Position nextPosition2 = findNonEmptyLineWithSameConstraints.nextPosition(MarkdownConstraintsKt.getCharsEaten(applyToNextLineAndAddModifiers, findNonEmptyLineWithSameConstraints.getCurrentLine()) + 1);
            if (nextPosition2 == null) {
                nextPosition = null;
            } else {
                Integer charsToNonWhitespace = nextPosition2.charsToNonWhitespace();
                nextPosition = nextPosition2.nextPosition(charsToNonWhitespace == null ? 0 : charsToNonWhitespace.intValue());
            }
            if (nextPosition == null) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            if (!markdownParserUtil.hasCodeBlockIndent(nextPosition, applyToNextLineAndAddModifiers)) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            C8654dtp c8654dtp = new C8654dtp(position.getOffset() + 1 + MarkdownConstraintsKt.getCharsEaten(MarkdownConstraintsKt.applyToNextLineAndAddModifiers(getConstraints(), position), position.getCurrentLine()), position.getNextLineOrEofOffset());
            if (c8654dtp.e() - c8654dtp.d() > 0) {
                ProductionHolder productionHolder = this.productionHolder;
                e = C8566dqi.e(new SequentialParser.Node(c8654dtp, MarkdownTokenTypes.CODE_LINE));
                productionHolder.addProduction(e);
            }
            this.realInterestingOffset = position.getNextLineOrEofOffset();
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        throw new MarkdownParsingException("");
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.CODE_BLOCK;
    }
}
