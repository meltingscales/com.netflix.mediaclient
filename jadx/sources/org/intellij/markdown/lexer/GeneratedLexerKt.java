package org.intellij.markdown.lexer;

import java.util.ArrayList;
import o.C8571dqn;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class GeneratedLexerKt {
    public static final <E> void push(ArrayList<E> arrayList, E e) {
        C8632dsu.c((Object) arrayList, "");
        arrayList.add(e);
    }

    public static final <E> E pop(ArrayList<E> arrayList) {
        Object v;
        C8632dsu.c((Object) arrayList, "");
        v = C8571dqn.v(arrayList);
        return (E) v;
    }
}
