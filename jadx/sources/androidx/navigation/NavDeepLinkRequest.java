package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class NavDeepLinkRequest {
    private final String action;
    private final String mimeType;
    private final Uri uri;

    public String getAction() {
        return this.action;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Uri getUri() {
        return this.uri;
    }

    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkRequest(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        C8632dsu.c((Object) intent, "");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* loaded from: classes5.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        private String action;
        private String mimeType;
        private Uri uri;

        public /* synthetic */ Builder(C8627dsp c8627dsp) {
            this();
        }

        public final Builder setUri(Uri uri) {
            C8632dsu.c((Object) uri, "");
            this.uri = uri;
            return this;
        }

        private Builder() {
        }

        public final NavDeepLinkRequest build() {
            return new NavDeepLinkRequest(this.uri, this.action, this.mimeType);
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final Builder fromUri(Uri uri) {
                C8632dsu.c((Object) uri, "");
                Builder builder = new Builder(null);
                builder.setUri(uri);
                return builder;
            }
        }
    }
}
