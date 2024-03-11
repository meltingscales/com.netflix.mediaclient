package o;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.dov  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8525dov {
    public static /* synthetic */ Map.Entry d(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
