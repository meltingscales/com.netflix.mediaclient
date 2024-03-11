package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import o.dpR;
import o.drM;

/* loaded from: classes.dex */
public final class AsyncFontListLoader implements State<Object> {
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    private final List<Font> fontList;
    private final drM<TypefaceResult.Immutable, dpR> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, drM<? super TypefaceResult.Immutable, dpR> drm, PlatformFontLoader platformFontLoader) {
        MutableState mutableStateOf$default;
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = drm;
        this.platformFontLoader = platformFontLoader;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.cacheable = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: all -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0109, blocks: (B:36:0x00bd, B:39:0x00f1, B:20:0x005a), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[Catch: all -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0109, blocks: (B:36:0x00bd, B:39:0x00f1, B:20:0x005a), top: B:63:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0104 -> B:43:0x0105). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010e -> B:49:0x0110). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object load(o.InterfaceC8585dra<? super o.dpR> r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(o.dra):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font r6, o.InterfaceC8585dra<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = o.C8588drd.c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            o.C8556dpz.d(r7)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            o.C8556dpz.d(r7)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.L$0 = r6     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.label = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = o.C8779dyf.c(r2, r7, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r4 = r7
            goto L85
        L4d:
            r7 = move-exception
            o.dqZ r1 = r0.getContext()
            kotlinx.coroutines.CoroutineExceptionHandler$c r2 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            o.dqZ$b r1 = r1.get(r2)
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            if (r1 == 0) goto L85
            o.dqZ r0 = r0.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r6, r7)
            r1.handleException(r0, r2)
            goto L85
        L7a:
            r6 = move-exception
            o.dqZ r7 = r0.getContext()
            boolean r7 = o.dxG.b(r7)
            if (r7 == 0) goto L86
        L85:
            return r4
        L86:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, o.dra):java.lang.Object");
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }
}
