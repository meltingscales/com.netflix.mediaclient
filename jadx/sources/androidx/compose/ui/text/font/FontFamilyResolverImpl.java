package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import o.C8627dsp;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    private final drM<TypefaceRequest, Object> createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new drM<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public final Object invoke(TypefaceRequest typefaceRequest) {
                State resolve;
                resolve = FontFamilyResolverImpl.this.resolve(TypefaceRequest.m2244copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null));
                return resolve.getValue();
            }
        };
    }

    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, C8627dsp c8627dsp) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo2201resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m2237interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.m2238interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new drM<drM<? super TypefaceResult, ? extends dpR>, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ TypefaceResult invoke(drM<? super TypefaceResult, ? extends dpR> drm) {
                return invoke2((drM<? super TypefaceResult, dpR>) drm);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final TypefaceResult invoke2(drM<? super TypefaceResult, dpR> drm) {
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
                drM<? super TypefaceRequest, ? extends Object> drm2;
                PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                drM<? super TypefaceRequest, ? extends Object> drm3;
                fontListFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                TypefaceRequest typefaceRequest2 = typefaceRequest;
                PlatformFontLoader platformFontLoader$ui_text_release = FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text_release();
                drm2 = FontFamilyResolverImpl.this.createDefaultTypeface;
                TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader$ui_text_release, drm, drm2);
                if (resolve == null) {
                    platformFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                    TypefaceRequest typefaceRequest3 = typefaceRequest;
                    PlatformFontLoader platformFontLoader$ui_text_release2 = FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text_release();
                    drm3 = FontFamilyResolverImpl.this.createDefaultTypeface;
                    resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest3, platformFontLoader$ui_text_release2, drm, drm3);
                    if (resolve == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return resolve;
            }
        });
    }
}
