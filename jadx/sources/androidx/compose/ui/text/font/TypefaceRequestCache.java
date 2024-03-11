package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class TypefaceRequestCache {
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final State<Object> runCached(final TypefaceRequest typefaceRequest, drM<? super drM<? super TypefaceResult, dpR>, ? extends TypefaceResult> drm) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.resultCache.remove(typefaceRequest);
            }
            try {
                TypefaceResult invoke = drm.invoke(new drM<TypefaceResult, dpR>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* bridge */ /* synthetic */ dpR invoke(TypefaceResult typefaceResult2) {
                        invoke2(typefaceResult2);
                        return dpR.c;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(TypefaceResult typefaceResult2) {
                        LruCache lruCache;
                        LruCache lruCache2;
                        SynchronizedObject lock$ui_text_release = TypefaceRequestCache.this.getLock$ui_text_release();
                        TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock$ui_text_release) {
                            if (typefaceResult2.getCacheable()) {
                                lruCache2 = typefaceRequestCache.resultCache;
                                lruCache2.put(typefaceRequest2, typefaceResult2);
                            } else {
                                lruCache = typefaceRequestCache.resultCache;
                                lruCache.remove(typefaceRequest2);
                            }
                            dpR dpr = dpR.c;
                        }
                    }
                });
                synchronized (this.lock) {
                    if (this.resultCache.get(typefaceRequest) == null && invoke.getCacheable()) {
                        this.resultCache.put(typefaceRequest, invoke);
                    }
                    dpR dpr = dpR.c;
                }
                return invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
