package org.intellij.markdown.parser.sequentialparsers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.C8632dsu;
import o.C8654dtp;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes5.dex */
public abstract class SequentialParserManager {
    public abstract List<SequentialParser> getParserSequence();

    public final Collection<SequentialParser.Node> runParsingSequence(TokensCache tokensCache, List<C8654dtp> list) {
        C8632dsu.c((Object) tokensCache, "");
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(list);
        for (SequentialParser sequentialParser : getParserSequence()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                List<C8654dtp> list2 = (List) it.next();
                C8632dsu.a(list2, "");
                SequentialParser.ParsingResult parse = sequentialParser.parse(tokensCache, list2);
                arrayList.addAll(parse.getParsedNodes());
                arrayList3.addAll(parse.getRangesToProcessFurther());
            }
            arrayList2 = arrayList3;
        }
        return arrayList;
    }
}
