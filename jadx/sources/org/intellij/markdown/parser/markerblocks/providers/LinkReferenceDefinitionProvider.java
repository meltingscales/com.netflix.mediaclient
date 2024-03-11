package org.intellij.markdown.parser.markerblocks.providers;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8672dug;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.LinkReferenceDefinitionMarkerBlock;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public final class LinkReferenceDefinitionProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    public static final Companion Companion = new Companion(null);

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        Object B;
        List<MarkerBlock> e;
        List<MarkerBlock> i;
        IElementType iElementType;
        List e2;
        List<MarkerBlock> i2;
        List<MarkerBlock> i3;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        if (!MarkerBlockProvider.Companion.isStartOfLineWithConstraints(position, stateInfo.getCurrentConstraints())) {
            i3 = C8569dql.i();
            return i3;
        }
        List<C8654dtp> matchLinkDefinition = Companion.matchLinkDefinition(position.getOriginalText(), position.getOffset());
        if (matchLinkDefinition == null) {
            i2 = C8569dql.i();
            return i2;
        }
        int i4 = 0;
        for (C8654dtp c8654dtp : matchLinkDefinition) {
            C8654dtp addToRangeAndWiden = Companion.addToRangeAndWiden(c8654dtp, 0);
            if (i4 == 0) {
                iElementType = MarkdownElementTypes.LINK_LABEL;
            } else if (i4 == 1) {
                iElementType = MarkdownElementTypes.LINK_DESTINATION;
            } else if (i4 == 2) {
                iElementType = MarkdownElementTypes.LINK_TITLE;
            } else {
                throw new AssertionError("There are no more than three groups in this regex");
            }
            e2 = C8566dqi.e(new SequentialParser.Node(addToRangeAndWiden, iElementType));
            productionHolder.addProduction(e2);
            i4++;
        }
        B = C8576dqs.B((List<? extends Object>) matchLinkDefinition);
        int e3 = (((C8654dtp) B).e() - position.getOffset()) + 1;
        LookaheadText.Position nextPosition = position.nextPosition(e3);
        if (nextPosition != null && !Companion.isEndOfLine(nextPosition)) {
            i = C8569dql.i();
            return i;
        }
        e = C8566dqi.e(new LinkReferenceDefinitionMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder.mark(), position.getOffset() + e3));
        return e;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final C8654dtp addToRangeAndWiden(C8654dtp c8654dtp, int i) {
            C8632dsu.c((Object) c8654dtp, "");
            return new C8654dtp(c8654dtp.d() + i, c8654dtp.e() + i + 1);
        }

        public final boolean isEndOfLine(LookaheadText.Position position) {
            C8632dsu.c((Object) position, "");
            return position.getOffsetInCurrentLine() == -1 || position.charsToNonWhitespace() == null;
        }

        public final List<C8654dtp> matchLinkDefinition(CharSequence charSequence, int i) {
            int e;
            int e2;
            C8654dtp matchLinkDestination;
            char charAt;
            C8632dsu.c((Object) charSequence, "");
            C8654dtp matchLinkLabel = matchLinkLabel(charSequence, MarkerBlockProvider.Companion.passSmallIndent(charSequence, i));
            if (matchLinkLabel != null && (e2 = (e = matchLinkLabel.e()) + 1) < charSequence.length() && charSequence.charAt(e2) == ':' && (matchLinkDestination = matchLinkDestination(charSequence, passOneNewline(charSequence, e + 2))) != null) {
                C8654dtp matchLinkTitle = matchLinkTitle(charSequence, passOneNewline(charSequence, matchLinkDestination.e() + 1));
                ArrayList arrayList = new ArrayList();
                arrayList.add(matchLinkLabel);
                arrayList.add(matchLinkDestination);
                if (matchLinkTitle != null) {
                    int e3 = matchLinkTitle.e();
                    while (true) {
                        e3++;
                        if (e3 >= charSequence.length() || ((charAt = charSequence.charAt(e3)) != ' ' && charAt != '\t')) {
                            break;
                        }
                    }
                    if (e3 >= charSequence.length() || charSequence.charAt(e3) == '\n') {
                        arrayList.add(matchLinkTitle);
                    }
                }
                return arrayList;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a1, code lost:
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C8654dtp matchLinkDestination(java.lang.CharSequence r12, int r13) {
            /*
                r11 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r12, r0)
                int r0 = r12.length()
                r1 = 0
                if (r13 < r0) goto Ld
                return r1
            Ld:
                char r0 = r12.charAt(r13)
                r2 = 92
                r3 = 60
                r4 = 10
                r5 = 9
                r6 = 32
                r7 = 1
                if (r0 != r3) goto L5a
                int r0 = r13 + 1
            L20:
                int r8 = r12.length()
                if (r0 >= r8) goto L59
                char r8 = r12.charAt(r0)
                r9 = 62
                if (r8 != r9) goto L34
                o.dtp r12 = new o.dtp
                r12.<init>(r13, r0)
                return r12
            L34:
                if (r8 == r3) goto L59
                if (r8 == r9) goto L59
                if (r8 == r6) goto L59
                if (r8 != r5) goto L3d
                goto L59
            L3d:
                if (r8 != r4) goto L40
                goto L59
            L40:
                if (r8 != r2) goto L57
                int r8 = r0 + 1
                int r9 = r12.length()
                if (r8 >= r9) goto L57
                char r9 = r12.charAt(r8)
                if (r9 == r6) goto L57
                if (r9 != r5) goto L53
                goto L57
            L53:
                if (r9 != r4) goto L56
                goto L57
            L56:
                r0 = r8
            L57:
                int r0 = r0 + r7
                goto L20
            L59:
                return r1
            L5a:
                r0 = 0
                r3 = r13
                r8 = r0
            L5d:
                int r9 = r12.length()
                if (r3 >= r9) goto L9f
                char r9 = r12.charAt(r3)
                if (r9 == r6) goto L9f
                if (r9 != r5) goto L6c
                goto L9f
            L6c:
                if (r9 != r4) goto L6f
                goto L9f
            L6f:
                r10 = 27
                if (r9 > r10) goto L74
                goto L9f
            L74:
                r10 = 40
                if (r9 != r10) goto L7d
                if (r8 == 0) goto L7b
                goto L9f
            L7b:
                r8 = r7
                goto L9d
            L7d:
                r10 = 41
                if (r9 != r10) goto L86
                if (r8 != 0) goto L84
                goto L9f
            L84:
                r8 = r0
                goto L9d
            L86:
                if (r9 != r2) goto L9d
                int r9 = r3 + 1
                int r10 = r12.length()
                if (r9 >= r10) goto L9d
                char r10 = r12.charAt(r9)
                if (r10 == r6) goto L9d
                if (r10 != r5) goto L99
                goto L9d
            L99:
                if (r10 != r4) goto L9c
                goto L9d
            L9c:
                r3 = r9
            L9d:
                int r3 = r3 + r7
                goto L5d
            L9f:
                if (r13 != r3) goto La2
                return r1
            La2:
                o.dtp r12 = new o.dtp
                int r3 = r3 - r7
                r12.<init>(r13, r3)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.markerblocks.providers.LinkReferenceDefinitionProvider.Companion.matchLinkDestination(java.lang.CharSequence, int):o.dtp");
        }

        public final C8654dtp matchLinkTitle(CharSequence charSequence, int i) {
            int i2;
            char charAt;
            C8632dsu.c((Object) charSequence, "");
            if (i >= charSequence.length()) {
                return null;
            }
            char charAt2 = charSequence.charAt(i);
            char c = '\'';
            if (charAt2 != '\'') {
                c = JsonFactory.DEFAULT_QUOTE_CHAR;
                if (charAt2 != '\"') {
                    if (charAt2 == '(') {
                        c = ')';
                    }
                    return null;
                }
            }
            int i3 = i + 1;
            boolean z = false;
            while (i3 < charSequence.length()) {
                char charAt3 = charSequence.charAt(i3);
                if (charAt3 == c) {
                    return new C8654dtp(i, i3);
                }
                if (charAt3 == '\n') {
                    if (z) {
                        return null;
                    }
                    z = true;
                } else if (charAt3 != ' ' && charAt3 != '\t') {
                    z = false;
                }
                if (charAt3 == '\\' && (i2 = i3 + 1) < charSequence.length() && (charAt = charSequence.charAt(i2)) != ' ' && charAt != '\t' && charAt != '\n') {
                    i3 = i2;
                }
                i3++;
            }
            return null;
        }

        public final C8654dtp matchLinkLabel(CharSequence charSequence, int i) {
            boolean c;
            C8632dsu.c((Object) charSequence, "");
            if (i < charSequence.length() && charSequence.charAt(i) == '[') {
                int i2 = i + 1;
                boolean z = false;
                int i3 = 1;
                do {
                    i3++;
                    if (i2 >= charSequence.length()) {
                        return null;
                    }
                    char charAt = charSequence.charAt(i2);
                    if (charAt == '[' || charAt == ']') {
                        break;
                    }
                    if (charAt == '\\') {
                        i2++;
                        if (i2 >= charSequence.length()) {
                            return null;
                        }
                        charAt = charSequence.charAt(i2);
                    }
                    c = C8672dug.c(charAt);
                    if (!c) {
                        z = true;
                    }
                    i2++;
                } while (i3 <= 999);
                if (z && i2 < charSequence.length() && charSequence.charAt(i2) == ']') {
                    return new C8654dtp(i, i2);
                }
            }
            return null;
        }

        private final int passOneNewline(CharSequence charSequence, int i) {
            char charAt;
            char charAt2;
            while (i < charSequence.length() && ((charAt2 = charSequence.charAt(i)) == ' ' || charAt2 == '\t')) {
                i++;
            }
            if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
                while (true) {
                    i++;
                    if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) != ' ' && charAt != '\t')) {
                        break;
                    }
                }
            }
            return i;
        }
    }
}
