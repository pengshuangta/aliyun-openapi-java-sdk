/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PubGetDQCQualityByEntityRequest extends RpcAcsRequest<PubGetDQCQualityByEntityResponse> {
	
	public PubGetDQCQualityByEntityRequest() {
		super("dataworks-enterprise-ultimate", "2019-04-24", "PubGetDQCQualityByEntity");
		setMethod(MethodType.POST);
	}

	private String projectName;

	private String endDate;

	private Integer pageSize;

	private Integer entityId;

	private Integer pageStart;

	private String startDate;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	public Integer getPageStart() {
		return this.pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
		if(pageStart != null){
			putBodyParameter("PageStart", pageStart.toString());
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate);
		}
	}

	@Override
	public Class<PubGetDQCQualityByEntityResponse> getResponseClass() {
		return PubGetDQCQualityByEntityResponse.class;
	}

}
