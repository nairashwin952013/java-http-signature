/*
 * Copyright (c) 2015-2017, Joyent, Inc. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.joyent.http.signature;

/**
 * General exception that all other exceptions inherit from in this project.
 *
 * @author <a href="https://github.com/dekobon">Elijah Zupancic</a>
 * @since 1.0.0
 */
public class HttpSignatureException extends RuntimeException {

    private static final long serialVersionUID = 6548882825292310527L;

    /**
     * Creates a new exception.
     */
    public HttpSignatureException() {
    }

    /**
     * Creates a new exception with the specified message.
     * @param message Message to embed
     */
    public HttpSignatureException(final String message) {
        super(message);
    }

    /**
     * Creates a new chained exception with the specified message.
     *
     * @param message Message to embed
     * @param cause exception to chain
     */
    public HttpSignatureException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new chained exception.
     *
     * @param cause exception to chain
     */
    public HttpSignatureException(final Throwable cause) {
        super(cause);
    }

    /**
     * Creates a exception with the specified message, cause,
     * suppression enabled or disabled, and writable stack trace enabled
     * or disabled.
     *
     * @param message Message to embed
     * @param cause exception to chain
     * @param enableSuppression whether or not suppression is enabled or disabled
     * @param writableStackTrace whether or not the stack trace should be writable
     */
    public HttpSignatureException(final String message,
                                  final Throwable cause,
                                  final boolean enableSuppression,
                                  final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
