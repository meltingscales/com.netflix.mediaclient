package org.intellij.markdown;

/* loaded from: classes5.dex */
public final class MarkdownElementTypes {
    public static final MarkdownElementTypes INSTANCE = new MarkdownElementTypes();
    public static final IElementType MARKDOWN_FILE = new MarkdownElementType("MARKDOWN_FILE", false, 2, null);
    public static final IElementType UNORDERED_LIST = new MarkdownElementType("UNORDERED_LIST", false, 2, null);
    public static final IElementType ORDERED_LIST = new MarkdownElementType("ORDERED_LIST", false, 2, null);
    public static final IElementType LIST_ITEM = new MarkdownElementType("LIST_ITEM", false, 2, null);
    public static final IElementType BLOCK_QUOTE = new MarkdownElementType("BLOCK_QUOTE", false, 2, null);
    public static final IElementType CODE_FENCE = new MarkdownElementType("CODE_FENCE", false, 2, null);
    public static final IElementType CODE_BLOCK = new MarkdownElementType("CODE_BLOCK", false, 2, null);
    public static final IElementType CODE_SPAN = new MarkdownElementType("CODE_SPAN", false, 2, null);
    public static final IElementType HTML_BLOCK = new MarkdownElementType("HTML_BLOCK", false, 2, null);
    public static final IElementType PARAGRAPH = new MarkdownElementType("PARAGRAPH", true);
    public static final IElementType EMPH = new MarkdownElementType("EMPH", false, 2, null);
    public static final IElementType STRONG = new MarkdownElementType("STRONG", false, 2, null);
    public static final IElementType LINK_DEFINITION = new MarkdownElementType("LINK_DEFINITION", false, 2, null);
    public static final IElementType LINK_LABEL = new MarkdownElementType("LINK_LABEL", true);
    public static final IElementType LINK_DESTINATION = new MarkdownElementType("LINK_DESTINATION", true);
    public static final IElementType LINK_TITLE = new MarkdownElementType("LINK_TITLE", true);
    public static final IElementType LINK_TEXT = new MarkdownElementType("LINK_TEXT", true);
    public static final IElementType INLINE_LINK = new MarkdownElementType("INLINE_LINK", false, 2, null);
    public static final IElementType FULL_REFERENCE_LINK = new MarkdownElementType("FULL_REFERENCE_LINK", false, 2, null);
    public static final IElementType SHORT_REFERENCE_LINK = new MarkdownElementType("SHORT_REFERENCE_LINK", false, 2, null);
    public static final IElementType IMAGE = new MarkdownElementType("IMAGE", false, 2, null);
    public static final IElementType AUTOLINK = new MarkdownElementType("AUTOLINK", false, 2, null);
    public static final IElementType SETEXT_1 = new MarkdownElementType("SETEXT_1", false, 2, null);
    public static final IElementType SETEXT_2 = new MarkdownElementType("SETEXT_2", false, 2, null);
    public static final IElementType ATX_1 = new MarkdownElementType("ATX_1", false, 2, null);
    public static final IElementType ATX_2 = new MarkdownElementType("ATX_2", false, 2, null);
    public static final IElementType ATX_3 = new MarkdownElementType("ATX_3", false, 2, null);
    public static final IElementType ATX_4 = new MarkdownElementType("ATX_4", false, 2, null);
    public static final IElementType ATX_5 = new MarkdownElementType("ATX_5", false, 2, null);
    public static final IElementType ATX_6 = new MarkdownElementType("ATX_6", false, 2, null);

    private MarkdownElementTypes() {
    }
}
