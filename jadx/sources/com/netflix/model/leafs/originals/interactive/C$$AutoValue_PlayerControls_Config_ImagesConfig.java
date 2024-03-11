package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_PlayerControls_Config_ImagesConfig  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_PlayerControls_Config_ImagesConfig extends PlayerControls.Config.ImagesConfig {
    private final Size size;
    private final Map<String, String> tokens;
    private final String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config.ImagesConfig
    public Size size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config.ImagesConfig
    public Map<String, String> tokens() {
        return this.tokens;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.PlayerControls.Config.ImagesConfig
    public String url() {
        return this.url;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_PlayerControls_Config_ImagesConfig(Size size, String str, Map<String, String> map) {
        this.size = size;
        this.url = str;
        this.tokens = map;
    }

    public String toString() {
        return "ImagesConfig{size=" + this.size + ", url=" + this.url + ", tokens=" + this.tokens + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayerControls.Config.ImagesConfig) {
            PlayerControls.Config.ImagesConfig imagesConfig = (PlayerControls.Config.ImagesConfig) obj;
            Size size = this.size;
            if (size != null ? size.equals(imagesConfig.size()) : imagesConfig.size() == null) {
                String str = this.url;
                if (str != null ? str.equals(imagesConfig.url()) : imagesConfig.url() == null) {
                    Map<String, String> map = this.tokens;
                    if (map == null) {
                        if (imagesConfig.tokens() == null) {
                            return true;
                        }
                    } else if (map.equals(imagesConfig.tokens())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Size size = this.size;
        int hashCode = size == null ? 0 : size.hashCode();
        String str = this.url;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.tokens;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (map != null ? map.hashCode() : 0);
    }
}
