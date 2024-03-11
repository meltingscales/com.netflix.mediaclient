package o;

import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.features.api.FeatureExperience;
import com.netflix.mediaclient.features.api.FeatureProfileType;

/* loaded from: classes3.dex */
public final class XO {
    @SerializedName("v1")
    private c c;

    public final c c() {
        return this.c;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @SerializedName("mdx")
        private a a;
        @SerializedName("partialDownloadPlayback")
        private a b;
        @SerializedName("browse")
        private a c;
        @SerializedName("download")
        private a d;
        @SerializedName("downloadsForYou")
        private a e;
        @SerializedName("smartDownload")
        private a f;

        public final a a() {
            return this.b;
        }

        public final a b() {
            return this.a;
        }

        public final a c() {
            return this.c;
        }

        public final a d() {
            return this.d;
        }

        public final a e() {
            return this.e;
        }

        public final a f() {
            return this.f;
        }

        /* loaded from: classes3.dex */
        public static class a implements XI {
            @SerializedName("enabled")
            private boolean a;
            @SerializedName("experience")
            private String c = "DEFAULT";
            @SerializedName("profileType")
            private String e = "REGULAR";

            @Override // o.XI
            public boolean a() {
                return this.a;
            }

            @Override // o.XI
            public FeatureExperience d() {
                try {
                    return FeatureExperience.valueOf(this.c);
                } catch (IllegalArgumentException unused) {
                    return FeatureExperience.b;
                }
            }

            @Override // o.XI
            public FeatureProfileType c() {
                try {
                    return FeatureProfileType.valueOf(this.e);
                } catch (IllegalArgumentException unused) {
                    return FeatureProfileType.b;
                }
            }
        }
    }
}
