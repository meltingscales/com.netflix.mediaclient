package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher a = new ViewMatcher();
    private static final long serialVersionUID = 1;

    public boolean d(Class<?> cls) {
        return false;
    }

    public static ViewMatcher a(Class<?>[] clsArr) {
        int length;
        if (clsArr != null && (length = clsArr.length) != 0) {
            if (length == 1) {
                return new Single(clsArr[0]);
            }
            return new Multi(clsArr);
        }
        return a;
    }

    /* loaded from: classes5.dex */
    static final class Single extends ViewMatcher {
        private static final long serialVersionUID = 1;
        private final Class<?> e;

        public Single(Class<?> cls) {
            this.e = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean d(Class<?> cls) {
            Class<?> cls2 = this.e;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    /* loaded from: classes5.dex */
    static final class Multi extends ViewMatcher implements Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?>[] b;

        public Multi(Class<?>[] clsArr) {
            this.b = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean d(Class<?> cls) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls2 = this.b[i];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
