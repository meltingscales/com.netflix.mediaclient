package org.intellij.markdown.parser.markerblocks.providers;

import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import o.C8566dqi;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8691duz;
import o.InterfaceC8678dum;
import o.drM;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.MarkerProcessor;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.HtmlBlockMarkerBlock;

/* loaded from: classes5.dex */
public final class HtmlBlockProvider implements MarkerBlockProvider<MarkerProcessor.StateInfo> {
    private static final String ATTRIBUTE;
    private static final String CLOSE_TAG;
    private static final Regex FIND_START_REGEX;
    private static final List<Pair<Regex, Regex>> OPEN_CLOSE_REGEXES;
    private static final String OPEN_TAG;
    public static final Companion Companion = new Companion(null);
    private static final String TAG_NAMES = "address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul";
    private static final String TAG_NAME = "[a-zA-Z][a-zA-Z0-9-]*";
    private static final String ATTR_NAME = "[A-Za-z:_][A-Za-z0-9_.:-]*";
    private static final String ATTR_VALUE = "\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\")";

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public List<MarkerBlock> createMarkerBlocks(LookaheadText.Position position, ProductionHolder productionHolder, MarkerProcessor.StateInfo stateInfo) {
        List<MarkerBlock> i;
        List<MarkerBlock> e;
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) productionHolder, "");
        C8632dsu.c((Object) stateInfo, "");
        int matches = matches(position, stateInfo.getCurrentConstraints());
        if (matches != -1) {
            e = C8566dqi.e(new HtmlBlockMarkerBlock(stateInfo.getCurrentConstraints(), productionHolder, OPEN_CLOSE_REGEXES.get(matches).a(), position));
            return e;
        }
        i = C8569dql.i();
        return i;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public boolean interruptsParagraph(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        C8632dsu.c((Object) position, "");
        C8632dsu.c((Object) markdownConstraints, "");
        int matches = matches(position, markdownConstraints);
        return matches >= 0 && matches <= 5;
    }

    private final int matches(LookaheadText.Position position, MarkdownConstraints markdownConstraints) {
        InterfaceC8678dum a;
        MarkerBlockProvider.Companion companion = MarkerBlockProvider.Companion;
        if (companion.isStartOfLineWithConstraints(position, markdownConstraints)) {
            CharSequence currentLineFromPosition = position.getCurrentLineFromPosition();
            int i = 0;
            int passSmallIndent$default = MarkerBlockProvider.Companion.passSmallIndent$default(companion, currentLineFromPosition, 0, 2, null);
            if (passSmallIndent$default >= currentLineFromPosition.length() || currentLineFromPosition.charAt(passSmallIndent$default) != '<' || (a = Regex.a(FIND_START_REGEX, currentLineFromPosition.subSequence(passSmallIndent$default, currentLineFromPosition.length()).toString(), 0, 2, null)) == null) {
                return -1;
            }
            Compat compat = Compat.INSTANCE;
            int size = a.e().size();
            List<Pair<Regex, Regex>> list = OPEN_CLOSE_REGEXES;
            if (size != list.size() + 2) {
                throw new MarkdownParsingException("There are some excess capturing groups probably!");
            }
            int size2 = list.size() - 1;
            if (size2 >= 0) {
                while (a.e().d(i + 2) == null) {
                    if (i != size2) {
                        i++;
                    }
                }
                return i;
            }
            Compat compat2 = Compat.INSTANCE;
            throw new MarkdownParsingException("Match found but all groups are empty!");
        }
        return -1;
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    static {
        String b;
        List<Pair<Regex, Regex>> j;
        String d;
        String str = "\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?";
        ATTRIBUTE = str;
        String str2 = "<[a-zA-Z][a-zA-Z0-9-]*(?:" + str + ")*\\s*/?>";
        OPEN_TAG = str2;
        String str3 = "</[a-zA-Z][a-zA-Z0-9-]*\\s*>";
        CLOSE_TAG = str3;
        RegexOption regexOption = RegexOption.e;
        Pair pair = new Pair(new Regex("<(?:script|pre|style)(?: |>|$)", regexOption), new Regex("</(?:script|style|pre)>", regexOption));
        Pair pair2 = new Pair(new Regex("<!--"), new Regex("-->"));
        Pair pair3 = new Pair(new Regex("<\\?"), new Regex("\\?>"));
        Pair pair4 = new Pair(new Regex("<![A-Z]"), new Regex(">"));
        Pair pair5 = new Pair(new Regex("<!\\[CDATA\\["), new Regex("\\]\\]>"));
        StringBuilder sb = new StringBuilder();
        sb.append("</?(?:");
        b = C8691duz.b("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|", false, 4, (Object) null);
        sb.append(b);
        sb.append(")(?: |/?>|$)");
        j = C8569dql.j(pair, pair2, pair3, pair4, pair5, new Pair(new Regex(sb.toString(), regexOption), null), new Pair(new Regex("(?:" + str2 + '|' + str3 + ")(?: |$)"), null));
        OPEN_CLOSE_REGEXES = j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("^(");
        d = C8576dqs.d(j, "|", null, null, 0, null, new drM<Pair<? extends Regex, ? extends Regex>, CharSequence>() { // from class: org.intellij.markdown.parser.markerblocks.providers.HtmlBlockProvider$Companion$FIND_START_REGEX$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(Pair<Regex, Regex> pair6) {
                C8632dsu.c((Object) pair6, "");
                return '(' + pair6.d().b() + ')';
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends Regex, ? extends Regex> pair6) {
                return invoke2((Pair<Regex, Regex>) pair6);
            }
        }, 30, null);
        sb2.append(d);
        sb2.append(')');
        FIND_START_REGEX = new Regex(sb2.toString());
    }
}
