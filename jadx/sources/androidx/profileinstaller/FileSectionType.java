package androidx.profileinstaller;

/* loaded from: classes5.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    public long getValue() {
        return this.mValue;
    }

    FileSectionType(long j) {
        this.mValue = j;
    }
}
