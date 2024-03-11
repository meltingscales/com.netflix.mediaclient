package org.intellij.markdown;

import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class MarkdownElementType extends IElementType {
    private final boolean isToken;

    public final boolean isToken() {
        return this.isToken;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownElementType(String str, boolean z) {
        super(str);
        C8632dsu.c((Object) str, "");
        this.isToken = z;
    }

    public /* synthetic */ MarkdownElementType(String str, boolean z, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? false : z);
    }

    @Override // org.intellij.markdown.IElementType
    public String toString() {
        return C8632dsu.d("Markdown:", (Object) super.toString());
    }
}
