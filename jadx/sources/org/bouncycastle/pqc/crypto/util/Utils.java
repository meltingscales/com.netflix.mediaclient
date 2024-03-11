package org.bouncycastle.pqc.crypto.util;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.util.Integers;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class Utils {
    static final AlgorithmIdentifier AlgID_qTESLA_p_I;
    static final AlgorithmIdentifier AlgID_qTESLA_p_III;
    static final AlgorithmIdentifier SPHINCS_SHA3_256;
    static final AlgorithmIdentifier SPHINCS_SHA512_256;
    static final AlgorithmIdentifier XMSS_SHA256;
    static final AlgorithmIdentifier XMSS_SHA512;
    static final AlgorithmIdentifier XMSS_SHAKE128;
    static final AlgorithmIdentifier XMSS_SHAKE256;
    static final Map bikeOids;
    static final Map bikeParams;
    static final Map categories;
    static final Map dilithiumOids;
    static final Map dilithiumParams;
    static final Map falconOids;
    static final Map falconParams;
    static final Map frodoOids;
    static final Map frodoParams;
    static final Map hqcOids;
    static final Map hqcParams;
    static final Map kyberOids;
    static final Map kyberParams;
    static final Map mcElieceOids;
    static final Map mcElieceParams;
    static final Map ntruOids;
    static final Map ntruParams;
    static final Map ntruprimeOids;
    static final Map ntruprimeParams;
    static final Map picnicOids;
    static final Map picnicParams;
    static final Map rainbowOids;
    static final Map rainbowParams;
    static final Map saberOids;
    static final Map saberParams;
    static final Map sikeOids;
    static final Map sikeParams;
    static final Map sntruprimeOids;
    static final Map sntruprimeParams;
    static final Map sphincsPlusOids;
    static final Map sphincsPlusParams;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
        AlgID_qTESLA_p_I = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
        AlgID_qTESLA_p_III = new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
        SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
        XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
        XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
        HashMap hashMap = new HashMap();
        categories = hashMap;
        HashMap hashMap2 = new HashMap();
        picnicOids = hashMap2;
        HashMap hashMap3 = new HashMap();
        picnicParams = hashMap3;
        HashMap hashMap4 = new HashMap();
        frodoOids = hashMap4;
        HashMap hashMap5 = new HashMap();
        frodoParams = hashMap5;
        HashMap hashMap6 = new HashMap();
        saberOids = hashMap6;
        HashMap hashMap7 = new HashMap();
        saberParams = hashMap7;
        HashMap hashMap8 = new HashMap();
        mcElieceOids = hashMap8;
        HashMap hashMap9 = new HashMap();
        mcElieceParams = hashMap9;
        HashMap hashMap10 = new HashMap();
        sphincsPlusOids = hashMap10;
        HashMap hashMap11 = new HashMap();
        sphincsPlusParams = hashMap11;
        sikeOids = new HashMap();
        sikeParams = new HashMap();
        HashMap hashMap12 = new HashMap();
        ntruOids = hashMap12;
        HashMap hashMap13 = new HashMap();
        ntruParams = hashMap13;
        HashMap hashMap14 = new HashMap();
        falconOids = hashMap14;
        HashMap hashMap15 = new HashMap();
        falconParams = hashMap15;
        HashMap hashMap16 = new HashMap();
        kyberOids = hashMap16;
        HashMap hashMap17 = new HashMap();
        kyberParams = hashMap17;
        HashMap hashMap18 = new HashMap();
        ntruprimeOids = hashMap18;
        HashMap hashMap19 = new HashMap();
        ntruprimeParams = hashMap19;
        HashMap hashMap20 = new HashMap();
        sntruprimeOids = hashMap20;
        HashMap hashMap21 = new HashMap();
        sntruprimeParams = hashMap21;
        HashMap hashMap22 = new HashMap();
        dilithiumOids = hashMap22;
        HashMap hashMap23 = new HashMap();
        dilithiumParams = hashMap23;
        HashMap hashMap24 = new HashMap();
        bikeOids = hashMap24;
        HashMap hashMap25 = new HashMap();
        bikeParams = hashMap25;
        HashMap hashMap26 = new HashMap();
        hqcOids = hashMap26;
        HashMap hashMap27 = new HashMap();
        hqcParams = hashMap27;
        HashMap hashMap28 = new HashMap();
        rainbowOids = hashMap28;
        HashMap hashMap29 = new HashMap();
        rainbowParams = hashMap29;
        hashMap.put(aSN1ObjectIdentifier, Integers.valueOf(5));
        hashMap.put(aSN1ObjectIdentifier2, Integers.valueOf(6));
        CMCEParameters cMCEParameters = CMCEParameters.mceliece348864r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mceliece348864_r3;
        hashMap8.put(cMCEParameters, aSN1ObjectIdentifier3);
        CMCEParameters cMCEParameters2 = CMCEParameters.mceliece348864fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mceliece348864f_r3;
        hashMap8.put(cMCEParameters2, aSN1ObjectIdentifier4);
        CMCEParameters cMCEParameters3 = CMCEParameters.mceliece460896r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.mceliece460896_r3;
        hashMap8.put(cMCEParameters3, aSN1ObjectIdentifier5);
        CMCEParameters cMCEParameters4 = CMCEParameters.mceliece460896fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.mceliece460896f_r3;
        hashMap8.put(cMCEParameters4, aSN1ObjectIdentifier6);
        CMCEParameters cMCEParameters5 = CMCEParameters.mceliece6688128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.mceliece6688128_r3;
        hashMap8.put(cMCEParameters5, aSN1ObjectIdentifier7);
        CMCEParameters cMCEParameters6 = CMCEParameters.mceliece6688128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.mceliece6688128f_r3;
        hashMap8.put(cMCEParameters6, aSN1ObjectIdentifier8);
        CMCEParameters cMCEParameters7 = CMCEParameters.mceliece6960119r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.mceliece6960119_r3;
        hashMap8.put(cMCEParameters7, aSN1ObjectIdentifier9);
        CMCEParameters cMCEParameters8 = CMCEParameters.mceliece6960119fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.mceliece6960119f_r3;
        hashMap8.put(cMCEParameters8, aSN1ObjectIdentifier10);
        CMCEParameters cMCEParameters9 = CMCEParameters.mceliece8192128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.mceliece8192128_r3;
        hashMap8.put(cMCEParameters9, aSN1ObjectIdentifier11);
        CMCEParameters cMCEParameters10 = CMCEParameters.mceliece8192128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.mceliece8192128f_r3;
        hashMap8.put(cMCEParameters10, aSN1ObjectIdentifier12);
        hashMap9.put(aSN1ObjectIdentifier3, cMCEParameters);
        hashMap9.put(aSN1ObjectIdentifier4, cMCEParameters2);
        hashMap9.put(aSN1ObjectIdentifier5, cMCEParameters3);
        hashMap9.put(aSN1ObjectIdentifier6, cMCEParameters4);
        hashMap9.put(aSN1ObjectIdentifier7, cMCEParameters5);
        hashMap9.put(aSN1ObjectIdentifier8, cMCEParameters6);
        hashMap9.put(aSN1ObjectIdentifier9, cMCEParameters7);
        hashMap9.put(aSN1ObjectIdentifier10, cMCEParameters8);
        hashMap9.put(aSN1ObjectIdentifier11, cMCEParameters9);
        hashMap9.put(aSN1ObjectIdentifier12, cMCEParameters10);
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.frodokem640aes;
        hashMap4.put(frodoParameters, aSN1ObjectIdentifier13);
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.frodokem640shake;
        hashMap4.put(frodoParameters2, aSN1ObjectIdentifier14);
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.frodokem976aes;
        hashMap4.put(frodoParameters3, aSN1ObjectIdentifier15);
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.frodokem976shake;
        hashMap4.put(frodoParameters4, aSN1ObjectIdentifier16);
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.frodokem1344aes;
        hashMap4.put(frodoParameters5, aSN1ObjectIdentifier17);
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.frodokem1344shake;
        hashMap4.put(frodoParameters6, aSN1ObjectIdentifier18);
        hashMap5.put(aSN1ObjectIdentifier13, frodoParameters);
        hashMap5.put(aSN1ObjectIdentifier14, frodoParameters2);
        hashMap5.put(aSN1ObjectIdentifier15, frodoParameters3);
        hashMap5.put(aSN1ObjectIdentifier16, frodoParameters4);
        hashMap5.put(aSN1ObjectIdentifier17, frodoParameters5);
        hashMap5.put(aSN1ObjectIdentifier18, frodoParameters6);
        SABERParameters sABERParameters = SABERParameters.lightsaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.lightsaberkem128r3;
        hashMap6.put(sABERParameters, aSN1ObjectIdentifier19);
        SABERParameters sABERParameters2 = SABERParameters.saberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = BCObjectIdentifiers.saberkem128r3;
        hashMap6.put(sABERParameters2, aSN1ObjectIdentifier20);
        SABERParameters sABERParameters3 = SABERParameters.firesaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BCObjectIdentifiers.firesaberkem128r3;
        hashMap6.put(sABERParameters3, aSN1ObjectIdentifier21);
        SABERParameters sABERParameters4 = SABERParameters.lightsaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.lightsaberkem192r3;
        hashMap6.put(sABERParameters4, aSN1ObjectIdentifier22);
        SABERParameters sABERParameters5 = SABERParameters.saberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BCObjectIdentifiers.saberkem192r3;
        hashMap6.put(sABERParameters5, aSN1ObjectIdentifier23);
        SABERParameters sABERParameters6 = SABERParameters.firesaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.firesaberkem192r3;
        hashMap6.put(sABERParameters6, aSN1ObjectIdentifier24);
        SABERParameters sABERParameters7 = SABERParameters.lightsaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.lightsaberkem256r3;
        hashMap6.put(sABERParameters7, aSN1ObjectIdentifier25);
        SABERParameters sABERParameters8 = SABERParameters.saberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.saberkem256r3;
        hashMap6.put(sABERParameters8, aSN1ObjectIdentifier26);
        SABERParameters sABERParameters9 = SABERParameters.firesaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.firesaberkem256r3;
        hashMap6.put(sABERParameters9, aSN1ObjectIdentifier27);
        SABERParameters sABERParameters10 = SABERParameters.ulightsaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.ulightsaberkemr3;
        hashMap6.put(sABERParameters10, aSN1ObjectIdentifier28);
        SABERParameters sABERParameters11 = SABERParameters.usaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.usaberkemr3;
        hashMap6.put(sABERParameters11, aSN1ObjectIdentifier29);
        SABERParameters sABERParameters12 = SABERParameters.ufiresaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.ufiresaberkemr3;
        hashMap6.put(sABERParameters12, aSN1ObjectIdentifier30);
        SABERParameters sABERParameters13 = SABERParameters.lightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = BCObjectIdentifiers.lightsaberkem90sr3;
        hashMap6.put(sABERParameters13, aSN1ObjectIdentifier31);
        SABERParameters sABERParameters14 = SABERParameters.saberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = BCObjectIdentifiers.saberkem90sr3;
        hashMap6.put(sABERParameters14, aSN1ObjectIdentifier32);
        SABERParameters sABERParameters15 = SABERParameters.firesaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = BCObjectIdentifiers.firesaberkem90sr3;
        hashMap6.put(sABERParameters15, aSN1ObjectIdentifier33);
        SABERParameters sABERParameters16 = SABERParameters.ulightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = BCObjectIdentifiers.ulightsaberkem90sr3;
        hashMap6.put(sABERParameters16, aSN1ObjectIdentifier34);
        SABERParameters sABERParameters17 = SABERParameters.usaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = BCObjectIdentifiers.usaberkem90sr3;
        hashMap6.put(sABERParameters17, aSN1ObjectIdentifier35);
        SABERParameters sABERParameters18 = SABERParameters.ufiresaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = BCObjectIdentifiers.ufiresaberkem90sr3;
        hashMap6.put(sABERParameters18, aSN1ObjectIdentifier36);
        hashMap7.put(aSN1ObjectIdentifier19, sABERParameters);
        hashMap7.put(aSN1ObjectIdentifier20, sABERParameters2);
        hashMap7.put(aSN1ObjectIdentifier21, sABERParameters3);
        hashMap7.put(aSN1ObjectIdentifier22, sABERParameters4);
        hashMap7.put(aSN1ObjectIdentifier23, sABERParameters5);
        hashMap7.put(aSN1ObjectIdentifier24, sABERParameters6);
        hashMap7.put(aSN1ObjectIdentifier25, sABERParameters7);
        hashMap7.put(aSN1ObjectIdentifier26, sABERParameters8);
        hashMap7.put(aSN1ObjectIdentifier27, sABERParameters9);
        hashMap7.put(aSN1ObjectIdentifier28, sABERParameters10);
        hashMap7.put(aSN1ObjectIdentifier29, sABERParameters11);
        hashMap7.put(aSN1ObjectIdentifier30, sABERParameters12);
        hashMap7.put(aSN1ObjectIdentifier31, sABERParameters13);
        hashMap7.put(aSN1ObjectIdentifier32, sABERParameters14);
        hashMap7.put(aSN1ObjectIdentifier33, sABERParameters15);
        hashMap7.put(aSN1ObjectIdentifier34, sABERParameters16);
        hashMap7.put(aSN1ObjectIdentifier35, sABERParameters17);
        hashMap7.put(aSN1ObjectIdentifier36, sABERParameters18);
        PicnicParameters picnicParameters = PicnicParameters.picnicl1fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = BCObjectIdentifiers.picnicl1fs;
        hashMap2.put(picnicParameters, aSN1ObjectIdentifier37);
        PicnicParameters picnicParameters2 = PicnicParameters.picnicl1ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = BCObjectIdentifiers.picnicl1ur;
        hashMap2.put(picnicParameters2, aSN1ObjectIdentifier38);
        PicnicParameters picnicParameters3 = PicnicParameters.picnicl3fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = BCObjectIdentifiers.picnicl3fs;
        hashMap2.put(picnicParameters3, aSN1ObjectIdentifier39);
        PicnicParameters picnicParameters4 = PicnicParameters.picnicl3ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = BCObjectIdentifiers.picnicl3ur;
        hashMap2.put(picnicParameters4, aSN1ObjectIdentifier40);
        PicnicParameters picnicParameters5 = PicnicParameters.picnicl5fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.picnicl5fs;
        hashMap2.put(picnicParameters5, aSN1ObjectIdentifier41);
        PicnicParameters picnicParameters6 = PicnicParameters.picnicl5ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = BCObjectIdentifiers.picnicl5ur;
        hashMap2.put(picnicParameters6, aSN1ObjectIdentifier42);
        PicnicParameters picnicParameters7 = PicnicParameters.picnic3l1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = BCObjectIdentifiers.picnic3l1;
        hashMap2.put(picnicParameters7, aSN1ObjectIdentifier43);
        PicnicParameters picnicParameters8 = PicnicParameters.picnic3l3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = BCObjectIdentifiers.picnic3l3;
        hashMap2.put(picnicParameters8, aSN1ObjectIdentifier44);
        PicnicParameters picnicParameters9 = PicnicParameters.picnic3l5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = BCObjectIdentifiers.picnic3l5;
        hashMap2.put(picnicParameters9, aSN1ObjectIdentifier45);
        PicnicParameters picnicParameters10 = PicnicParameters.picnicl1full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = BCObjectIdentifiers.picnicl1full;
        hashMap2.put(picnicParameters10, aSN1ObjectIdentifier46);
        PicnicParameters picnicParameters11 = PicnicParameters.picnicl3full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier47 = BCObjectIdentifiers.picnicl3full;
        hashMap2.put(picnicParameters11, aSN1ObjectIdentifier47);
        PicnicParameters picnicParameters12 = PicnicParameters.picnicl5full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier48 = BCObjectIdentifiers.picnicl5full;
        hashMap2.put(picnicParameters12, aSN1ObjectIdentifier48);
        hashMap3.put(aSN1ObjectIdentifier37, picnicParameters);
        hashMap3.put(aSN1ObjectIdentifier38, picnicParameters2);
        hashMap3.put(aSN1ObjectIdentifier39, picnicParameters3);
        hashMap3.put(aSN1ObjectIdentifier40, picnicParameters4);
        hashMap3.put(aSN1ObjectIdentifier41, picnicParameters5);
        hashMap3.put(aSN1ObjectIdentifier42, picnicParameters6);
        hashMap3.put(aSN1ObjectIdentifier43, picnicParameters7);
        hashMap3.put(aSN1ObjectIdentifier44, picnicParameters8);
        hashMap3.put(aSN1ObjectIdentifier45, picnicParameters9);
        hashMap3.put(aSN1ObjectIdentifier46, picnicParameters10);
        hashMap3.put(aSN1ObjectIdentifier47, picnicParameters11);
        hashMap3.put(aSN1ObjectIdentifier48, picnicParameters12);
        NTRUParameters nTRUParameters = NTRUParameters.ntruhps2048509;
        ASN1ObjectIdentifier aSN1ObjectIdentifier49 = BCObjectIdentifiers.ntruhps2048509;
        hashMap12.put(nTRUParameters, aSN1ObjectIdentifier49);
        NTRUParameters nTRUParameters2 = NTRUParameters.ntruhps2048677;
        ASN1ObjectIdentifier aSN1ObjectIdentifier50 = BCObjectIdentifiers.ntruhps2048677;
        hashMap12.put(nTRUParameters2, aSN1ObjectIdentifier50);
        NTRUParameters nTRUParameters3 = NTRUParameters.ntruhps4096821;
        ASN1ObjectIdentifier aSN1ObjectIdentifier51 = BCObjectIdentifiers.ntruhps4096821;
        hashMap12.put(nTRUParameters3, aSN1ObjectIdentifier51);
        NTRUParameters nTRUParameters4 = NTRUParameters.ntruhrss701;
        ASN1ObjectIdentifier aSN1ObjectIdentifier52 = BCObjectIdentifiers.ntruhrss701;
        hashMap12.put(nTRUParameters4, aSN1ObjectIdentifier52);
        hashMap13.put(aSN1ObjectIdentifier49, nTRUParameters);
        hashMap13.put(aSN1ObjectIdentifier50, nTRUParameters2);
        hashMap13.put(aSN1ObjectIdentifier51, nTRUParameters3);
        hashMap13.put(aSN1ObjectIdentifier52, nTRUParameters4);
        FalconParameters falconParameters = FalconParameters.falcon_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier53 = BCObjectIdentifiers.falcon_512;
        hashMap14.put(falconParameters, aSN1ObjectIdentifier53);
        FalconParameters falconParameters2 = FalconParameters.falcon_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier54 = BCObjectIdentifiers.falcon_1024;
        hashMap14.put(falconParameters2, aSN1ObjectIdentifier54);
        hashMap15.put(aSN1ObjectIdentifier53, falconParameters);
        hashMap15.put(aSN1ObjectIdentifier54, falconParameters2);
        KyberParameters kyberParameters = KyberParameters.kyber512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier55 = BCObjectIdentifiers.kyber512;
        hashMap16.put(kyberParameters, aSN1ObjectIdentifier55);
        KyberParameters kyberParameters2 = KyberParameters.kyber768;
        ASN1ObjectIdentifier aSN1ObjectIdentifier56 = BCObjectIdentifiers.kyber768;
        hashMap16.put(kyberParameters2, aSN1ObjectIdentifier56);
        KyberParameters kyberParameters3 = KyberParameters.kyber1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier57 = BCObjectIdentifiers.kyber1024;
        hashMap16.put(kyberParameters3, aSN1ObjectIdentifier57);
        hashMap17.put(aSN1ObjectIdentifier55, kyberParameters);
        hashMap17.put(aSN1ObjectIdentifier56, kyberParameters2);
        hashMap17.put(aSN1ObjectIdentifier57, kyberParameters3);
        NTRULPRimeParameters nTRULPRimeParameters = NTRULPRimeParameters.ntrulpr653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier58 = BCObjectIdentifiers.ntrulpr653;
        hashMap18.put(nTRULPRimeParameters, aSN1ObjectIdentifier58);
        NTRULPRimeParameters nTRULPRimeParameters2 = NTRULPRimeParameters.ntrulpr761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier59 = BCObjectIdentifiers.ntrulpr761;
        hashMap18.put(nTRULPRimeParameters2, aSN1ObjectIdentifier59);
        NTRULPRimeParameters nTRULPRimeParameters3 = NTRULPRimeParameters.ntrulpr857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier60 = BCObjectIdentifiers.ntrulpr857;
        hashMap18.put(nTRULPRimeParameters3, aSN1ObjectIdentifier60);
        NTRULPRimeParameters nTRULPRimeParameters4 = NTRULPRimeParameters.ntrulpr953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier61 = BCObjectIdentifiers.ntrulpr953;
        hashMap18.put(nTRULPRimeParameters4, aSN1ObjectIdentifier61);
        NTRULPRimeParameters nTRULPRimeParameters5 = NTRULPRimeParameters.ntrulpr1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier62 = BCObjectIdentifiers.ntrulpr1013;
        hashMap18.put(nTRULPRimeParameters5, aSN1ObjectIdentifier62);
        NTRULPRimeParameters nTRULPRimeParameters6 = NTRULPRimeParameters.ntrulpr1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier63 = BCObjectIdentifiers.ntrulpr1277;
        hashMap18.put(nTRULPRimeParameters6, aSN1ObjectIdentifier63);
        hashMap19.put(aSN1ObjectIdentifier58, nTRULPRimeParameters);
        hashMap19.put(aSN1ObjectIdentifier59, nTRULPRimeParameters2);
        hashMap19.put(aSN1ObjectIdentifier60, nTRULPRimeParameters3);
        hashMap19.put(aSN1ObjectIdentifier61, nTRULPRimeParameters4);
        hashMap19.put(aSN1ObjectIdentifier62, nTRULPRimeParameters5);
        hashMap19.put(aSN1ObjectIdentifier63, nTRULPRimeParameters6);
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier64 = BCObjectIdentifiers.sntrup653;
        hashMap20.put(sNTRUPrimeParameters, aSN1ObjectIdentifier64);
        SNTRUPrimeParameters sNTRUPrimeParameters2 = SNTRUPrimeParameters.sntrup761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier65 = BCObjectIdentifiers.sntrup761;
        hashMap20.put(sNTRUPrimeParameters2, aSN1ObjectIdentifier65);
        SNTRUPrimeParameters sNTRUPrimeParameters3 = SNTRUPrimeParameters.sntrup857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier66 = BCObjectIdentifiers.sntrup857;
        hashMap20.put(sNTRUPrimeParameters3, aSN1ObjectIdentifier66);
        SNTRUPrimeParameters sNTRUPrimeParameters4 = SNTRUPrimeParameters.sntrup953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier67 = BCObjectIdentifiers.sntrup953;
        hashMap20.put(sNTRUPrimeParameters4, aSN1ObjectIdentifier67);
        SNTRUPrimeParameters sNTRUPrimeParameters5 = SNTRUPrimeParameters.sntrup1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier68 = BCObjectIdentifiers.sntrup1013;
        hashMap20.put(sNTRUPrimeParameters5, aSN1ObjectIdentifier68);
        SNTRUPrimeParameters sNTRUPrimeParameters6 = SNTRUPrimeParameters.sntrup1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier69 = BCObjectIdentifiers.sntrup1277;
        hashMap20.put(sNTRUPrimeParameters6, aSN1ObjectIdentifier69);
        hashMap21.put(aSN1ObjectIdentifier64, sNTRUPrimeParameters);
        hashMap21.put(aSN1ObjectIdentifier65, sNTRUPrimeParameters2);
        hashMap21.put(aSN1ObjectIdentifier66, sNTRUPrimeParameters3);
        hashMap21.put(aSN1ObjectIdentifier67, sNTRUPrimeParameters4);
        hashMap21.put(aSN1ObjectIdentifier68, sNTRUPrimeParameters5);
        hashMap21.put(aSN1ObjectIdentifier69, sNTRUPrimeParameters6);
        DilithiumParameters dilithiumParameters = DilithiumParameters.dilithium2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier70 = BCObjectIdentifiers.dilithium2;
        hashMap22.put(dilithiumParameters, aSN1ObjectIdentifier70);
        DilithiumParameters dilithiumParameters2 = DilithiumParameters.dilithium3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier71 = BCObjectIdentifiers.dilithium3;
        hashMap22.put(dilithiumParameters2, aSN1ObjectIdentifier71);
        DilithiumParameters dilithiumParameters3 = DilithiumParameters.dilithium5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier72 = BCObjectIdentifiers.dilithium5;
        hashMap22.put(dilithiumParameters3, aSN1ObjectIdentifier72);
        hashMap23.put(aSN1ObjectIdentifier70, dilithiumParameters);
        hashMap23.put(aSN1ObjectIdentifier71, dilithiumParameters2);
        hashMap23.put(aSN1ObjectIdentifier72, dilithiumParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier73 = BCObjectIdentifiers.bike128;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        hashMap25.put(aSN1ObjectIdentifier73, bIKEParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier74 = BCObjectIdentifiers.bike192;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        hashMap25.put(aSN1ObjectIdentifier74, bIKEParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier75 = BCObjectIdentifiers.bike256;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        hashMap25.put(aSN1ObjectIdentifier75, bIKEParameters3);
        hashMap24.put(bIKEParameters, aSN1ObjectIdentifier73);
        hashMap24.put(bIKEParameters2, aSN1ObjectIdentifier74);
        hashMap24.put(bIKEParameters3, aSN1ObjectIdentifier75);
        ASN1ObjectIdentifier aSN1ObjectIdentifier76 = BCObjectIdentifiers.hqc128;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap27.put(aSN1ObjectIdentifier76, hQCParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier77 = BCObjectIdentifiers.hqc192;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        hashMap27.put(aSN1ObjectIdentifier77, hQCParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier78 = BCObjectIdentifiers.hqc256;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        hashMap27.put(aSN1ObjectIdentifier78, hQCParameters3);
        hashMap26.put(hQCParameters, aSN1ObjectIdentifier76);
        hashMap26.put(hQCParameters2, aSN1ObjectIdentifier77);
        hashMap26.put(hQCParameters3, aSN1ObjectIdentifier78);
        ASN1ObjectIdentifier aSN1ObjectIdentifier79 = BCObjectIdentifiers.rainbow_III_classic;
        RainbowParameters rainbowParameters = RainbowParameters.rainbowIIIclassic;
        hashMap29.put(aSN1ObjectIdentifier79, rainbowParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier80 = BCObjectIdentifiers.rainbow_III_circumzenithal;
        RainbowParameters rainbowParameters2 = RainbowParameters.rainbowIIIcircumzenithal;
        hashMap29.put(aSN1ObjectIdentifier80, rainbowParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier81 = BCObjectIdentifiers.rainbow_III_compressed;
        RainbowParameters rainbowParameters3 = RainbowParameters.rainbowIIIcompressed;
        hashMap29.put(aSN1ObjectIdentifier81, rainbowParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier82 = BCObjectIdentifiers.rainbow_V_classic;
        RainbowParameters rainbowParameters4 = RainbowParameters.rainbowVclassic;
        hashMap29.put(aSN1ObjectIdentifier82, rainbowParameters4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier83 = BCObjectIdentifiers.rainbow_V_circumzenithal;
        RainbowParameters rainbowParameters5 = RainbowParameters.rainbowVcircumzenithal;
        hashMap29.put(aSN1ObjectIdentifier83, rainbowParameters5);
        ASN1ObjectIdentifier aSN1ObjectIdentifier84 = BCObjectIdentifiers.rainbow_V_compressed;
        RainbowParameters rainbowParameters6 = RainbowParameters.rainbowVcompressed;
        hashMap29.put(aSN1ObjectIdentifier84, rainbowParameters6);
        hashMap28.put(rainbowParameters, aSN1ObjectIdentifier79);
        hashMap28.put(rainbowParameters2, aSN1ObjectIdentifier80);
        hashMap28.put(rainbowParameters3, aSN1ObjectIdentifier81);
        hashMap28.put(rainbowParameters4, aSN1ObjectIdentifier82);
        hashMap28.put(rainbowParameters5, aSN1ObjectIdentifier83);
        hashMap28.put(rainbowParameters6, aSN1ObjectIdentifier84);
        SPHINCSPlusParameters sPHINCSPlusParameters = SPHINCSPlusParameters.sha2_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier85 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
        hashMap10.put(sPHINCSPlusParameters, aSN1ObjectIdentifier85);
        SPHINCSPlusParameters sPHINCSPlusParameters2 = SPHINCSPlusParameters.sha2_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier86 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
        hashMap10.put(sPHINCSPlusParameters2, aSN1ObjectIdentifier86);
        SPHINCSPlusParameters sPHINCSPlusParameters3 = SPHINCSPlusParameters.shake_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier87 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
        hashMap10.put(sPHINCSPlusParameters3, aSN1ObjectIdentifier87);
        SPHINCSPlusParameters sPHINCSPlusParameters4 = SPHINCSPlusParameters.shake_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier88 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
        hashMap10.put(sPHINCSPlusParameters4, aSN1ObjectIdentifier88);
        SPHINCSPlusParameters sPHINCSPlusParameters5 = SPHINCSPlusParameters.haraka_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier89 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
        hashMap10.put(sPHINCSPlusParameters5, aSN1ObjectIdentifier89);
        SPHINCSPlusParameters sPHINCSPlusParameters6 = SPHINCSPlusParameters.haraka_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier90 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
        hashMap10.put(sPHINCSPlusParameters6, aSN1ObjectIdentifier90);
        SPHINCSPlusParameters sPHINCSPlusParameters7 = SPHINCSPlusParameters.sha2_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier91 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
        hashMap10.put(sPHINCSPlusParameters7, aSN1ObjectIdentifier91);
        SPHINCSPlusParameters sPHINCSPlusParameters8 = SPHINCSPlusParameters.sha2_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier92 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
        hashMap10.put(sPHINCSPlusParameters8, aSN1ObjectIdentifier92);
        SPHINCSPlusParameters sPHINCSPlusParameters9 = SPHINCSPlusParameters.shake_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier93 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
        hashMap10.put(sPHINCSPlusParameters9, aSN1ObjectIdentifier93);
        SPHINCSPlusParameters sPHINCSPlusParameters10 = SPHINCSPlusParameters.shake_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier94 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
        hashMap10.put(sPHINCSPlusParameters10, aSN1ObjectIdentifier94);
        SPHINCSPlusParameters sPHINCSPlusParameters11 = SPHINCSPlusParameters.haraka_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier95 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
        hashMap10.put(sPHINCSPlusParameters11, aSN1ObjectIdentifier95);
        SPHINCSPlusParameters sPHINCSPlusParameters12 = SPHINCSPlusParameters.haraka_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier96 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
        hashMap10.put(sPHINCSPlusParameters12, aSN1ObjectIdentifier96);
        SPHINCSPlusParameters sPHINCSPlusParameters13 = SPHINCSPlusParameters.sha2_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier97 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
        hashMap10.put(sPHINCSPlusParameters13, aSN1ObjectIdentifier97);
        SPHINCSPlusParameters sPHINCSPlusParameters14 = SPHINCSPlusParameters.sha2_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier98 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
        hashMap10.put(sPHINCSPlusParameters14, aSN1ObjectIdentifier98);
        SPHINCSPlusParameters sPHINCSPlusParameters15 = SPHINCSPlusParameters.shake_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier99 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
        hashMap10.put(sPHINCSPlusParameters15, aSN1ObjectIdentifier99);
        SPHINCSPlusParameters sPHINCSPlusParameters16 = SPHINCSPlusParameters.shake_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier100 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
        hashMap10.put(sPHINCSPlusParameters16, aSN1ObjectIdentifier100);
        SPHINCSPlusParameters sPHINCSPlusParameters17 = SPHINCSPlusParameters.haraka_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier101 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
        hashMap10.put(sPHINCSPlusParameters17, aSN1ObjectIdentifier101);
        SPHINCSPlusParameters sPHINCSPlusParameters18 = SPHINCSPlusParameters.haraka_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier102 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
        hashMap10.put(sPHINCSPlusParameters18, aSN1ObjectIdentifier102);
        SPHINCSPlusParameters sPHINCSPlusParameters19 = SPHINCSPlusParameters.haraka_128s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier103 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters19, aSN1ObjectIdentifier103);
        SPHINCSPlusParameters sPHINCSPlusParameters20 = SPHINCSPlusParameters.haraka_128f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier104 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters20, aSN1ObjectIdentifier104);
        SPHINCSPlusParameters sPHINCSPlusParameters21 = SPHINCSPlusParameters.haraka_192s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier105 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters21, aSN1ObjectIdentifier105);
        SPHINCSPlusParameters sPHINCSPlusParameters22 = SPHINCSPlusParameters.haraka_192f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier106 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters22, aSN1ObjectIdentifier106);
        SPHINCSPlusParameters sPHINCSPlusParameters23 = SPHINCSPlusParameters.haraka_256s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier107 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple;
        hashMap10.put(sPHINCSPlusParameters23, aSN1ObjectIdentifier107);
        SPHINCSPlusParameters sPHINCSPlusParameters24 = SPHINCSPlusParameters.haraka_256f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier108 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple;
        hashMap10.put(sPHINCSPlusParameters24, aSN1ObjectIdentifier108);
        SPHINCSPlusParameters sPHINCSPlusParameters25 = SPHINCSPlusParameters.sha2_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier109 = BCObjectIdentifiers.sphincsPlus_sha2_128s;
        hashMap10.put(sPHINCSPlusParameters25, aSN1ObjectIdentifier109);
        SPHINCSPlusParameters sPHINCSPlusParameters26 = SPHINCSPlusParameters.sha2_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier110 = BCObjectIdentifiers.sphincsPlus_sha2_128f;
        hashMap10.put(sPHINCSPlusParameters26, aSN1ObjectIdentifier110);
        SPHINCSPlusParameters sPHINCSPlusParameters27 = SPHINCSPlusParameters.shake_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier111 = BCObjectIdentifiers.sphincsPlus_shake_128s;
        hashMap10.put(sPHINCSPlusParameters27, aSN1ObjectIdentifier111);
        SPHINCSPlusParameters sPHINCSPlusParameters28 = SPHINCSPlusParameters.shake_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier112 = BCObjectIdentifiers.sphincsPlus_shake_128f;
        hashMap10.put(sPHINCSPlusParameters28, aSN1ObjectIdentifier112);
        SPHINCSPlusParameters sPHINCSPlusParameters29 = SPHINCSPlusParameters.sha2_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier113 = BCObjectIdentifiers.sphincsPlus_sha2_192s;
        hashMap10.put(sPHINCSPlusParameters29, aSN1ObjectIdentifier113);
        SPHINCSPlusParameters sPHINCSPlusParameters30 = SPHINCSPlusParameters.sha2_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier114 = BCObjectIdentifiers.sphincsPlus_sha2_192f;
        hashMap10.put(sPHINCSPlusParameters30, aSN1ObjectIdentifier114);
        SPHINCSPlusParameters sPHINCSPlusParameters31 = SPHINCSPlusParameters.shake_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier115 = BCObjectIdentifiers.sphincsPlus_shake_192s;
        hashMap10.put(sPHINCSPlusParameters31, aSN1ObjectIdentifier115);
        SPHINCSPlusParameters sPHINCSPlusParameters32 = SPHINCSPlusParameters.shake_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier116 = BCObjectIdentifiers.sphincsPlus_shake_192f;
        hashMap10.put(sPHINCSPlusParameters32, aSN1ObjectIdentifier116);
        SPHINCSPlusParameters sPHINCSPlusParameters33 = SPHINCSPlusParameters.sha2_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier117 = BCObjectIdentifiers.sphincsPlus_sha2_256s;
        hashMap10.put(sPHINCSPlusParameters33, aSN1ObjectIdentifier117);
        SPHINCSPlusParameters sPHINCSPlusParameters34 = SPHINCSPlusParameters.sha2_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier118 = BCObjectIdentifiers.sphincsPlus_sha2_256f;
        hashMap10.put(sPHINCSPlusParameters34, aSN1ObjectIdentifier118);
        SPHINCSPlusParameters sPHINCSPlusParameters35 = SPHINCSPlusParameters.shake_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier119 = BCObjectIdentifiers.sphincsPlus_shake_256s;
        hashMap10.put(sPHINCSPlusParameters35, aSN1ObjectIdentifier119);
        SPHINCSPlusParameters sPHINCSPlusParameters36 = SPHINCSPlusParameters.shake_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier120 = BCObjectIdentifiers.sphincsPlus_shake_256f;
        hashMap10.put(sPHINCSPlusParameters36, aSN1ObjectIdentifier120);
        hashMap11.put(aSN1ObjectIdentifier109, sPHINCSPlusParameters25);
        hashMap11.put(aSN1ObjectIdentifier110, sPHINCSPlusParameters26);
        hashMap11.put(aSN1ObjectIdentifier111, sPHINCSPlusParameters27);
        hashMap11.put(aSN1ObjectIdentifier112, sPHINCSPlusParameters28);
        hashMap11.put(aSN1ObjectIdentifier113, sPHINCSPlusParameters29);
        hashMap11.put(aSN1ObjectIdentifier114, sPHINCSPlusParameters30);
        hashMap11.put(aSN1ObjectIdentifier115, sPHINCSPlusParameters31);
        hashMap11.put(aSN1ObjectIdentifier116, sPHINCSPlusParameters32);
        hashMap11.put(aSN1ObjectIdentifier117, sPHINCSPlusParameters33);
        hashMap11.put(aSN1ObjectIdentifier118, sPHINCSPlusParameters34);
        hashMap11.put(aSN1ObjectIdentifier119, sPHINCSPlusParameters35);
        hashMap11.put(aSN1ObjectIdentifier120, sPHINCSPlusParameters36);
        hashMap11.put(aSN1ObjectIdentifier85, sPHINCSPlusParameters);
        hashMap11.put(aSN1ObjectIdentifier86, sPHINCSPlusParameters2);
        hashMap11.put(aSN1ObjectIdentifier87, sPHINCSPlusParameters3);
        hashMap11.put(aSN1ObjectIdentifier88, sPHINCSPlusParameters4);
        hashMap11.put(aSN1ObjectIdentifier89, sPHINCSPlusParameters5);
        hashMap11.put(aSN1ObjectIdentifier90, sPHINCSPlusParameters6);
        hashMap11.put(aSN1ObjectIdentifier91, sPHINCSPlusParameters7);
        hashMap11.put(aSN1ObjectIdentifier92, sPHINCSPlusParameters8);
        hashMap11.put(aSN1ObjectIdentifier93, sPHINCSPlusParameters9);
        hashMap11.put(aSN1ObjectIdentifier94, sPHINCSPlusParameters10);
        hashMap11.put(aSN1ObjectIdentifier95, sPHINCSPlusParameters11);
        hashMap11.put(aSN1ObjectIdentifier96, sPHINCSPlusParameters12);
        hashMap11.put(aSN1ObjectIdentifier97, sPHINCSPlusParameters13);
        hashMap11.put(aSN1ObjectIdentifier98, sPHINCSPlusParameters14);
        hashMap11.put(aSN1ObjectIdentifier99, sPHINCSPlusParameters15);
        hashMap11.put(aSN1ObjectIdentifier100, sPHINCSPlusParameters16);
        hashMap11.put(aSN1ObjectIdentifier101, sPHINCSPlusParameters17);
        hashMap11.put(aSN1ObjectIdentifier102, sPHINCSPlusParameters18);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, sPHINCSPlusParameters25);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, sPHINCSPlusParameters26);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, sPHINCSPlusParameters27);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, sPHINCSPlusParameters28);
        hashMap11.put(aSN1ObjectIdentifier103, sPHINCSPlusParameters19);
        hashMap11.put(aSN1ObjectIdentifier104, sPHINCSPlusParameters20);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, sPHINCSPlusParameters29);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, sPHINCSPlusParameters30);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, sPHINCSPlusParameters31);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, sPHINCSPlusParameters32);
        hashMap11.put(aSN1ObjectIdentifier105, sPHINCSPlusParameters21);
        hashMap11.put(aSN1ObjectIdentifier106, sPHINCSPlusParameters22);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, sPHINCSPlusParameters33);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, sPHINCSPlusParameters34);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, sPHINCSPlusParameters35);
        hashMap11.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, sPHINCSPlusParameters36);
        hashMap11.put(aSN1ObjectIdentifier107, sPHINCSPlusParameters23);
        hashMap11.put(aSN1ObjectIdentifier108, sPHINCSPlusParameters24);
    }

    Utils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier bikeOidLookup(BIKEParameters bIKEParameters) {
        return (ASN1ObjectIdentifier) bikeOids.get(bIKEParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BIKEParameters bikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (BIKEParameters) bikeParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters dilithiumParameters) {
        return (ASN1ObjectIdentifier) dilithiumOids.get(dilithiumParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (DilithiumParameters) dilithiumParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier falconOidLookup(FalconParameters falconParameters) {
        return (ASN1ObjectIdentifier) falconOids.get(falconParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FalconParameters falconParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FalconParameters) falconParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters frodoParameters) {
        return (ASN1ObjectIdentifier) frodoOids.get(frodoParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FrodoParameters) frodoParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String str) {
        if (str.equals("SHA-1")) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals("SHA-224")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals("SHA-256")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals("SHA-384")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals("SHA-512")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(JSONzip.end);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + aSN1ObjectIdentifier);
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return "SHA-1";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return "SHA-224";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return "SHA-256";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return "SHA-384";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier hqcOidLookup(HQCParameters hQCParameters) {
        return (ASN1ObjectIdentifier) hqcOids.get(hQCParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HQCParameters hqcParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (HQCParameters) hqcParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier kyberOidLookup(KyberParameters kyberParameters) {
        return (ASN1ObjectIdentifier) kyberOids.get(kyberParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KyberParameters kyberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (KyberParameters) kyberParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters cMCEParameters) {
        return (ASN1ObjectIdentifier) mcElieceOids.get(cMCEParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (CMCEParameters) mcElieceParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters nTRUParameters) {
        return (ASN1ObjectIdentifier) ntruOids.get(nTRUParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRUParameters) ntruParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters nTRULPRimeParameters) {
        return (ASN1ObjectIdentifier) ntruprimeOids.get(nTRULPRimeParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRULPRimeParameters) ntruprimeParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters picnicParameters) {
        return (ASN1ObjectIdentifier) picnicOids.get(picnicParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (PicnicParameters) picnicParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AlgorithmIdentifier qTeslaLookupAlgID(int i) {
        if (i != 5) {
            if (i == 6) {
                return AlgID_qTESLA_p_III;
            }
            throw new IllegalArgumentException("unknown security category: " + i);
        }
        return AlgID_qTESLA_p_I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int qTeslaLookupSecurityCategory(AlgorithmIdentifier algorithmIdentifier) {
        return ((Integer) categories.get(algorithmIdentifier.getAlgorithm())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier rainbowOidLookup(RainbowParameters rainbowParameters) {
        return (ASN1ObjectIdentifier) rainbowOids.get(rainbowParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RainbowParameters rainbowParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (RainbowParameters) rainbowParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier saberOidLookup(SABERParameters sABERParameters) {
        return (ASN1ObjectIdentifier) saberOids.get(sABERParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SABERParameters saberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SABERParameters) saberParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier sntruprimeOidLookup(SNTRUPrimeParameters sNTRUPrimeParameters) {
        return (ASN1ObjectIdentifier) sntruprimeOids.get(sNTRUPrimeParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SNTRUPrimeParameters sntruprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SNTRUPrimeParameters) sntruprimeParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AlgorithmIdentifier sphincs256LookupTreeAlgID(String str) {
        if (str.equals("SHA3-256")) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals("SHA-512/256")) {
            return SPHINCS_SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA3_256.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA512_256.getAlgorithm())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + treeDigest.getAlgorithm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters sPHINCSPlusParameters) {
        return (ASN1ObjectIdentifier) sphincsPlusOids.get(sPHINCSPlusParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SPHINCSPlusParameters sphincsPlusParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SPHINCSPlusParameters) sphincsPlusParams.get(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AlgorithmIdentifier xmssLookupTreeAlgID(String str) {
        if (str.equals("SHA-256")) {
            return XMSS_SHA256;
        }
        if (str.equals("SHA-512")) {
            return XMSS_SHA512;
        }
        if (str.equals("SHAKE128")) {
            return XMSS_SHAKE128;
        }
        if (str.equals("SHAKE256")) {
            return XMSS_SHAKE256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
