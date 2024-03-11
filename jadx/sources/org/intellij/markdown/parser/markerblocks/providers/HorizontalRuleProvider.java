package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.HorizontalRuleMarkerBlock;

/* loaded from: classes5.dex */
public final class HorizontalRuleProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    public static final Companion Companion = new Companion(null);

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> i;
        List<MarkerBlock> e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        if (matches(position, stateInfo.getCurrentConstraints())) {
            e = C8566dqi.e(new HorizontalRuleMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder.mark()));
            return e;
        }
        i = C8569dql.i();
        return i;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return matches(position, markdownConstraints);
    }

    public final boolean matches(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, markdownConstraints)) {
            return Companion.isHorizontalRule(position.getCurrentLine(), position.getOffsetInCurrentLine());
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean isHorizontalRule(CharSequence charSequence, int i) {
            C8632dsu.c((Object) charSequence, "");
            int length = charSequence.length() - 1;
            if (i <= length) {
                Character ch = null;
                int i2 = 1;
                int i3 = 0;
                while (true) {
                    char charAt = charSequence.charAt(i);
                    if (ch == null) {
                        if (charAt == '*' || charAt == '-' || charAt == '_') {
                            ch = Character.valueOf(charAt);
                        } else if (i3 >= 3 || charAt != ' ') {
                            break;
                        } else {
                            i3++;
                        }
                    } else if (charAt == ch.charValue()) {
                        i2++;
                    } else if (charAt != ' ' && charAt != '\t') {
                        return false;
                    }
                    if (i != length) {
                        i++;
                    } else if (i2 >= 3) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }
}
