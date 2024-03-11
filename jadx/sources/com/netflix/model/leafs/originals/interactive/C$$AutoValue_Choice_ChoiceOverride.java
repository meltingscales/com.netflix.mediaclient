package com.netflix.model.leafs.originals.interactive;

import com.netflix.model.leafs.originals.interactive.Choice;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_Choice_ChoiceOverride  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C$$AutoValue_Choice_ChoiceOverride extends Choice.ChoiceOverride {
    private final Choice data;
    private final String preconditionId;

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceOverride
    public Choice data() {
        return this.data;
    }

    @Override // com.netflix.model.leafs.originals.interactive.Choice.ChoiceOverride
    public String preconditionId() {
        return this.preconditionId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_Choice_ChoiceOverride(Choice choice, String str) {
        if (choice == null) {
            throw new NullPointerException("Null data");
        }
        this.data = choice;
        this.preconditionId = str;
    }

    public String toString() {
        return "ChoiceOverride{data=" + this.data + ", preconditionId=" + this.preconditionId + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Choice.ChoiceOverride) {
            Choice.ChoiceOverride choiceOverride = (Choice.ChoiceOverride) obj;
            if (this.data.equals(choiceOverride.data())) {
                String str = this.preconditionId;
                if (str == null) {
                    if (choiceOverride.preconditionId() == null) {
                        return true;
                    }
                } else if (str.equals(choiceOverride.preconditionId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode();
        String str = this.preconditionId;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}
