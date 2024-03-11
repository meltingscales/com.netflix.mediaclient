package o;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class dqP {
    public static <T> Set<T> a(T t) {
        Set<T> singleton = Collections.singleton(t);
        C8632dsu.a(singleton, "");
        return singleton;
    }

    public static <E> Set<E> c() {
        return new SetBuilder();
    }

    public static <E> Set<E> b(int i) {
        return new SetBuilder(i);
    }

    public static <E> Set<E> c(Set<E> set) {
        C8632dsu.c((Object) set, "");
        return ((SetBuilder) set).e();
    }
}
