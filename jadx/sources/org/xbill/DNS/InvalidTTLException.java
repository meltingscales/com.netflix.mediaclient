package org.xbill.DNS;

/* loaded from: classes5.dex */
public class InvalidTTLException extends IllegalArgumentException {
    public InvalidTTLException(long j) {
        super("Invalid DNS TTL: " + j);
    }
}
