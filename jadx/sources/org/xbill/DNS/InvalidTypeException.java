package org.xbill.DNS;

/* loaded from: classes5.dex */
public class InvalidTypeException extends IllegalArgumentException {
    public InvalidTypeException(int i) {
        super("Invalid DNS type: " + i);
    }
}
