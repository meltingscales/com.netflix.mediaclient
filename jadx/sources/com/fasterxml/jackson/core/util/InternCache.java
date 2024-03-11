package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache e = new InternCache();
    private static final long serialVersionUID = 1;
    private final Object c;

    private InternCache() {
        super(180, 0.8f, 4);
        this.c = new Object();
    }

    public String b(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.c) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
