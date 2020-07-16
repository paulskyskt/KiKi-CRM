package com.kiki.crm.domain;

import javax.persistence.Table;

@Table(name = "tbl_activity_remark")
public class ActivityRemark {

    private String id;
	private String noteContent; //备注信息
	private String createTime;
	private String createBy;
	private String editBy;
	private String editTime;
	private String activityId;
	private String editFlag; //是否修改过的标记

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoteContent65() {
        return noteContent;
    }

    public void setNoteContent65(String noteContent65) {
        this.noteContent = noteContent65;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getEditFlag() {
        return editFlag;
    }

    public void setEditFlag(String editFlag) {
        this.editFlag = editFlag;
    }
}
