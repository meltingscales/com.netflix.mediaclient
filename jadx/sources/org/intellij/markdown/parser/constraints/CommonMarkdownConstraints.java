package org.intellij.markdown.parser.constraints;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;
import o.C8563dqf;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C8657dts;
import o.C8691duz;
import o.dqB;
import o.drM;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.markerblocks.providers.HorizontalRuleProvider;

/* loaded from: classes5.dex */
public class CommonMarkdownConstraints implements MarkdownConstraints {
    private final int charsEaten;
    private final int[] indents;
    private final boolean[] isExplicit;
    private final char[] types;
    public static final Companion Companion = new Companion(null);
    private static final CommonMarkdownConstraints BASE = new CommonMarkdownConstraints(new int[0], new char[0], new boolean[0], 0);

    protected CommonMarkdownConstraints getBase() {
        return BASE;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public int getCharsEaten() {
        return this.charsEaten;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public char[] getTypes() {
        return this.types;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public boolean[] isExplicit() {
        return this.isExplicit;
    }

    protected CommonMarkdownConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) cArr, "");
        C8632dsu.c((Object) zArr, "");
        this.indents = iArr;
        this.types = cArr;
        this.isExplicit = zArr;
        this.charsEaten = i;
    }

    protected CommonMarkdownConstraints createNewConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        C8632dsu.c((Object) iArr, "");
        C8632dsu.c((Object) cArr, "");
        C8632dsu.c((Object) zArr, "");
        return new CommonMarkdownConstraints(iArr, cArr, zArr, i);
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public int getIndent() {
        Integer o2;
        o2 = C8563dqf.o(this.indents);
        if (o2 == null) {
            return 0;
        }
        return o2.intValue();
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public boolean startsWith(MarkdownConstraints markdownConstraints) {
        C8654dtp g;
        C8632dsu.c((Object) markdownConstraints, "");
        if (markdownConstraints instanceof CommonMarkdownConstraints) {
            int length = this.indents.length;
            int length2 = ((CommonMarkdownConstraints) markdownConstraints).indents.length;
            if (length < length2) {
                return false;
            }
            g = C8657dts.g(0, length2);
            if (!(g instanceof Collection) || !((Collection) g).isEmpty()) {
                Iterator<Integer> it = g.iterator();
                while (it.hasNext()) {
                    int nextInt = ((dqB) it).nextInt();
                    if (getTypes()[nextInt] != markdownConstraints.getTypes()[nextInt]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public boolean containsListMarkers(int i) {
        C8654dtp g;
        g = C8657dts.g(0, i);
        if ((g instanceof Collection) && ((Collection) g).isEmpty()) {
            return false;
        }
        Iterator<Integer> it = g.iterator();
        while (it.hasNext()) {
            int nextInt = ((dqB) it).nextInt();
            if (getTypes()[nextInt] != '>' && isExplicit()[nextInt]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public CommonMarkdownConstraints addModifierIfNeeded(LookaheadText.Position position) {
        if (position == null || position.getOffsetInCurrentLine() == -1 || HorizontalRuleProvider.Companion.isHorizontalRule(position.getCurrentLine(), position.getOffsetInCurrentLine())) {
            return null;
        }
        CommonMarkdownConstraints tryAddListItem = tryAddListItem(position);
        return tryAddListItem == null ? tryAddBlockQuote(position) : tryAddListItem;
    }

    @Override // org.intellij.markdown.parser.constraints.MarkdownConstraints
    public CommonMarkdownConstraints applyToNextLine(LookaheadText.Position position) {
        if (position == null) {
            return getBase();
        }
        Compat compat = Compat.INSTANCE;
        if (position.getOffsetInCurrentLine() != -1) {
            throw new MarkdownParsingException(C8632dsu.d("given ", position));
        }
        final String currentLine = position.getCurrentLine();
        final int length = this.indents.length;
        final Ref.IntRef intRef = new Ref.IntRef();
        final drM<Integer, Integer> drm = new drM<Integer, Integer>() { // from class: org.intellij.markdown.parser.constraints.CommonMarkdownConstraints$applyToNextLine$getBlockQuoteIndent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i) {
                int i2 = 0;
                while (i2 < 3 && i < currentLine.length() && currentLine.charAt(i) == ' ') {
                    i2++;
                    i++;
                }
                if (i >= currentLine.length() || currentLine.charAt(i) != '>') {
                    return null;
                }
                return Integer.valueOf(i2 + 1);
            }
        };
        drM<CommonMarkdownConstraints, CommonMarkdownConstraints> drm2 = new drM<CommonMarkdownConstraints, CommonMarkdownConstraints>() { // from class: org.intellij.markdown.parser.constraints.CommonMarkdownConstraints$applyToNextLine$fillMaybeBlockquoteAndListIndents$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public final CommonMarkdownConstraints invoke(CommonMarkdownConstraints commonMarkdownConstraints) {
                Integer num;
                CommonMarkdownConstraints commonMarkdownConstraints2;
                C8632dsu.c((Object) commonMarkdownConstraints, "");
                if (Ref.IntRef.this.b >= length) {
                    return commonMarkdownConstraints;
                }
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.b = MarkdownConstraintsKt.getCharsEaten(commonMarkdownConstraints, currentLine);
                final Ref.IntRef intRef3 = new Ref.IntRef();
                final Ref.IntRef intRef4 = new Ref.IntRef();
                final String str = currentLine;
                drM<Integer, Boolean> drm3 = new drM<Integer, Boolean>() { // from class: org.intellij.markdown.parser.constraints.CommonMarkdownConstraints$applyToNextLine$fillMaybeBlockquoteAndListIndents$1$hasKMoreSpaces$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ Boolean invoke(Integer num2) {
                        return invoke(num2.intValue());
                    }

                    public final Boolean invoke(int i) {
                        boolean z;
                        int i2;
                        int i3 = Ref.IntRef.this.b;
                        int i4 = intRef2.b;
                        while (true) {
                            z = true;
                            if (Ref.IntRef.this.b >= i || intRef2.b >= str.length()) {
                                break;
                            }
                            char charAt = str.charAt(intRef2.b);
                            if (charAt != ' ') {
                                if (charAt != '\t') {
                                    break;
                                }
                                i2 = 4 - (intRef3.b % 4);
                            } else {
                                i2 = 1;
                            }
                            Ref.IntRef.this.b += i2;
                            intRef3.b += i2;
                            intRef2.b++;
                        }
                        if (intRef2.b == str.length()) {
                            Ref.IntRef.this.b = Integer.MAX_VALUE;
                        }
                        Ref.IntRef intRef5 = Ref.IntRef.this;
                        int i5 = intRef5.b;
                        if (i <= i5) {
                            intRef5.b = i5 - i;
                        } else {
                            intRef2.b = i4;
                            intRef5.b = i3;
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                };
                if (this.getTypes()[Ref.IntRef.this.b] == '>') {
                    num = drm.invoke(Integer.valueOf(intRef2.b));
                    if (num == null) {
                        return commonMarkdownConstraints;
                    }
                    intRef2.b += num.intValue();
                    Ref.IntRef.this.b++;
                } else {
                    num = null;
                }
                int i = Ref.IntRef.this.b;
                while (Ref.IntRef.this.b < length && this.getTypes()[Ref.IntRef.this.b] != '>') {
                    int[] iArr = this.indents;
                    int i2 = Ref.IntRef.this.b;
                    if (!drm3.invoke(Integer.valueOf(iArr[i2] - (i2 == 0 ? 0 : this.indents[Ref.IntRef.this.b - 1]))).booleanValue()) {
                        break;
                    }
                    Ref.IntRef.this.b++;
                }
                if (num != null) {
                    commonMarkdownConstraints2 = CommonMarkdownConstraints.Companion.create(commonMarkdownConstraints, (drm3.invoke(1).booleanValue() ? 1 : 0) + num.intValue(), '>', true, intRef2.b);
                } else {
                    commonMarkdownConstraints2 = commonMarkdownConstraints;
                }
                if (i >= Ref.IntRef.this.b) {
                    return commonMarkdownConstraints2;
                }
                CommonMarkdownConstraints commonMarkdownConstraints3 = commonMarkdownConstraints2;
                while (true) {
                    int i3 = i + 1;
                    commonMarkdownConstraints3 = CommonMarkdownConstraints.Companion.create(commonMarkdownConstraints3, this.indents[i] - (i == 0 ? 0 : this.indents[i - 1]), this.getTypes()[i], false, intRef2.b);
                    if (i3 >= Ref.IntRef.this.b) {
                        return commonMarkdownConstraints3;
                    }
                    i = i3;
                }
            }
        };
        CommonMarkdownConstraints base = getBase();
        while (true) {
            CommonMarkdownConstraints invoke = drm2.invoke(base);
            if (C8632dsu.c(invoke, base)) {
                return base;
            }
            base = invoke;
        }
    }

    protected ListMarkerInfo fetchListMarker(LookaheadText.Position position) {
        char charAt;
        C8632dsu.c((Object) position, "");
        char c = position.getChar();
        if (c == '*' || c == '-' || c == '+') {
            return new ListMarkerInfo(1, c, 1);
        }
        String currentLine = position.getCurrentLine();
        int offsetInCurrentLine = position.getOffsetInCurrentLine();
        while (offsetInCurrentLine < currentLine.length() && '0' <= (charAt = currentLine.charAt(offsetInCurrentLine)) && charAt <= '9') {
            offsetInCurrentLine++;
        }
        if (offsetInCurrentLine <= position.getOffsetInCurrentLine() || offsetInCurrentLine - position.getOffsetInCurrentLine() > 9 || offsetInCurrentLine >= currentLine.length() || !(currentLine.charAt(offsetInCurrentLine) == '.' || currentLine.charAt(offsetInCurrentLine) == ')')) {
            return null;
        }
        int i = offsetInCurrentLine + 1;
        return new ListMarkerInfo(i - position.getOffsetInCurrentLine(), currentLine.charAt(offsetInCurrentLine), i - position.getOffsetInCurrentLine());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class ListMarkerInfo {
        private final int markerIndent;
        private final int markerLength;
        private final char markerType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ListMarkerInfo) {
                ListMarkerInfo listMarkerInfo = (ListMarkerInfo) obj;
                return this.markerLength == listMarkerInfo.markerLength && this.markerType == listMarkerInfo.markerType && this.markerIndent == listMarkerInfo.markerIndent;
            }
            return false;
        }

        public final int getMarkerIndent() {
            return this.markerIndent;
        }

        public final int getMarkerLength() {
            return this.markerLength;
        }

        public final char getMarkerType() {
            return this.markerType;
        }

        public int hashCode() {
            return (((this.markerLength * 31) + this.markerType) * 31) + this.markerIndent;
        }

        public String toString() {
            return "ListMarkerInfo(markerLength=" + this.markerLength + ", markerType=" + this.markerType + ", markerIndent=" + this.markerIndent + ')';
        }

        public ListMarkerInfo(int i, char c, int i2) {
            this.markerLength = i;
            this.markerType = c;
            this.markerIndent = i2;
        }
    }

    private final CommonMarkdownConstraints tryAddListItem(LookaheadText.Position position) {
        String currentLine = position.getCurrentLine();
        int offsetInCurrentLine = position.getOffsetInCurrentLine();
        int i = 0;
        int indent = (offsetInCurrentLine <= 0 || currentLine.charAt(offsetInCurrentLine + (-1)) != '\t') ? 0 : (4 - (getIndent() % 4)) % 4;
        while (offsetInCurrentLine < currentLine.length() && currentLine.charAt(offsetInCurrentLine) == ' ' && indent < 3) {
            indent++;
            offsetInCurrentLine++;
        }
        if (offsetInCurrentLine == currentLine.length()) {
            return null;
        }
        LookaheadText.Position nextPosition = position.nextPosition(offsetInCurrentLine - position.getOffsetInCurrentLine());
        C8632dsu.d(nextPosition);
        ListMarkerInfo fetchListMarker = fetchListMarker(nextPosition);
        if (fetchListMarker == null) {
            return null;
        }
        int markerLength = offsetInCurrentLine + fetchListMarker.getMarkerLength();
        int i2 = markerLength;
        while (i2 < currentLine.length()) {
            char charAt = currentLine.charAt(i2);
            if (charAt != ' ') {
                if (charAt != '\t') {
                    break;
                }
                i += 4 - (i % 4);
            } else {
                i++;
            }
            i2++;
        }
        if (1 > i || i > 4 || i2 >= currentLine.length()) {
            if ((i < 5 || i2 >= currentLine.length()) && i2 != currentLine.length()) {
                return null;
            }
            return Companion.create(this, indent + fetchListMarker.getMarkerIndent() + 1, fetchListMarker.getMarkerType(), true, Math.min(i2, markerLength + 1));
        }
        return Companion.create(this, indent + fetchListMarker.getMarkerIndent() + i, fetchListMarker.getMarkerType(), true, i2);
    }

    private final CommonMarkdownConstraints tryAddBlockQuote(LookaheadText.Position position) {
        int i;
        String currentLine = position.getCurrentLine();
        int offsetInCurrentLine = position.getOffsetInCurrentLine();
        int i2 = 0;
        int i3 = 0;
        while (offsetInCurrentLine < currentLine.length() && currentLine.charAt(offsetInCurrentLine) == ' ' && i3 < 3) {
            i3++;
            offsetInCurrentLine++;
        }
        if (offsetInCurrentLine == currentLine.length() || currentLine.charAt(offsetInCurrentLine) != '>') {
            return null;
        }
        int i4 = offsetInCurrentLine + 1;
        if (i4 >= currentLine.length() || currentLine.charAt(i4) == ' ' || currentLine.charAt(i4) == '\t') {
            if (i4 < currentLine.length()) {
                i4 = offsetInCurrentLine + 2;
            }
            i = i4;
            i2 = 1;
        } else {
            i = i4;
        }
        return Companion.create(this, i3 + 1 + i2, '>', true, i);
    }

    public String toString() {
        String b;
        StringBuilder sb = new StringBuilder();
        sb.append("MdConstraints: ");
        b = C8691duz.b(getTypes());
        sb.append(b);
        sb.append('(');
        sb.append(getIndent());
        sb.append(')');
        return sb.toString();
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final CommonMarkdownConstraints getBASE() {
            return CommonMarkdownConstraints.BASE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CommonMarkdownConstraints create(CommonMarkdownConstraints commonMarkdownConstraints, int i, char c, boolean z, int i2) {
            int length = commonMarkdownConstraints.indents.length;
            int i3 = length + 1;
            int[] copyOf = Arrays.copyOf(commonMarkdownConstraints.indents, i3);
            C8632dsu.a(copyOf, "");
            char[] copyOf2 = Arrays.copyOf(commonMarkdownConstraints.getTypes(), i3);
            C8632dsu.a(copyOf2, "");
            boolean[] copyOf3 = Arrays.copyOf(commonMarkdownConstraints.isExplicit(), i3);
            C8632dsu.a(copyOf3, "");
            copyOf[length] = commonMarkdownConstraints.getIndent() + i;
            copyOf2[length] = c;
            copyOf3[length] = z;
            return commonMarkdownConstraints.createNewConstraints(copyOf, copyOf2, copyOf3, i2);
        }
    }
}
