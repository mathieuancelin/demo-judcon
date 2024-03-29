package org.judcon.demo.fwk.view;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class Renderable {

    protected int statusCode = 200;
    protected String contentType = MediaType.APPLICATION_OCTET_STREAM;

    public int getStatusCode() {
        return statusCode;
    }

    public String getContentType() {
        return contentType;
    }

    public abstract Response render();

}
