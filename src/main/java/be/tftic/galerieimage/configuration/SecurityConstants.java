package be.tftic.galerieimage.configuration;

public class SecurityConstants {

    static final String SECRET = "CodeSecret";
    static final long EXPIRATION_TIME = 28_800_000; //8h
    static final String TOKEN_PREFIX = "bearer ";
    static final String HEADER_STRING = "Authorization";
}
