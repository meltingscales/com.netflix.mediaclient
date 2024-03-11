package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcelable;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Element implements Parcelable, VisualStatesDefinition {
    public List<Element> elementChildList() {
        return null;
    }

    public abstract String id();

    public abstract String styleId();

    public abstract String type();

    public abstract Map<String, AnimationTemplateId> visualStateTransitions();

    public abstract Map<String, VisualStateDefinition> visualStates();

    public boolean hasVisualStates() {
        Map<String, VisualStateDefinition> visualStates = visualStates();
        return (visualStates == null || visualStates.isEmpty()) ? false : true;
    }

    private VisualStateDefinition getStateDefinition(String str) {
        Map<String, VisualStateDefinition> visualStates = visualStates();
        if (visualStates != null) {
            return visualStates.get(str);
        }
        return null;
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getDefault() {
        return getStateDefinition("default");
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getFocused() {
        return getStateDefinition("focused");
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getSelected() {
        return getStateDefinition(VisualStateDefinition.ELEMENT_STATE.SELECTED);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getResult() {
        return getStateDefinition(VisualStateDefinition.ELEMENT_STATE.RESULT);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getWrong() {
        return getStateDefinition(VisualStateDefinition.ELEMENT_STATE.WRONG);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getCorrect() {
        return getStateDefinition(VisualStateDefinition.ELEMENT_STATE.CORRECT);
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getUpdate() {
        return getStateDefinition("update");
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.VisualStatesDefinition
    public VisualStateDefinition getLastTenSeconds() {
        return getStateDefinition(VisualStateDefinition.ELEMENT_STATE.LAST_10_SECS);
    }

    public int hashCode() {
        String id = id();
        int hashCode = id == null ? 0 : id.hashCode();
        String type = type();
        int hashCode2 = type == null ? 0 : type.hashCode();
        String styleId = styleId();
        return (((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (styleId != null ? styleId.hashCode() : 0)) * 1000003;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Element) {
            Element element = (Element) obj;
            String id = id();
            String type = type();
            String styleId = styleId();
            if (id != null ? id.equals(element.id()) : element.id() == null) {
                if (type != null ? type.equals(element.type()) : element.type() == null) {
                    if (styleId == null) {
                        if (element.styleId() == null) {
                            return true;
                        }
                    } else if (styleId.equals(element.styleId())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public Map<String, AnimationTemplateId> mergeVisualStateTransition(Map<String, AnimationTemplateId> map) {
        if (map == null || map.isEmpty()) {
            return visualStateTransitions();
        }
        Map<String, AnimationTemplateId> visualStateTransitions = visualStateTransitions();
        if (visualStateTransitions != null) {
            HashMap hashMap = new HashMap(visualStateTransitions);
            hashMap.putAll(map);
            return hashMap;
        }
        return map;
    }

    public Map<String, VisualStateDefinition> mergeVisualStates(Map<String, VisualStateDefinition> map) {
        if (map == null || map.isEmpty()) {
            return visualStates();
        }
        Map<String, VisualStateDefinition> visualStates = visualStates();
        if (visualStates != null) {
            HashMap hashMap = new HashMap(visualStates);
            hashMap.putAll(map);
            return hashMap;
        }
        return map;
    }
}
