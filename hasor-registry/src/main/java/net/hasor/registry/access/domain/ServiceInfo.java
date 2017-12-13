/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.registry.access.domain;
/**
 * 服务信息
 *
 * @version : 2015年5月22日
 * @author 赵永春 (zyc@hasor.net)
 */
public class ServiceInfo {
    /** 唯一标识*/
    private String bindID;
    /** 服务名称。*/
    private String bindName;
    /** 服务分组。*/
    private String bindGroup;
    /** 服务版本。*/
    private String bindVersion;
    //
    public String getBindID() {
        return bindID;
    }
    public void setBindID(String bindID) {
        this.bindID = bindID;
    }
    public String getBindName() {
        return bindName;
    }
    public void setBindName(String bindName) {
        this.bindName = bindName;
    }
    public String getBindGroup() {
        return bindGroup;
    }
    public void setBindGroup(String bindGroup) {
        this.bindGroup = bindGroup;
    }
    public String getBindVersion() {
        return bindVersion;
    }
    public void setBindVersion(String bindVersion) {
        this.bindVersion = bindVersion;
    }
}