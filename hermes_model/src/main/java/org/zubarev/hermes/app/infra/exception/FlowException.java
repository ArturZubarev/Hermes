package org.zubarev.hermes.app.infra.exception;

import org.zubarev.hermes.app.infra.exception.base.AppException;

public class FlowException extends AppException {
    public static final long serialVersionUID = -2889607185988464072L;
    public FlowException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowException(String message) {
        super(message);
    }
}
