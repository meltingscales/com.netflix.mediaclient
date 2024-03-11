package org.intellij.markdown.flavours.commonmark;

import java.util.List;
import o.C8566dqi;
import o.C8569dql;
import o.C8627dsp;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.flavours.MarkdownFlavourDescriptor;
import org.intellij.markdown.flavours.commonmark.CommonMarkMarkerProcessor;
import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.lexer._MarkdownLexer;
import org.intellij.markdown.parser.MarkerProcessorFactory;
import org.intellij.markdown.parser.sequentialparsers.EmphasisLikeParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.SequentialParserManager;
import org.intellij.markdown.parser.sequentialparsers.impl.AutolinkParser;
import org.intellij.markdown.parser.sequentialparsers.impl.BacktickParser;
import org.intellij.markdown.parser.sequentialparsers.impl.EmphStrongDelimiterParser;
import org.intellij.markdown.parser.sequentialparsers.impl.ImageParser;
import org.intellij.markdown.parser.sequentialparsers.impl.InlineLinkParser;
import org.intellij.markdown.parser.sequentialparsers.impl.ReferenceLinkParser;

/* loaded from: classes5.dex */
public class CommonMarkFlavourDescriptor implements MarkdownFlavourDescriptor {
    private final boolean absolutizeAnchorLinks;
    private final MarkerProcessorFactory markerProcessorFactory;
    private final SequentialParserManager sequentialParserManager;
    private final boolean useSafeLinks;

    public CommonMarkFlavourDescriptor() {
        this(false, false, 3, null);
    }

    @Override // org.intellij.markdown.flavours.MarkdownFlavourDescriptor
    public MarkerProcessorFactory getMarkerProcessorFactory() {
        return this.markerProcessorFactory;
    }

    @Override // org.intellij.markdown.flavours.MarkdownFlavourDescriptor
    public SequentialParserManager getSequentialParserManager() {
        return this.sequentialParserManager;
    }

    public CommonMarkFlavourDescriptor(boolean z, boolean z2) {
        this.useSafeLinks = z;
        this.absolutizeAnchorLinks = z2;
        this.markerProcessorFactory = CommonMarkMarkerProcessor.Factory.INSTANCE;
        this.sequentialParserManager = new SequentialParserManager() { // from class: org.intellij.markdown.flavours.commonmark.CommonMarkFlavourDescriptor$sequentialParserManager$1
            @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParserManager
            public List<SequentialParser> getParserSequence() {
                List e;
                List<SequentialParser> j;
                e = C8566dqi.e(MarkdownTokenTypes.AUTOLINK);
                j = C8569dql.j(new AutolinkParser(e), new BacktickParser(), new ImageParser(), new InlineLinkParser(), new ReferenceLinkParser(), new EmphasisLikeParser(new EmphStrongDelimiterParser()));
                return j;
            }
        };
    }

    public /* synthetic */ CommonMarkFlavourDescriptor(boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2);
    }

    @Override // org.intellij.markdown.flavours.MarkdownFlavourDescriptor
    public MarkdownLexer createInlinesLexer() {
        return new MarkdownLexer(new _MarkdownLexer());
    }
}
