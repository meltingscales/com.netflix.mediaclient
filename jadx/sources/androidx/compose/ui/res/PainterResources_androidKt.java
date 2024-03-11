package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.painter.Painter painterResource(int r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r12.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
        L12:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r12.consume(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.res.Resources r3 = androidx.compose.ui.res.Resources_androidKt.resources(r12, r1)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r2)
            java.lang.Object r2 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r2 != r5) goto L3b
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r12.updateRememberedValue(r2)
        L3b:
            r12.endReplaceableGroup()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r5 = 1
            r3.getValue(r11, r2, r5)
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L73
            r7 = 2
            r8 = 0
            java.lang.String r9 = ".xml"
            boolean r7 = o.C8684dus.c(r6, r9, r1, r7, r8)
            if (r7 != r5) goto L73
            r4 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r12.startReplaceableGroup(r4)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r5 = r2.changingConfigurations
            int r13 = r13 << 6
            r13 = r13 & 896(0x380, float:1.256E-42)
            r7 = r13 | 72
            r2 = r0
            r4 = r11
            r6 = r12
            androidx.compose.ui.graphics.vector.ImageVector r11 = loadVectorResource(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.VectorPainter r11 = androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(r11, r12, r1)
            r12.endReplaceableGroup()
            goto Lbd
        L73:
            r13 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r12.startReplaceableGroup(r13)
            android.content.res.Resources$Theme r13 = r0.getTheme()
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.startReplaceableGroup(r0)
            boolean r0 = r12.changed(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r1 = r12.changed(r1)
            boolean r13 = r12.changed(r13)
            java.lang.Object r2 = r12.rememberedValue()
            r0 = r0 | r1
            r13 = r13 | r0
            if (r13 != 0) goto La1
            java.lang.Object r13 = r4.getEmpty()
            if (r2 != r13) goto La8
        La1:
            androidx.compose.ui.graphics.ImageBitmap r2 = access$loadImageBitmapResource(r6, r3, r11)
            r12.updateRememberedValue(r2)
        La8:
            r12.endReplaceableGroup()
            r4 = r2
            androidx.compose.ui.graphics.ImageBitmap r4 = (androidx.compose.ui.graphics.ImageBitmap) r4
            androidx.compose.ui.graphics.painter.BitmapPainter r11 = new androidx.compose.ui.graphics.painter.BitmapPainter
            r5 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r7, r9, r10)
            r12.endReplaceableGroup()
        Lbd:
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto Lc6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lc6:
            r12.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.PainterResources_androidKt.painterResource(int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.painter.Painter");
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(21855625);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!C8632dsu.c((Object) XmlVectorParser_androidKt.seekToStartTag(xml).getName(), (Object) "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
            imageVectorCache.set(key, imageVectorEntry);
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i);
        } catch (Exception e) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }
}
