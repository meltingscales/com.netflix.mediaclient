package org.chromium.base;

import dalvik.system.BaseDexClassLoader;

/* loaded from: classes6.dex */
public class WrappedClassLoader extends ClassLoader {
    private ClassLoader mPrimaryClassLoader;
    private ClassLoader mSecondaryClassLoader;

    @Override // java.lang.ClassLoader
    protected Class<?> findClass(String str) {
        try {
            return this.mPrimaryClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return this.mSecondaryClassLoader.loadClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String str) {
        String str2;
        ClassLoader classLoader = this.mPrimaryClassLoader;
        if (classLoader instanceof BaseDexClassLoader) {
            str2 = ((BaseDexClassLoader) classLoader).findLibrary(str);
            if (str2 != null) {
                return str2;
            }
        } else {
            str2 = null;
        }
        ClassLoader classLoader2 = this.mSecondaryClassLoader;
        return classLoader2 instanceof BaseDexClassLoader ? ((BaseDexClassLoader) classLoader2).findLibrary(str) : str2;
    }
}
