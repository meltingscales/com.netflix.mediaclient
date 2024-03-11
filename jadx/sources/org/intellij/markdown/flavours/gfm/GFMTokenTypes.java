package org.intellij.markdown.flavours.gfm;

import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes5.dex */
public final class GFMTokenTypes {
    public static final GFMTokenTypes INSTANCE = new GFMTokenTypes();
    public static final IElementType TILDE = new MarkdownElementType("~", true);
    public static final IElementType TABLE_SEPARATOR = new MarkdownElementType("TABLE_SEPARATOR", true);
    public static final IElementType GFM_AUTOLINK = new MarkdownElementType("GFM_AUTOLINK", true);
    public static final IElementType CHECK_BOX = new MarkdownElementType("CHECK_BOX", true);
    public static final IElementType CELL = new MarkdownElementType("CELL", true);

    private GFMTokenTypes() {
    }
}
