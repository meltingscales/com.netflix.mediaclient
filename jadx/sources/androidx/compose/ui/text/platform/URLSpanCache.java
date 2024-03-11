package androidx.compose.ui.text.platform;

import android.text.style.URLSpan;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class URLSpanCache {
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    public final URLSpan toURLSpan(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
