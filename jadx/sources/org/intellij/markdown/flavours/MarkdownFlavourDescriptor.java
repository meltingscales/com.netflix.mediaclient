package org.intellij.markdown.flavours;

import org.intellij.markdown.lexer.MarkdownLexer;
import org.intellij.markdown.parser.MarkerProcessorFactory;
import org.intellij.markdown.parser.sequentialparsers.SequentialParserManager;

/* loaded from: classes5.dex */
public interface MarkdownFlavourDescriptor {
    MarkdownLexer createInlinesLexer();

    MarkerProcessorFactory getMarkerProcessorFactory();

    SequentialParserManager getSequentialParserManager();
}
