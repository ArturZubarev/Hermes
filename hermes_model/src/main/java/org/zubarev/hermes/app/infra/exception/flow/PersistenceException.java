package org.zubarev.hermes.app.infra.exception.flow;

import org.zubarev.hermes.app.infra.exception.base.AppException;

public class PersistenceException extends AppException {
    private static final long serialVersionUID = -7889716045779735512L;

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(String message) {
        super(message);
    }
}
