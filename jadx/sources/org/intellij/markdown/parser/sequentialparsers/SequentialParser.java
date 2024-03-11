package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.IElementType;

/* loaded from: classes5.dex */
public interface SequentialParser {

    /* loaded from: classes5.dex */
    public interface ParsingResult {
        Collection<Node> getParsedNodes();

        Collection<List<C8654dtp>> getRangesToProcessFurther();
    }

    ParsingResult parse(TokensCache tokensCache, List<C8654dtp> list);

    /* loaded from: classes5.dex */
    public static final class Node {
        private final C8654dtp range;
        private final IElementType type;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Node) {
                Node node = (Node) obj;
                return C8632dsu.c(this.range, node.range) && C8632dsu.c(this.type, node.type);
            }
            return false;
        }

        public final C8654dtp getRange() {
            return this.range;
        }

        public final IElementType getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.range.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Node(range=" + this.range + ", type=" + this.type + ')';
        }

        public Node(C8654dtp c8654dtp, IElementType iElementType) {
            C8632dsu.c((Object) c8654dtp, "");
            C8632dsu.c((Object) iElementType, "");
            this.range = c8654dtp;
            this.type = iElementType;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ParsingResultBuilder implements ParsingResult {
        private final Collection<Node> _parsedNodes = new ArrayList();
        private final Collection<List<C8654dtp>> _rangesToProcessFurther = new ArrayList();

        @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser.ParsingResult
        public Collection<Node> getParsedNodes() {
            return this._parsedNodes;
        }

        @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser.ParsingResult
        public Collection<List<C8654dtp>> getRangesToProcessFurther() {
            return this._rangesToProcessFurther;
        }

        public final ParsingResultBuilder withNode(Node node) {
            C8632dsu.c((Object) node, "");
            this._parsedNodes.add(node);
            return this;
        }

        public final ParsingResultBuilder withFurtherProcessing(List<C8654dtp> list) {
            C8632dsu.c((Object) list, "");
            this._rangesToProcessFurther.add(list);
            return this;
        }

        public final ParsingResultBuilder withOtherParsingResult(ParsingResult parsingResult) {
            C8632dsu.c((Object) parsingResult, "");
            this._parsedNodes.addAll(parsingResult.getParsedNodes());
            this._rangesToProcessFurther.addAll(parsingResult.getRangesToProcessFurther());
            return this;
        }
    }
}
