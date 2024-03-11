package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import o.C8632dsu;
import o.drN;

/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    private final Object PermanentFailure = AsyncTypefaceResult.m2193constructorimpl(null);
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);
    private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, null);
    private final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();

    @drN
    /* loaded from: classes.dex */
    public static final class AsyncTypefaceResult {
        private final Object result;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m2192boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static Object m2193constructorimpl(Object obj) {
            return obj;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m2194equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && C8632dsu.c(obj, ((AsyncTypefaceResult) obj2).m2198unboximpl());
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m2195hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl  reason: not valid java name */
        public static final boolean m2196isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m2197toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m2194equalsimpl(this.result, obj);
        }

        public int hashCode() {
            return m2195hashCodeimpl(this.result);
        }

        public String toString() {
            return m2197toStringimpl(this.result);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ Object m2198unboximpl() {
            return this.result;
        }

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class Key {
        private final Font font;
        private final Object loaderKey;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return C8632dsu.c(this.font, key.font) && C8632dsu.c(this.loaderKey, key.loaderKey);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode();
            Object obj = this.loaderKey;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m2192boximpl(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m2192boximpl(AsyncTypefaceResult.m2193constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m2192boximpl(AsyncTypefaceResult.m2193constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: get-1ASDuI8  reason: not valid java name */
    public final AsyncTypefaceResult m2191get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runCached(androidx.compose.ui.text.font.Font r6, androidx.compose.ui.text.font.PlatformFontLoader r7, boolean r8, o.drM<? super o.InterfaceC8585dra<java.lang.Object>, ? extends java.lang.Object> r9, o.InterfaceC8585dra<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r7
            o.C8556dpz.d(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            o.C8556dpz.d(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.resultCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.m2198unboximpl()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            o.dpR r7 = o.dpR.c     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m2192boximpl(r7)     // Catch: java.lang.Throwable -> L8b
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m2193constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m2192boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m2193constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m2192boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            o.dpR r6 = o.dpR.c     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, o.drM, o.dra):java.lang.Object");
    }
}
