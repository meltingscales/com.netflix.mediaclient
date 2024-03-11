package o;

import com.netflix.msl.client.params.MslBootKey;

/* renamed from: o.aZb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2079aZb {
    private static final MslBootKey b;
    private static final MslBootKey c;
    private static final MslBootKey d;

    public static MslBootKey e() {
        return c;
    }

    static {
        MslBootKey.KeyType keyType = MslBootKey.KeyType.ECC;
        MslBootKey.EntityType entityType = MslBootKey.EntityType.APPBOOT;
        c = new MslBootKey(keyType, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEnf3WkcQtuP+EQOWrwa6KSyHEAr3ifUTkd+G7bzA4GcWBSiU5/FV25OzYPu/FTKJXThf/4S3bYvi+nk22GuD+dw==", 1, entityType);
        MslBootKey.KeyType keyType2 = MslBootKey.KeyType.RSA;
        b = new MslBootKey(keyType2, "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAniUdnoFyqHUerpq3zqrStDVAdmDXg90ARWUjelG8L/JYmLC/z1AxlFoqcbwvcrLonaguZVW1WH8cZzl2EQGDMeydZyDq2zTNh+2mVvrPxiqoVx9rVOtQScJzxVYvbkcgxHEwQJMz1DsM+42bjuOsruNshvTCm+eq6he8SwvCGV4ny0pe/jwY+JZcO+CxTw7/zEHrn9nQo/8doOU8DaMrC20KaW0ss/R3dj5ofonouyRInr1nwpFPZzZvFf9lMJnxS0com8RDnTQpe2GsKt7HMl6p9eQiPCNXy8ACTD9kEwbM5WZoUj5T3eTY4VgCL7HTXZ09wta7M9utfHt3rvMctxCSrzR02SaSPA5LxnW0rzM9KYabZs+77wvXo1I0Cf6+pjWqsJjwhIYEQMlHw8q4l/I/CPdLNlqPH2KplapDGvZSTF1znTiQRowK3U65GJBb+Qdr1GBbVf+pYWRldujhW1+iU+wp8B4BFInLwLUgc/iFi/gN9xSWMDJiw79C02L59542l4CvsTJdAoNOZvdvEUxrpWS+ewP1y73fJvqX5Po5Hqm+h97Rg3ABVQ48lh5N8hSFB4gUX343QzxP/wT6keoCfDAzn99tutavJRExaboF32CJjA4yopgurkYUO5YgQigGiiV38Nrv2x8Aa0QX6+XhRmKksV6z90t/4mu9OQkCAwEAAQ==", 0, entityType);
        d = new MslBootKey(keyType2, "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA1h/UVRYyyDMlfY4eEiGTAYH8enFcyOaAyW3ulv1X/lCZL8pdk4KywDxssdhvkj8ib7vrrK8ktf/aeTxzezR6HVcS9JZ9kIfTgGrTVnUHFjcYOBdPAaeJl7Mx8+ubAlYeMwsOaG/nHD96/7RkqxF0+FB4RKZTnfjTziZaIEkmLLb+ifyB5mvk8SVa7i8qJf2Dw2l/0uxp93558Dl9xeAOH3Hz3G7wgtxnL71BSOE8H9s7z4etQmuSdf++n++C9HeszauVohHhgtejw+qqf63a8R9/6MeJwh/VRJTw7nXM2PN+8ERpQzJR+AWOkHqbC2mgvSYEFMtBhodOxnp73bR7LMIAbObrTm7VDQBcav5wWlH+KPCaBR0VCRSy9GG23CHOsuWVln2idnDz/zFBHnVnWKVAanZ3Ot4LmM2nrJvSlrt1OiQSLaI+CJHO8InfVTQEXpduoiGkLpc1HcmWNF98JuA8ZX3tqmcncdHnEMG3A5hZVnM6MrsidcQTsojl/MuoXrMeuWkvQQUe4wklBHleLs6jA/Au0oT4Q34luCvG3C32N2XiUcAeFdGd3MuDlDjqG88A9CLd21eh1HqkHD76qeWGnwumLHyJmqL25Lmz4LMjJ/nkXaY9r4Fya2/I/aV9kt5lCaPY3Wb4nDivjPqM6iP9vHCKOMxwjvbE4DFgN60CAwEAAQ==", 0, entityType);
    }

    public static MslBootKey c() {
        return !C8159dfC.j() ? b : d;
    }
}
