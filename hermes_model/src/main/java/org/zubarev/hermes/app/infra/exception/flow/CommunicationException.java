package org.zubarev.hermes.app.infra.exception.flow;

import org.zubarev.hermes.app.infra.exception.base.AppException;

public class CommunicationException extends AppException {
    private static final long serialVersionUID = -2850898723336164866L;

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommunicationException(String message) {
        super(message);
    }
}
