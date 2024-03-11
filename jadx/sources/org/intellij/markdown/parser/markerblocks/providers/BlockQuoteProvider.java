package org.intellij.markdown.parser.markerblocks.providers;

import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;

/* loaded from: classes5.dex */
public final class BlockQuoteProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        r3 = o.C8563dqf.d(r5.getTypes());
     */
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<org.intellij.markdown.parser.markerblocks.MarkerBlock> createMarkerBlocks(org.intellij.markdown.parser.LookaheadText.Position r3, org.intellij.markdown.parser.ProductionHolder r4, org.intellij.markdown.parser.MarkerProcessor.StateInfo r5) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            org.intellij.markdown.parser.constraints.MarkdownConstraints r0 = r5.getCurrentConstraints()
            org.intellij.markdown.parser.constraints.MarkdownConstraints r5 = r5.getNextConstraints()
            int r1 = r3.getOffsetInCurrentLine()
            java.lang.String r3 = r3.getCurrentLine()
            int r3 = org.intellij.markdown.parser.constraints.MarkdownConstraintsKt.getCharsEaten(r0, r3)
            if (r1 == r3) goto L26
            java.util.List r3 = o.C8570dqm.c()
            return r3
        L26:
            boolean r3 = o.C8632dsu.c(r5, r0)
            if (r3 != 0) goto L4d
            char[] r3 = r5.getTypes()
            java.lang.Character r3 = o.C8561dqd.b(r3)
            if (r3 != 0) goto L37
            goto L4d
        L37:
            char r3 = r3.charValue()
            r0 = 62
            if (r3 != r0) goto L4d
            org.intellij.markdown.parser.markerblocks.impl.BlockQuoteMarkerBlock r3 = new org.intellij.markdown.parser.markerblocks.impl.BlockQuoteMarkerBlock
            org.intellij.markdown.parser.ProductionHolder$Marker r4 = r4.mark()
            r3.<init>(r5, r4)
            java.util.List r3 = o.C8570dqm.c(r3)
            return r3
        L4d:
            java.util.List r3 = o.C8570dqm.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.markerblocks.providers.BlockQuoteProvider.createMarkerBlocks(org.intellij.markdown.parser.LookaheadText$Position, org.intellij.markdown.parser.ProductionHolder, org.intellij.markdown.parser.MarkerProcessor$StateInfo):java.util.List");
    }
}
