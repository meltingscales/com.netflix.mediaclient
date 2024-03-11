package org.intellij.markdown.parser;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.C8575dqr;
import o.C8576dqs;
import o.C8632dsu;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.ast.ASTNode;
import org.intellij.markdown.ast.ASTNodeBuilder;
import org.intellij.markdown.lexer.Compat;
import org.intellij.markdown.lexer.Stack;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public abstract class TreeBuilder {
    private final ASTNodeBuilder nodeBuilder;

    protected abstract MyASTNodeWrapper createASTNodeOnClosingEvent(MyEvent myEvent, List<MyASTNodeWrapper> list, boolean z);

    protected abstract void flushEverythingBeforeEvent(MyEvent myEvent, List<MyASTNodeWrapper> list);

    /* JADX INFO: Access modifiers changed from: protected */
    public final ASTNodeBuilder getNodeBuilder() {
        return this.nodeBuilder;
    }

    public TreeBuilder(ASTNodeBuilder aSTNodeBuilder) {
        C8632dsu.c((Object) aSTNodeBuilder, "");
        this.nodeBuilder = aSTNodeBuilder;
    }

    public final ASTNode buildTree(List<SequentialParser.Node> list) {
        Object y;
        Object B;
        Object y2;
        Object B2;
        List<MyASTNodeWrapper> list2;
        C8632dsu.c((Object) list, "");
        List<MyEvent> constructEvents = constructEvents(list);
        Stack stack = new Stack();
        Compat compat = Compat.INSTANCE;
        if (!(!constructEvents.isEmpty())) {
            throw new MarkdownParsingException("nonsense");
        }
        y = C8576dqs.y(constructEvents);
        SequentialParser.Node info = ((MyEvent) y).getInfo();
        B = C8576dqs.B((List<? extends Object>) constructEvents);
        if (!C8632dsu.c(info, ((MyEvent) B).getInfo())) {
            StringBuilder sb = new StringBuilder();
            sb.append("more than one root?\nfirst: ");
            y2 = C8576dqs.y(constructEvents);
            sb.append(((MyEvent) y2).getInfo());
            sb.append("\nlast: ");
            B2 = C8576dqs.B((List<? extends Object>) constructEvents);
            sb.append(((MyEvent) B2).getInfo());
            throw new MarkdownParsingException(sb.toString());
        }
        int size = constructEvents.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                MyEvent myEvent = constructEvents.get(i);
                flushEverythingBeforeEvent(myEvent, stack.isEmpty() ? null : (List) ((Pair) stack.peek()).a());
                if (myEvent.isStart()) {
                    stack.push(new Pair(myEvent, new ArrayList()));
                } else {
                    if (myEvent.isEmpty()) {
                        list2 = new ArrayList<>();
                    } else {
                        Pair pair = (Pair) stack.pop();
                        Compat compat2 = Compat.INSTANCE;
                        if (!C8632dsu.c(((MyEvent) pair.d()).getInfo(), myEvent.getInfo())) {
                            throw new MarkdownParsingException("Intersecting parsed nodes detected: " + ((MyEvent) pair.d()).getInfo() + " vs " + myEvent.getInfo());
                        }
                        list2 = (List) pair.a();
                    }
                    boolean isEmpty = stack.isEmpty();
                    MyASTNodeWrapper createASTNodeOnClosingEvent = createASTNodeOnClosingEvent(myEvent, list2, isEmpty);
                    if (isEmpty) {
                        Compat compat3 = Compat.INSTANCE;
                        if (i2 == constructEvents.size()) {
                            return createASTNodeOnClosingEvent.getAstNode();
                        }
                        throw new MarkdownParsingException("");
                    }
                    ((List) ((Pair) stack.peek()).a()).add(createASTNodeOnClosingEvent);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        throw new AssertionError("markers stack should close some time thus would not be here!");
    }

    private final List<MyEvent> constructEvents(List<SequentialParser.Node> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                SequentialParser.Node node = list.get(i);
                int d = node.getRange().d();
                int e = node.getRange().e();
                arrayList.add(new MyEvent(d, i, node));
                if (e != d) {
                    arrayList.add(new MyEvent(e, i, node));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        C8575dqr.s(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class MyEvent implements Comparable<MyEvent> {
        private final SequentialParser.Node info;
        private final int position;
        private final int timeClosed;

        public final SequentialParser.Node getInfo() {
            return this.info;
        }

        public final int getPosition() {
            return this.position;
        }

        public MyEvent(int i, int i2, SequentialParser.Node node) {
            C8632dsu.c((Object) node, "");
            this.position = i;
            this.timeClosed = i2;
            this.info = node;
        }

        public final boolean isStart() {
            return this.info.getRange().e() != this.position;
        }

        public final boolean isEmpty() {
            return this.info.getRange().d() == this.info.getRange().e();
        }

        @Override // java.lang.Comparable
        public int compareTo(MyEvent myEvent) {
            C8632dsu.c((Object) myEvent, "");
            int i = this.position;
            int i2 = myEvent.position;
            if (i != i2) {
                return i - i2;
            }
            if (isStart() != myEvent.isStart()) {
                return isStart() ? 1 : -1;
            }
            int d = (this.info.getRange().d() + this.info.getRange().e()) - (myEvent.info.getRange().d() + myEvent.info.getRange().e());
            if (d != 0) {
                return -d;
            }
            int i3 = this.timeClosed - myEvent.timeClosed;
            return isStart() ? -i3 : i3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(isStart() ? "Open" : "Close");
            sb.append(": ");
            sb.append(this.position);
            sb.append(" (");
            sb.append(this.info);
            sb.append(')');
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    protected static final class MyASTNodeWrapper {
        private final ASTNode astNode;
        private final int endTokenIndex;
        private final int startTokenIndex;

        public final ASTNode getAstNode() {
            return this.astNode;
        }

        public final int getEndTokenIndex() {
            return this.endTokenIndex;
        }

        public final int getStartTokenIndex() {
            return this.startTokenIndex;
        }

        public MyASTNodeWrapper(ASTNode aSTNode, int i, int i2) {
            C8632dsu.c((Object) aSTNode, "");
            this.astNode = aSTNode;
            this.startTokenIndex = i;
            this.endTokenIndex = i2;
        }
    }
}
