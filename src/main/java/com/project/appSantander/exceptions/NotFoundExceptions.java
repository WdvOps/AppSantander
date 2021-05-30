package com.project.appSantander.exceptions;

import com.project.appSantander.util.MessageUtils;

public class NotFoundExceptions extends RuntimeException {

    public NotFoundExceptions() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
