package androidx.compose.foundation;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
final class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BorderCache) {
            BorderCache borderCache = (BorderCache) obj;
            return C8632dsu.c(this.imageBitmap, borderCache.imageBitmap) && C8632dsu.c(this.canvas, borderCache.canvas) && C8632dsu.c(this.canvasDrawScope, borderCache.canvasDrawScope) && C8632dsu.c(this.borderPath, borderCache.borderPath);
        }
        return false;
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int hashCode = imageBitmap == null ? 0 : imageBitmap.hashCode();
        Canvas canvas = this.canvas;
        int hashCode2 = canvas == null ? 0 : canvas.hashCode();
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int hashCode3 = canvasDrawScope == null ? 0 : canvasDrawScope.hashCode();
        Path path = this.borderPath;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (path != null ? path.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : imageBitmap, (i & 2) != 0 ? null : canvas, (i & 4) != 0 ? null : canvasDrawScope, (i & 8) != 0 ? null : path);
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path == null) {
            Path Path = AndroidPath_androidKt.Path();
            this.borderPath = Path;
            return Path;
        }
        return path;
    }
}
