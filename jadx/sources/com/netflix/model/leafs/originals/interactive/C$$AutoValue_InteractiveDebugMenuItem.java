package com.netflix.model.leafs.originals.interactive;

/* renamed from: com.netflix.model.leafs.originals.interactive.$$AutoValue_InteractiveDebugMenuItem  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_InteractiveDebugMenuItem extends InteractiveDebugMenuItem {
    private final String id;
    private final String label;
    private final String segmentId;
    private final Double startTime;

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem
    public String id() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem
    public String label() {
        return this.label;
    }

    @Override // com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem
    public String segmentId() {
        return this.segmentId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.netflix.model.leafs.originals.interactive.InteractiveDebugMenuItem
    public Double startTime() {
        return this.startTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_InteractiveDebugMenuItem(String str, String str2, String str3, Double d) {
        this.id = str;
        this.label = str2;
        this.segmentId = str3;
        this.startTime = d;
    }

    public String toString() {
        return "InteractiveDebugMenuItem{id=" + this.id + ", label=" + this.label + ", segmentId=" + this.segmentId + ", startTime=" + this.startTime + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InteractiveDebugMenuItem) {
            InteractiveDebugMenuItem interactiveDebugMenuItem = (InteractiveDebugMenuItem) obj;
            String str = this.id;
            if (str != null ? str.equals(interactiveDebugMenuItem.id()) : interactiveDebugMenuItem.id() == null) {
                String str2 = this.label;
                if (str2 != null ? str2.equals(interactiveDebugMenuItem.label()) : interactiveDebugMenuItem.label() == null) {
                    String str3 = this.segmentId;
                    if (str3 != null ? str3.equals(interactiveDebugMenuItem.segmentId()) : interactiveDebugMenuItem.segmentId() == null) {
                        Double d = this.startTime;
                        if (d == null) {
                            if (interactiveDebugMenuItem.startTime() == null) {
                                return true;
                            }
                        } else if (d.equals(interactiveDebugMenuItem.startTime())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.segmentId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        Double d = this.startTime;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (d != null ? d.hashCode() : 0);
    }
}
