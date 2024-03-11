package com.netflix.model.leafs.originals.interactive.animations;

/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$AutoValue_AnimationTemplateId  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_AnimationTemplateId extends AnimationTemplateId {
    private final String animationTemplateId;

    @Override // com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId
    public String animationTemplateId() {
        return this.animationTemplateId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_AnimationTemplateId(String str) {
        if (str == null) {
            throw new NullPointerException("Null animationTemplateId");
        }
        this.animationTemplateId = str;
    }

    public String toString() {
        return "AnimationTemplateId{animationTemplateId=" + this.animationTemplateId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AnimationTemplateId) {
            return this.animationTemplateId.equals(((AnimationTemplateId) obj).animationTemplateId());
        }
        return false;
    }

    public int hashCode() {
        return this.animationTemplateId.hashCode() ^ 1000003;
    }
}
