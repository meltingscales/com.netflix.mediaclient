package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class dkE extends OutputStream {
    private final C8421dkz a;
    private MslConstants.CompressionAlgorithm e;
    private final OutputStream f;
    private final C8404dki h;
    private final MslContext i;
    private final AbstractC8393djy j;

    /* renamed from: o  reason: collision with root package name */
    private final dkC f13853o;
    private long k = 1;
    private ByteArrayOutputStream g = new ByteArrayOutputStream();
    private boolean c = false;
    private boolean d = false;
    private boolean b = true;
    private final List<dkM> n = new ArrayList();

    public void a(boolean z) {
        this.d = z;
    }

    public dkE(MslContext mslContext, OutputStream outputStream, dkG dkg, AbstractC8393djy abstractC8393djy) {
        MslConstants.CompressionAlgorithm compressionAlgorithm;
        C8404dki b;
        AbstractC8399dkd e = mslContext.e();
        C8421dkz g = dkg.g();
        if (g != null) {
            compressionAlgorithm = MslConstants.CompressionAlgorithm.e(g.b());
            b = e.b(g.d());
        } else {
            compressionAlgorithm = null;
            b = e.b(null);
        }
        try {
            byte[] c = dkg.c(e, b);
            this.i = mslContext;
            this.f = outputStream;
            this.h = b;
            this.a = g;
            this.f13853o = dkg;
            this.e = compressionAlgorithm;
            this.j = abstractC8393djy;
            outputStream.write(c);
            outputStream.flush();
        } catch (MslEncoderException e2) {
            throw new IOException("Error encoding the message header.", e2);
        }
    }

    protected void finalize() {
        close();
        super.finalize();
    }

    public boolean a(MslConstants.CompressionAlgorithm compressionAlgorithm) {
        C8421dkz c8421dkz;
        if (e() == null) {
            throw new MslInternalException("Cannot write payload data for an error message.");
        }
        if (compressionAlgorithm == null || ((c8421dkz = this.a) != null && c8421dkz.b().contains(compressionAlgorithm))) {
            if (this.e != compressionAlgorithm) {
                flush();
            }
            this.e = compressionAlgorithm;
            return true;
        }
        return false;
    }

    public dkG e() {
        dkC dkc = this.f13853o;
        if (dkc instanceof dkG) {
            return (dkG) dkc;
        }
        return null;
    }

    public List<dkM> b() {
        return Collections.unmodifiableList(this.n);
    }

    public void c() {
        this.b = false;
        this.n.clear();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        flush();
        this.g = null;
        if (this.d) {
            this.f.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        dkG e;
        ByteArrayOutputStream byteArrayOutputStream = this.g;
        if (byteArrayOutputStream == null) {
            return;
        }
        if ((!this.c && byteArrayOutputStream.size() == 0) || (e = e()) == null || e.t()) {
            return;
        }
        try {
            dkM e2 = e(this.i, this.k, e.f(), this.c, this.e, this.g.toByteArray(), this.j);
            if (this.b) {
                this.n.add(e2);
            }
            this.f.write(e2.c(this.i.e(), this.h));
            this.f.flush();
            this.k++;
            if (this.c) {
                this.g = null;
            } else {
                this.g.reset();
            }
        } catch (MslCryptoException e3) {
            throw new IOException("Error encrypting payload chunk [sequence number " + this.k + "].", e3);
        } catch (MslException e4) {
            throw new IOException("Error compressing payload chunk [sequence number " + this.k + "].", e4);
        } catch (MslEncoderException e5) {
            throw new IOException("Error encoding payload chunk [sequence number " + this.k + "].", e5);
        }
    }

    protected dkM e(MslContext mslContext, long j, long j2, boolean z, MslConstants.CompressionAlgorithm compressionAlgorithm, byte[] bArr, AbstractC8393djy abstractC8393djy) {
        return new dkM(mslContext, j, j2, z, compressionAlgorithm, bArr, abstractC8393djy);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IOException("Message output stream already closed.");
        }
        dkG e = e();
        if (e == null) {
            throw new MslInternalException("Cannot write payload data for an error message.");
        }
        if (e.t()) {
            throw new MslInternalException("Cannot write payload data for a handshake message.");
        }
        this.g.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) (i & PrivateKeyType.INVALID)});
    }
}
