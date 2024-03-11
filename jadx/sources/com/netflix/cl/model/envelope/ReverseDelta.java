package com.netflix.cl.model.envelope;

import com.netflix.cl.Platform;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class ReverseDelta {
    private List<Operation> operations = new LinkedList();

    public void add(Operation operation) {
        synchronized (this) {
            if (operation == null) {
                return;
            }
            this.operations.add(operation);
        }
    }

    public JSONArray addItself(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        jSONArray.put(jSONArray2);
        for (Operation operation : this.operations) {
            if (operation instanceof SimpleOperation) {
                ((SimpleOperation) operation).addItself(jSONArray2);
            } else if (operation instanceof ComplexOperation) {
                jSONArray2.put(((ComplexOperation) operation).toJsonArray());
            } else {
                Platform.getLocalLogger().error("Not supported operation implementation: %s", operation.getClass().getSimpleName());
            }
        }
        return jSONArray;
    }
}
