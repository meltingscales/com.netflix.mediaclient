package androidx.compose.ui.text;

import o.C8632dsu;

/* loaded from: classes.dex */
public final class UrlAnnotation {
    private final String url;

    public final String getUrl() {
        return this.url;
    }

    public UrlAnnotation(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlAnnotation) && C8632dsu.c((Object) this.url, (Object) ((UrlAnnotation) obj).url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
