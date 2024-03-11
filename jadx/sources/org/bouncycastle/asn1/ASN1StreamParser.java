package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1StreamParser(InputStream inputStream, int i, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i;
        this.tmpBuffers = bArr;
    }

    private void set00Check(boolean z) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z);
        }
    }

    ASN1Encodable implParseObject(int i) {
        set00Check(false);
        int readTagNumber = ASN1InputStream.readTagNumber(this._in, i);
        int readLength = ASN1InputStream.readLength(this._in, this._limit, readTagNumber == 3 || readTagNumber == 4 || readTagNumber == 16 || readTagNumber == 17 || readTagNumber == 8);
        if (readLength < 0) {
            if ((i & 32) != 0) {
                ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
                int i2 = i & 192;
                return i2 != 0 ? new BERTaggedObjectParser(i2, readTagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(readTagNumber);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, readLength, this._limit);
        if ((i & 224) == 0) {
            return parseImplicitPrimitive(readTagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i3 = i & 192;
        if (i3 != 0) {
            return new DLTaggedObjectParser(i3, readTagNumber, (i & 32) != 0, aSN1StreamParser2);
        }
        return aSN1StreamParser2.parseImplicitConstructedDL(readTagNumber);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Primitive loadTaggedDL(int i, int i2, boolean z) {
        return !z ? ASN1TaggedObject.createPrimitive(i, i2, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i, i2, readVector());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Primitive loadTaggedIL(int i, int i2) {
        return ASN1TaggedObject.createConstructedIL(i, i2, readVector());
    }

    ASN1Encodable parseImplicitConstructedDL(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i == 17) {
                            return new DLSetParser(this);
                        }
                        throw new ASN1Exception("unknown DL object encountered: 0x" + Integer.toHexString(i));
                    }
                    return new DLSequenceParser(this);
                }
                return new DERExternalParser(this);
            }
            return new BEROctetStringParser(this);
        }
        return new BERBitStringParser(this);
    }

    ASN1Encodable parseImplicitConstructedIL(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i == 17) {
                            return new BERSetParser(this);
                        }
                        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i));
                    }
                    return new BERSequenceParser(this);
                }
                return new DERExternalParser(this);
            }
            return new BEROctetStringParser(this);
        }
        return new BERBitStringParser(this);
    }

    ASN1Encodable parseImplicitPrimitive(int i, DefiniteLengthInputStream definiteLengthInputStream) {
        if (i != 3) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 17) {
                            try {
                                return ASN1InputStream.createPrimitiveDERObject(i, definiteLengthInputStream, this.tmpBuffers);
                            } catch (IllegalArgumentException e) {
                                throw new ASN1Exception("corrupted stream detected", e);
                            }
                        }
                        throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
                    }
                    throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
                }
                throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
            }
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        return new DLBitStringParser(definiteLengthInputStream);
    }

    public ASN1Encodable readObject() {
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        return implParseObject(read);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1EncodableVector readVector() {
        int read = this._in.read();
        if (read < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable implParseObject = implParseObject(read);
            aSN1EncodableVector.add(implParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) implParseObject).getLoadedObject() : implParseObject.toASN1Primitive());
            read = this._in.read();
        } while (read >= 0);
        return aSN1EncodableVector;
    }
}
