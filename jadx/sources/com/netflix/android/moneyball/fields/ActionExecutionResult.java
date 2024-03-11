package com.netflix.android.moneyball.fields;

import java.util.List;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class ActionExecutionResult {
    private final ActionField action;
    private final List<Field> fields;
    private final String flow;
    private final String mode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionExecutionResult copy$default(ActionExecutionResult actionExecutionResult, ActionField actionField, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionField = actionExecutionResult.action;
        }
        if ((i & 2) != 0) {
            list = actionExecutionResult.fields;
        }
        if ((i & 4) != 0) {
            str = actionExecutionResult.flow;
        }
        if ((i & 8) != 0) {
            str2 = actionExecutionResult.mode;
        }
        return actionExecutionResult.copy(actionField, list, str, str2);
    }

    public final ActionField component1() {
        return this.action;
    }

    public final List<Field> component2() {
        return this.fields;
    }

    public final String component3() {
        return this.flow;
    }

    public final String component4() {
        return this.mode;
    }

    public final ActionExecutionResult copy(ActionField actionField, List<? extends Field> list, String str, String str2) {
        C8632dsu.c((Object) actionField, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return new ActionExecutionResult(actionField, list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionExecutionResult) {
            ActionExecutionResult actionExecutionResult = (ActionExecutionResult) obj;
            return C8632dsu.c(this.action, actionExecutionResult.action) && C8632dsu.c(this.fields, actionExecutionResult.fields) && C8632dsu.c((Object) this.flow, (Object) actionExecutionResult.flow) && C8632dsu.c((Object) this.mode, (Object) actionExecutionResult.mode);
        }
        return false;
    }

    public final ActionField getAction() {
        return this.action;
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        return (((((this.action.hashCode() * 31) + this.fields.hashCode()) * 31) + this.flow.hashCode()) * 31) + this.mode.hashCode();
    }

    public String toString() {
        ActionField actionField = this.action;
        List<Field> list = this.fields;
        String str = this.flow;
        String str2 = this.mode;
        return "ActionExecutionResult(action=" + actionField + ", fields=" + list + ", flow=" + str + ", mode=" + str2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionExecutionResult(ActionField actionField, List<? extends Field> list, String str, String str2) {
        C8632dsu.c((Object) actionField, "");
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.action = actionField;
        this.fields = list;
        this.flow = str;
        this.mode = str2;
    }

    public /* synthetic */ ActionExecutionResult(ActionField actionField, List list, String str, String str2, int i, C8627dsp c8627dsp) {
        this(actionField, list, (i & 4) != 0 ? actionField.getFlowMode().getFlow() : str, (i & 8) != 0 ? actionField.getFlowMode().getMode() : str2);
    }
}
