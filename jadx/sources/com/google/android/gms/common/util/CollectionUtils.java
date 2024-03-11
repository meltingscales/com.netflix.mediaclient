package com.google.android.gms.common.util;

import com.google.errorprone.annotations.InlineMe;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class CollectionUtils {
    @InlineMe(imports = {"java.util.Collections"}, replacement = "Collections.singletonList(item)")
    @Deprecated
    public static <T> List<T> listOf(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return Collections.singletonList(tArr[0]);
            }
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return Collections.emptyList();
    }
}
