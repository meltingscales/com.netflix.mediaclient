package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import o.C8627dsp;
import o.C8737dwr;
import o.dpR;
import o.dqZ;
import o.drM;
import o.dwU;
import o.dwY;
import o.dxD;
import o.dxZ;

/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter {
    private dwU asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final CoroutineExceptionHandler DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);

    public FontListFontFamilyTypefaceAdapter() {
        this(null, null, 3, null);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, dqZ dqz) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = dwY.c(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(dqz).plus(dxZ.d((dxD) dqz.get(dxD.b))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, dqZ dqz, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.e : dqz);
    }

    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, drM<? super TypefaceResult.Immutable, dpR> drm, drM<? super TypefaceRequest, ? extends Object> drm2) {
        Pair firstImmediatelyAvailable;
        if (typefaceRequest.getFontFamily() instanceof FontListFontFamily) {
            firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m2213matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m2246getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, drm2);
            List list = (List) firstImmediatelyAvailable.b();
            Object c = firstImmediatelyAvailable.c();
            if (list == null) {
                return new TypefaceResult.Immutable(c, false, 2, null);
            }
            AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, c, typefaceRequest, this.asyncTypefaceCache, drm, platformFontLoader);
            C8737dwr.c(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
            return new TypefaceResult.Async(asyncFontListLoader);
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }
}
