package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class InspectorInfo {
    private String name;
    private final ValueElementSequence properties = new ValueElementSequence();
    private Object value;

    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
