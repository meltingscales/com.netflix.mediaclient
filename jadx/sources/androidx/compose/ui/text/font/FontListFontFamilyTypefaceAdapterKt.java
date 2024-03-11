package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import o.C8556dpz;
import o.C8569dql;
import o.dpD;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, drM<? super TypefaceRequest, ? extends Object> drm) {
        SynchronizedObject synchronizedObject;
        LruCache lruCache;
        Object loadBlocking;
        SimpleArrayMap simpleArrayMap;
        SynchronizedObject synchronizedObject2;
        LruCache lruCache2;
        Object e;
        SimpleArrayMap simpleArrayMap2;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            Font font = list.get(i);
            int mo2189getLoadingStrategyPKNRLFQ = font.mo2189getLoadingStrategyPKNRLFQ();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
            if (!FontLoadingStrategy.m2206equalsimpl0(mo2189getLoadingStrategyPKNRLFQ, companion.m2211getBlockingPKNRLFQ())) {
                if (!FontLoadingStrategy.m2206equalsimpl0(mo2189getLoadingStrategyPKNRLFQ, companion.m2212getOptionalLocalPKNRLFQ())) {
                    if (!FontLoadingStrategy.m2206equalsimpl0(mo2189getLoadingStrategyPKNRLFQ, companion.m2210getAsyncPKNRLFQ())) {
                        throw new IllegalStateException("Unknown font type " + font);
                    }
                    AsyncTypefaceCache.AsyncTypefaceResult m2191get1ASDuI8 = asyncTypefaceCache.m2191get1ASDuI8(font, platformFontLoader);
                    if (m2191get1ASDuI8 == null) {
                        if (list2 == null) {
                            list2 = C8569dql.f(font);
                        } else {
                            list2.add(font);
                        }
                    } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m2196isPermanentFailureimpl(m2191get1ASDuI8.m2198unboximpl()) && m2191get1ASDuI8.m2198unboximpl() != null) {
                        return dpD.a(list2, FontSynthesis_androidKt.m2236synthesizeTypefaceFxwP2eA(typefaceRequest.m2247getFontSynthesisGVVA2EU(), m2191get1ASDuI8.m2198unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA()));
                    }
                } else {
                    synchronizedObject2 = asyncTypefaceCache.cacheLock;
                    synchronized (synchronizedObject2) {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                        lruCache2 = asyncTypefaceCache.resultCache;
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) lruCache2.get(key);
                        if (asyncTypefaceResult == null) {
                            simpleArrayMap2 = asyncTypefaceCache.permanentCache;
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) simpleArrayMap2.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            e = asyncTypefaceResult.m2198unboximpl();
                        } else {
                            dpR dpr = dpR.c;
                            try {
                                Result.c cVar = Result.e;
                                e = Result.e(platformFontLoader.loadBlocking(font));
                            } catch (Throwable th) {
                                Result.c cVar2 = Result.e;
                                e = Result.e(C8556dpz.a(th));
                            }
                            if (Result.a(e)) {
                                e = null;
                            }
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, e, false, 8, null);
                        }
                    }
                    if (e != null) {
                        return dpD.a(list2, FontSynthesis_androidKt.m2236synthesizeTypefaceFxwP2eA(typefaceRequest.m2247getFontSynthesisGVVA2EU(), e, font, typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA()));
                    }
                }
            } else {
                synchronizedObject = asyncTypefaceCache.cacheLock;
                synchronized (synchronizedObject) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    lruCache = asyncTypefaceCache.resultCache;
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) lruCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        simpleArrayMap = asyncTypefaceCache.permanentCache;
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) simpleArrayMap.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        loadBlocking = asyncTypefaceResult2.m2198unboximpl();
                    } else {
                        dpR dpr2 = dpR.c;
                        try {
                            loadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, loadBlocking, false, 8, null);
                        } catch (Exception e2) {
                            throw new IllegalStateException("Unable to load font " + font, e2);
                        }
                    }
                }
                if (loadBlocking == null) {
                    throw new IllegalStateException("Unable to load font " + font);
                }
                return dpD.a(list2, FontSynthesis_androidKt.m2236synthesizeTypefaceFxwP2eA(typefaceRequest.m2247getFontSynthesisGVVA2EU(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA()));
            }
        }
        return dpD.a(list2, drm.invoke(typefaceRequest));
    }
}
