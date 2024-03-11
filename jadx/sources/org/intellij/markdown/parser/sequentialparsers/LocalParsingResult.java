package org.intellij.markdown.parser.sequentialparsers;

import java.util.Collection;
import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;
import org.intellij.markdown.parser.sequentialparsers.TokensCache;

/* loaded from: classes5.dex */
public final class LocalParsingResult implements SequentialParser.ParsingResult {
    private final TokensCache.Iterator iteratorPosition;
    private final Collection<SequentialParser.Node> parsedNodes;
    private final Collection<List<C8654dtp>> rangesToProcessFurther;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalParsingResult) {
            LocalParsingResult localParsingResult = (LocalParsingResult) obj;
            return C8632dsu.c(this.iteratorPosition, localParsingResult.iteratorPosition) && C8632dsu.c(getParsedNodes(), localParsingResult.getParsedNodes()) && C8632dsu.c(getRangesToProcessFurther(), localParsingResult.getRangesToProcessFurther());
        }
        return false;
    }

    public final TokensCache.Iterator getIteratorPosition() {
        return this.iteratorPosition;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser.ParsingResult
    public Collection<SequentialParser.Node> getParsedNodes() {
        return this.parsedNodes;
    }

    @Override // org.intellij.markdown.parser.sequentialparsers.SequentialParser.ParsingResult
    public Collection<List<C8654dtp>> getRangesToProcessFurther() {
        return this.rangesToProcessFurther;
    }

    public int hashCode() {
        return (((this.iteratorPosition.hashCode() * 31) + getParsedNodes().hashCode()) * 31) + getRangesToProcessFurther().hashCode();
    }

    public String toString() {
        return "LocalParsingResult(iteratorPosition=" + this.iteratorPosition + ", parsedNodes=" + getParsedNodes() + ", rangesToProcessFurther=" + getRangesToProcessFurther() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalParsingResult(TokensCache.Iterator iterator, Collection<SequentialParser.Node> collection, Collection<? extends List<C8654dtp>> collection2) {
        C8632dsu.c((Object) iterator, "");
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) collection2, "");
        this.iteratorPosition = iterator;
        this.parsedNodes = collection;
        this.rangesToProcessFurther = collection2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LocalParsingResult(org.intellij.markdown.parser.sequentialparsers.TokensCache.Iterator r2, java.util.Collection<org.intellij.markdown.parser.sequentialparsers.SequentialParser.Node> r3, java.util.List<o.C8654dtp> r4) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            o.C8632dsu.c(r4, r0)
            java.util.List r4 = o.C8570dqm.c(r4)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.sequentialparsers.LocalParsingResult.<init>(org.intellij.markdown.parser.sequentialparsers.TokensCache$Iterator, java.util.Collection, java.util.List):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LocalParsingResult(org.intellij.markdown.parser.sequentialparsers.TokensCache.Iterator r2, java.util.Collection<org.intellij.markdown.parser.sequentialparsers.SequentialParser.Node> r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r2, r0)
            o.C8632dsu.c(r3, r0)
            java.util.List r0 = o.C8570dqm.c()
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.intellij.markdown.parser.sequentialparsers.LocalParsingResult.<init>(org.intellij.markdown.parser.sequentialparsers.TokensCache$Iterator, java.util.Collection):void");
    }
}
