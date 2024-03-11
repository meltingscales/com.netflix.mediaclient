package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.netflix.hawkins.consumer.component.extensions.ParseAsMarkdownKt$parseAsMarkdown$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;
import o.C8632dsu;
import o.C8654dtp;
import o.C8671duf;
import o.InterfaceC8678dum;
import o.dpR;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.MarkdownElementTypes;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.ASTUtilKt;
import org.intellij.markdown.flavours.commonmark.CommonMarkFlavourDescriptor;
import org.intellij.markdown.parser.MarkdownParser;

/* loaded from: classes3.dex */
public final class KN {
    public static final AnnotatedString a(String str, KL kl, drX<? super C8654dtp, ? super String, dpR> drx, Composer composer, int i, int i2) {
        C8632dsu.c((Object) str, "");
        composer.startReplaceableGroup(728590718);
        KL d = (i2 & 1) != 0 ? KG.e.d(null, null, null, null, null, null, null, null, null, null, composer, 0, 6, 1023) : kl;
        ParseAsMarkdownKt$parseAsMarkdown$1 parseAsMarkdownKt$parseAsMarkdown$1 = (i2 & 2) != 0 ? new drX<C8654dtp, String, dpR>() { // from class: com.netflix.hawkins.consumer.component.extensions.ParseAsMarkdownKt$parseAsMarkdown$1
            public final void c(C8654dtp c8654dtp, String str2) {
                C8632dsu.c((Object) c8654dtp, "");
                C8632dsu.c((Object) str2, "");
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(C8654dtp c8654dtp, String str2) {
                c(c8654dtp, str2);
                return dpR.c;
            }
        } : drx;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(728590718, i, -1, "com.netflix.hawkins.consumer.component.extensions.parseAsMarkdown (ParseAsMarkdown.kt:130)");
        }
        AnnotatedString annotatedString = a(new AnnotatedString.Builder(0, 1, null), str, d, new MarkdownParser(new CommonMarkFlavourDescriptor(false, false, 3, null)).buildMarkdownTreeFromString(str), 0, parseAsMarkdownKt$parseAsMarkdown$1, 8, null).toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    static /* synthetic */ AnnotatedString.Builder a(AnnotatedString.Builder builder, String str, KL kl, ASTNode aSTNode, int i, drX drx, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return e(builder, str, kl, aSTNode, i, drx);
    }

    private static final AnnotatedString.Builder e(AnnotatedString.Builder builder, String str, KL kl, ASTNode aSTNode, int i, drX<? super C8654dtp, ? super String, dpR> drx) {
        TextStyle a;
        int pushStyle;
        Object obj;
        ASTNode aSTNode2;
        List<ASTNode> children;
        Object f;
        List i2;
        List<ASTNode> h;
        SpanStyle spanStyle;
        List i3;
        List<ASTNode> h2;
        IElementType type = aSTNode.getType();
        if (!C8632dsu.c(type, MarkdownElementTypes.MARKDOWN_FILE) && !C8632dsu.c(type, MarkdownElementTypes.PARAGRAPH)) {
            IElementType iElementType = MarkdownElementTypes.SETEXT_1;
            if (C8632dsu.c(type, iElementType) || C8632dsu.c(type, MarkdownElementTypes.ATX_1) || C8632dsu.c(type, MarkdownElementTypes.SETEXT_2) || C8632dsu.c(type, MarkdownElementTypes.ATX_2) || C8632dsu.c(type, MarkdownElementTypes.ATX_3) || C8632dsu.c(type, MarkdownElementTypes.ATX_4) || C8632dsu.c(type, MarkdownElementTypes.ATX_5) || C8632dsu.c(type, MarkdownElementTypes.ATX_6)) {
                IElementType type2 = aSTNode.getType();
                if (C8632dsu.c(type2, iElementType) || C8632dsu.c(type2, MarkdownElementTypes.ATX_1)) {
                    a = kl.a();
                } else if (C8632dsu.c(type2, MarkdownElementTypes.SETEXT_2) || C8632dsu.c(type2, MarkdownElementTypes.ATX_2)) {
                    a = kl.d();
                } else if (C8632dsu.c(type2, MarkdownElementTypes.ATX_3)) {
                    a = kl.c();
                } else if (C8632dsu.c(type2, MarkdownElementTypes.ATX_4)) {
                    a = kl.e();
                } else if (C8632dsu.c(type2, MarkdownElementTypes.ATX_5)) {
                    a = kl.b();
                } else {
                    a = C8632dsu.c(type2, MarkdownElementTypes.ATX_6) ? kl.j() : kl.a();
                }
                pushStyle = builder.pushStyle(new SpanStyle(0L, a.m2170getFontSizeXSAIIZE(), a.getFontWeight(), null, null, a.getFontFamily(), null, 0L, null, null, null, 0L, null, null, null, null, 65497, null));
                try {
                    for (ASTNode aSTNode3 : aSTNode.getChildren().subList(1, aSTNode.getChildren().size())) {
                        e(builder, str, kl, aSTNode3, i + 1, drx);
                    }
                    dpR dpr = dpR.c;
                } finally {
                }
            } else if (C8632dsu.c(type, MarkdownTokenTypes.ATX_CONTENT)) {
                List<ASTNode> children2 = aSTNode.getChildren();
                ArrayList<ASTNode> arrayList = new ArrayList();
                for (Object obj2 : children2) {
                    if (!C8632dsu.c(((ASTNode) obj2).getType(), MarkdownTokenTypes.WHITE_SPACE)) {
                        arrayList.add(obj2);
                    }
                }
                for (ASTNode aSTNode4 : arrayList) {
                    e(builder, str, kl, aSTNode4, i + 1, drx);
                }
            } else if (C8632dsu.c(type, MarkdownElementTypes.STRONG)) {
                if (kl.h() != null) {
                    TextStyle h3 = kl.h();
                    if (h3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    spanStyle = new SpanStyle(0L, h3.m2170getFontSizeXSAIIZE(), h3.getFontWeight(), null, null, h3.getFontFamily(), null, 0L, null, null, null, 0L, null, null, null, null, 65497, null);
                } else {
                    spanStyle = new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null);
                }
                pushStyle = builder.pushStyle(spanStyle);
                try {
                    i3 = C8576dqs.i(aSTNode.getChildren(), 2);
                    h2 = C8576dqs.h(i3, 2);
                    for (ASTNode aSTNode5 : h2) {
                        e(builder, str, kl, aSTNode5, i + 1, drx);
                    }
                    dpR dpr2 = dpR.c;
                } finally {
                }
            } else if (!C8632dsu.c(type, MarkdownElementTypes.EMPH)) {
                if (C8632dsu.c(type, MarkdownElementTypes.INLINE_LINK)) {
                    List<ASTNode> children3 = aSTNode.getChildren();
                    ListIterator<ASTNode> listIterator = children3.listIterator(children3.size());
                    while (true) {
                        obj = null;
                        if (!listIterator.hasPrevious()) {
                            aSTNode2 = null;
                            break;
                        }
                        aSTNode2 = listIterator.previous();
                        if (C8632dsu.c(aSTNode2.getType(), MarkdownElementTypes.LINK_DESTINATION)) {
                            break;
                        }
                    }
                    ASTNode aSTNode6 = aSTNode2;
                    if (aSTNode6 == null) {
                        return builder;
                    }
                    Iterator<T> it = aSTNode.getChildren().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C8632dsu.c(((ASTNode) next).getType(), MarkdownElementTypes.LINK_TEXT)) {
                            obj = next;
                            break;
                        }
                    }
                    ASTNode aSTNode7 = (ASTNode) obj;
                    if (aSTNode7 != null && (children = aSTNode7.getChildren()) != null) {
                        f = C8576dqs.f((List<? extends Object>) children, 1);
                        ASTNode aSTNode8 = (ASTNode) f;
                        if (aSTNode8 != null && aSTNode6.getChildren().size() > 2) {
                            String obj3 = ASTUtilKt.getTextInNode(aSTNode6, str).toString();
                            int length = builder.getLength();
                            builder.pushUrlAnnotation(new UrlAnnotation(obj3));
                            pushStyle = builder.pushStyle(kl.i());
                            try {
                                e(builder, str, kl, aSTNode8, i + 1, drx);
                                drx.invoke(new C8654dtp(length, builder.getLength()), obj3);
                                dpR dpr3 = dpR.c;
                                builder.pop(pushStyle);
                                builder.pop();
                            } finally {
                            }
                        }
                    }
                    return builder;
                } else if (C8632dsu.c(type, MarkdownElementTypes.UNORDERED_LIST)) {
                    List<ASTNode> children4 = aSTNode.getChildren();
                    ArrayList<ASTNode> arrayList2 = new ArrayList();
                    for (Object obj4 : children4) {
                        if (C8632dsu.c(((ASTNode) obj4).getType(), MarkdownElementTypes.LIST_ITEM)) {
                            arrayList2.add(obj4);
                        }
                    }
                    for (ASTNode aSTNode9 : arrayList2) {
                        builder.append("•\t\t");
                        List<ASTNode> children5 = aSTNode9.getChildren();
                        ArrayList<ASTNode> arrayList3 = new ArrayList();
                        for (Object obj5 : children5) {
                            if (!C8632dsu.c(((ASTNode) obj5).getType(), MarkdownTokenTypes.LIST_BULLET)) {
                                arrayList3.add(obj5);
                            }
                        }
                        for (ASTNode aSTNode10 : arrayList3) {
                            e(builder, str, kl, aSTNode10, i + 1, drx);
                        }
                        builder.append("\n");
                    }
                } else {
                    builder.append(new Regex("\\\\([!\"#$%&'()*+,\\-./:;<=>?@\\[\\\\\\]^_`{|}~])").b(ASTUtilKt.getTextInNode(aSTNode, str).toString(), new drM<InterfaceC8678dum, CharSequence>() { // from class: com.netflix.hawkins.consumer.component.extensions.ParseAsMarkdownKt$appendMarkdown$9
                        @Override // o.drM
                        /* renamed from: a */
                        public final CharSequence invoke(InterfaceC8678dum interfaceC8678dum) {
                            String a2;
                            C8632dsu.c((Object) interfaceC8678dum, "");
                            C8671duf d = interfaceC8678dum.e().d(1);
                            return (d == null || (a2 = d.a()) == null) ? "" : a2;
                        }
                    }));
                }
            } else {
                pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, null, FontStyle.m2214boximpl(FontStyle.Companion.m2221getItalic_LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null));
                try {
                    i2 = C8576dqs.i(aSTNode.getChildren(), 1);
                    h = C8576dqs.h(i2, 1);
                    for (ASTNode aSTNode11 : h) {
                        e(builder, str, kl, aSTNode11, i + 1, drx);
                    }
                    dpR dpr4 = dpR.c;
                } finally {
                }
            }
        } else {
            for (ASTNode aSTNode12 : aSTNode.getChildren()) {
                e(builder, str, kl, aSTNode12, i + 1, drx);
            }
        }
        return builder;
    }
}
