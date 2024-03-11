package org.json;

import java.io.StringWriter;

/* loaded from: classes.dex */
public class JSONStringer extends JSONWriter {
    public JSONStringer() {
        super(new StringWriter());
    }

    public String toString() {
        if (((JSONWriter) this).mode == 'd') {
            return ((JSONWriter) this).writer.toString();
        }
        return null;
    }
}
