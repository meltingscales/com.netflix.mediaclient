package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Result;
import o.C8586drb;
import o.C8590drf;
import o.C8592drh;
import o.C8632dsu;
import o.C8741dwv;
import o.InterfaceC8585dra;
import o.InterfaceC8743dwx;

/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        C8632dsu.d(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, InterfaceC8585dra<? super android.graphics.Typeface> interfaceC8585dra) {
        InterfaceC8585dra b;
        Object e;
        b = C8590drf.b(interfaceC8585dra);
        final C8741dwv c8741dwv = new C8741dwv(b, 1);
        c8741dwv.h();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrieved(android.graphics.Typeface typeface) {
                InterfaceC8743dwx<android.graphics.Typeface> interfaceC8743dwx = c8741dwv;
                Result.c cVar = Result.e;
                interfaceC8743dwx.resumeWith(Result.e(typeface));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrievalFailed(int i) {
                InterfaceC8743dwx<android.graphics.Typeface> interfaceC8743dwx = c8741dwv;
                interfaceC8743dwx.c(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i + ')'));
            }
        }, null);
        Object b2 = c8741dwv.b();
        e = C8586drb.e();
        if (b2 == e) {
            C8592drh.c(interfaceC8585dra);
        }
        return b2;
    }
}
