package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Deprecated
/* renamed from: o.qY  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9488qY {
    private final ObjectNode e;

    @JsonCreator
    public C9488qY(ObjectNode objectNode) {
        this.e = objectNode;
    }

    public String toString() {
        return this.e.toString();
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C9488qY)) {
            C9488qY c9488qY = (C9488qY) obj;
            ObjectNode objectNode = this.e;
            if (objectNode == null) {
                return c9488qY.e == null;
            }
            return objectNode.equals(c9488qY.e);
        }
        return false;
    }

    public static AbstractC9454pr e() {
        ObjectNode a = JsonNodeFactory.a.a();
        a.c("type", "any");
        return a;
    }
}
