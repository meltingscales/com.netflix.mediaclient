package org.intellij.markdown.parser.markerblocks;

import java.util.List;
import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.MarkerProcessor.StateInfo;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.constraints.MarkdownConstraintsKt;

/* loaded from: classes5.dex */
public interface MarkerBlockProvider<T extends MarkerProcessor.StateInfo> {
    public static final Companion Companion = Companion.$$INSTANCE;

    List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, T t);

    boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints);

    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean isStartOfLineWithConstraints(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
            C8632dsu.c((Object) position, "");
            C8632dsu.c((Object) markdownConstraints, "");
            return position.getOffsetInCurrentLine() == MarkdownConstraintsKt.getCharsEaten(markdownConstraints, position.getCurrentLine());
        }

        public static /* synthetic */ int passSmallIndent$default(Companion companion, CharSequence charSequence, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.passSmallIndent(charSequence, i);
        }

        public final int passSmallIndent(CharSequence charSequence, int i) {
            C8632dsu.c((Object) charSequence, "");
            for (int i2 = 0; i2 < 3; i2++) {
                if (i < charSequence.length() && charSequence.charAt(i) == ' ') {
                    i++;
                }
            }
            return i;
        }
    }
}
