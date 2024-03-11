package org.intellij.markdown.parser.markerblocks.providers;

import o.C8563dqf;
import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;

/* loaded from: classes5.dex */
public final class ListMarkerProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        r4 = o.C8563dqf.d(r1.getTypes());
     */
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<org.intellij.markdown.parser.markerblocks.MarkerBlock> createMarkerBlocks(org.intellij.markdown.parser.LookaheadText.Position r4, org.intellij.markdown.parser.ProductionHolder r5, org.intellij.markdown.parser.MarkerProcessor.StateInfo r6) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            org.intellij.markdown.parser.constraints.MarkdownConstraints r0 = r6.getCurrentConstraints()
            org.intellij.markdown.parser.constraints.MarkdownConstraints r1 = r6.getNextConstraints()
            org.intellij.markdown.parser.markerblocks.MarkerBlockProvider$Companion r2 = org.intellij.markdown.parser.markerblocks.MarkerBlockProvider.Companion
            boolean r4 = r2.isStartOfLineWithConstraints(r4, r0)
            if (r4 != 0) goto L20
            java.util.List r4 = o.C8570dqm.c()
            return r4
        L20:
            boolean r4 = o.C8632dsu.c(r1, r0)
            if (r4 != 0) goto L7a
            char[] r4 = r1.getTypes()
            java.lang.Character r4 = o.C8561dqd.b(r4)
            if (r4 != 0) goto L31
            goto L39
        L31:
            char r4 = r4.charValue()
            r0 = 62
            if (r4 == r0) goto L7a
        L39:
            java.lang.Boolean r4 = r3.getLastExplicit(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = o.C8632dsu.c(r4, r0)
            if (r4 == 0) goto L7a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            org.intellij.markdown.parser.markerblocks.MarkerBlock r6 = r6.getLastBlock()
            boolean r6 = r6 instanceof org.intellij.markdown.parser.markerblocks.impl.ListMarkerBlock
            if (r6 != 0) goto L6d
            org.intellij.markdown.parser.ProductionHolder$Marker r6 = r5.mark()
            char[] r0 = r1.getTypes()
            java.lang.Character r0 = o.C8561dqd.b(r0)
            o.C8632dsu.d(r0)
            org.intellij.markdown.parser.markerblocks.impl.ListMarkerBlock r2 = new org.intellij.markdown.parser.markerblocks.impl.ListMarkerBlock
            char r0 = r0.charValue()
            r2.<init>(r1, r6, r0)
            r4.add(r2)
        L6d:
            org.intellij.markdown.parser.markerblocks.impl.ListItemMarkerBlock r6 = new org.intellij.markdown.parser.markerblocks.impl.ListItemMarkerBlock
            org.intellij.markdown.parser.ProductionHolder$Marker r5 = r5.mark()
            r6.<init>(r1, r5)
            r4.add(r6)
            return r4
        L7a:
            java.util.List r4 = o.C8570dqm.c()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.markerblocks.providers.ListMarkerProvider.createMarkerBlocks(org.intellij.markdown.parser.LookaheadText$Position, org.intellij.markdown.parser.ProductionHolder, org.intellij.markdown.parser.MarkerProcessor$StateInfo):java.util.List");
    }

    private final Boolean getLastExplicit(MarkdownConstraints markdownConstraints) {
        Boolean b;
        b = C8563dqf.b(markdownConstraints.isExplicit());
        return b;
    }
}
