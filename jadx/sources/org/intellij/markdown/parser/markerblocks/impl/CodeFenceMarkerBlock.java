package org.intellij.markdown.parser.markerblocks.impl;

import java.util.List;
import kotlin.text.Regex;
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
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class CodeFenceMarkerBlock extends MarkerBlockImpl {
    private final Regex endLineRegex;
    private final String fenceStart;
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
    public CodeFenceMarkerBlock(MarkdownConstraints markdownConstraints, ProductionHolder productionHolder, String str) {
        super(markdownConstraints, productionHolder.mark());
        C8632dsu.c((Object) markdownConstraints, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) str, "");
        this.productionHolder = productionHolder;
        this.fenceStart = str;
        this.endLineRegex = new Regex("^ {0,3}" + str + "+ *$");
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
        List e;
        List e2;
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
            MarkdownConstraints applyToNextLineAndAddModifiers = MarkdownConstraintsKt.applyToNextLineAndAddModifiers(getConstraints(), position);
            if (!MarkdownConstraintsKt.extendsPrev(applyToNextLineAndAddModifiers, getConstraints())) {
                return MarkerBlock.ProcessingResult.Companion.getDEFAULT();
            }
            int nextLineOrEofOffset = position.getNextLineOrEofOffset();
            this.realInterestingOffset = nextLineOrEofOffset;
            if (endsThisFence(MarkdownConstraintsKt.eatItselfFromString(applyToNextLineAndAddModifiers, position.getCurrentLine()))) {
                ProductionHolder productionHolder = this.productionHolder;
                e2 = C8566dqi.e(new SequentialParser.Node(new C8654dtp(position.getOffset() + 1, position.getNextLineOrEofOffset()), MarkdownTokenTypes.CODE_FENCE_END));
                productionHolder.addProduction(e2);
                scheduleProcessingResult(nextLineOrEofOffset, MarkerBlock.ProcessingResult.Companion.getDEFAULT());
            } else {
                C8654dtp c8654dtp = new C8654dtp(Math.min(position.getOffset() + 1 + MarkdownConstraintsKt.getCharsEaten(getConstraints(), position.getCurrentLine()), nextLineOrEofOffset), nextLineOrEofOffset);
                if (c8654dtp.d() < c8654dtp.e()) {
                    ProductionHolder productionHolder2 = this.productionHolder;
                    e = C8566dqi.e(new SequentialParser.Node(c8654dtp, MarkdownTokenTypes.CODE_FENCE_CONTENT));
                    productionHolder2.addProduction(e);
                }
            }
            return MarkerBlock.ProcessingResult.Companion.getCANCEL();
        }
        throw new MarkdownParsingException("");
    }

    private final boolean endsThisFence(CharSequence charSequence) {
        return this.endLineRegex.e(charSequence);
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public IElementType getDefaultNodeType() {
        return MarkdownElementTypes.CODE_FENCE;
    }
}
