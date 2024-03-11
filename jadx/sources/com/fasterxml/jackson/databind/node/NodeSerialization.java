package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import o.C9561rs;

/* loaded from: classes5.dex */
class NodeSerialization implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] c;

    public NodeSerialization() {
    }

    public NodeSerialization(byte[] bArr) {
        this.c = bArr;
    }

    protected Object readResolve() {
        try {
            return C9561rs.e(this.c);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e.getMessage(), e);
        }
    }

    public static NodeSerialization d(Object obj) {
        try {
            return new NodeSerialization(C9561rs.b(obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.c.length);
        objectOutput.write(this.c);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        byte[] bArr = new byte[readInt];
        this.c = bArr;
        objectInput.readFully(bArr, 0, readInt);
    }
}
