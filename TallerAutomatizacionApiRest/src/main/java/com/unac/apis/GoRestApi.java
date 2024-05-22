package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "b3610367ac70a2e59b67e182539949e1981e0d1967d02f115e14877b6774a3fa";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPutToken(endPoint, idUser, TOKEN, name, email);
    }

    public static void validatePutResponse(Integer statusCode, String name, String email) {
        RestInteractions.validatecode(statusCode);
        String pathName = "name";
        String pathEmail = "email";
        RestInteractions.validateDataResponse(name, email, pathName, pathEmail);
    }
}
