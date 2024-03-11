package o;

import androidx.compose.material.IconKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda1$1;
import o.dpR;

/* loaded from: classes5.dex */
public final class J {
    public static final J d = new J();
    public static drX<Composer, Integer, dpR> e = ComposableLambdaKt.composableLambdaInstance(1662328616, false, ComposableSingletons$ShowkaseBrowserAppKt$lambda1$1.c);
    public static drX<Composer, Integer, dpR> c = ComposableLambdaKt.composableLambdaInstance(-396295222, false, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-2$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return dpR.c;
        }

        public final void c(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-396295222, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-2.<anonymous> (ShowkaseBrowserApp.kt:321)");
            }
            IconKt.m611Iconww6aTOc(SearchKt.getSearch(Icons.Filled.INSTANCE), "Search Icon", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static drX<Composer, Integer, dpR> b = ComposableLambdaKt.composableLambdaInstance(-227151447, false, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-3$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return dpR.c;
        }

        public final void d(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227151447, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-3.<anonymous> (ShowkaseBrowserApp.kt:331)");
            }
            IconKt.m611Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), "Clear Search Field", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    public static drX<Composer, Integer, dpR> a = ComposableLambdaKt.composableLambdaInstance(1818908679, false, new drX<Composer, Integer, dpR>() { // from class: com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt$lambda-4$1
        @Override // o.drX
        public /* synthetic */ dpR invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return dpR.c;
        }

        public final void a(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818908679, i, -1, "com.airbnb.android.showkase.ui.ComposableSingletons$ShowkaseBrowserAppKt.lambda-4.<anonymous> (ShowkaseBrowserApp.kt:356)");
            }
            IconKt.m611Iconww6aTOc(SearchKt.getSearch(Icons.Filled.INSTANCE), "Search Icon", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final drX<Composer, Integer, dpR> a() {
        return e;
    }

    public final drX<Composer, Integer, dpR> b() {
        return b;
    }

    public final drX<Composer, Integer, dpR> d() {
        return a;
    }

    public final drX<Composer, Integer, dpR> e() {
        return c;
    }
}
