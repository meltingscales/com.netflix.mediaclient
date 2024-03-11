package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import kotlin.text.Regex;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8671duf;
import o.InterfaceC8678dum;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.CodeFenceMarkerBlock;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public class CodeFenceProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    public static final Companion Companion = new Companion(null);
    private static final Regex REGEX = new Regex("^ {0,3}(~~~+|```+)([^`]*)$");

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> e;
        List<MarkerBlock> i;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        OpeningInfo obtainFenceOpeningInfo = obtainFenceOpeningInfo(position, stateInfo.getCurrentConstraints());
        if (obtainFenceOpeningInfo == null) {
            i = C8569dql.i();
            return i;
        }
        createNodesForFenceStart(position, obtainFenceOpeningInfo, productionHolder);
        e = C8566dqi.e(new CodeFenceMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder, obtainFenceOpeningInfo.getDelimiter()));
        return e;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return obtainFenceOpeningInfo(position, markdownConstraints) != null;
    }

    private final void createNodesForFenceStart(LookaheadText.Position position, OpeningInfo openingInfo, ProductionHolder productionHolder) {
        List e;
        List e2;
        int nextLineOrEofOffset = position.getNextLineOrEofOffset() - openingInfo.component2().length();
        e = C8566dqi.e(new SequentialParser.Node(new C8654dtp(position.getOffset(), nextLineOrEofOffset), MarkdownTokenTypes.CODE_FENCE_START));
        productionHolder.addProduction(e);
        if (openingInfo.getInfo().length() > 0) {
            e2 = C8566dqi.e(new SequentialParser.Node(new C8654dtp(nextLineOrEofOffset, position.getNextLineOrEofOffset()), MarkdownTokenTypes.FENCE_LANG));
            productionHolder.addProduction(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class OpeningInfo {
        private final String delimiter;
        private final String info;

        public final String component2() {
            return this.info;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpeningInfo) {
                OpeningInfo openingInfo = (OpeningInfo) obj;
                return C8632dsu.c((Object) this.delimiter, (Object) openingInfo.delimiter) && C8632dsu.c((Object) this.info, (Object) openingInfo.info);
            }
            return false;
        }

        public final String getDelimiter() {
            return this.delimiter;
        }

        public final String getInfo() {
            return this.info;
        }

        public int hashCode() {
            return (this.delimiter.hashCode() * 31) + this.info.hashCode();
        }

        public String toString() {
            return "OpeningInfo(delimiter=" + this.delimiter + ", info=" + this.info + ')';
        }

        public OpeningInfo(String str, String str2) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.delimiter = str;
            this.info = str2;
        }
    }

    protected OpeningInfo obtainFenceOpeningInfo(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        InterfaceC8678dum a;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        if (MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, markdownConstraints) && (a = Regex.a(REGEX, position.getCurrentLineFromPosition(), 0, 2, null)) != null) {
            C8671duf d = a.e().d(1);
            String a2 = d == null ? null : d.a();
            C8632dsu.d((Object) a2);
            C8671duf d2 = a.e().d(2);
            String a3 = d2 != null ? d2.a() : null;
            C8632dsu.d((Object) a3);
            return new OpeningInfo(a2, a3);
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
