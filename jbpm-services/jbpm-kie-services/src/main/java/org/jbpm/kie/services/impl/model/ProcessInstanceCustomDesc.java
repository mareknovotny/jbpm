/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.kie.services.impl.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProcessInstanceCustomDesc extends ProcessInstanceWithVarsDesc implements org.jbpm.services.api.model.ProcessInstanceCustomDesc, Serializable  {
    
    private static final long serialVersionUID = -3268588405784349092L;
    
    private Date lastModificationDate;    

    public ProcessInstanceCustomDesc() {
        super();
    }
    
    public ProcessInstanceCustomDesc(long id, String processId, String processName, 
                                 String processVersion, int state, String deploymentId, 
                                 Date dataTimeStamp, String initiator, String processInstanceDescription, 
                                 String correlationKey, Long parentId, Date lastModificationDate) {
        super(id, processId, processName, processVersion, state, deploymentId, dataTimeStamp, initiator, processInstanceDescription, correlationKey, parentId);
        this.lastModificationDate = lastModificationDate;
    }
    
    public Date getLastModificationDate() {
        return lastModificationDate;
    }
    
    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

}
