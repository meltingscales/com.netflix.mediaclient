package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

/* loaded from: classes5.dex */
public class BasicMDCAdapter implements MDCAdapter {
    private final ThreadLocalMapOfStacks threadLocalMapOfDeques = new ThreadLocalMapOfStacks();
    private final InheritableThreadLocal<Map<String, String>> inheritableThreadLocalMap = new InheritableThreadLocal<Map<String, String>>() { // from class: org.slf4j.helpers.BasicMDCAdapter.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    };
}
