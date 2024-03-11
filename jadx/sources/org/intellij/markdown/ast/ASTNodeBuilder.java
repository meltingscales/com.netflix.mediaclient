package org.intellij.markdown.ast;

import java.util.ArrayList;
import java.util.List;
import o.C8566dqi;
import o.C8627dsp;
import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.impl.ListCompositeNode;
import org.intellij.markdown.ast.impl.ListItemCompositeNode;

/* loaded from: classes5.dex */
public class ASTNodeBuilder {
    public static final Companion Companion = new Companion(null);
    private final CharSequence text;

    public final CharSequence getText() {
        return this.text;
    }

    public ASTNodeBuilder(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.text = charSequence;
    }

    public List<ASTNode> createLeafNodes(IElementType iElementType, int i, int i2) {
        List<ASTNode> e;
        C8632dsu.c((Object) iElementType, "");
        if (C8632dsu.c(iElementType, MarkdownTokenTypes.WHITE_SPACE)) {
            ArrayList arrayList = new ArrayList();
            while (i < i2) {
                int indexOfSubSeq = Companion.indexOfSubSeq(this.text, i, i2, '\n');
                if (indexOfSubSeq == -1) {
                    break;
                }
                if (indexOfSubSeq > i) {
                    arrayList.add(new LeafASTNode(MarkdownTokenTypes.WHITE_SPACE, i, indexOfSubSeq));
                }
                int i3 = indexOfSubSeq + 1;
                arrayList.add(new LeafASTNode(MarkdownTokenTypes.EOL, indexOfSubSeq, i3));
                i = i3;
            }
            if (i2 > i) {
                arrayList.add(new LeafASTNode(MarkdownTokenTypes.WHITE_SPACE, i, i2));
            }
            return arrayList;
        }
        e = C8566dqi.e(new LeafASTNode(iElementType, i, i2));
        return e;
    }

    public CompositeASTNode createCompositeNode(IElementType iElementType, List<? extends ASTNode> list) {
        C8632dsu.c((Object) iElementType, "");
        C8632dsu.c((Object) list, "");
        if (C8632dsu.c(iElementType, MarkdownElementTypes.UNORDERED_LIST) || C8632dsu.c(iElementType, MarkdownElementTypes.ORDERED_LIST)) {
            return new ListCompositeNode(iElementType, list);
        }
        if (C8632dsu.c(iElementType, MarkdownElementTypes.LIST_ITEM)) {
            return new ListItemCompositeNode(list);
        }
        return new CompositeASTNode(iElementType, list);
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final int indexOfSubSeq(CharSequence charSequence, int i, int i2, char c) {
            C8632dsu.c((Object) charSequence, "");
            int i3 = i2 - 1;
            if (i <= i3) {
                while (charSequence.charAt(i) != c) {
                    if (i != i3) {
                        i++;
                    }
                }
                return i;
            }
            return -1;
        }
    }
}
