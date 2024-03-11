package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Audio  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_Audio extends Audio {
    private final float delay;
    private final String id;
    private final String url;
    private final float volume;

    @Override // com.netflix.model.leafs.originals.interactive.Audio
    public float delay() {
        return this.delay;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Audio
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Audio
    public String url() {
        return this.url;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Audio
    public float volume() {
        return this.volume;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Audio(String str, float f, float f2, String str2) {
        this.id = str;
        this.volume = f;
        this.delay = f2;
        this.url = str2;
    }

    public String toString() {
        return "Audio{id=" + this.id + ", volume=" + this.volume + ", delay=" + this.delay + ", url=" + this.url + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Audio) {
            Audio audio = (Audio) obj;
            String str = this.id;
            if (str != null ? str.equals(audio.id()) : audio.id() == null) {
                if (Float.floatToIntBits(this.volume) == Float.floatToIntBits(audio.volume()) && Float.floatToIntBits(this.delay) == Float.floatToIntBits(audio.delay())) {
                    String str2 = this.url;
                    if (str2 == null) {
                        if (audio.url() == null) {
                            return true;
                        }
                    } else if (str2.equals(audio.url())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        int floatToIntBits = Float.floatToIntBits(this.volume);
        int floatToIntBits2 = Float.floatToIntBits(this.delay);
        String str2 = this.url;
        return ((((((hashCode ^ 1000003) * 1000003) ^ floatToIntBits) * 1000003) ^ floatToIntBits2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
