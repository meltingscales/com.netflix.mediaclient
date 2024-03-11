package com.netflix.model.leafs.originals.interactive.animations;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.animations.$$AutoValue_ChoicePointAnimations  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_ChoicePointAnimations extends ChoicePointAnimations {
    private final Map<String, List<InteractiveAnimation>> hide;
    private final Map<String, List<InteractiveAnimation>> hideSelected;
    private final Map<String, List<InteractiveAnimation>> show;

    @Override // com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations
    public Map<String, List<InteractiveAnimation>> hide() {
        return this.hide;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations
    public Map<String, List<InteractiveAnimation>> hideSelected() {
        return this.hideSelected;
    }

    @Override // com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations
    public Map<String, List<InteractiveAnimation>> show() {
        return this.show;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_ChoicePointAnimations(Map<String, List<InteractiveAnimation>> map, Map<String, List<InteractiveAnimation>> map2, Map<String, List<InteractiveAnimation>> map3) {
        if (map == null) {
            throw new NullPointerException("Null show");
        }
        this.show = map;
        if (map2 == null) {
            throw new NullPointerException("Null hide");
        }
        this.hide = map2;
        this.hideSelected = map3;
    }

    public String toString() {
        return "ChoicePointAnimations{show=" + this.show + ", hide=" + this.hide + ", hideSelected=" + this.hideSelected + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChoicePointAnimations) {
            ChoicePointAnimations choicePointAnimations = (ChoicePointAnimations) obj;
            if (this.show.equals(choicePointAnimations.show()) && this.hide.equals(choicePointAnimations.hide())) {
                Map<String, List<InteractiveAnimation>> map = this.hideSelected;
                if (map == null) {
                    if (choicePointAnimations.hideSelected() == null) {
                        return true;
                    }
                } else if (map.equals(choicePointAnimations.hideSelected())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.show.hashCode();
        int hashCode2 = this.hide.hashCode();
        Map<String, List<InteractiveAnimation>> map = this.hideSelected;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (map == null ? 0 : map.hashCode());
    }
}
