/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticfilesystem.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if the specified <code>FileSystemId</code> does not exist in
 * the requester's AWS account.
 * </p>
 */        
public class FileSystemNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String errorCode;
    
    /**
     * Constructs a new FileSystemNotFoundException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public FileSystemNotFoundException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the ErrorCode property for this object.
     *
     * @return The value of the ErrorCode property for this object.         
     */
    public String getErrorCode() {
        return errorCode;
    }
        
    /**
     * Sets the value of the ErrorCode property for this object.
     *
     * @param errorCode The new value for this object's ErrorCode property. 
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
    