package com.google.android.play.core.splitinstall.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public final class zzi {
    public static X509Certificate[][] zza(String str) {
        Pair zzc;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            zzc = zzj.zzc(randomAccessFile);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (zzc != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long zza = zzj.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzf("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzj.zzb(byteBuffer) + zza == longValue) {
                    if (zza < 32) {
                        throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(zza - allocate.capacity());
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                        throw new zzf("No APK Signing Block before ZIP Central Directory");
                    }
                    int i = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        throw new zzf("APK Signing Block size out of range: " + j2);
                    }
                    int i2 = (int) (8 + j2);
                    long j3 = zza - i2;
                    if (j3 < 0) {
                        throw new zzf("APK Signing Block offset out of range: " + j3);
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        throw new zzf("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == byteOrder) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i++;
                            if (slice.remaining() >= 8) {
                                long j5 = slice.getLong();
                                if (j5 >= 4 && j5 <= 2147483647L) {
                                    int position2 = slice.position();
                                    int i3 = (int) j5;
                                    if (i3 <= slice.remaining()) {
                                        if (slice.getInt() != 1896449818) {
                                            slice.position(position2 + i3);
                                        } else {
                                            X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zze(zze(slice, i3 - 4), longValue2, zza, longValue, byteBuffer, null));
                                            randomAccessFile.close();
                                            try {
                                                randomAccessFile.close();
                                            } catch (IOException unused) {
                                            }
                                            return zzl;
                                        }
                                    } else {
                                        int remaining = slice.remaining();
                                        throw new zzf("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + remaining);
                                    }
                                } else {
                                    throw new zzf("APK Signing Block entry #" + i + " size out of range: " + j5);
                                }
                            } else {
                                throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i);
                            }
                        }
                        throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                } else {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
            }
            long length = randomAccessFile.length();
            throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + length + " bytes");
        } catch (Throwable th2) {
            th = th2;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + remaining);
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + remaining2);
        }
        return zze(byteBuffer, i);
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & PrivateKeyType.INVALID);
        bArr[2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            zzc zzcVar = new zzc(fileChannel, 0L, j);
            zzc zzcVar2 = new zzc(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzj.zzd(duplicate, j);
            zza zzaVar = new zza(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            for (Integer num : map.keySet()) {
                iArr[i] = num.intValue();
                i++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = iArr[i2];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.internal.zzi.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) {
        long j;
        int i;
        int length;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i2 >= 3) {
                break;
            }
            j3 += (zzbVarArr[i2].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i2++;
        }
        if (j3 >= 2097151) {
            throw new DigestException("Too many chunks: " + j3);
        }
        byte[][] bArr = new byte[iArr.length];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) j3;
            byte[] bArr2 = new byte[(zzb(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            zzg(i4, bArr2, 1);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String zzd = zzd(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(zzd);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(zzd.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            zzb zzbVar = zzbVarArr[i6];
            long j4 = j2;
            int i9 = i8;
            long zza = zzbVar.zza();
            while (zza > j2) {
                int min = (int) Math.min(zza, j);
                zzg(min, bArr3, 1);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzbVar.zzb(messageDigestArr, j5, min);
                    zzb zzbVar2 = zzbVar;
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i11];
                        int zzb = zzb(i12);
                        int i13 = length;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i9 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i11++;
                        bArr3 = bArr4;
                        length = i13;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j6 = min;
                    zza -= j6;
                    i9++;
                    long j7 = j6 + j5;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    j4 = j7;
                    zzbVar = zzbVar2;
                    j2 = 0;
                } catch (IOException e2) {
                    throw new DigestException("Failed to digest chunk #" + i9 + " of section #" + i7, e2);
                }
            }
            i7++;
            i6++;
            j2 = 0;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i8 = i9;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String zzd2 = zzd(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(zzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzeVar.zzb;
                    j2 = zzeVar.zzc;
                    j3 = zzeVar.zzd;
                    byteBuffer2 = zzeVar.zze;
                    zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
