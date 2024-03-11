package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
final class StructuralMessageInfo implements MessageInfo {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }
}
