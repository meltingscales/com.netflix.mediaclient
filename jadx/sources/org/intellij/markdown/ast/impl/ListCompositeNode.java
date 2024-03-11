package org.intellij.markdown.ast.impl;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.dpB;
import o.drO;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.CompositeASTNode;

/* loaded from: classes5.dex */
public final class ListCompositeNode extends CompositeASTNode {
    public static final Companion Companion = new Companion(null);
    private final InterfaceC8554dpx loose$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCompositeNode(IElementType iElementType, List<? extends ASTNode> list) {
        super(iElementType, list);
        InterfaceC8554dpx b;
        C8632dsu.c((Object) iElementType, "");
        C8632dsu.c((Object) list, "");
        b = dpB.b(LazyThreadSafetyMode.e, new drO<Boolean>() { // from class: org.intellij.markdown.ast.impl.ListCompositeNode$loose$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final Boolean invoke() {
                boolean isLoose;
                isLoose = ListCompositeNode.this.isLoose();
                return Boolean.valueOf(isLoose);
            }
        });
        this.loose$delegate = b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoose() {
        if (Companion.hasLooseContent(this)) {
            return true;
        }
        for (ASTNode aSTNode : getChildren()) {
            if (C8632dsu.c(aSTNode.getType(), MarkdownElementTypes.LIST_ITEM) && Companion.hasLooseContent(aSTNode)) {
                return true;
            }
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

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasLooseContent(ASTNode aSTNode) {
            int i = 0;
            boolean z = false;
            for (ASTNode aSTNode2 : aSTNode.getChildren()) {
                IElementType type = aSTNode2.getType();
                if (C8632dsu.c(type, MarkdownTokenTypes.EOL)) {
                    i++;
                } else if (!C8632dsu.c(type, MarkdownTokenTypes.LIST_BULLET) && !C8632dsu.c(type, MarkdownTokenTypes.LIST_NUMBER) && !C8632dsu.c(type, MarkdownTokenTypes.WHITE_SPACE)) {
                    if (z && i > 1) {
                        return true;
                    }
                    i = 0;
                    z = true;
                }
            }
            return false;
        }
    }
}
